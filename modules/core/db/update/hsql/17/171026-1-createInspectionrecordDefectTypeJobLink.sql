create table INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK (
    JOB_ID varchar(36) not null,
    DEFECT_TYPE_ID varchar(36) not null,
    primary key (JOB_ID, DEFECT_TYPE_ID)
);
