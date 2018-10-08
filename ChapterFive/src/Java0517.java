// Java0517.java
// This program displays various counting schemes.
// It also demonstrates the versatility of the <for> loop.


public class Java0517
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0517.JAVA\n");
		for (int p = 1; p <= 15; p++)  
		     System.out.print(p + "  ");
		System.out.println();

		for (int q = 1; q <= 15; q+=3)   
			System.out.print(q + "  ");
		System.out.println();

		for (int r = 15; r >= 1; r--)   
			System.out.print(r + "  ");
		System.out.println();

		for (double s = 0; s <= 3; s+=0.5)   
			System.out.print(s + "  ");
		System.out.println();

		for (char t = 'A'; t <= 'Z'; t++)
			System.out.print(t + "  ");
		System.out.println("\n\n");
	}
}

