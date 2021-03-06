package com.java.setOracleConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class OracleConn {

//public static void main(String[] args) throws SQLException {
	
	public int saveStudent(Student student)
	{	
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new oracle.jdbc.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sqlInsert = "INSERT INTO TBL_MST_STUDENT(NUM_STUDENT_ID, VCH_ROLL_NO, VCH_STUDENT_NAME, NUM_BATCH, VCH_STUDENT_EMAIL, NUM_DEPARTMENT_ID, CHR_ACTIVE_STATUS ) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sqlInsert, 1, student.getRollNo(), student.getName(), student.getBatch(), student.getEmail(), student.getDeptId(),"Y" );
		
		return 0;
	}
	
	public int saveStaff(Staff staff)
	{	
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new oracle.jdbc.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sqlInsert = "INSERT INTO TBL_MST_STAFFS(NUM_STAFF_ID, VCH_STAFF_NAME, VCH_STAFF_EMAIL, NUM_DEPARTMENT_ID, CHR_ACTIVE_STATUS) values(?,?,?,?,?)";
		jdbcTemplate.update(sqlInsert, staff.getStaffId(), staff.getName(), staff.getEmail(), staff.getDeptId(),"Y" );
		
		return 0;
	}
	public int saveQuestionaire(Questionaire quest)
	{	
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new oracle.jdbc.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sqlInsert = "INSERT INTO TBL_MST_QUESTION(NUM_QUESTION_ID, VCH_QUESTION_NAME, VCH_QUESTION_CHOICE_1, VCH_QUESTION_CHOICE_2, VCH_QUESTION_CHOICE_3, VCH_QUESTION_CHOICE_4, NUM_CHOICE_ANSWER, VCH_QUESTION_TEXT_ANSWER, CHR_ACTIVE_STATUS, NUM_LEVEL_ID, NUM_SUBLEVEL_ID, NUM_CREATED_BY) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sqlInsert, 1, quest.getQuestionName(), quest.getQuestionChoice1(), quest.getQuestionChoice2(), quest.getQuestionChoice3(), quest.getQuestionChoice4(), quest.getQuestionChoiceAns(), quest.getQuestionTextAns() ,"Y", 1,1 ,19050);
		
		return 0;
	}
}