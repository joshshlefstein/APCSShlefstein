// Java1203.java
// The previous program - with separate statements for each array member assignment
// and display - is now replaced with two loops.  The loop counter index is used
// to specify each array element in an efficient manner.


public class Java1203
{
	public static void main(String args[])
	{
		System.out.println("Java1203\n");
		int list[];
		list = new int[10];

		for (int index = 0; index <=9; index++)
			list[index] = index + 100;

		for (int index = 0; index <=9; index++)
			System.out.print(list[index] + " ");

		System.out.println();
	}
}

