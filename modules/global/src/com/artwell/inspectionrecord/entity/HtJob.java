package com.artwell.inspectionrecord.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|xName")
@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "sID"))
})
@Table(name = "ht_job")
@Entity(name = "inspectionrecord$HtJob")
public class HtJob extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 3319780627734214932L;

    @Column(name = "\"sCode\"", length = 30)
    protected String sCode;

    @Column(name = "\"xName\"", length = 40)
    protected String xName;

    @Column(name = "\"xTag\"")
    protected Integer xTag;

    @Column(name = "\"xOrder\"")
    protected Integer xOrder;

    @Column(name = "\"xNote\"", length = 200)
    protected String xNote;

    @Column(name = "\"xTagStr\"", length = 80)
    protected String xTagStr;

    @Column(name = "\"sVerNo\"")
    protected Integer sVerNo;

    @Column(name = "\"sStatus\"")
    protected Integer sStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"sCreateDate\"")
    protected Date sCreateDate;

    @Column(name = "\"sOwner\"", length = 20)
    protected String sOwner;

    @Column(name = "\"sMender\"", length = 20)
    protected String sMender;

    @Column(name = "\"sChecker\"", length = 20)
    protected String sChecker;

    @Column(name = "\"sAuditor\"", length = 20)
    protected String sAuditor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"sLastUpdate\"")
    protected Date sLastUpdate;

    @Column(name = "\"xKind\"", length = 40)
    protected String xKind;

    @Column(name = "\"xIsSubsidy\"")
    protected Boolean xIsSubsidy;

    @Column(name = "\"xIsRequest\"")
    protected Boolean xIsRequest;

    @Column(name = "\"xMinYear\"")
    protected Integer xMinYear;

    @Column(name = "\"xMaxYear\"")
    protected Integer xMaxYear;

    @Column(name = "\"xMinSchool\"", length = 40)
    protected String xMinSchool;

    @Lob
    @Column(name = "\"xRemark\"")
    protected String xRemark;

    @Column(name = "\"xIsStop\"")
    protected Boolean xIsStop;

    @Column(name = "\"xJobGroup\"", length = 40)
    protected String xJobGroup;

    @Column(name = "\"xProperty\"", length = 40)
    protected String xProperty;

    @Column(name = "\"xPaytype\"")
    protected Integer xPaytype;

    @Column(name = "\"xJobPact\"", length = 40)
    protected String xJobPact;

    @Column(name = "\"xDefInt\"")
    protected Integer xDefInt;

    @Column(name = "\"xDefReal\"")
    protected Double xDefReal;

    @Column(name = "\"xGUID\"", length = 40)
    protected String xGUID;

    @Column(name = "\"xNoHead\"", nullable = false, length = 10)
    protected String xNoHead;

    @Column(name = "\"xLimitAge\"")
    protected Boolean xLimitAge;

    @Column(name = "\"xMinAge\"")
    protected Integer xMinAge;

    @Column(name = "\"xMaxAge\"")
    protected Integer xMaxAge;

    @Column(name = "\"xEJobName\"", length = 50)
    protected String xEJobName;

    public void setSCode(String sCode) {
        this.sCode = sCode;
    }

    public String getSCode() {
        return sCode;
    }

    public void setXName(String xName) {
        this.xName = xName;
    }

    public String getXName() {
        return xName;
    }

    public void setXTag(Integer xTag) {
        this.xTag = xTag;
    }

    public Integer getXTag() {
        return xTag;
    }

    public void setXOrder(Integer xOrder) {
        this.xOrder = xOrder;
    }

    public Integer getXOrder() {
        return xOrder;
    }

    public void setXNote(String xNote) {
        this.xNote = xNote;
    }

    public String getXNote() {
        return xNote;
    }

    public void setXTagStr(String xTagStr) {
        this.xTagStr = xTagStr;
    }

    public String getXTagStr() {
        return xTagStr;
    }

    public void setSVerNo(Integer sVerNo) {
        this.sVerNo = sVerNo;
    }

    public Integer getSVerNo() {
        return sVerNo;
    }

    public void setSStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    public Integer getSStatus() {
        return sStatus;
    }

    public void setSCreateDate(Date sCreateDate) {
        this.sCreateDate = sCreateDate;
    }

    public Date getSCreateDate() {
        return sCreateDate;
    }

    public void setSOwner(String sOwner) {
        this.sOwner = sOwner;
    }

    public String getSOwner() {
        return sOwner;
    }

    public void setSMender(String sMender) {
        this.sMender = sMender;
    }

    public String getSMender() {
        return sMender;
    }

    public void setSChecker(String sChecker) {
        this.sChecker = sChecker;
    }

    public String getSChecker() {
        return sChecker;
    }

    public void setSAuditor(String sAuditor) {
        this.sAuditor = sAuditor;
    }

    public String getSAuditor() {
        return sAuditor;
    }

    public void setSLastUpdate(Date sLastUpdate) {
        this.sLastUpdate = sLastUpdate;
    }

    public Date getSLastUpdate() {
        return sLastUpdate;
    }

    public void setXKind(String xKind) {
        this.xKind = xKind;
    }

    public String getXKind() {
        return xKind;
    }

    public void setXIsSubsidy(Boolean xIsSubsidy) {
        this.xIsSubsidy = xIsSubsidy;
    }

    public Boolean getXIsSubsidy() {
        return xIsSubsidy;
    }

    public void setXIsRequest(Boolean xIsRequest) {
        this.xIsRequest = xIsRequest;
    }

    public Boolean getXIsRequest() {
        return xIsRequest;
    }

    public void setXMinYear(Integer xMinYear) {
        this.xMinYear = xMinYear;
    }

    public Integer getXMinYear() {
        return xMinYear;
    }

    public void setXMaxYear(Integer xMaxYear) {
        this.xMaxYear = xMaxYear;
    }

    public Integer getXMaxYear() {
        return xMaxYear;
    }

    public void setXMinSchool(String xMinSchool) {
        this.xMinSchool = xMinSchool;
    }

    public String getXMinSchool() {
        return xMinSchool;
    }

    public void setXRemark(String xRemark) {
        this.xRemark = xRemark;
    }

    public String getXRemark() {
        return xRemark;
    }

    public void setXIsStop(Boolean xIsStop) {
        this.xIsStop = xIsStop;
    }

    public Boolean getXIsStop() {
        return xIsStop;
    }

    public void setXJobGroup(String xJobGroup) {
        this.xJobGroup = xJobGroup;
    }

    public String getXJobGroup() {
        return xJobGroup;
    }

    public void setXProperty(String xProperty) {
        this.xProperty = xProperty;
    }

    public String getXProperty() {
        return xProperty;
    }

    public void setXPaytype(Integer xPaytype) {
        this.xPaytype = xPaytype;
    }

    public Integer getXPaytype() {
        return xPaytype;
    }

    public void setXJobPact(String xJobPact) {
        this.xJobPact = xJobPact;
    }

    public String getXJobPact() {
        return xJobPact;
    }

    public void setXDefInt(Integer xDefInt) {
        this.xDefInt = xDefInt;
    }

    public Integer getXDefInt() {
        return xDefInt;
    }

    public void setXDefReal(Double xDefReal) {
        this.xDefReal = xDefReal;
    }

    public Double getXDefReal() {
        return xDefReal;
    }

    public void setXGUID(String xGUID) {
        this.xGUID = xGUID;
    }

    public String getXGUID() {
        return xGUID;
    }

    public void setXNoHead(String xNoHead) {
        this.xNoHead = xNoHead;
    }

    public String getXNoHead() {
        return xNoHead;
    }

    public void setXLimitAge(Boolean xLimitAge) {
        this.xLimitAge = xLimitAge;
    }

    public Boolean getXLimitAge() {
        return xLimitAge;
    }

    public void setXMinAge(Integer xMinAge) {
        this.xMinAge = xMinAge;
    }

    public Integer getXMinAge() {
        return xMinAge;
    }

    public void setXMaxAge(Integer xMaxAge) {
        this.xMaxAge = xMaxAge;
    }

    public Integer getXMaxAge() {
        return xMaxAge;
    }

    public void setXEJobName(String xEJobName) {
        this.xEJobName = xEJobName;
    }

    public String getXEJobName() {
        return xEJobName;
    }


}