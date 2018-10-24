// Java1212.java
// This program demonstrates a very generalized <for..each> loop usage
// with the <Object> class.


public class Java1212
{
	public static void main(String args[])
	{
		System.out.println("Java1212\n");
		String names[] = {"Tom","Sue","Joe","Jan","Bob","Lee","Ann","Meg"};

		for (int k = 0; k < 8; k++)
			System.out.print(names[k] + " ");
		System.out.println("\n\n");

		for (Object obj: names)
			System.out.print(obj + " ");
		System.out.println("\n\n");
	}
}

