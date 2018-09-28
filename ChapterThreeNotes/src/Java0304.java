// Java0304.java
// This program combines output of literals and variables.
// "a: " is a string literal, which displays the characters a:
// a is an integer variable, which displays its integer value 10.


public class Java0304
{
	public static void main (String args[])
	{
		int a = 10;
		int b = 25;
		System.out.println("a: " + a);
		
		a= a+10;
		a=a+10;
		System.out.println("a: "+a);
		System.out.println("b: " + b);
	}
}

