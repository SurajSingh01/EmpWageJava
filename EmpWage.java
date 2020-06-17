/* Welcome to java program for emp wage */
public class EmpWage{
		//Constant
		private static final int IS_FULL_TIME=2;
		private static final int IS_PART_TIME=1;
		private static final int WAGE_PER_HOUR=20;
		private static final int FULL_DAY_HOURS=8;
		private static final int NUM_OF_WORKING_DAYS=20;
		private static final int MAX_HRS_IN_MONTH =100;

		//variable
		int empHrs=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;
		int totalWage = 0;
		int dailyWage = 0;
		int daysPerMonth = 0;
		int hrsPerMonth = 0;
		int wagePerHr = 0;
		int empCheck=0;

public void getWelcomeMessage() {
		System.out.println("Welcome Wage Employee..");
		}

//public int getEmpHrs() {
public void getEmpSalary(String company, int daysPerMonth, int hrsPerMonth, int wagePerHr) {
		this.wagePerHr=wagePerHr;
      this.daysPerMonth=daysPerMonth;
      this.hrsPerMonth=hrsPerMonth;
      company=company;

		while( totalWorkingHrs < hrsPerMonth && totalWorkingDays < daysPerMonth ) {
		empCheck = (int)Math.floor(Math.random() * 10 ) %3;
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
		totalWorkingHrs += empHrs;
		}
		System.out.println("************************* "+company+"********************************************");
		System.out.println("Total working Hrs for the employee in "+daysPerMonth+ " days is " +totalWorkingHrs);
		totalWage = totalWorkingHrs * wagePerHr;
		System.out.println("Employee total wage"+totalWage);
	}


public static void main (String[] args) {
		EmpWage emp=new EmpWage();
		emp.getWelcomeMessage();
		emp.getEmpSalary("DMart ", 26, 60, 20);          //company dayspermonth hrspermonth wageperhour
		emp.getEmpSalary("Reliance fresh ", 28, 70, 18);
		}
}
