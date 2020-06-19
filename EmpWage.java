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
		int jobType=0;

public void getWelcomeMessage() {
		System.out.println("Welcome Wage Employee wage computation");
		}


//class Empdetails extends EmpWage implements Employee { 

//		Empdetails() { }

public int getEmpSalary(String company, int daysPerMonth, int hrsPerMonth, int wagePerHr) {
		this.wagePerHr=wagePerHr;
      this.daysPerMonth=daysPerMonth;
      this.hrsPerMonth=hrsPerMonth;
      this.company=company;

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
		//System.out.println("Days :  "+totalWorkingDays+ " Employee Hours :  " +empHrs);
		}
		totalWage = totalWorkingHrs * wagePerHr;
		//System.out.println("Total Salary for employee of " +company+" is = Rs. "+totalWage);
		return totalWage;
}

@Override
public String toString() {
		return "Total Emp Wage for Company : "+company+" is: " +totalWage;
		}



public static void main (String[] args) {
		EmpWage emp[]= new EmpWage[5];
		//emp[0]=new EmpWage();
		//emp[1]=new EmpWage();
		ArrayList<Integer> salary = new ArrayList<Integer>();
		EmpWage employee = new EmpWage();
		employee.getWelcomeMessage();
		System.out.println("Company Details");
		//EmpWage dMart= new EmpWage("DMart ", 26, 60, 20);
		salary.add(0, employee.getEmpSalary("DMart ", 26, 60, 20));
		salary.add(1, employee.getEmpSalary("Reliance fresh", 28, 70, 18));
		for (int i=0;i<salary.size();i++)
			System.out.println("Per Month Wage  is Rs. "+salary.get(i));
		}
}
