// Java1220.java
// The previous program showed an array storing objects.
// This program turns it around and shows an object storing an array.
// In fact, this is an example of composition.


import java.util.Random;


public class Java1220
{
	public static void main(String args[])
	{
		System.out.println("\nJava1220.java\n");
		MyList list = new MyList(10);
		list.Display();
		list.Display();
		System.out.println();
	}
}


class MyList
{
	private int intArray[];		// stores array elements
	private int size;    		// number of elements in the array

	public MyList(int s)
	{
		System.out.println("\nCONSTRUCTING NEW LIST OBJECT WITH DEFAULT VALUES");
		size = s;
		intArray = new int[size];
		Assign();
	}

	private void Assign()
	{
		System.out.println("\nASSIGNING RANDOM VALUES TO LIST OBJECT");
		Random random = new Random(12345);
		for (int k = 0; k < size; k++)
			intArray[k] = random.nextInt(9000) + 1000;
	}

	public void Display()
	{
		System.out.println("\nDISPLAYING ARRAY ELEMENTS");
		for (int k = 0; k < size; k++)
			System.out.print(intArray[k] + "  ");
		System.out.println();
	}
}
