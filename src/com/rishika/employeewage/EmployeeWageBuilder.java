package com.rishika.employeewage;

public class EmployeeWageBuilder implements CalcEmpWage {


	private CompanyEmpWage[] empWages;

	public EmployeeWageBuilder() {
		empWages = new CompanyEmpWage[2];
	}

	public static void main(String[] args) {

		EmployeeWageBuilder emps = new EmployeeWageBuilder();
		emps.empWages[0] = new CompanyEmpWage("Reliance Mart", 280, 22, 110);
		emps.calcWagesForMonth(emps.empWages[0]);
		emps.empWages[1] = new CompanyEmpWage("D Mart", 200, 20, 100);
		emps.calcWagesForMonth(emps.empWages[1]);

		for (int i = 0; i < 2; i++) {
			System.out.println(emps.empWages[i]);
		}
	}

	public void calcWagesForMonth (CompanyEmpWage compEmpWage) {
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

	@Override
	public void calcWagesForMonth() {
		// TODO Auto-generated method stub
		
	}
}
