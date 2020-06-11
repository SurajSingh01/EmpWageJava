/* Welcome to java program for emp wage */
public class EmpWage{
	public static void main(String[] args){
		//Constant
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOURS=8;
		//variable
		double empCheck = Math.floor(Math.random() * 10 ) %3;
		int dailyWage=0;

		System.out.println("Welcome Wage Employee..");
		//Computation
		if (empCheck == IS_FULL_TIME)
		{
			dailyWage= WAGE_PER_HOUR * 8;
		}
		else if (empCheck == IS_PART_TIME)
			dailyWage= WAGE_PER_HOUR *4;
		else
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("Employee Daily Wage=" +dailyWage);
	}
}
