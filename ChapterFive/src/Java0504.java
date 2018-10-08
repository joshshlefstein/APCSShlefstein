// Java0504.java
// This program uses the <nextInt> method to enter integers from the keyboard.
// It is now possible to correctly add the two numbers.


import java.util.Scanner;

public class Java0504
{
	public static void main (String args[]) 							
	{  
 		System.out.println("\nJAVA0504.JAVA\n");
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Number  ===>>  ");										
		int number1 = input.nextInt();
		System.out.print("Enter 2nd Number  ===>>  ");										
		int number2 = input.nextInt();
		int sum = number1 + number2;		
		System.out.println();																	
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println();
	}
}
