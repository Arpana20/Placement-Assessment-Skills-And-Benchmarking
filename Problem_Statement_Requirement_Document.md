## Placement Skills Assessment System and Benchmarking
### Description:
	This project is built to enhance the students assessment and train them for their placements. The system provides an initial test that is called a mandatory test to all students of various departments during their beginner stage. Based upon the outcome, the system will generate  an individual student report, where each and every student data will be analyzed and their benchmarks will be highlighted. Furthermore, test levels will be generated based upon their previous performance and questions will be randomly distributed for each student based upon their performance. The student can attempt the test multiple times to improve his/ her placement skills. The attempts made by the students and related scores will be updated to the respective faculty members and to the students.
	The Existing Placement Online Assessment Training will not provide  the analysis report of the student in an individual basis. Successful training program are well aware of the assessments that are vital part of improving aptitude skills,
Knowledge and their courage to face the interview. But there is no provision to train the students where they want to be trained in the specific field. 
  	The proposed system provides the analysis report on students who takes the test and provides the high quality tests with varied difficulty levels based on the score obtained.

Planning to build the software using java

## Technology Details:
	Angularjs , Spring MVC & Oracle 10g: Eclipse/Toad.
## Screen Details:
	Common screens like login and dashboard will be done as a general purpose
## Other Screens Include:

1.Student bulk upload / Student profile
2.Admin(faculty) bulk upload / Admin profile
3.Question setup / bulk upload
4.Student Assessment Page
5.Assessment Score

1.Student bulk upload / Student profile
	We need to gather the student information and it consists of various field such as login, Register, Take test and View Report, the data are stored in TBL_MST_STUDENT table


Details:    						Login table:TBL_MST_LOGIN
Student ID						Login ID
Student name						Staff ID
Roll number						Username
Batch 							Student ID
Department ID

2.Admin(faculty) bulk upload / Admin profile
	The administrator module is also called as faculty module consist of tabs such as view report, upload questions and bulk registration, and the admin data are stored in TBL_MST_STAFF table.
Details:
Staff ID
Staff name
Department ID
Staff email
Staff code

3.Question setup / bulk upload
	In this question module, faculty can upload questions to the portal and questions can be uploaded into the system in two forms. One method is through an User interface which asks for questions, choices and their answer. Another method is through Excel sheet upload and this is stored in TBL_MST_QUESTION table.
Details:
Question ID
Question name
Question choice
Question answer

4.Student Assessment Page
	In this module test will be assessed based upon the data which is already stored in the database and this result will be stored in TBL_TRS_STUDENT_ASSESSMENT table.
Details:
Student ID
Question ID
Question choice
Attempt count
Assess value
Actual answer
Date of assessment

5.Assessment Score
	In this module, the score will be displayed based upon the test attempt. It can be either as individual or bulk of student score can be viewed from TBL_MST_SCORE_PARAMETER table.
Details:
Score Parameter ID
Score from
Score to

## Database design:
PK – Primary Key; FK – Foreign Key

## Master Tables:
1.TBL_MST_LOGIN
NUM_STUDENT_ID       NUMBER                                        FK [TBL_MST_STUDENT]                   
VCH_USERNAME          VARCHAR2(100 BYTE)
  	VCH_PASSWORD    	VARCHAR2(100 BYTE)           
  	NUM_STAFF_ID    	NUMBER                                        FK[TBL_MST_STAFF]
  	NUM_LOGIN_ID    	NUMBER		              PK

2.TBL_MST_STUDENT
	NUM_STUDENT_ID    	               NUMBER			  PK
  	VCH_ROLL_NO        	 	VARCHAR2(20 BYTE)          
  	VCH_STUDENT_NAME      	 VARCHAR2(200 BYTE)         
  	NUM_BATCH         		 NUMBER                  
  	CHR_ACTIVE_STATUS  	 CHAR(1 BYTE)              
  	DTT_CREATION_DATE  	 DATE                      
  	NUM_MODIFIED_BY   	 	NUMBER
  	VCH_STUDENT_EMAIL 	 VARCHAR2(100 BYTE)         
  	NUM_DEPARTMENT_ID 	 NUMBER     	                             FK[TBL_MST_DEPARTMENT]
  	NUM_CREATED_BY     		 NUMBER
  	DTT_MODIFIED_DATE  	 DATE 

3.TBL_MST_STAFF
	NUM_STAFF_ID       	     NUMBER,			       PK
 	VCH_STAFF_NAME            VARCHAR2(100 BYTE)         
  	NUM_DEPARTMENT_ID    NUMBER                                           FK[TBL_MST_DEPARTMENT]
  	VCH_STAFF_EMAIL           VARCHAR2(100 BYTE)         
  	CHR_ACTIVE_STATUS       CHAR(1 BYTE)               
  	DTT_CREATION_DATE       DATE                       
 	 NUM_CREATED_BY           NUMBER
  	NUM_MODIFIED_BY          NUMBER
  	DTT_MODIFIED_DATE       DATE
  	VCH_STAFF_CODE              VARCHAR2(50 BYTE)

## Level details:
	There are different level test where the level data are stored in TBL_MST_LEVELS table
