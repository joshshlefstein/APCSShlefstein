// Java1204.java
// This program is the same <list> array and the same <list> values as the previous program.
// This time note that the array declaration and object construction is accomplished with
// a single statement.


public class Java1204
{
	public static void main(String args[])
	{
		System.out.println("Java1204\n");
		int list[] = new int[10];

		for (int index = 0; index <=9; index++)
			list[index] = index + 100;

		for (int index = 0; index <=9; index++)
			System.out.print(list[index] + " ");

		System.out.println();
	}
}

