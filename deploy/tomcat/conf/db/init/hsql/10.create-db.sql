-- begin INSPECTIONRECORD_EMPLOYEE
create table INSPECTIONRECORD_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HT_EMPL_ID integer not null,
    --
    primary key (ID)
)^
-- end INSPECTIONRECORD_EMPLOYEE
-- begin INSPECTIONRECORD_DEFECT_TYPE
create table INSPECTIONRECORD_DEFECT_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CAUSE_JOB_ID varchar(36),
    --
    primary key (ID)
)^
-- end INSPECTIONRECORD_DEFECT_TYPE
-- begin INSPECTIONRECORD_INSPECTION_RECORD
create table INSPECTIONRECORD_INSPECTION_RECORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EVENT_DATE_TIME timestamp not null,
    EMPLOYEE_ID varchar(36) not null,
    BARCODE integer not null,
    --
    primary key (ID)
)^
-- end INSPECTIONRECORD_INSPECTION_RECORD

-- begin INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK
create table INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK (
    INSPECTION_RECORD_ID varchar(36) not null,
    DEFECT_TYPE_ID varchar(36) not null,
    primary key (INSPECTION_RECORD_ID, DEFECT_TYPE_ID)
)^
-- end INSPECTIONRECORD_INSPECTION_RECORD_DEFECT_TYPE_LINK
-- begin INSPECTIONRECORD_JOB
create table INSPECTIONRECORD_JOB (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HT_JOB_ID integer not null,
    --
    primary key (ID)
)^
-- end INSPECTIONRECORD_JOB
-- begin INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK
create table INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK (
    JOB_ID varchar(36) not null,
    DEFECT_TYPE_ID varchar(36) not null,
    primary key (JOB_ID, DEFECT_TYPE_ID)
)^
-- end INSPECTIONRECORD_DEFECT_TYPE_JOB_LINK
