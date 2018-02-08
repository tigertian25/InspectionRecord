package com.artwell.inspectionrecord.service;

import com.artwell.inspectionrecord.entity.DefectType;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    String NAME = "inspectionrecord_EmployeeService";

    LoginInfo getLoginInfobyCode(String code);

    public class LoginInfo implements Serializable {
        private static final long serialVersionUID = 1L;

        public String employeeName;
        public UUID employeeId;
        public Integer htEmplId;
        public String jobName;
        public UUID jobId;
        public Integer htJobId;
        public List<DefectType> defectTypeList;

        public LoginInfo(String employeeName, UUID employeeId, Integer htEmplId, String jobName, UUID jobId, Integer htJobId, List<DefectType> defectTypeList) {
            this.employeeName = employeeName;
            this.employeeId = employeeId;
            this.htEmplId = htEmplId;
            this.jobName = jobName;
            this.jobId = jobId;
            this.htJobId = htJobId;
            this.defectTypeList = defectTypeList;
        }

        @Override
        public String toString() {
            return "LoginInfo{" +
                    "employeeName='" + employeeName + '\'' +
                    ", employeeId=" + employeeId +
                    ", htEmplId=" + htEmplId +
                    ", jobName='" + jobName + '\'' +
                    ", jobId=" + jobId +
                    ", htJobId=" + htJobId +
                    ", defectTypeList=" + defectTypeList +
                    '}';
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public UUID getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(UUID employeeId) {
            this.employeeId = employeeId;
        }

        public Integer getHtEmplId() {
            return htEmplId;
        }

        public void setHtEmplId(Integer htEmplId) {
            this.htEmplId = htEmplId;
        }

        public String getJobName() {
            return jobName;
        }

        public void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public UUID getJobId() {
            return jobId;
        }

        public void setJobId(UUID jobId) {
            this.jobId = jobId;
        }

        public Integer getHtJobId() {
            return htJobId;
        }

        public void setHtJobId(Integer htJobId) {
            this.htJobId = htJobId;
        }

        public List<DefectType> getDefectTypeList() {
            return defectTypeList;
        }

        public void setDefectTypeList(List<DefectType> defectTypeList) {
            this.defectTypeList = defectTypeList;
        }

    }
}