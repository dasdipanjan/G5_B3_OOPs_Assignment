package com.glearning.department;

/**
 * This class contains functionality of admin departments.
 * 
 * @author Amit, Arka, Latika, Dipanjan
 * @version 1.0
 * @since 02-12-2022
 *
 */
public class AdminDepartment extends SuperDepartment {

	/**
	 * Default constructor of AdminDepartment.
	 */
	public AdminDepartment() {
		super();
	}

	/**
	 * This method is responsible to return department name;
	 * 
	 * @return String value.
	 */
	@Override
	public String departmentName() {
		return "Admin Department";
	}

	/**
	 * This method is responsible to return about today's work.
	 * 
	 * @return String value.
	 */
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	/**
	 * This method is responsible to return about work deadline.
	 * 
	 * @return String value
	 */
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return "Admin Department: Today is not a holiday";
	}
}
