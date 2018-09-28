// Java0317.java
// This program demonstrates the use of self-commenting identifiers.


public class Java0317
{
	public static void main (String args[])
	{
		double hoursWorked;
		double hourlyRate;
		double grossPay;
		double deductions;
		double netPay;

		hoursWorked = 35;
		hourlyRate = 8.75;
		grossPay = hoursWorked * hourlyRate;
		deductions = grossPay * 0.29;
		netPay = grossPay - deductions;

		System.out.println("Hours Worked:   " + hoursWorked);
		System.out.println("Hourly Rate:    " + hourlyRate);
		System.out.println("Gross Pay:      " + grossPay);
		System.out.println("Deductions:     " + deductions);
		System.out.println("Net Pay:        " + netPay);
		System.out.println();
	}

}

