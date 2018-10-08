// Java0507.java
// This program demonstrates one-way selection with <if>.
// It also shows that only one statement is controlled.
// Run the program twice.  First with Sales equals to 300,000 
// and then a second time with Sales equals to 500,000.


import java.util.Scanner;

public class Java0507
{
	public static void main (String args[]) 							
	{   
		System.out.println("\nJAVA0507.JAVA\n");
 		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Sales  ===>>  ");										
		Double sales  = keyboard.nextDouble();
		double bonus = 250.00;
		if (sales >= 500000.0)
			bonus += 500.0;
			System.out.println("Your sales >=       500,000.00");
			System.out.println("You will receive    500.00 extra bonus.");        
		System.out.println    ("Yearly bonus:       " + bonus);
		System.out.println();
	}
}

