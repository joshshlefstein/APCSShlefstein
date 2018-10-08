// Java0502.java
// This program demonstrates how to use <nextLine> for three separate String keyboard inputs.                                                   


import java.util.Scanner;

public class Java0502
{
	public static void main (String args[]) 							
	{  
 		System.out.println("\nJAVA0502.JAVA\n");
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter Line 1  ===>>  ");									
		String input1 = input.nextLine();											
		System.out.print("Enter Line 2  ===>>  ");									
		String input2 = input.nextLine();
		System.out.print("Enter Line 3  ===>>  ");									
		String input3 = input.nextLine();		
		System.out.println();
		System.out.println(input1);
		System.out.println(input2);
		System.out.println(input3);	
		System.out.println();
	}
}

