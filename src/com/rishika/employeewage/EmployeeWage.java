package com.rishika.employeewage;

import java.util.Random;

public class EmployeeWage {
	
	private static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	private final int dailyWage;
	private final int workingDaysPerMonth;
	private final int workingHoursPerMonth;
	

	public EmployeeWage(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public long getWagesForMonth() {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < workingDaysPerMonth && workingHours < workingHoursPerMonth) {
			workingDays++;
			if (isEmployeePresent()) {
				workingHours += FULL_DAY_WORKING_HOURS;
				wages += dailyWage;
			}
		}
		return wages;
	}



	private boolean isEmployeePresent() {
		// TODO Auto-generated method stub
		return new Random().nextBoolean();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage dMart = new EmployeeWage("D Mart", 200, 20, 100);
		EmployeeWage relianceMart = new EmployeeWage("Reliance Mart", 280, 22, 110);

		System.out.println("Monthly wage for an employee of company " + dMart.getCompanyName() + " is "
				+dMart.getWagesForMonth());
		System.out.println("Monthly wage for an employee of company " + relianceMart.getCompanyName() + " is "
				+ relianceMart.getWagesForMonth());
	}
}
