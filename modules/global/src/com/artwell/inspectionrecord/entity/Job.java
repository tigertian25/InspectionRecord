package com.artwell.inspectionrecord.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.annotation.SystemLevel;
import javax.persistence.Column;
import javax.persistence.Transient;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@NamePattern("%s|htJob")
@Table(name = "INSPECTIONRECORD_JOB")
@Entity(name = "inspectionrecord$Job")
public class Job extends StandardEntity {
    private static final long serialVersionUID = 8645319617675052848L;

    @Transient
    @MetaProperty(mandatory = true, related = "htJobId")
    protected HtJob htJob;

    @NotNull
    @SystemLevel
    @Column(name = "HT_JOB_ID", nullable = false, unique = true)
    protected Integer htJobId;

    @JoinTable(name = "INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK",
        joinColumns = @JoinColumn(name = "JOB_ID"),
        inverseJoinColumns = @JoinColumn(name = "DEFECT_TYPE_ID"))
    @ManyToMany
    protected List<DefectType> defectTypeList;

    public void setDefectTypeList(List<DefectType> defectTypeList) {
        this.defectTypeList = defectTypeList;
    }

    public List<DefectType> getDefectTypeList() {
        return defectTypeList;
    }


    public void setHtJob(HtJob htJob) {
        this.htJob = htJob;
    }

    public HtJob getHtJob() {
        return htJob;
    }

    public void setHtJobId(Integer htJobId) {
        this.htJobId = htJobId;
    }

    public Integer getHtJobId() {
        return htJobId;
    }


}