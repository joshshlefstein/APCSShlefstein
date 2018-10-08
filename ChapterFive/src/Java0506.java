// Java0506.java
// This program demonstrates one-way selection with <if>.
// Run the program twice.  First with Sales equals to 300,000 
// and a second time with Sales equals 500,000.


import java.util.Scanner;

public class Java0506
{
	public static void main (String args[]) 							
	{   
		System.out.println("\nJAVA0506.JAVA\n");
 		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Sales  ===>>  ");										
		double sales  = keyboard.nextDouble();
		double bonus = 250.00;
		if (sales >= 500000.0)
			bonus += 500.0;
		System.out.println("Yearly bonus:       " + bonus);
		System.out.println();
	}
}
