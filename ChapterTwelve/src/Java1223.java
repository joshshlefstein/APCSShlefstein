// Java1223.java
// A very slight change with the column length results in the
// correct array display.


public class Java1223
{
	public static void main(String args[])
	{
		System.out.println("\nJava1223.java\n");
		int[][] mat = {{1,2,3,4},
					   {5,6,7,8}};
		displayMatrix(mat);
	}

	public static void displayMatrix(int[][] m)
	{
		for (int r = 0; r < m.length; r++)
		{
			for (int c = 0; c < m[0].length; c++)
				System.out.print(m[r][c] + "  ");
			System.out.println();
		}
		System.out.println();
	}
}


