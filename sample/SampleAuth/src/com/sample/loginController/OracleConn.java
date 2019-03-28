package com.sample.loginController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.CallableStatementCreator;
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
	public boolean validateStudent(String uname, String password) {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new oracle.jdbc.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlSelect = "SELECT * FROM TBL_MST_STUDENT WHERE VCH_STUDENT_EMAIL=? AND VCH_ROLL_NO=?";
		int i = jdbcTemplate.update(sqlSelect, uname, password);
		System.out.println(i);
		System.out.println(uname);
		System.out.println(password);
		//String allQ = "SELECT * FROM TBL_MST_STUDENT";
		
		//List list = jdbcTemplate.queryForList(allQ);
		
//		Map<String, Object> str = jdbcTemplate.queryForMap(allQ);
//		System.out.println(str);
//		System.out.println(list.toArray()[1]);
		
		if(i == 0) 
			return false;
		else
			return true;
	}
	
	public List getQuestions() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new oracle.jdbc.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String ques = "Select * from TBL_MST_QUESTION";
		List allQ = jdbcTemplate.queryForList(ques);
		
		//System.out.println(allQ);
		return allQ;
		
	}
	public List sampleGetQuestions() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new oracle.jdbc.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String ques = "Select * from TBL_MST_QUESTION";
		List<String> newS = new ArrayList<String>();
		
		List allQ = jdbcTemplate.queryForList(ques);
//		String allS = allQ.toString().replace("{", "").replace("}", "");
//		String s[] = allS.split(",");
		
//		newS = Arrays.asList(s);
//		String allS = toFormattedString(allQ);
//		System.out.println(allS);
//		System.out.println(newS);
//		String str =  allQ.get(4).toString();
		List<String> QuesList = new ArrayList<String>();
		String str = allQ.toString();
		String sArray[] = str.split("}");
		String ques1 = null;
		for(int i=1; i<5; i++) {
//			String str = allQ.get(i).toString();
//			QuesList.add(str.split("VCH_QUESTION_NAME=").toString());
			//System.out.println(sArray[i]);
//			ques1 = sArray[i].split("VCH_QUESTION_NAME=");
			ques1 = sArray[i].replaceAll("{NUM_QUESTION_ID=1, NUM_LEVEL_ID=1, NUM_SUBLEVEL_ID=1, VCH_QUESTION_NAME=", "");
			System.out.println(ques1);
		}
		
//		System.out.println(str);
//		for(String i:s) {
//			System.out.println(i);
//		}
//		for(String i: ques1) {
//			System.out.println(i);
//		}
		return allQ;
		
	}
	
	String toFormattedString(Map<String,Integer> map) {
	    return map.entrySet().stream()
	        .map(e -> String.format("(\"%s\", %d)", e.getKey(), e.getValue()))
	        .collect(Collectors.joining(", "));
	}
}