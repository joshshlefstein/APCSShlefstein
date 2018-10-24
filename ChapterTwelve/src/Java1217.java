// Java1217.java
// This program allows the user to specify the number of rows and columns.
// Note that the output will not line up nicely as it combines single,
// double and triple digit numbers.


import java.util.Scanner;       // necessary to use the <Scanner> class


public class Java1217
{
	public static void main(String args[])
	{
		System.out.println("\nJava1217.java\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows     -->  ");
		int numRows = input.nextInt();
		System.out.print("Enter the number of columns  -->  ");
		int numCols = input.nextInt();
		System.out.println("\n");
		int k = 1;
		int matrix[][] = new int[numRows][numCols];
		for (int r = 0; r < numRows; r++)
			for (int c = 0; c < numCols; c++)
			{
				matrix[r][c] = k;
				k++;
			}
		System.out.println();

		for (int r = 0; r < numRows; r++)
		{
			for (int c = 0; c < numCols; c++)
				System.out.print(matrix[r][c] + "  ");
			System.out.println();
		}
		System.out.println();
	}
}


