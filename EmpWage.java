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
		String company;

public void getWelcomeMessage() {
		System.out.println("Welcome Wage Employee..");
		}

//public int getEmpHrs() {
public EmpWage(String company, int daysPerMonth, int hrsPerMonth, int wagePerHr) {
		this.wagePerHr=wagePerHr;
      this.daysPerMonth=daysPerMonth;
      this.hrsPerMonth=hrsPerMonth;
      this.company=company;
		}

public void getEmpSalary() {

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
		System.out.println("Days :  "+totalWorkingDays+ " Employee Hours :  " +empHrs);
		}
<<<<<<< HEAD
		System.out.println("************************* "+company+"********************************************");
=======
<<<<<<< HEAD

=======
		System.out.println("************************"+company+"**********************");
>>>>>>> UC9_addMultipleCompany
		System.out.println("Total working Hrs for the employee in "+daysPerMonth+ " days is " +totalWorkingHrs);
>>>>>>> e77ce6e40f9a5b1be4b3ec358d167bd431cbdf1a
		totalWage = totalWorkingHrs * wagePerHr;
 //		System.out.println("Employee total wage"+totalWage);
	}

@Override
public String toString() {
		return "Total Emp Wage for Company : "+company+" is: " +totalWage;
		}


public static void main (String[] args) {
<<<<<<< HEAD
		EmpWage emp=new EmpWage();
		emp.getWelcomeMessage();
		emp.getEmpSalary("DMart ", 26, 60, 20);          //company dayspermonth hrspermonth wageperhour
		emp.getEmpSalary("Reliance fresh ", 28, 70, 18);
=======
		//EmpWage emp=new EmpWage();
		//emp.getWelcomeMessage();
		EmpWage dMart= new EmpWage("DMart ", 26, 60, 20);
		dMart.getWelcomeMessage();
		EmpWage reliance=new EmpWage("Reliance fresh ", 28, 70, 18);
		dMart.getEmpSalary();
		System.out.println(dMart);
		reliance.getEmpSalary();
		System.out.println(reliance);
>>>>>>> UC9_addMultipleCompany
		}
}
