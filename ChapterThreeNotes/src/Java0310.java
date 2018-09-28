// Java0310.java
// This program shows "unary" arithmetic shortcut notation in Java.
// Note that  "postfix" x++ and "prefix"  ++x do not always have the same result.


public class Java0310
{
	public static void main (String args[])
	{
		int num = 10;
		System.out.println("num equals " + num);
		num++;
		System.out.println("num equals " + num);
		++num;
		System.out.println("num equals " + num);
		System.out.println("num equals " + num++);
		System.out.println("num equals " + num);
		System.out.println("num equals " + ++num);
		System.out.println("num equals " + num);
		System.out.println();
	}
}

