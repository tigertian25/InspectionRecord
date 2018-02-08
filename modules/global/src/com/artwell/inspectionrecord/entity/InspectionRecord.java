package com.artwell.inspectionrecord.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s %s|eventDateTime,barcode,employee,defectTypeList")
@Table(name = "INSPECTIONRECORD_INSPECTION_RECORD")
@Entity(name = "inspectionrecord$InspectionRecord")
public class InspectionRecord extends StandardEntity {
    private static final long serialVersionUID = -6339172843889500752L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EVENT_DATE_TIME", nullable = false)
    protected Date eventDateTime;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYEE_ID")
    protected Employee employee;

    @Column(name = "BARCODE", nullable = false)
    protected String barcode;

    @JoinTable(name = "INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK",
        joinColumns = @JoinColumn(name = "INSPECTION_RECORD_ID"),
        inverseJoinColumns = @JoinColumn(name = "DEFECT_TYPE_ID"))
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToMany
    protected List<DefectType> defectTypeList;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }



    public void setEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public Date getEventDateTime() {
        return eventDateTime;
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setDefectTypeList(List<DefectType> defectTypeList) {
        this.defectTypeList = defectTypeList;
    }

    public List<DefectType> getDefectTypeList() {
        return defectTypeList;
    }


}