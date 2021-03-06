
CREATE TABLE TBL_MST_DEPARTMENT
(
  NUM_DEPARTMENT_ID    NUMBER,
  VCH_DEPARTMENT_NAME  VARCHAR2(100 BYTE)       NOT NULL
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


CREATE UNIQUE INDEX TBL_MST_DEPARTMENT_PK ON TBL_MST_DEPARTMENT
(NUM_DEPARTMENT_ID)
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

ALTER TABLE TBL_MST_DEPARTMENT ADD (
  CONSTRAINT TBL_MST_DEPARTMENT_PK
  PRIMARY KEY
  (NUM_DEPARTMENT_ID)
  USING INDEX SCOTT.TBL_MST_DEPARTMENT_PK
  ENABLE VALIDATE);
