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
);
