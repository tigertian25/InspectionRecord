package com.artwell.inspectionrecord.web.inspectionrecord;

import com.artwell.inspectionrecord.entity.InspectionRecord;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.ComponentsHelper;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;
import com.haulmont.cuba.gui.components.actions.RemoveAction;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.security.entity.EntityOp;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class InspectionRecordBrowse extends AbstractLookup {

    /**
     * The {@link CollectionDatasource} instance that loads a list of {@link InspectionRecord} records
     * to be displayed in {@link InspectionRecordBrowse#inspectionRecordsTable} on the left
     */
    @Inject
    private CollectionDatasource<InspectionRecord, UUID> inspectionRecordsDs;

    /**
     * The {@link Datasource} instance that contains an instance of the selected entity
     * in {@link InspectionRecordBrowse#inspectionRecordsDs}
     * <p/> Containing instance is loaded in {@link CollectionDatasource#addItemChangeListener}
     * with the view, specified in the XML screen descriptor.
     * The listener is set in the {@link InspectionRecordBrowse#init(Map)} method
     */
    @Inject
    private Datasource<InspectionRecord> inspectionRecordDs;

    /**
     * The {@link Table} instance, containing a list of {@link InspectionRecord} records,
     * loaded via {@link InspectionRecordBrowse#inspectionRecordsDs}
     */
    @Inject
    private Table<InspectionRecord> inspectionRecordsTable;

    /**
     * The {@link BoxLayout} instance that contains components on the left side
     * of {@link SplitPanel}
     */
    @Inject
    private BoxLayout lookupBox;

    /**
    * The {@link BoxLayout} instance that contains components on the right side
    * of {@link SplitPanel}
    */
    @Inject
    private BoxLayout editBox;

    /**
     * The {@link BoxLayout} instance that contains buttons to invoke Save or Cancel actions in edit mode
     */
    @Inject
    private BoxLayout actionsPane;

    /**
     * The {@link FieldGroup} instance that is linked to {@link InspectionRecordBrowse#inspectionRecordDs}
     * and shows fields of the selected {@link InspectionRecord} record
     */
    @Inject
    private FieldGroup fieldGroup;

    /**
     * The {@link TabSheet} instance, located on the right side of {@link SplitPanel}
     * <p/> First tab contains {@link InspectionRecordBrowse#fieldGroup}. Others tabs are designed to manipulate with
     * one-two-many related collections
     */
    @Inject
    private TabSheet tabSheet;

    /**
     * The {@link RemoveAction} instance, related to {@link InspectionRecordBrowse#inspectionRecordsTable}
     */
    @Named("inspectionRecordsTable.remove")
    private RemoveAction inspectionRecordsTableRemove;

    @Inject
    private DataSupplier dataSupplier;

    /**
     * {@link Boolean} value, indicating if a new instance of {@link InspectionRecord} is being created
     */
    private boolean creating;

    @Override
    public void init(Map<String, Object> params) {

        /*
         * Adding {@link com.haulmont.cuba.gui.data.Datasource.ItemChangeListener} to {@link inspectionRecordsDs}
         * The listener reloads the selected record with the specified view and sets it to {@link inspectionRecordDs}
         */
        inspectionRecordsDs.addItemChangeListener(e -> {
            if (e.getItem() != null) {
                InspectionRecord reloadedItem = dataSupplier.reload(e.getDs().getItem(), inspectionRecordDs.getView());
                inspectionRecordDs.setItem(reloadedItem);
            }
        });

        /*
         * Adding {@link CreateAction} to {@link inspectionRecordsTable}
         * The listener removes selection in {@link inspectionRecordsTable}, sets a newly created item to {@link inspectionRecordDs}
         * and enables controls for record editing
         */
        inspectionRecordsTable.addAction(new CreateAction(inspectionRecordsTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity newItem, Datasource parentDs, Map<String, Object> params) {
                inspectionRecordsTable.setSelected(Collections.emptyList());
                inspectionRecordDs.setItem((InspectionRecord) newItem);
                refreshOptionsForLookupFields();
                enableEditControls(true);
            }
        });

        /*
         * Adding {@link EditAction} to {@link inspectionRecordsTable}
         * The listener enables controls for record editing
         */
        inspectionRecordsTable.addAction(new EditAction(inspectionRecordsTable) {
            @Override
            protected void internalOpenEditor(CollectionDatasource datasource, Entity existingItem, Datasource parentDs, Map<String, Object> params) {
                if (inspectionRecordsTable.getSelected().size() == 1) {
                    refreshOptionsForLookupFields();
                    enableEditControls(false);
                }
            }

            @Override
            public void refreshState() {
                if (target != null) {
                    CollectionDatasource ds = target.getDatasource();
                    if (ds != null && !captionInitialized) {
                        setCaption(messages.getMainMessage("actions.Edit"));
                    }
                }
                super.refreshState();
            }

            @Override
            protected boolean isPermitted() {
                CollectionDatasource ownerDatasource = target.getDatasource();
                boolean entityOpPermitted = security.isEntityOpPermitted(ownerDatasource.getMetaClass(), EntityOp.UPDATE);
                if (!entityOpPermitted) {
                    return false;
                }
                return super.isPermitted();
            }
        });

        /*
         * Setting {@link RemoveAction#afterRemoveHandler} for {@link inspectionRecordsTableRemove}
         * to reset record, contained in {@link inspectionRecordDs}
         */
        inspectionRecordsTableRemove.setAfterRemoveHandler(removedItems -> inspectionRecordDs.setItem(null));

        /*
         * Adding ESCAPE shortcut that invokes cancel() method
         */
        editBox.addShortcutAction(new ShortcutAction(new KeyCombination(KeyCombination.Key.ESCAPE),
        shortcutTriggeredEvent -> cancel()));

        disableEditControls();
    }

    private void refreshOptionsForLookupFields() {
        for (Component component : fieldGroup.getOwnComponents()) {
            if (component instanceof LookupField) {
                CollectionDatasource optionsDatasource = ((LookupField) component).getOptionsDatasource();
                if (optionsDatasource != null) {
                    optionsDatasource.refresh();
                }
            }
        }
    }

    /**
     * Method that is invoked by clicking Ok button after editing an existing or creating a new record
     */
    public void save() {
        if (!validate(Collections.singletonList(fieldGroup))) {
            return;
        }
        getDsContext().commit();

        InspectionRecord editedItem = inspectionRecordDs.getItem();
        if (creating) {
            inspectionRecordsDs.includeItem(editedItem);
        } else {
            inspectionRecordsDs.updateItem(editedItem);
        }
        inspectionRecordsTable.setSelected(editedItem);

        disableEditControls();
    }

    /**
     * Method that is invoked by clicking Cancel button, discards changes and disables controls for record editing
     */
    public void cancel() {
        InspectionRecord selectedItem = inspectionRecordsDs.getItem();
        if (selectedItem != null) {
            InspectionRecord reloadedItem = dataSupplier.reload(selectedItem, inspectionRecordDs.getView());
            inspectionRecordsDs.setItem(reloadedItem);
        } else {
            inspectionRecordDs.setItem(null);
        }

        disableEditControls();
    }

    /**
     * Enabling controls for record editing
     * @param creating indicates if a new instance of {@link InspectionRecord} is being created
     */
    private void enableEditControls(boolean creating) {
        this.creating = creating;
        initEditComponents(true);
        fieldGroup.requestFocus();
    }

    /**
     * Disabling editing controls
     */
    private void disableEditControls() {
        initEditComponents(false);
        inspectionRecordsTable.requestFocus();
    }

    /**
     * Initiating edit controls, depending on if they should be enabled/disabled
     * @param enabled if true - enables editing controls and disables controls on the left side of the splitter
     *                if false - visa versa
     */
    private void initEditComponents(boolean enabled) {
        ComponentsHelper.walkComponents(tabSheet, (component, name) -> {
            if (component instanceof FieldGroup) {
                ((FieldGroup) component).setEditable(enabled);
            } else if (component instanceof Table) {
                ((Table) component).getActions().forEach(action -> action.setEnabled(enabled));
            } else if (!(component instanceof Container)) {
                component.setEnabled(enabled);
            }
        });
        actionsPane.setVisible(enabled);
        lookupBox.setEnabled(!enabled);
    }
}