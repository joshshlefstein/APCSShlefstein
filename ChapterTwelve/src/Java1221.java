// Java1221.java
// This program creates a 3 X 3 2D array and uses a method
// to display the array elements.
// The length field is used for both row and column length.


public class Java1221
{
	public static void main(String args[])
	{
		System.out.println("\nJava1221.java\n");
		int[][] board = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		displayMatrix(board);
	}


	public static void displayMatrix(int[][] m)
	{
		for (int r = 0; r < m.length; r++)
		{
			for (int c = 0; c < m.length; c++)
				System.out.print(m[r][c] + "  ");
			System.out.println();
		}
		System.out.println();
	}
}


