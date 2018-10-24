// Java1222.java
// The same <displayMatrix> method is used to display a
// 2 X 4 2D array.  This time the method does not display correctly.


public class Java1222
{
	public static void main(String args[])
	{
		System.out.println("\nJava1222.java\n");
		int[][] mat = {{1,2,3,4},
					   {5,6,7,8}};
		displayMatrix(mat);
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


