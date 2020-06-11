/* Welcome to java program for emp wage */
public class EmpWage{
	public static void main(String[] args){
		//Constant
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOURS=8;
		//variable
		int dailyWage=0;
		int empHrs=0;
		int totalWage=0;

		System.out.println("Welcome Wage Employee..");
		//Computation
		for (int i=0; i<20; i++ )
		{
			 int empCheck = (int)Math.floor(Math.random() * 10 ) %3;
			 switch (empCheck){
				case 0:
							empHrs=0;
							break;
				case 1:
							empHrs=4;
							break;
				case 3:
							empHrs=8;
							break;
			}
		dailyWage= WAGE_PER_HOUR * empHrs;
		totalWage= totalWage + dailyWage;
			}
		System.out.println("Employee Daily Wage=" +totalWage);
	}
}
