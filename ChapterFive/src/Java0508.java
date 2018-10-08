// Java0508.java
// This program demonstrates one-way selection with <if>.
// It fixes the logic problem of the previous program
// with block structure by using braces.


import java.util.Scanner;

public class Java0508
{
	public static void main (String args[])							
	{   
		System.out.println("\nJAVA0508.JAVA\n");
 		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Sales  ===>>  ");										
		double sales  = keyboard.nextDouble();
		double bonus = 250.00;
		if (sales >= 500000.0)
		{
			bonus += 500.0;
			System.out.println("Your sales >=       500,000.00");
			System.out.println("You will receive    500.00 extra bonus.");
		}        
		System.out.println("Yearly bonus:       " + bonus);
		System.out.println();
	}
}

