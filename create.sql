/*

DROP TABLE STUDENT;
DROP SEQUENCE STUDENT_SEQ;

create table STUDENT
(
    STUDENT_ID NUMBER              not null
        primary key,
    FIRST_NAME VARCHAR2(40)        not null,
    LAST_NAME  VARCHAR2(40)        not null,
    COURSE     NUMBER(1),
    DEBT       NUMBER(1) default 0 not null
)

CREATE SEQUENCE student_seq START WITH 1;

CREATE OR REPLACE TRIGGER students_id_ins
BEFORE INSERT ON STUDENT
FOR EACH ROW

BEGIN
SELECT student_seq.NEXTVAL
INTO   :new.STUDENT_ID
FROM   dual;
END;

*/