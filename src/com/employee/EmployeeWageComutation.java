package com.employee;
  
public class EmployeeWageComutation {
	 public static final int IS_PART_TIME = 4;
	 public static final int IS_FULL_TIME = 8;
	 public static final int EMP_RATE_PER_HOUR= 20;
	 public static final int empPresent = 1;
	 public static final int empPartTime = 2;
	 public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		
		
		int dailywage= 0;
		
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		
		switch (empCheck) {
		
		case empPresent: {
			dailywage = IS_FULL_TIME * EMP_RATE_PER_HOUR * NUM_OF_WORKING_DAYS ;
			System.out.println("Employee Full Time is Present");
			System.out.println("Employee Daily 20 Day Wage Is : "+ dailywage);
			 
			break;
		}
		
		case empPartTime:{
			dailywage =IS_PART_TIME *EMP_RATE_PER_HOUR * NUM_OF_WORKING_DAYS;
			System.out.println("Employee Part Time is Present");
			System.out.println("Employee Part Time 20 Day Wage Is : "+ dailywage);
			break;
		}
		
		default:
			System.out.println("Employee is Absent");
			break;
		
		}
        
		
	}	

}


