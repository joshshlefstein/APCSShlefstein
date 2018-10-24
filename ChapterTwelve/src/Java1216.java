// Java1216.java
// This program demonstrates what happens when rows and columns are confused.
// A matrix of 7 rows and 5 columns is created.
// The program attempts to display 5 rows and 7 columns.
// The program will compile and execute, but then it will crash mid-display.


public class Java1216
{
	public static void main(String args[])
	{
		System.out.println("\nJava1216.java\n");
		int k = 1;
		int matrix[][] = new int[7][5];   // 7 rows and 5 columns
		for (int r = 0; r < 7; r++)
			for (int c = 0; c < 5; c++)
			{
				matrix[r][c] = k;
				k++;
			}
		System.out.println();

		for (int r = 0; r < 5; r++) // should be 7
		{
			for (int c = 0; c < 7; c++) // should be 5
				System.out.print(matrix[r][c] + "  ");
			System.out.println();
		}
		System.out.println();
	}
}


