-- begin INSPECTIONRECORD_EMPLOYEE
create table INSPECTIONRECORD_EMPLOYEE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime,
    CREATED_BY varchar(50),
    UPDATE_TS datetime,
    UPDATED_BY varchar(50),
    DELETE_TS datetime,
    DELETED_BY varchar(50),
    --
    HT_EMPL_ID integer not null,
    --
    primary key nonclustered (ID)
)^
-- end INSPECTIONRECORD_EMPLOYEE
-- begin INSPECTIONRECORD_DEFECT_TYPE
create table INSPECTIONRECORD_DEFECT_TYPE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime,
    CREATED_BY varchar(50),
    UPDATE_TS datetime,
    UPDATED_BY varchar(50),
    DELETE_TS datetime,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CAUSE_JOB_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
)^
-- end INSPECTIONRECORD_DEFECT_TYPE
-- begin INSPECTIONRECORD_INSPECTION_RECORD
create table INSPECTIONRECORD_INSPECTION_RECORD (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime,
    CREATED_BY varchar(50),
    UPDATE_TS datetime,
    UPDATED_BY varchar(50),
    DELETE_TS datetime,
    DELETED_BY varchar(50),
    --
    EVENT_DATE_TIME datetime not null,
    EMPLOYEE_ID uniqueidentifier not null,
    BARCODE integer not null,
    --
    primary key nonclustered (ID)
)^
-- end INSPECTIONRECORD_INSPECTION_RECORD
-- begin INSPECTIONRECORD_JOB
create table INSPECTIONRECORD_JOB (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime,
    CREATED_BY varchar(50),
    UPDATE_TS datetime,
    UPDATED_BY varchar(50),
    DELETE_TS datetime,
    DELETED_BY varchar(50),
    --
    HT_JOB_ID integer not null,
    --
    primary key nonclustered (ID)
)^
-- end INSPECTIONRECORD_JOB
-- begin INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK
create table INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK (
    JOB_ID uniqueidentifier,
    DEFECT_TYPE_ID uniqueidentifier,
    primary key (JOB_ID, DEFECT_TYPE_ID)
)^
-- end INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK
-- begin INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK
create table INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK (
    INSPECTION_RECORD_ID uniqueidentifier,
    DEFECT_TYPE_ID uniqueidentifier,
    primary key (INSPECTION_RECORD_ID, DEFECT_TYPE_ID)
)^
-- end INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK
