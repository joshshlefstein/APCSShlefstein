// Java0519.java
// This program demonstrates the postcondition <do..while> loop.
// This loop structure guarantees at least one repetition of
// the loop body.  Like the <while> loop this is not a 
// "fixed iteration" loop.
 


import java.util.Scanner;


public class Java0519
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0519.JAVA\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your ATM Person al Identification Number (PIN)!");
		System.out.println("\n\n");
		int PIN = 0;
		do
		{
			System.out.print("Enter your PIN  ==>>  ");
			PIN = input.nextInt();
			System.out.println();
			if (PIN == 1234)
				System.out.println("Your PIN is correct; you may proceed.");
			else
				System.out.println("That is not the correct PIN.");
			System.out.println("\n\n");
		}  
		while (PIN != 1234);
	}
}


										
