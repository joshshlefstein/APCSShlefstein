// Java1208.java
// This program introduces the <length> field to determine the
// number of elements in the array.  Remove the comments from line 16
// to observe what happens when the <length> field is altered.


public class Java1208
{
	public static void main(String args[])
	{
		System.out.println("Java1208\n");
		String names[] = {"Joe","Tom","Sue","Meg"};
		int n = names.length;  										// data field access; not a method call
		System.out.println("There are " + n + " array elements.");
		for(int k = 0; k < n; k++)
			System.out.println("names[" + k + "] = " + names[k]);
//		names.length = 10;
		System.out.println();
	}
}

