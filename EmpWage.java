/* Welocome to java program for emp wage */
import java.io.*;
import java.util.*;

interface Employee {
      public int getEmpSalary(String company, int daysPerMonth, int hrsPerMonth, int wagePerHr);
      }


public class EmpWage implements Employee {
		//Constant
		private static final int IS_FULL_TIME=2;
		private static final int IS_PART_TIME=1;

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
		System.out.println("Welcome Wage Employee wage computation");
		}



public int getEmpSalary(String company, int daysPerMonth, int hrsPerMonth, int wagePerHr) {
		this.wagePerHr=wagePerHr;
      this.daysPerMonth=daysPerMonth;
      this.hrsPerMonth=hrsPerMonth;
      this.company=company;
		int[] dailyWage=new int[daysPerMonth+1];
		int[] totalWage=new int[daysPerMonth+1];
		int i=0;
		int totalSalary=0;
		int dailySalary=0;

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
		//totalWorkingHrs += empHrs;
		dailySalary=empHrs * wagePerHr;
		totalSalary = totalSalary+dailySalary;
		dailyWage[i]=dailySalary;
		totalWage[i]=totalSalary;
		i++;
		//System.out.println("Days :  "+totalWorkingDays+ " Employee Hours :  " +empHrs);
		}
		//totalWage = totalWorkingHrs * wagePerHr;
		System.out.println("Days \t DailyWage \t TotalWage");
		System.out.println();
		i=1;
		for(int j=0;j<dailyWage.length;j++)
		{
			if(i>daysPerMonth)
				break;
			System.out.println("Day"+(j+1)+"\t "+dailyWage[j]+"\t \t "+totalWage[j]);
			i+=1;
		}
		return 0;
}

@Override
public String toString() {
		return "Total Emp Wage for Company : "+company+" is: " +totalWage;
		}



public static void main (String[] args) {
		EmpWage employee = new EmpWage();
		employee.getWelcomeMessage();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Company you would like access the wage for:[DMart, Decathlon, Reliance]");
		String company = scanner.next();
		if(company.equals("Dmart"))
			employee.getEmpSalary("DMart ", 26, 60, 20);
		else if(company.equals("Bridgelabs"))
			employee.getEmpSalary("Bridgelabs ", 24, 50, 18);
		else
			employee.getEmpSalary("DMart ", 26, 60, 20);

		}
}
