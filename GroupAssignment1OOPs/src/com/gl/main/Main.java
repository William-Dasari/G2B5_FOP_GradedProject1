package com.gl.main;

import com.gl.subdepartments.AdminDepartment;
import com.gl.subdepartments.HrDepartment;
import com.gl.subdepartments.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment admindepartment = new AdminDepartment();
		HrDepartment hrdepartment = new HrDepartment();
		TechDepartment techdepartment = new TechDepartment();

		/*
		 * Printing statements Printing the output for AdminDepartment
		 */

		System.out.println("Welcome to " + admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		System.out.println();
		

		// Printing the output for HrDepartment

		System.out.println("Welcome to "+hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		System.out.println();

		// Printing the output for TechDepartment

		System.out.println("Welcome to "+techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStachInformation());
		System.out.println(techdepartment.isTodayAHoliday());
		
	}

}
