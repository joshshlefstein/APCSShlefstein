// Java1205.java
// This program demonstrates how to initialize array elements.
// The <new> operator is not necessary in this case.


public class Java1205
{
	public static void main(String args[])
	{
		System.out.println("Java1205\n");
		int list[] = {100,101,102,103,104,105,106,107};
		for (int k = 0; k <= 7; k++)
			System.out.println("list[" + k + "] = " + list[k]);
		System.out.println();
	}
}

