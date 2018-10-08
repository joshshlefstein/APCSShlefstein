// Java0518.java
// This program demonstrates the precondition <while> loop.
// This loop will continue until the winning number is entered.
// This loop does not repeat in a fixed number of times. 


import java.util.Scanner;

public class Java0518
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0518.JAVA\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number between 1 and 100");
		System.out.println("The first person to guess the number wins the price.");
		System.out.println();
		int guess = 0;
		while (guess != 31)
		{
			System.out.print("Enter your guess  ==>>  ");
			guess = input.nextInt();
			if (guess == 31)
				System.out.println("You are the winner.");
			else
				System.out.println("That is not the winning number.");
			System.out.println();
		}
	}
}