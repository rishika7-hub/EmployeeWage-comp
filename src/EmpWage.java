import java.util.*;
public class EmpWage {
	
	private static final int WAGE_PER_HOUR=20;
	private static final int FULL_DAY_HOUR=8;
	private static final int DAILY_WAGE=WAGE_PER_HOUR * FULL_DAY_HOUR;
	private static final int PART_DAY_HOUR=4;
	private static final int PART_TIME_WAGE=WAGE_PER_HOUR * PART_DAY_HOUR;
	public static final int IS_PART_TIME=2;
	public static final int IS_FULL_TIME=1;
	

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
				
				// Employee Attendance
				
				if(isEmployeePresent()) {
					System.out.println("Employee is Present");
				} else {
					System.out.println("Employee is Absent");
			        }
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
	
	


	


