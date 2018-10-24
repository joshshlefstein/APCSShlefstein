// Java0728.java
// Payroll Case Study #6
// Stage #6 tries to correct the variable problems of Stage #5.  Variables are declared
// in every location where they are used to allow access to such variables.
// The idea seems logical, but the program now has different compile problems.


import java.util.Scanner;			
import java.text.*;			


public class Java0728
{			
	
	public static void main (String args[])							
	{   
	 	System.out.println("\nPAYROLL CASE STUDY #6\n");		
		enterData();
 		computeGrosspay();
 		computeDeductions();
 		computeNetpay();
 		printCheck();
 	}
 		
 		
 	public static void enterData() 	
 	{
 		String employeeName;		
 		double hoursWorked;		
 		double hourlyRate;		
 		int numDependants;		
 		Scanner keyboard = new Scanner(System.in);	
		System.out.print("Enter Name  ===>>  ");										
		employeeName = keyboard.nextLine();	
		System.out.print("Enter Hours Worked  ===>>  ");										
		hoursWorked = keyboard.nextDouble();
		System.out.print("Enter Hourly Rate   ===>>  ");										
		hourlyRate = keyboard.nextDouble();	
		System.out.print("Enter Dependants    ===>>  ");										
		numDependants = keyboard.nextInt();		
	}
		
		
		
	public static void computeGrosspay()
	{
		double hoursWorked;		
 		double hourlyRate;		
		double overtimeHours;	
 		double regularPay;		
 		double overtimePay;					
 		double grossPay;			

		if (hoursWorked > 40)	
		{
			overtimeHours = hoursWorked - 40;
		 	regularPay = 40 * hourlyRate;
		 	overtimePay = overtimeHours * hourlyRate * 1.5;
		}
		else					
		{
			regularPay = hoursWorked * hourlyRate;
			overtimePay = 0;
		}
		grossPay = regularPay + overtimePay;
	}
	 	
	 	
	public static void computeDeductions()
	{ 		
 		int numDependants;			
 		double taxRate;			
 		double grossPay;			
 		double taxDeductions;	

		switch (numDependants)
		{
			case 0 : taxRate = 0.295; break;
			case 1 : taxRate = 0.249; break;
			case 2 : taxRate = 0.187; break;
			case 3 : taxRate = 0.155; break;
			case 4 : taxRate = 0.126; break;
			case 5 : taxRate = 0.100; break;
			default: taxRate = 0.075;
		}
		taxDeductions = grossPay * taxRate;
	}
		
		
	public static void computeNetpay()
	{
		double grossPay;			
 		double taxDeductions;	
 		double netPay;
		netPay = grossPay - taxDeductions;
	}
		
		
	public static void printCheck()
	{
		DecimalFormat output = new DecimalFormat("$0.00");
		String employeeName;		
 		double hoursWorked;		
 		double hourlyRate;		
 		int numDependants;			
 		double regularPay;		
 		double overtimePay;		
 		double taxRate;			
 		double grossPay;			
 		double taxDeductions;	
 		double netPay;
 		
		System.out.println("\n\n");
		System.out.println("Name:	      " + employeeName);
		System.out.println("Hourly rate:  " + output.format(hourlyRate));
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Dependants:   " + numDependants);
		System.out.println("Tax rate:     " + taxRate);
		System.out.println("Regular pay:  " + output.format(regularPay));
		System.out.println("Overtime pay: " + output.format(overtimePay));
		System.out.println("Gross pay:    " + output.format(grossPay));
		System.out.println("Deductions:   " + output.format(taxDeductions));
		System.out.println("Net pay:      " + output.format(netPay));
		System.out.println("\n\n");
	}
}   
      


