import java.util.*;
public class EmpWage {
	
	private static final int WAGE_PER_HOUR=20;
	private static final int FULL_DAY_HOUR=8;
	private static final int DAILY_WAGE=WAGE_PER_HOUR * FULL_DAY_HOUR;
	private static final int PART_DAY_HOUR=4;
	private static final int PART_TIME_WAGE=WAGE_PER_HOUR * PART_DAY_HOUR;
	public static final int IS_PART_TIME=2;
	public static final int IS_FULL_TIME=1;
	private static final int WORKING_DAYS_PER_MONTH=20;
	


	public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("Welcome to Employee Wage Computation Problem");

				int empHrs = 0;
				int empWage=0;
				int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
				switch (empCheck()) {
				case IS_FULL_TIME: 
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					break;
				} 
				
				//Wages For Month
					int wages = 0;
					for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
						System.out.println("Day #" + i);
						if (isEmployeePresent()) {
							System.out.println("Present");
							wages += DAILY_WAGE;
						} else {
							System.out.println("Absent");
						}
					}
					return;
				}
				
				
				
				
				
				
		
				
			
	private static int empCheck() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getEmployeeType() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean isEmployeePresent() {
		// TODO Auto-generated method stub
		return new Random().nextBoolean();
	}
}
	
	


	


