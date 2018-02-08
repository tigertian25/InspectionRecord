create table INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK (
    JOB_ID uniqueidentifier,
    DEFECT_TYPE_ID uniqueidentifier,
    primary key (JOB_ID, DEFECT_TYPE_ID)
);
