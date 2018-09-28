// Java0308.java
// This program shows that there is a memory storage limitation to
// how many digits are stored beyond the decimal point.
// Observe that the last digits displayed is rounded off in num3.


public class Java0308
{
	public static void main (String args[])
	{
		double num1 = 1.012345;
		double num2 = 1.0123456789;
		double num3 = 1.01234567890123456789;

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num2: " + num3);

		System.out.println("\n\n");
	}

}

