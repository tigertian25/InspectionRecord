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
);
