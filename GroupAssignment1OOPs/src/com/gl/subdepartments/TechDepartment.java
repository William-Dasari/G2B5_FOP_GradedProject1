package com.gl.subdepartments;

import com.gl.superdepartment.SuperDepartment;
public class TechDepartment extends SuperDepartment {
	
	//Declaring functions with return value of string type
	
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getTechStachInformation() {
		return "Core Java";
	}
}
