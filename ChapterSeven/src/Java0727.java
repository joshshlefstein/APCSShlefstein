// Java0727.java
// Payroll Case Study #5
// In all the previous stages the program statements were located in the <main> method. 
// Stage #5 divides the program up in a series of <class> methods for improved program readability.
// The comments are intentionally removed to show that with well-chosen variables names and with
// user-defined methods, a program becomes very organized and readable.
// There are some problems, because the program does not compile, unable to find many variables.


import java.util.Scanner;			
import java.text.*;			


public class Java0727
{			
	
	public static void main (String args[]) 							
	{   
	 	System.out.println("\nPAYROLL CASE STUDY #5\n");
	 	String employeeName;		
 		double hoursWorked;		
 		double hourlyRate;		
 		int numDependants;		
 		double overtimeHours;	
 		double regularPay;		
 		double overtimePay;		
 		double taxRate;			
 		double grossPay;			
 		double taxDeductions;	
 		double netPay;
 			
		enterData();
 		computeGrosspay();
 		computeDeductions();
 		computeNetpay();
 		printCheck();
 	}
 		
 		
 	public static void enterData() 	
 	{
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
		netPay = grossPay - taxDeductions;
	}
		
		
	public static void printCheck()
	{
		DecimalFormat output = new DecimalFormat("$0.00");
		System.out.println("\n\n");
		System.out.println("Name:	      " + employeeName);
		System.out.println("Hourly rate:  " + output.format(hourlyRate));
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Dependants:   " + numDependants);
		System.out.println("Tax rate:     " + output.format(taxRate));
		System.out.println("Regular pay:  " + output.format(regularPay));
		System.out.println("Overtime pay: " + output.format(overtimePay));
		System.out.println("Gross pay:    " + output.format(grossPay));
		System.out.println("Deductions:   " + output.format(taxDeductions));
		System.out.println("Net pay:      " + output.format(netPay));
		System.out.println("\n\n");
	}
}   
      


