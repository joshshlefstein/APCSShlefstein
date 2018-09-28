// Java0319.java
// This program demonstrates mathematical precedence in Java operations.


public class Java0319
{
	public static void main (String args[])
	{
		double a,b,c, result;
		a = 1000;
		b = 100;
		c = 2.5;

		System.out.println("a = " + a + "  b = " + b + "  c = " + c);
		System.out.println();
		result = a + b * c;
		System.out.println("a + b * c   = " + result);
		result = (a + b) * c;
		System.out.println("(a + b) * c = " + result);
		result = a / b * c;
		System.out.println("a / b * c   = " + result);
		result = a * b / c;
 		System.out.println("a * b / c   = " + result);
 		System.out.println();
   }

}

