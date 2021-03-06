package com.rishika.employeewage;

import java.util.Random;

public class CompanyEmpWage {
	private static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	private final int dailyWage;
	private final int workingDaysPerMonth;
	private final int workingHoursPerMonth;
	private long monthlyWage;

	public CompanyEmpWage(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
		calcWagesForMonth();
	}


	public void calcWagesForMonth() {
		// TODO Auto-generated method stub
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < workingDaysPerMonth && workingHours < workingHoursPerMonth) {
			workingDays++;
			if (isEmployeePresent()) {
				workingHours += FULL_DAY_WORKING_HOURS;
				wages += dailyWage;
			}
		}
		monthlyWage = wages;
	}

		
	public boolean isEmployeePresent() {
		// TODO Auto-generated method stub
		return new Random().nextBoolean();
	}
	@Override
	public String toString() {
		return "Monthly wage for an employee of company " + companyName + " is " + monthlyWage;
	}
}