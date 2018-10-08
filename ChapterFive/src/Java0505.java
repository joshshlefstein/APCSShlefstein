// Java0505.java
// This program demonstrates how to use <nextDouble> for three separate double keyboard inputs,
// which are used to display the mean.                                                   


import java.util.Scanner;

public class Java0505
{
	public static void main (String args[]) 							
	{  
 		System.out.println("\nJAVA0505.JAVA\n");
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number 1  ===>>  ");									
		double n1 = input.nextDouble();											
		System.out.print("Enter Number 2  ===>>  ");									
		double n2 = input.nextDouble();
		System.out.print("Enter Number 3  ===>>  ");									
		double n3 = input.nextDouble();		
		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);	
		double mean = (n1+n2+n3)/3;
		System.out.println();
		System.out.println("The mean is " + mean);
		System.out.println();
	}
}