Details:
Level ID
Level name
Sub Levels details:
Level 1 test  
This test can be taken by all the students irrespective of department and it is Initial 
tests are basic test and it consist of questions based upon problem solving skills such as Aptitude, and questions based upon Increasing communication skills through English.
	Level 2 test
		This test is considered to be as an intermediate test and it is specific to each                department. Domain Knowledge can be increased in this field.
	Level 3 test
		 This test is Advanced category test. Test questions are based upon various companies. Different companies have different criteria to evaluate a student and based upon that criteria, questions are generated.  

These data can be stored in TBL_MST_SUBLEVELS table


## Details:
Sublevel ID
Sublevel name
Level ID
Department ID

4.TBL_MST_LEVELS
	NUM_LEVEL_ID       		NUMBER			PK
  	VCH_LEVEL_NAME           	VARCHAR2(100 BYTE)         
  	CHR_ACTIVE_STATUS  	CHAR(1 BYTE)              
  	DTT_CREATION_DATE  	DATE                      
 	 NUM_CREATED_BY    	 	NUMBER

5.TBL_MST_SUBLEVELS:
	NUM_SUBLEVEL_ID   	      NUMBER			PK
  	VCH_SUBLEVEL_NAME    VARCHAR2(100 BYTE)            
  	NUM_LEVEL_ID                   NUMBER 			FK[TBL_MST_LEVELS]                  
  	NUM_DEPARTMENT_ID     NUMBER                                   FK[TBL_MST_DEPARTMENT]     
  	CHR_ACTIVE_STATUS       CHAR(1 BYTE)        
  	DTT_CREATION_DATE       DATE                
  	NUM_MODIFIED_BY          NUMBER
  	DTT_MODIFIED_DATE       DATE                       
  	NUM_CREATED_BY            NUMBER

6.TBL_MST_DEPARTMENT:
	NUM_DEPARTMENT_ID   	     NUMBER			PK
  	VCH_DEPARTMENT_NAME  	     VARCHAR2(100 BYTE) 

7.TBL_MST_QUESTIONS:   
  NUM_QUESTION_ID           	        NUMBER		           PK
  NUM_LEVEL_ID                                  NUMBER 	                          FK[TBL_MST_LEVELS]             
  NUM_SUBLEVEL_ID           	        NUMBER              
  VCH_QUESTION_NAME                   VARCHAR2(3000 BYTE) 
  VCH_QUESTION_CHOICE_1            VARCHAR2(2000 BYTE) 
  VCH_QUESTION_TEXT_ANSWER  VARCHAR2(2000 BYTE) 
  NUM_CREATED_BY                           NUMBER                             FK[TBL_MST_STAFF]
  DTT_CREATION_DATE                      DATE                
  CHR_ACTIVE_STATUS                      CHAR(1 BYTE)        
  NUM_CHOICE_ANSWER                   NUMBER
  VCH_QUESTION_CHOICE_2             VARCHAR2(2000 BYTE) 
  VCH_QUESTION_CHOICE_3             VARCHAR2(2000 BYTE) 
  VCH_QUESTION_CHOICE_4             VARCHAR2(2000 BYTE) 


8.TBL_MST_SCORE_PARAMETER:
	 NUM_SCORE_PARAMETER_ID 	 NUMBER	PK
 	 NUM_SCORE_FROM          		NUMBER           
 	 NUM_SCORE_TO            		NUMBER        
  	 NUM_CREATED_BY          		NUMBER               
  	 DTT_CREATION_DATE      		DATE             
  	 NUM_MODIFIED_BY         		NUMBER               
  	 DTT_MODIFIED_DATE       		DATE                 
  	 CHR_ACTIVE_STATUS       		CHAR(1 BYTE)      



## Transaction tables: 
1.TBL_TRS_STUDENT_ASSESSMENT
 	NUM_STUDENT_ID           	 	NUMBER	               FK[TBL_MST_STUDENT]             
  	NUM_QUESTION_ID            		NUMBER                           FK[TBL_MST_QUESTIONS]       
  	NUM_ANSWER_CHOICE         		NUMBER           
  	VCH_ANSWER_TEST           		VARCHAR2(2000 BYTE) 
  	NUM_ACTUAL_ANSWER_CHOICE  	NUMBER              
  	NUM_ASSESS_VALUE          		NUMBER             
  	NUM_ATTEMPT_COUNT        		 NUMBER           
  	DTT_DATE_OF_ASSESSMENT    	DATE                         
  	NUM_ASSESSMENT_ID        		 NUMBER			PK
  	NUM_CREATED_BY            		NUMBER
  	DTT_CREATION_DATE         		DATE                
  	VCH_ACTUAL_ANSWER_TEXT    	VARCHAR2(2000 BYTE)

2.TBL_TRS_STUDENT_SCALING:
	NUM_STUDENT_ID     		NUMBER	             FK[[TBL_MST_STUDENT]                  
  	NUM_ATTEMPT_COUNT  	NUMBER                     
  	NUM_SUBLEVEL_ID    		NUMBER	             FK[TBL_MST_SUBLEVELS]                     
  	NUM_TOTAL_SCORE    	NUMBER                  
  	DTT_MODIFIED_DATE  	DATE                       
  	NUM_MODIFIED_BY    		NUMBER
  	NUM_CREATED_BY     		NUMBER
  	DTT_CREATION_DATE  	DATE                       
  	NUM_SCALING_ID     		NUMBER		PK




  







		









