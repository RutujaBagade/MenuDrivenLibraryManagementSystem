package com.librarystore.beans;

import java.io.Serializable;


public class Student  extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2515940756629059990L;
	private String branchName;
	private String courseName;
	

	
	
	
	public Student() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		return true;
	}

	public Student(int userId, String name, String email, String phone,String branchName, String courseName) {
		super(userId,name,email,phone);
		this.branchName = branchName;
		this.courseName = courseName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "["+super.toString()+" ,branchName=" + branchName + ", courseName=" + courseName + "]";
	}
	
	
	
	

}
