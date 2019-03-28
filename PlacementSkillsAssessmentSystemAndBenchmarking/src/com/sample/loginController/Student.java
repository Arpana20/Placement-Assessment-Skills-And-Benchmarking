package com.sample.loginController;

public class Student {
	
	private int studentId;
	private String name;
	private String rollNo;
	private int batch;
	private String email;
	private int deptId;
	
	public Student(int studentId, String name, String rollNo, int batch, String email, int deptId) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.rollNo = rollNo;
		this.batch = batch;
		this.email = email;
		this.deptId = deptId;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return rollNo + " " + name + " " + batch + " " + email + " " + deptId;
	}
		
}
