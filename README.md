# Placement-Assessment-Skills-And-Benchmarking
This project is intended to provide Intelligent Assessment program for Students

### Problem Statement
The Existing Placement Online Assessment Training will not provide  the analysis report of the student in an individual basis. Successful training program are well aware of the assessments that are vital part of improving aptitude skills,Knowledge and their courage to face the interview. But there is no provision to train the students where they want to be trained in the specific field.

### Abstract
This project is built to enhance the students assessment and train them for their placements. The system provides an initial test that is called a mandatory test to all students of various departments during their beginner stage. Based upon the outcome, the system will generate  an individual student report, where each and every student data will be analyzed and their benchmarks will be highlighted. Furthermore, test levels will be generated based upon their previous performance and questions will be randomly distributed for each student based upon their performance. The student can attempt the test multiple times to improve his/ her placement skills. The attempts made by the students and related scores will be updated to the respective faculty members and to the students.

### Modules
- Student bulk upload / student profile
- Admin(faculty) bulk upload / Admin profile
- Question setup / bulk upload
- Student Assessment Page
- Assessment Score
- Database Creation

### Student bulk upload / Student profile
We need to gather the student information and it consists of various field such as login, Register, Take test and View Report, the data are stored in TBL_MST_STUDENT table

### Admin(faculty) bulk upload / Admin profile
The administrator module is also called as faculty module consist of tabs such as view report, upload questions and bulk registration, and the admin data are stored in TBL_MST_STAFF table.

### Question setup / bulk upload
In this question module, faculty can upload questions to the portal and questions can be uploaded into the system in two forms. One method is through an User interface which asks for questions, choices and their answer. Another method is through Excel sheet upload and this is stored in TBL_MST_QUESTION table.

### Student Assessment Page
In this module test will be assessed based upon the data which is already stored in the database and this result will be stored in TBL_TRS_STUDENT_ASSESSMENT table.

### Assessment Score
In this module, the score will be displayed based upon the test attempt. It can be either as individual or bulk of student score can be viewed from TBL_MST_SCORE_PARAMETER table.

### Database Creation
In this part, all the tables necessary for the creation of a database is done. The created files are stored in SQL folder. These files can be used to configure/ import the database in other systems.

### Levels details
#### Level 1 test  
This test can be taken by all the students irrespective of department and it is Initial 
tests are basic test and it consist of questions based upon problem solving skills such as Aptitude, and questions based upon Increasing communication skills through English.
#### Level 2 test
This test is considered to be as an intermediate test and it is specific to each department. Domain Knowledge can be increased in this field.
#### Level 3 test
This test is Advanced category test. Test questions are based upon various companies. Different companies have different criteria to evaluate a student and based upon that criteria, questions are generated.  

### Links to Project flow
[Student Flow](https://drive.google.com/file/d/1pB-FNXTdF8ruHIZd-GEjXRdDSgwVEJpt/view)
[Admin/ Faculty Flow](https://drive.google.com/file/d/15g-eHZrAiF-oG3t3MWT6ENjAcBw4Gsuk/view)

### Tasks Completed
- #### Project Flow [Arpana, Himanshu]
   Faculty flow[Arpana] and Student flow[Himanshu].
- #### Registration and Login [Himanshu]
   Design of login and registration page.
- #### Database Creation [Arpana]
   All tables creation with proper naming conventions.          
- #### Spring MVC Configuration [Himanshu]
   Configuration of POM.xml and WEB.xml files.
- #### Database Connectivity with Spring MVC [Arpana, Himanshu]
   Configured the appropriate JAR file required and updated with spring configuration.
- #### Creation of JSP files [Arpana, Himanshu]
   JSP files such as studentDashboard, facultyDashboard, takeTest, uploadQuestions, viewReport, etc., files creation.

### Future Enhancements
- Updation of Forgot Password feature
- Validating Username and Password for special cases
- Validation of test page 
- Adding Questions for other level tests
- Adding functionality to provide Training Test
- Faculty upload module

