// Java1209.java
// This program demonstrates how to display an array of random strings.


import java.util.Random;
public class Java1209
{
	public static void main(String args[])
	{
		System.out.println("Java1209\n");
		Random random = new Random(6623);
		int rndInt;
		String names[] = {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ"};
		for(int k = 1; k < 15; k++)
		{
			rndInt = random.nextInt(names.length);
			System.out.println("names[" + rndInt + "] = " + names[rndInt]);
		}
		System.out.println();
	}
}


