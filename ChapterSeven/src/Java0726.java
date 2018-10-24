// Java0726.java
// Payroll Case Study #4
// Stage 4 separates the program statements in the main method with spaces and comments
// to help identify the purpose for each segment.  This helps program debugging and updating.
// Note that this program does not prevents erroneous input.


import java.util.Scanner;	// provides access to the input methods of the Scanner class.
import java.text.*;			// used for text output with <DecimalFormat> class.


public class Java0726
{
	public static void main (String args[]) 						
	{   

		/////////////////////////////////////////////////////////////////////////////////////////////////////
		// Program variables
		//
 		String employeeName;	// 	employee name used on payroll check	 
 		double hoursWorked;		//	hours worked per week
 		double hourlyRate;		//	employee wage paid per hour
 		int numDependants;		//	number of dependats declared for tax rate purposes
 		double overtimeHours;	//	number of hours worked over 40
 		double regularPay;		//	pay earned for up to 40 hours worked
 		double overtimePay;		//	pay earned for hours worked above 40 per week
 		double taxRate;			//	tax rate, based on declared dependants, used for deduction computation
 		double grossPay;		//	total pay earned before deductions
 		double taxDeductions;	//	total tax deductions
 		double netPay;			//	total take-home pay, which is printed on the check
 		//////////////////////////////////////////////////////////////////////////////////////////////////////
 		
 		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		//	Program objects
		//
		Scanner keyboard = new Scanner(System.in);	
			//	keyboard is used for interactive keyboard input
 		DecimalFormat output = new DecimalFormat("$0.00");
 			//	output is used to display values in monetary format
 		////////////////////////////////////////////////////////////////////////////////////////////////////
 		
 		
 		///////////////////////////////////////////////////////////////////////////////////////////////////
 		//	Program input
 		//
 		System.out.println("\nPAYROLL CASE STUDY #3\n");
		System.out.print("Enter Name  ===>>  ");										
		employeeName = keyboard.nextLine();	
		System.out.print("Enter Hours Worked  ===>>  ");										
		hoursWorked = keyboard.nextDouble();
		System.out.print("Enter Hourly Rate   ===>>  ");										
		hourlyRate = keyboard.nextDouble();	
		System.out.print("Enter Dependants    ===>>  ");										
		numDependants = keyboard.nextInt();	
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		//	Program computation
		//
		if (hoursWorked > 40)	//	qualifies for overtime pay
		{
			 overtimeHours = hoursWorked - 40;
			 regularPay = 40 * hourlyRate;
			 overtimePay = overtimeHours * hourlyRate * 1.5;
		}
	 	else					//	does not qualify for overtime pay
	 	{
	 		regularPay = hoursWorked * hourlyRate;
	 		overtimePay = 0;
	 	}
	 	
	 	
	 	grossPay = regularPay + overtimePay;
	 		//	total pay earned before any deductions
	 		
	 		
		switch (numDependants)
			//	compute proper tax rate based on declared dependants
			//	everybody gets 0.075 tax rate if dependants are greater than 5
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
		
		netPay = grossPay - taxDeductions;
			//	computes actual take-home-pay, which is printed on the paycheck
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		// Output display, which simulates the printing of a payroll check
		//
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
		/////////////////////////////////////////////////////////////////////////////////////////////
	}   
      
}

