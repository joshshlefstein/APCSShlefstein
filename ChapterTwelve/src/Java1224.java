// Java1224.java
// This program demonstrates how to construct an irregular two-dimensional array
// in the shape of a triangle, using a "ragged" array.
// It also shows how to use length for different column sizes.


public class Java1224
{
	public static void main(String args[])
	{
		System.out.println("\nJava1224.java\n");
		int[][] mat = {{1},
					   {1,2},
		 			   {1,2,3},
		 			   {1,2,3,4},
	 				   {1,2,3,4,5}};
		displayMatrix(mat);
	}

	public static void displayMatrix(int[][] m)
	{
		for (int r = 0; r < m.length; r++)
		{
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + "  ");
			System.out.println();
		}
		System.out.println();
	}
}


