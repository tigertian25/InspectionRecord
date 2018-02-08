-- alter table INSPECTIONRECORD_DEFECT_TYPE add column CAUSE_JOB_ID varchar(36) ^
-- update INSPECTIONRECORD_DEFECT_TYPE set CAUSE_JOB_ID = <default_value> ;
-- alter table INSPECTIONRECORD_DEFECT_TYPE alter column CAUSE_JOB_ID set not null ;
alter table INSPECTIONRECORD_DEFECT_TYPE add column CAUSE_JOB_ID varchar(36) not null ;
alter table INSPECTIONRECORD_DEFECT_TYPE drop column CAUSE_DEPARTMENT_ID cascade ;
