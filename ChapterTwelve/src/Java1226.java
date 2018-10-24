// Java1226.java
// This program demonstrates the swapping process without a method.
// The swapping of variables x and y simulates the parameter passing concept.
// Note that changes made to variables x and y do not impact variable p and q.


public class Java1226
{
	public static void main (String args[])
	{
		System.out.println("\nJava1226.java\n");
		int p = 10;
		int q = 20;
		System.out.println("main, before swap  " + p + "  " + q);

		/////////////////////////////////////////////////////////////////

		int x = p;
		int y = q;
		System.out.println("swap start         " + x + "  " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swap end           " + x + "  " + y);

		////////////////////////////////////////////////////////////////

		System.out.println("main, after swap   " + p + "  " + q);
	}
}


