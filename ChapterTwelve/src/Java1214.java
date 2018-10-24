// Java1214.java
// This program stores and displays the same values in a 2 X 3 array
// as the previous program.
// But this time a set of nested loops is used with 2D arrays to assign
// and display individual values.
// Additionally, the declaration of the 2D array is done in one statement.


public class Java1214
{
	public static void main(String args[])
	{
		System.out.println("\nJava1214.java\n");

		int twoD[][] = new int[2][3];  // 2D array declaration in one statement.

		int count = 1;
		for (int row = 0; row < 2; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				twoD[row][col] = count;
				count++;
			}
		}

		for (int row = 0; row < 2; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print(twoD[row][col] + "  ");
			}
			System.out.println();
		}

		System.out.println();
	}
}


