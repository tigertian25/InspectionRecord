-- update INSPECTIONRECORD_JOB set HT_JOB_ID = <default_value> where HT_JOB_ID is null ;
alter table INSPECTIONRECORD_JOB alter column HT_JOB_ID set not null ;
