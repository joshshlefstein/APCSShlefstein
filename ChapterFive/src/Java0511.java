// Java0511.java
// This program demonstrates multi-way selection with <switch> and <case>.
// This program compiles, but displays illogical output.


import java.util.Scanner;

public class Java0511
{
	public static void main (String args[])							
	{   
		System.out.println("\nJAVA0511.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter Letter Grade  ===>>  ");										
		String temp  = keyboard.nextLine();
		char grade = temp.charAt(0);
		switch (grade)
		{
			case 'A' :
				System.out.println("90 .. 100 Average");
			case 'B' :
				System.out.println("80 .. 89 Average");
			case 'C' :
				System.out.println("70 .. 79 Average");
			case 'D' :
				System.out.println("60 .. 69 Average");
			case 'F' :
				System.out.println("Below 60 Average");
		}  
		System.out.println();
	}
}

