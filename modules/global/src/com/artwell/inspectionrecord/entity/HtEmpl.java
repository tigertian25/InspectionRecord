package com.artwell.inspectionrecord.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "sID"))
})
@NamePattern("%s|xName")
@Table(name = "ht_empl")
@Entity(name = "inspectionrecord$HtEmpl")
public class HtEmpl extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 2282556636668180366L;

    @Column(name = "\"xNo\"", nullable = false, length = 30)
    protected String xNo;

    @Column(name = "\"xName\"", length = 30)
    protected String xName;

    @Column(name = "\"xSpell\"", length = 30)
    protected String xSpell;

    @Column(name = "\"xEName\"", length = 100)
    protected String xEName;

    @Column(name = "\"xName2\"", length = 30)
    protected String xName2;

    @Column(name = "\"xSex\"")
    protected Boolean xSex;

    @Column(name = "\"xOrder\"")
    protected Integer xOrder;

    @Column(name = "\"xIsSynch\"")
    protected Boolean xIsSynch;

    @Column(name = "\"rDept_ID\"")
    protected Integer rDept;

    @Column(name = "\"rJob_ID\"")
    protected Integer rJob;

    @Column(name = "\"xPost\"", length = 30)
    protected String xPost;

    @Column(name = "\"xGroup\"", length = 30)
    protected String xGroup;

    @Column(name = "\"xPaytype\"")
    protected Integer xPaytype;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xWorkDate\"")
    protected Date xWorkDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xJoinDate\"")
    protected Date xJoinDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xJobDate\"")
    protected Date xJobDate;

    @Column(name = "\"xWed\"")
    protected Boolean xWed;

    @Column(name = "\"xNation\"", length = 30)
    protected String xNation;

    @Column(name = "\"xDegree\"", length = 30)
    protected String xDegree;

    @Column(name = "\"xLevel\"", length = 30)
    protected String xLevel;

    @Column(name = "\"xKind\"", length = 30)
    protected String xKind;

    @Column(name = "\"xIDNo\"", length = 30)
    protected String xIDNo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xBirth\"")
    protected Date xBirth;

    @Column(name = "\"xBirth2\"", length = 20)
    protected String xBirth2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xTheBirth\"")
    protected Date xTheBirth;

    @Column(name = "\"xIDAddr\"", length = 100)
    protected String xIDAddr;

    @Column(name = "\"xNative\"", length = 80)
    protected String xNative;

    @Column(name = "\"xRegion\"", length = 20)
    protected String xRegion;

    @Column(name = "\"xIsPhoto\"")
    protected Boolean xIsPhoto;

    @Column(name = "\"xIsCheck\"")
    protected Boolean xIsCheck;

    @Column(name = "\"xCard\"", length = 20)
    protected String xCard;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xCheckDate\"")
    protected Date xCheckDate;

    @Column(name = "\"xDefWitClass\"", length = 30)
    protected String xDefWitClass;

    @Column(name = "\"xDefClass\"", length = 30)
    protected String xDefClass;

    @Column(name = "\"xJobKind\"", length = 30)
    protected String xJobKind;

    @Column(name = "\"xJobLevel\"", length = 30)
    protected String xJobLevel;

    @Column(name = "\"xInsureNo\"", length = 30)
    protected String xInsureNo;

    @Column(name = "\"xIsSafety\"")
    protected Boolean xIsSafety;

    @Column(name = "\"xIsPay\"")
    protected Boolean xIsPay;

    @Column(name = "\"xIsGrow\"")
    protected Boolean xIsGrow;

    @Column(name = "\"xIsManager\"")
    protected Boolean xIsManager;

    @Column(name = "\"xIsTryout\"")
    protected Boolean xIsTryout;

    @Column(name = "\"xIsOK\"")
    protected Boolean xIsOK;

    @Column(name = "\"xIsSecret\"")
    protected Boolean xIsSecret;

    @Column(name = "\"xSecretKind\"")
    protected Integer xSecretKind;

    @Column(name = "\"xPact\"", length = 30)
    protected String xPact;

    @Column(name = "\"xKindDept\"", length = 40)
    protected String xKindDept;

    @Column(name = "\"xBTag\"")
    protected Integer xBTag;

    @Column(name = "\"xDimis\"")
    protected Integer xDimis;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xDimisDate\"")
    protected Date xDimisDate;

    @Column(name = "\"xDimisMode\"", length = 30)
    protected String xDimisMode;

    @Column(name = "\"xIsFullCheck\"")
    protected Boolean xIsFullCheck;

    @Column(name = "\"xWorkDays\"")
    protected Double xWorkDays;

    @Column(name = "\"xRestDays\"")
    protected Double xRestDays;

    @Column(name = "\"xDuty\"", length = 30)
    protected String xDuty;

    @Column(name = "\"xPolity\"", length = 30)
    protected String xPolity;

    @Column(name = "\"xIsInside\"")
    protected Boolean xIsInside;

    @Column(name = "\"xLead\"")
    protected Integer xLead;

    @Column(name = "\"xBedNo\"", length = 80)
    protected String xBedNo;

    @Column(name = "\"xMachNo\"", length = 30)
    protected String xMachNo;

    @Column(name = "\"xFingerID\"")
    protected Integer xFingerID;

    @Column(name = "\"xMach\"", length = 30)
    protected String xMach;

    @Column(name = "\"xAPaytype\"")
    protected Integer xAPaytype;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xAJoinDate\"")
    protected Date xAJoinDate;

    @Column(name = "\"xTag\"")
    protected Integer xTag;

    @Column(name = "\"xTagBool\"")
    protected Boolean xTagBool;

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

    @Column(name = "\"xPic\"")
    protected Integer xPic;

    @Column(name = "\"xPic2\"")
    protected Integer xPic2;

    @Column(name = "\"xPic3\"")
    protected Integer xPic3;

    @Column(name = "\"xNote\"", length = 200)
    protected String xNote;

    @Column(name = "\"xNoHead\"", length = 20)
    protected String xNoHead;

    @Column(name = "\"xPassword\"", length = 40)
    protected String xPassword;

    @Column(name = "\"rFlow_ID\"")
    protected Integer rFlow;

    @Column(name = "\"xStr1\"", length = 40)
    protected String xStr1;

    @Column(name = "\"xStr2\"", length = 40)
    protected String xStr2;

    @Column(name = "\"xStr3\"", length = 40)
    protected String xStr3;

    @Column(name = "\"xIsCard\"")
    protected Boolean xIsCard;

    @Column(name = "\"xHolGroup\"", length = 30)
    protected String xHolGroup;

    @Column(name = "\"xIsFinger\"")
    protected Boolean xIsFinger;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xFingerDate\"")
    protected Date xFingerDate;

    @Column(name = "\"xIsCheckB\"")
    protected Boolean xIsCheckB;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xCheckDateB\"")
    protected Date xCheckDateB;

    @Column(name = "\"xCloth\"", length = 4)
    protected String xCloth;

    @Column(name = "\"xPants\"", length = 4)
    protected String xPants;

    @Column(name = "\"xShoes\"", length = 4)
    protected String xShoes;

    @Column(name = "\"xShoesNo\"", length = 4)
    protected String xShoesNo;

    @Column(name = "\"xShoesIndex\"")
    protected Integer xShoesIndex;

    @Column(name = "\"xCountry\"", length = 40)
    protected String xCountry;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xBDimisDate\"")
    protected Date xBDimisDate;

    @Column(name = "\"xBDimisMode\"", length = 30)
    protected String xBDimisMode;

    @Column(name = "\"xJobInfo\"", length = 40)
    protected String xJobInfo;

    @Column(name = "\"xIsFremd\"")
    protected Boolean xIsFremd;

    @Column(name = "\"xCornet\"", length = 40)
    protected String xCornet;

    @Column(name = "\"xEditOwner\"", length = 100)
    protected String xEditOwner;

    @Column(name = "\"xMachGroup\"", length = 30)
    protected String xMachGroup;

    @Column(name = "\"rIntro_ID\"")
    protected Integer rIntro;

    @Column(name = "\"xIntroducer\"", length = 40)
    protected String xIntroducer;

    @Column(name = "\"xIntroPay\"")
    protected Double xIntroPay;

    @Column(name = "\"xInWorkSubPay\"")
    protected Double xInWorkSubPay;

    @Column(name = "\"xIsDeclarer\"")
    protected Boolean xIsDeclarer;

    @Column(name = "\"xResidentCard\"", length = 20)
    protected String xResidentCard;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xQBDate\"")
    protected Date xQBDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xQEDate\"")
    protected Date xQEDate;

    @Column(name = "\"xIsGetCard\"")
    protected Boolean xIsGetCard;

    @Column(name = "\"xIsInsure\"")
    protected Boolean xIsInsure;

    @Column(name = "\"xPregnancy\"", length = 10)
    protected String xPregnancy;

    @Column(name = "\"xGUID\"", length = 40)
    protected String xGUID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"xOldJoinDate\"")
    protected Date xOldJoinDate;

    @Column(name = "\"xFName\"", length = 30)
    protected String xFName;

    @Column(name = "\"xLName\"", length = 30)
    protected String xLName;

    @Column(name = "\"xRemark\"", length = 4000)
    protected String xRemark;

    @Column(name = "\"xSKill\"", length = 4000)
    protected String xSKill;

    @Column(name = "\"xIsUseWEB\"")
    protected Boolean xIsUseWEB;

    @Column(name = "\"xIsClasswit\"")
    protected Boolean xIsClasswit;

    public void setXNo(String xNo) {
        this.xNo = xNo;
    }

    public String getXNo() {
        return xNo;
    }

    public void setXName(String xName) {
        this.xName = xName;
    }

    public String getXName() {
        return xName;
    }

    public void setXSpell(String xSpell) {
        this.xSpell = xSpell;
    }

    public String getXSpell() {
        return xSpell;
    }

    public void setXEName(String xEName) {
        this.xEName = xEName;
    }

    public String getXEName() {
        return xEName;
    }

    public void setXName2(String xName2) {
        this.xName2 = xName2;
    }

    public String getXName2() {
        return xName2;
    }

    public void setXSex(Boolean xSex) {
        this.xSex = xSex;
    }

    public Boolean getXSex() {
        return xSex;
    }

    public void setXOrder(Integer xOrder) {
        this.xOrder = xOrder;
    }

    public Integer getXOrder() {
        return xOrder;
    }

    public void setXIsSynch(Boolean xIsSynch) {
        this.xIsSynch = xIsSynch;
    }

    public Boolean getXIsSynch() {
        return xIsSynch;
    }

    public void setRDept(Integer rDept) {
        this.rDept = rDept;
    }

    public Integer getRDept() {
        return rDept;
    }

    public void setRJob(Integer rJob) {
        this.rJob = rJob;
    }

    public Integer getRJob() {
        return rJob;
    }

    public void setXPost(String xPost) {
        this.xPost = xPost;
    }

    public String getXPost() {
        return xPost;
    }

    public void setXGroup(String xGroup) {
        this.xGroup = xGroup;
    }

    public String getXGroup() {
        return xGroup;
    }

    public void setXPaytype(Integer xPaytype) {
        this.xPaytype = xPaytype;
    }

    public Integer getXPaytype() {
        return xPaytype;
    }

    public void setXWorkDate(Date xWorkDate) {
        this.xWorkDate = xWorkDate;
    }

    public Date getXWorkDate() {
        return xWorkDate;
    }

    public void setXJoinDate(Date xJoinDate) {
        this.xJoinDate = xJoinDate;
    }

    public Date getXJoinDate() {
        return xJoinDate;
    }

    public void setXJobDate(Date xJobDate) {
        this.xJobDate = xJobDate;
    }

    public Date getXJobDate() {
        return xJobDate;
    }

    public void setXWed(Boolean xWed) {
        this.xWed = xWed;
    }

    public Boolean getXWed() {
        return xWed;
    }

    public void setXNation(String xNation) {
        this.xNation = xNation;
    }

    public String getXNation() {
        return xNation;
    }

    public void setXDegree(String xDegree) {
        this.xDegree = xDegree;
    }

    public String getXDegree() {
        return xDegree;
    }

    public void setXLevel(String xLevel) {
        this.xLevel = xLevel;
    }

    public String getXLevel() {
        return xLevel;
    }

    public void setXKind(String xKind) {
        this.xKind = xKind;
    }

    public String getXKind() {
        return xKind;
    }

    public void setXIDNo(String xIDNo) {
        this.xIDNo = xIDNo;
    }

    public String getXIDNo() {
        return xIDNo;
    }

    public void setXBirth(Date xBirth) {
        this.xBirth = xBirth;
    }

    public Date getXBirth() {
        return xBirth;
    }

    public void setXBirth2(String xBirth2) {
        this.xBirth2 = xBirth2;
    }

    public String getXBirth2() {
        return xBirth2;
    }

    public void setXTheBirth(Date xTheBirth) {
        this.xTheBirth = xTheBirth;
    }

    public Date getXTheBirth() {
        return xTheBirth;
    }

    public void setXIDAddr(String xIDAddr) {
        this.xIDAddr = xIDAddr;
    }

    public String getXIDAddr() {
        return xIDAddr;
    }

    public void setXNative(String xNative) {
        this.xNative = xNative;
    }

    public String getXNative() {
        return xNative;
    }

    public void setXRegion(String xRegion) {
        this.xRegion = xRegion;
    }

    public String getXRegion() {
        return xRegion;
    }

    public void setXIsPhoto(Boolean xIsPhoto) {
        this.xIsPhoto = xIsPhoto;
    }

    public Boolean getXIsPhoto() {
        return xIsPhoto;
    }

    public void setXIsCheck(Boolean xIsCheck) {
        this.xIsCheck = xIsCheck;
    }

    public Boolean getXIsCheck() {
        return xIsCheck;
    }

    public void setXCard(String xCard) {
        this.xCard = xCard;
    }

    public String getXCard() {
        return xCard;
    }

    public void setXCheckDate(Date xCheckDate) {
        this.xCheckDate = xCheckDate;
    }

    public Date getXCheckDate() {
        return xCheckDate;
    }

    public void setXDefWitClass(String xDefWitClass) {
        this.xDefWitClass = xDefWitClass;
    }

    public String getXDefWitClass() {
        return xDefWitClass;
    }

    public void setXDefClass(String xDefClass) {
        this.xDefClass = xDefClass;
    }

    public String getXDefClass() {
        return xDefClass;
    }

    public void setXJobKind(String xJobKind) {
        this.xJobKind = xJobKind;
    }

    public String getXJobKind() {
        return xJobKind;
    }

    public void setXJobLevel(String xJobLevel) {
        this.xJobLevel = xJobLevel;
    }

    public String getXJobLevel() {
        return xJobLevel;
    }

    public void setXInsureNo(String xInsureNo) {
        this.xInsureNo = xInsureNo;
    }

    public String getXInsureNo() {
        return xInsureNo;
    }

    public void setXIsSafety(Boolean xIsSafety) {
        this.xIsSafety = xIsSafety;
    }

    public Boolean getXIsSafety() {
        return xIsSafety;
    }

    public void setXIsPay(Boolean xIsPay) {
        this.xIsPay = xIsPay;
    }

    public Boolean getXIsPay() {
        return xIsPay;
    }

    public void setXIsGrow(Boolean xIsGrow) {
        this.xIsGrow = xIsGrow;
    }

    public Boolean getXIsGrow() {
        return xIsGrow;
    }

    public void setXIsManager(Boolean xIsManager) {
        this.xIsManager = xIsManager;
    }

    public Boolean getXIsManager() {
        return xIsManager;
    }

    public void setXIsTryout(Boolean xIsTryout) {
        this.xIsTryout = xIsTryout;
    }

    public Boolean getXIsTryout() {
        return xIsTryout;
    }

    public void setXIsOK(Boolean xIsOK) {
        this.xIsOK = xIsOK;
    }

    public Boolean getXIsOK() {
        return xIsOK;
    }

    public void setXIsSecret(Boolean xIsSecret) {
        this.xIsSecret = xIsSecret;
    }

    public Boolean getXIsSecret() {
        return xIsSecret;
    }

    public void setXSecretKind(Integer xSecretKind) {
        this.xSecretKind = xSecretKind;
    }

    public Integer getXSecretKind() {
        return xSecretKind;
    }

    public void setXPact(String xPact) {
        this.xPact = xPact;
    }

    public String getXPact() {
        return xPact;
    }

    public void setXKindDept(String xKindDept) {
        this.xKindDept = xKindDept;
    }

    public String getXKindDept() {
        return xKindDept;
    }

    public void setXBTag(Integer xBTag) {
        this.xBTag = xBTag;
    }

    public Integer getXBTag() {
        return xBTag;
    }

    public void setXDimis(Integer xDimis) {
        this.xDimis = xDimis;
    }

    public Integer getXDimis() {
        return xDimis;
    }

    public void setXDimisDate(Date xDimisDate) {
        this.xDimisDate = xDimisDate;
    }

    public Date getXDimisDate() {
        return xDimisDate;
    }

    public void setXDimisMode(String xDimisMode) {
        this.xDimisMode = xDimisMode;
    }

    public String getXDimisMode() {
        return xDimisMode;
    }

    public void setXIsFullCheck(Boolean xIsFullCheck) {
        this.xIsFullCheck = xIsFullCheck;
    }

    public Boolean getXIsFullCheck() {
        return xIsFullCheck;
    }

    public void setXWorkDays(Double xWorkDays) {
        this.xWorkDays = xWorkDays;
    }

    public Double getXWorkDays() {
        return xWorkDays;
    }

    public void setXRestDays(Double xRestDays) {
        this.xRestDays = xRestDays;
    }

    public Double getXRestDays() {
        return xRestDays;
    }

    public void setXDuty(String xDuty) {
        this.xDuty = xDuty;
    }

    public String getXDuty() {
        return xDuty;
    }

    public void setXPolity(String xPolity) {
        this.xPolity = xPolity;
    }

    public String getXPolity() {
        return xPolity;
    }

    public void setXIsInside(Boolean xIsInside) {
        this.xIsInside = xIsInside;
    }

    public Boolean getXIsInside() {
        return xIsInside;
    }

    public void setXLead(Integer xLead) {
        this.xLead = xLead;
    }

    public Integer getXLead() {
        return xLead;
    }

    public void setXBedNo(String xBedNo) {
        this.xBedNo = xBedNo;
    }

    public String getXBedNo() {
        return xBedNo;
    }

    public void setXMachNo(String xMachNo) {
        this.xMachNo = xMachNo;
    }

    public String getXMachNo() {
        return xMachNo;
    }

    public void setXFingerID(Integer xFingerID) {
        this.xFingerID = xFingerID;
    }

    public Integer getXFingerID() {
        return xFingerID;
    }

    public void setXMach(String xMach) {
        this.xMach = xMach;
    }

    public String getXMach() {
        return xMach;
    }

    public void setXAPaytype(Integer xAPaytype) {
        this.xAPaytype = xAPaytype;
    }

    public Integer getXAPaytype() {
        return xAPaytype;
    }

    public void setXAJoinDate(Date xAJoinDate) {
        this.xAJoinDate = xAJoinDate;
    }

    public Date getXAJoinDate() {
        return xAJoinDate;
    }

    public void setXTag(Integer xTag) {
        this.xTag = xTag;
    }

    public Integer getXTag() {
        return xTag;
    }

    public void setXTagBool(Boolean xTagBool) {
        this.xTagBool = xTagBool;
    }

    public Boolean getXTagBool() {
        return xTagBool;
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

    public void setXPic(Integer xPic) {
        this.xPic = xPic;
    }

    public Integer getXPic() {
        return xPic;
    }

    public void setXPic2(Integer xPic2) {
        this.xPic2 = xPic2;
    }

    public Integer getXPic2() {
        return xPic2;
    }

    public void setXPic3(Integer xPic3) {
        this.xPic3 = xPic3;
    }

    public Integer getXPic3() {
        return xPic3;
    }

    public void setXNote(String xNote) {
        this.xNote = xNote;
    }

    public String getXNote() {
        return xNote;
    }

    public void setXNoHead(String xNoHead) {
        this.xNoHead = xNoHead;
    }

    public String getXNoHead() {
        return xNoHead;
    }

    public void setXPassword(String xPassword) {
        this.xPassword = xPassword;
    }

    public String getXPassword() {
        return xPassword;
    }

    public void setRFlow(Integer rFlow) {
        this.rFlow = rFlow;
    }

    public Integer getRFlow() {
        return rFlow;
    }

    public void setXStr1(String xStr1) {
        this.xStr1 = xStr1;
    }

    public String getXStr1() {
        return xStr1;
    }

    public void setXStr2(String xStr2) {
        this.xStr2 = xStr2;
    }

    public String getXStr2() {
        return xStr2;
    }

    public void setXStr3(String xStr3) {
        this.xStr3 = xStr3;
    }

    public String getXStr3() {
        return xStr3;
    }

    public void setXIsCard(Boolean xIsCard) {
        this.xIsCard = xIsCard;
    }

    public Boolean getXIsCard() {
        return xIsCard;
    }

    public void setXHolGroup(String xHolGroup) {
        this.xHolGroup = xHolGroup;
    }

    public String getXHolGroup() {
        return xHolGroup;
    }

    public void setXIsFinger(Boolean xIsFinger) {
        this.xIsFinger = xIsFinger;
    }

    public Boolean getXIsFinger() {
        return xIsFinger;
    }

    public void setXFingerDate(Date xFingerDate) {
        this.xFingerDate = xFingerDate;
    }

    public Date getXFingerDate() {
        return xFingerDate;
    }

    public void setXIsCheckB(Boolean xIsCheckB) {
        this.xIsCheckB = xIsCheckB;
    }

    public Boolean getXIsCheckB() {
        return xIsCheckB;
    }

    public void setXCheckDateB(Date xCheckDateB) {
        this.xCheckDateB = xCheckDateB;
    }

    public Date getXCheckDateB() {
        return xCheckDateB;
    }

    public void setXCloth(String xCloth) {
        this.xCloth = xCloth;
    }

    public String getXCloth() {
        return xCloth;
    }

    public void setXPants(String xPants) {
        this.xPants = xPants;
    }

    public String getXPants() {
        return xPants;
    }

    public void setXShoes(String xShoes) {
        this.xShoes = xShoes;
    }

    public String getXShoes() {
        return xShoes;
    }

    public void setXShoesNo(String xShoesNo) {
        this.xShoesNo = xShoesNo;
    }

    public String getXShoesNo() {
        return xShoesNo;
    }

    public void setXShoesIndex(Integer xShoesIndex) {
        this.xShoesIndex = xShoesIndex;
    }

    public Integer getXShoesIndex() {
        return xShoesIndex;
    }

    public void setXCountry(String xCountry) {
        this.xCountry = xCountry;
    }

    public String getXCountry() {
        return xCountry;
    }

    public void setXBDimisDate(Date xBDimisDate) {
        this.xBDimisDate = xBDimisDate;
    }

    public Date getXBDimisDate() {
        return xBDimisDate;
    }

    public void setXBDimisMode(String xBDimisMode) {
        this.xBDimisMode = xBDimisMode;
    }

    public String getXBDimisMode() {
        return xBDimisMode;
    }

    public void setXJobInfo(String xJobInfo) {
        this.xJobInfo = xJobInfo;
    }

    public String getXJobInfo() {
        return xJobInfo;
    }

    public void setXIsFremd(Boolean xIsFremd) {
        this.xIsFremd = xIsFremd;
    }

    public Boolean getXIsFremd() {
        return xIsFremd;
    }

    public void setXCornet(String xCornet) {
        this.xCornet = xCornet;
    }

    public String getXCornet() {
        return xCornet;
    }

    public void setXEditOwner(String xEditOwner) {
        this.xEditOwner = xEditOwner;
    }

    public String getXEditOwner() {
        return xEditOwner;
    }

    public void setXMachGroup(String xMachGroup) {
        this.xMachGroup = xMachGroup;
    }

    public String getXMachGroup() {
        return xMachGroup;
    }

    public void setRIntro(Integer rIntro) {
        this.rIntro = rIntro;
    }

    public Integer getRIntro() {
        return rIntro;
    }

    public void setXIntroducer(String xIntroducer) {
        this.xIntroducer = xIntroducer;
    }

    public String getXIntroducer() {
        return xIntroducer;
    }

    public void setXIntroPay(Double xIntroPay) {
        this.xIntroPay = xIntroPay;
    }

    public Double getXIntroPay() {
        return xIntroPay;
    }

    public void setXInWorkSubPay(Double xInWorkSubPay) {
        this.xInWorkSubPay = xInWorkSubPay;
    }

    public Double getXInWorkSubPay() {
        return xInWorkSubPay;
    }

    public void setXIsDeclarer(Boolean xIsDeclarer) {
        this.xIsDeclarer = xIsDeclarer;
    }

    public Boolean getXIsDeclarer() {
        return xIsDeclarer;
    }

    public void setXResidentCard(String xResidentCard) {
        this.xResidentCard = xResidentCard;
    }

    public String getXResidentCard() {
        return xResidentCard;
    }

    public void setXQBDate(Date xQBDate) {
        this.xQBDate = xQBDate;
    }

    public Date getXQBDate() {
        return xQBDate;
    }

    public void setXQEDate(Date xQEDate) {
        this.xQEDate = xQEDate;
    }

    public Date getXQEDate() {
        return xQEDate;
    }

    public void setXIsGetCard(Boolean xIsGetCard) {
        this.xIsGetCard = xIsGetCard;
    }

    public Boolean getXIsGetCard() {
        return xIsGetCard;
    }

    public void setXIsInsure(Boolean xIsInsure) {
        this.xIsInsure = xIsInsure;
    }

    public Boolean getXIsInsure() {
        return xIsInsure;
    }

    public void setXPregnancy(String xPregnancy) {
        this.xPregnancy = xPregnancy;
    }

    public String getXPregnancy() {
        return xPregnancy;
    }

    public void setXGUID(String xGUID) {
        this.xGUID = xGUID;
    }

    public String getXGUID() {
        return xGUID;
    }

    public void setXOldJoinDate(Date xOldJoinDate) {
        this.xOldJoinDate = xOldJoinDate;
    }

    public Date getXOldJoinDate() {
        return xOldJoinDate;
    }

    public void setXFName(String xFName) {
        this.xFName = xFName;
    }

    public String getXFName() {
        return xFName;
    }

    public void setXLName(String xLName) {
        this.xLName = xLName;
    }

    public String getXLName() {
        return xLName;
    }

    public void setXRemark(String xRemark) {
        this.xRemark = xRemark;
    }

    public String getXRemark() {
        return xRemark;
    }

    public void setXSKill(String xSKill) {
        this.xSKill = xSKill;
    }

    public String getXSKill() {
        return xSKill;
    }

    public void setXIsUseWEB(Boolean xIsUseWEB) {
        this.xIsUseWEB = xIsUseWEB;
    }

    public Boolean getXIsUseWEB() {
        return xIsUseWEB;
    }

    public void setXIsClasswit(Boolean xIsClasswit) {
        this.xIsClasswit = xIsClasswit;
    }

    public Boolean getXIsClasswit() {
        return xIsClasswit;
    }


}