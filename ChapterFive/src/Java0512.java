// Java0512.java
// This program demonstrates multi-way selection with <switch> and <case>.
// This program adds <break> and <default>.
// The use of <break> is required for logical output.


import java.util.Scanner;

public class Java0512
{
	public static void main (String args[]) 						
	{   
		System.out.println("\nJAVA0512.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter Letter Grade  ===>>  ");										
		String temp  = keyboard.nextLine();
		char grade = temp.charAt(0);  // converts 1st letter in the String to a char

		switch (grade)
		{
			case 'A' :
				System.out.println("90 .. 100 Average");
				break;
			case 'B' :
				System.out.println("80 .. 89 Average");
				break;
			case 'C' :
				System.out.println("70 .. 79 Average");
				break;
			case 'D' :
				System.out.println("60 .. 69 Average");
				break;
			case 'F' :
				System.out.println("Below 60 Average");
				break;
			default :
				System.out.println("No Match Found");
		}
		System.out.println();
	}
}

