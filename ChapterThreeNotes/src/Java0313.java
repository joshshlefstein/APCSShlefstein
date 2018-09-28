// Java0313.java
// This program demonstrates the <char> data types.
// It also demonstrates how assignment can be "chained" with
// multiple variables in one statement.


public class Java0313
{
	public static void main (String args[])
	{
		char c1 = 'A';
		char c2 = 'B';
		char c3 = 'C';
		System.out.println("The three characters are: " + c1 + c2 + c3);
		c1 = c2 = c3 = 'Q';
		System.out.println("The three characters are: " + c1 + c2 + c3);
		System.out.println();
	}
}

