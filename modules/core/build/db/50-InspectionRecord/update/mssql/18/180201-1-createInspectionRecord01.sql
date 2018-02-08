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
);
