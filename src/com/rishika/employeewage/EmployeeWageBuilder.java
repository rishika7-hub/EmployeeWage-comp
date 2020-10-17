package com.rishika.employeewage;

import java.util.ArrayList;

public class EmployeeWageBuilder implements CalcEmpWage {
	
	private ArrayList<CompanyEmpWage> empWages;
	
	public EmployeeWageBuilder() {
		empWages = new ArrayList<CompanyEmpWage>();
	}


	public static void main(String[] args) {

		EmployeeWageBuilder emps = new EmployeeWageBuilder();
		emps.empWages.add(new CompanyEmpWage("Big Basket", 280, 22, 110));
		emps.empWages.add(new CompanyEmpWage("JIO Mart", 200, 20, 100));

		for (CompanyEmpWage cew : emps.empWages) {
			emps.calcWagesForMonth(cew);
		}

		for (CompanyEmpWage cew : emps.empWages) {
			System.out.println(cew);
		}
	}
	
	public void calcWagesForMonth(CompanyEmpWage compEmpWage) {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < compEmpWage.workingDaysPerMonth && workingHours < compEmpWage.workingHoursPerMonth) {
			workingDays++;
			if (compEmpWage.isEmployeePresent()) {
				workingHours += CompanyEmpWage.FULL_DAY_WORKING_HOURS;
				wages += compEmpWage.dailyWage;
			}
		}
		compEmpWage.setMonthlyWage(wages);

	}
}