CREATE TABLE TBL_MST_STUDENT
(
  NUM_STUDENT_ID     NUMBER,
  VCH_ROLL_NO        VARCHAR2(20 BYTE)          NOT NULL,
  VCH_STUDENT_NAME   VARCHAR2(200 BYTE)         NOT NULL,
  NUM_BATCH          NUMBER                     NOT NULL,
  CHR_ACTIVE_STATUS  CHAR(1 BYTE)               NOT NULL,
  DTT_CREATION_DATE  DATE                       DEFAULT SYSDATE               NOT NULL,
  NUM_MODIFIED_BY    NUMBER,
  VCH_STUDENT_EMAIL  VARCHAR2(100 BYTE)         NOT NULL,
  NUM_DEPARTMENT_ID  NUMBER,
  NUM_CREATED_BY     NUMBER,
  DTT_MODIFIED_DATE  DATE
)
TABLESPACE USERS
PCTUSED    0
PCTFREE    10
INITRANS   1
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           )
LOGGING 
NOCACHE;


CREATE UNIQUE INDEX TBL_MST_STUDENT_PK ON TBL_MST_STUDENT
(NUM_STUDENT_ID)
LOGGING
TABLESPACE USERS
PCTFREE    10
INITRANS   2
MAXTRANS   255
STORAGE    (
            INITIAL          64K
            MINEXTENTS       1
            MAXEXTENTS       UNLIMITED
            PCTINCREASE      0
            BUFFER_POOL      DEFAULT
           );

ALTER TABLE TBL_MST_STUDENT ADD (
  CONSTRAINT TBL_MST_STUDENT_PK
  PRIMARY KEY
  (NUM_STUDENT_ID)
  USING INDEX TBL_MST_STUDENT_PK
  ENABLE VALIDATE);
