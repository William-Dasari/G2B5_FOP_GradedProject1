package com.gl.subdepartments;

import com.gl.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	//Declaring functions with return value of string type
	
	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}



}
