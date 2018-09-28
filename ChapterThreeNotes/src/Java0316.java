// Java0316.java
// This program demonstrates how to create "constant" identifier
// values with the <final> keyword.
// Removing the comments from the three assignment statements
// will result in compile errors.


public class Java0316
{
	public static void main (String args[])
	{
		final int intConst = 100;
		final double doubleConst = 3.14159;
		final char charConst = 'Q';

//		intConst++;
//		doubleConst = 1234.4321;
//		charConst = 'A';

		System.out.println("intConst:    " + intConst);
		System.out.println("doubleConst: " + doubleConst);
		System.out.println("charConst:   " + charConst);
		System.out.println();
	}
}

