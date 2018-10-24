// Java1215.java
// This program demonstrates how to use an initializer list
// with a 2D array to assign values.
// Commented lines 15 and 16 show a second style of using initializer
// lists with 2D arrays that display the matrix appearance.


public class Java1215
{
	public static void main(String args[])
	{
		System.out.println("\nJava1215.java\n");

		int twoD[][] = { {1,2,3}, {4,5,6} };

		//	int twoD[][] = { {1,2,3},
		//					 {4,5,6} };

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


