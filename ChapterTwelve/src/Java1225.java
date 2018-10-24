// Java1225.java
// This program attempts to swap the p and q variable values,
// which does not work as expected.


public class Java1225
{
	public static void main (String args[])
	{
		System.out.println("\nJava1225.java\n");
		int p = 10;
		int q = 20;
		System.out.println("main, before swap  " + p + "  " + q);
		swap(p,q);
		System.out.println("main, after swap   " + p + "  " + q);
	}

	public static void swap(int x, int y)
	{
		System.out.println("swap start         " + x + "  " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swap end           " + x + "  " + y);
	}
}


