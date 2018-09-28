// Java0312.java
// This program demonstrates very bad programming style by
// combining various shortcuts in one statement.  It is difficult
// to determine what actually is happening.


public class Java0312
{
	public static void main (String args[])
	{
		int x = 10;
		System.out.println("Before: " + x);
		x += ++x + x++;
		System.out.println("After:  " + x);
		System.out.println();
	}
}

