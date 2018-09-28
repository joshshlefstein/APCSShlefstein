// Java0307.java
// This program demonstrates memory overflow problems.
// Saving memory is important, but too little memory can
// also cause problems.


public class Java0307
{
	public static void main (String args[])
	{
		int intNum = 1000;
		System.out.println("intNum: " + intNum);

		intNum = intNum * 1000;
		System.out.println("intNum: " + intNum);

		intNum = intNum * 1000;
		System.out.println("intNum: " + intNum);

		intNum = intNum * 1000;
		System.out.println("intNum: " + intNum);
	}

}

