package com.io.serial;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String studentName;
	private Integer studentid;
	private String department;
	public Student() {
		super();
	}
	public Student(String studentName, Integer studentid, String department) {
		super();
		this.studentName = studentName;
		this.studentid = studentid;
		this.department = department;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentid=" + studentid + ", department=" + department + "]";
	}
	

}
