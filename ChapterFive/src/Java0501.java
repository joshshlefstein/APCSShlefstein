// Java0501.java
// This program demonstrates user keyboard input during program execution.
// Many program features will be used that will be explained later.


import java.util.Scanner;									// Line 1

public class Java0501
{
	public static void main (String args[]) 						
	{   
		System.out.println("\nJAVA0501.JAVA\n");
		Scanner input = new Scanner(System.in);				// Line 2 
		System.out.print("Enter name  ===>>  ");			// Line 3
		String name = input.nextLine();						// Line 4
		System.out.println("Name Entered:      " + name);
		System.out.println();
	}
}

