// Java0510.java
// This program demonstrates two-way selection with <if..else>.
// Multiple statements require the use of block structure.


import java.util.Scanner;

public class Java0510
{
	public static void main (String args[])							
	{   
		System.out.println("\nJAVA0510.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter SAT  ===>>  ");										
		int sat  = keyboard.nextInt();
		if (sat >= 1100)
		{
			System.out.println("You are admitted");
			System.out.println("Orientation will start in June");
		}
		else
		{
			System.out.println("You are not admitted");
			System.out.println("Please try again when your SAT improves.");
		}
		System.out.println();
	}
}

