// Java0321.java
// This program corrects the logic error of Java0319.java.
// Type casting is used to "force" real number division computation.


public class Java0321
{
	public static void main (String args[])
	{
		int nr1 = 1000;
		int nr2 = 3000;
		int nr3 = 6000;
		double mean;
		mean = (double) (nr1 + nr2 + nr3) / 3;
		System.out.println("The mean equals:  " + mean);
		System.out.println();
	}
}

