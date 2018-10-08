// Java0509.java
// This program demonstrates two-way selection with <if..else>.


import java.util.Scanner;

public class Java0509
{
	public static void main (String args[]) 							
	{   
		System.out.println("\nJAVA0509.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter SAT  ===>>  ");										
		int sat  = keyboard.nextInt();
		if (sat >= 1100)
			System.out.println("You are admitted");
		else
			System.out.println("You are not admitted");
		System.out.println();
	}
}

