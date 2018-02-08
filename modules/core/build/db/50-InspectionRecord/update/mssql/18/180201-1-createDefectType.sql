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
);
