// Java0320.java
// This program demonstrates that the intended computation may not be
// performed by Java.  The expression on the right side of the assignment
// operator is performed without knowledge of the type on the left side.


public class Java0320
{
	public static void main (String args[])
	{
		int nr1 = 1000;
		int nr2 = 3000;
		int nr3 = 6000;
		double mean;
		mean = (double)(nr1 + nr2 + nr3) / 3;
		System.out.println("The mean equals:  " + mean);
		System.out.println();
	}
}

