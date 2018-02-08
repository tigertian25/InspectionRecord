package com.artwell.inspectionrecord.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

@NamePattern("%s|name")
@Table(name = "INSPECTIONRECORD_DEFECT_TYPE")
@Entity(name = "inspectionrecord$DefectType")
public class DefectType extends StandardEntity {
    private static final long serialVersionUID = 7671356368055350246L;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_JOB_ID")
    protected Job causeJob;

    @JoinTable(name = "INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK",
        joinColumns = @JoinColumn(name = "DEFECT_TYPE_ID"),
        inverseJoinColumns = @JoinColumn(name = "JOB_ID"))
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToMany
    protected List<Job> inspectionJobList;

    public void setInspectionJobList(List<Job> inspectionJobList) {
        this.inspectionJobList = inspectionJobList;
    }

    public List<Job> getInspectionJobList() {
        return inspectionJobList;
    }


    public void setCauseJob(Job causeJob) {
        this.causeJob = causeJob;
    }

    public Job getCauseJob() {
        return causeJob;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}