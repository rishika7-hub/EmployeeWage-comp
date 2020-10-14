import java.util.*;
public class EmpWage {
	
	private static final int WAGE_PER_HOUR=20;
	private static final int FULL_DAY_HOUR=8;
	private static final int DAILY_WAGE=WAGE_PER_HOUR * FULL_DAY_HOUR;
	private static final int PART_DAY_HOUR=4;
	private static final int PART_TIME_WAGE=WAGE_PER_HOUR * PART_DAY_HOUR;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Welcome to Employee Wage Computation Problem");
				
				// Employee Attendance
				
				if(isEmployeePresent()) {
					System.out.println("Employee is Present");
				} else {
					System.out.println("Employee is Absent");
			        }
	}

	private static boolean isEmployeePresent() {
		// TODO Auto-generated method stub
		return new Random().nextBoolean();
	}
}
	
	


	


