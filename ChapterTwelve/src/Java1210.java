// Java1210.java
// This program introduces the Java Version 5.0 enhanced <for..each> loop
// with an <int> array.


public class Java1210
{
	public static void main(String args[])
	{
		System.out.println("Java1210\n");
		int list[] = {11,22,33,44,55,66,77,88,99};

		for (int k = 0; k < 9; k++)					// Old <for> loop syntax
			System.out.print(list[k] + " ");
		System.out.println("\n\n");

		for (int item: list)						// New <for> loop syntax
			System.out.print(item + " ");
		System.out.println("\n\n");
	}
}

