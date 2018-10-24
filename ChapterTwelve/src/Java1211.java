// Java1211.java
// This program uses the Java Version 5.0 <for..each> loop with a <String> array.


public class Java1211
{
	public static void main(String args[])
	{
		System.out.println("Java1211\n");
		String names[] = {"Tom","Sue","Joe","Jan","Bob","Lee","Ann","Meg"};

		for (int k = 0; k < 8; k++)
			System.out.print(names[k] + " ");			// Old <for> loop syntax
		System.out.println("\n\n");

		for (String name: names)						// New <for> loop syntax
			System.out.print(name + " ");
		System.out.println("\n\n");
	}
}

