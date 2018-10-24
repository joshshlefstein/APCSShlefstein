// Java1202.java
// This program declares an array of 10 <int> elements.
// Each array element value is individually assigned and displayed.
// There does not appear any real benefit from the previous program example.


public class Java1202
{
	public static void main(String args[])
	{
		System.out.println("Java1202\n");
		int list[];             			// declares the array object identifier
		list = new int[10];     			// allocates memory for 10 array elements
		list[0] = 100;
		list[1] = 101;
		list[2] = 102;
		list[3] = 103;
		list[4] = 104;
		list[5] = 105;
		list[6] = 106;
		list[7] = 107;
		list[8] = 108;
		list[9] = 109;
		System.out.print(list[0] + " ");
		System.out.print(list[1] + " ");
		System.out.print(list[2] + " ");
		System.out.print(list[3] + " ");
		System.out.print(list[4] + " ");
		System.out.print(list[5] + " ");
		System.out.print(list[6] + " ");
		System.out.print(list[7] + " ");
		System.out.print(list[8] + " ");
		System.out.print(list[9] + " ");
		System.out.println();
	}
}

