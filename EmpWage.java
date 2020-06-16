/* Welcome to java program for emp wage */
public class EmpWage{
		//Constant
		public static final int IS_FULL_TIME=2;
		public static final int IS_PART_TIME=1;
		public static final int WAGE_PER_HOUR=20;
		public static final int FULL_DAY_HOURS=8;
		public static final int NUM_OF_WORKING_DAYS=20;
		public static final int MAX_HRS_IN_MONTH =100;


public static int computeWage() {
		//variable
		int empHrs=0;
		int totalWage=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;

		System.out.println("Welcome Wage Employee..");
		//Computation
		while( totalWorkingHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS )
		{
			 int empCheck = (int)Math.floor(Math.random() * 10 ) %3;
			 switch (empCheck) {
				case 0:
							empHrs=0;
							break;
				case 1:
							empHrs=4;
							break;
				case 2:
							empHrs=8;
							break;
			}
		++totalWorkingDays;
      totalWorkingHrs=totalWorkingHrs + empHrs;
		}
		System.out.println("Total Day count:- "+totalWorkingDays+"\nEmp Working Hours :- "+totalWorkingHrs);
		totalWage= totalWorkingHrs * WAGE_PER_HOUR;
		System.out.println("Employee total Wage=" +totalWage);
		return totalWage;
	}
public static void main (String[] args) {
		computeWage();
		}
}
