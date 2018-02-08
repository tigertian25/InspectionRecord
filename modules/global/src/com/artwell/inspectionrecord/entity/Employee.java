package com.artwell.inspectionrecord.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.annotation.SystemLevel;
import javax.persistence.Column;
import javax.persistence.Transient;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|htEmpl")
@Table(name = "INSPECTIONRECORD_EMPLOYEE")
@Entity(name = "inspectionrecord$Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = 6914724773523517260L;

    @Transient
    @MetaProperty(mandatory = true, related = "htEmplId")
    protected HtEmpl htEmpl;

    @SystemLevel
    @Column(name = "HT_EMPL_ID", nullable = false, unique = true)
    protected Integer htEmplId;


    public void setHtEmpl(HtEmpl htEmpl) {
        this.htEmpl = htEmpl;
    }

    public HtEmpl getHtEmpl() {
        return htEmpl;
    }

    public void setHtEmplId(Integer htEmplId) {
        this.htEmplId = htEmplId;
    }

    public Integer getHtEmplId() {
        return htEmplId;
    }


}