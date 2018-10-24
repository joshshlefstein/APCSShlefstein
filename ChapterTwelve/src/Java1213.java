// Java1213.java
// This program introduces 2D Java static arrays.
// For 2D arrays two sets of index operators are needed.
// The first set of index brackets stores the rows value.
// The second set of index operators stores the cols value.
// The <twoD> array in this program is a 2 X 3 array.


public class Java1213
{
	public static void main(String args[])
	{
		System.out.println("\nJava1213.java\n");

		int twoD[][];			// declaration of two-dimensional integer array
		twoD = new int[2][3];	// new 2D array is constructed with 2 rows and 3 columns
		twoD[0][0] = 1;
		twoD[0][1] = 2;
		twoD[0][2] = 3;
		twoD[1][0] = 4;
		twoD[1][1] = 5;
		twoD[1][2] = 6;

		System.out.print(twoD[0][0] + "  ");
		System.out.print(twoD[0][1] + "  ");
		System.out.print(twoD[0][2] + "  ");
		System.out.println();
		System.out.print(twoD[1][0] + "  ");
		System.out.print(twoD[1][1] + "  ");
		System.out.print(twoD[1][2] + "  ");
		System.out.println();
	}
}


