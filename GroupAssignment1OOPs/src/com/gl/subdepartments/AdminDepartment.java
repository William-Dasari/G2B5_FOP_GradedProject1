package com.gl.subdepartments;

import com.gl.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	//Declaring functions with return value of string type
	
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
