// Java1207.java
// This program fills an <int> array with a random set of numbers.


import java.util.Random;	// necessary to use the <Random> class


public class Java1207
{
	public static void main(String args[])
	{
		System.out.println("Java1207\n");
		int list[] = new int[20];
		Random random = new Random(12345);
		for (int k = 0; k < 20; k++)
			list[k] = random.nextInt(900) + 100;
		for (int k = 0; k < 20; k++)
			System.out.println("list[" + k + "] = " + list[k]);
		System.out.println();
	}
}

