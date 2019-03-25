package com.java.setOracleConn;

public class Staff {

	private int staffId;
	private String name;
	private String staffNo;
	private String email;
	private int deptId;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(int staffId, String name, String staffNo, String email, int deptId) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.staffNo = staffNo;
		this.email = email;
		this.deptId = deptId;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
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
		return "Staff [staffId=" + staffId + ", name=" + name + ", staffNo=" + staffNo + ", email=" + email
				+ ", deptId=" + deptId + "]";
	}
	
}
