// Java0729.java
// Payroll Case Study #7
// Stage #7 solves the problem of the previous program.  The variables are declared in the <Java0720>
// class, which makes them available anywhere in the class.  The previous program made variables only
// available within their respective methods.


import java.util.Scanner;			
import java.text.*;			


public class Java0729
{ 		
	
	static String employeeName;		
 	static double hoursWorked;		
 	static double hourlyRate;		
 	static int 	  numDependants;		
 	static double overtimeHours;	
 	static double regularPay;		
 	static double overtimePay;		
 	static double taxRate;			
 	static double grossPay;			
 	static double taxDeductions;	
 	static double netPay;	

	public static void main (String args[]) 							
	{   
	 	System.out.println("\nPAYROLL CASE STUDY #7\n");
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
		System.out.println("Tax rate:     " + taxRate);
		System.out.println("Regular pay:  " + output.format(regularPay));
		System.out.println("Overtime pay: " + output.format(overtimePay));
		System.out.println("Gross pay:    " + output.format(grossPay));
		System.out.println("Deductions:   " + output.format(taxDeductions));
		System.out.println("Net pay:      " + output.format(netPay));
		System.out.println("\n\n");
	}
}   
      


