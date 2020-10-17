package com.rishika.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeWageBuilder implements CalcEmpWage {
	
	private ArrayList<CompanyEmpWage> empWages;
	
	public EmployeeWageBuilder() {
		empWages = new ArrayList<CompanyEmpWage>();
	}


	public static void main(String[] args) {

			EmpWageBuilder emps = new EmpWageBuilder();
			((ArrayList<CompanyEmpWage>) emps.empWages).add(new CompanyEmpWage("Reliance Mart", 280, 22, 110));
			((ArrayList<CompanyEmpWage>) emps.empWages).add(new CompanyEmpWage("D Mart", 200, 20, 100));

			for (CompanyEmpWage cew : emps.empWages) {
				emps.calcWagesForMonth(cew);
			}

			for (CompanyEmpWage cew : emps.empWages) {
				System.out.println(cew);
				System.out.println("-->Daily wages<--");
				for (String k : cew.dailyWagesRecord.keySet()) {
					System.out.println(k + ": " + cew.dailyWagesRecord.get(k));
				}
			}
		}

		public void calcWagesForMonth(CompanyEmpWage compEmpWage) {
			long wages = 0;
			int workingHours = 0, workingDays = 0;
			Map<String, Long> dailyWages = new HashMap<String, Long>();
			while (workingDays < compEmpWage.workingDaysPerMonth && workingHours < compEmpWage.workingHoursPerMonth) {
				workingDays++;
				if (compEmpWage.isEmployeePresent()) {
					workingHours += CompanyEmpWage.FULL_DAY_WORKING_HOURS;
					wages += compEmpWage.dailyWage;
					dailyWages.put("Day#" + workingDays, (long) compEmpWage.dailyWage);
				} else {
					dailyWages.put("Day#" + workingDays, (long) 0);
				}
			}
			compEmpWage.setMonthlyWage(wages);
			compEmpWage.setDailyWagesRecord(dailyWages);
		}
	}