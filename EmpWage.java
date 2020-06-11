/* Welcome to java program for emp wage */
public class EmpWage{
	public static void main(String[] args){
		//Constant
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOURS=8;
		//variable
		double empCheck = Math.floor(Math.random() * 10 ) %2;
		int dailyWage=0;

		System.out.println("Welcome Wage Employee..");
		//Computation
		if (empCheck == 1)
		{
			System.out.println("Employee is Present.");
			dailyWage= WAGE_PER_HOUR * FULL_DAY_HOURS;
		}
		else
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("Employee Daily Wage=" +dailyWage);
	}
}
