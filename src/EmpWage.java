import java.util.*;
public class EmpWage {

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

	public static boolean isEmployeePresent() {
		// TODO Auto-generated method stub
		return new Random().nextBoolean();
	}
}
