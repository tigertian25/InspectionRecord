create table INSPECTIONRECORD_DEFECT_TYPE_DEPARTMENT_LINK (
    DEFECT_TYPE_ID varchar(36) not null,
    DEPARTMENT_ID varchar(36) not null,
    primary key (DEFECT_TYPE_ID, DEPARTMENT_ID)
);
