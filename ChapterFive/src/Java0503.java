// Java0503.java
// This program demonstrates <String> objects concatenation with 
// keyboard entered data.                                                    


import java.util.Scanner;

public class Java0503
{
	public static void main (String args[]) 							
	{  
 		System.out.println("\nJAVA0503.JAVA\n");
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Number  ===>>  ");										
		String number1 = input.nextLine();
		System.out.print("Enter 2nd Number  ===>>  ");										
		String number2 = input.nextLine();
		String sum = number1 + number2;		
		System.out.println();																	
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println();
	}
}
