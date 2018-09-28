// Java0311.java
// This program shows arithmetic assignment operations in Java.
// x+=10; is the same as x = x + 10;


public class Java0311
{
	public static void main (String args[])
	{
		int x = 10;
		System.out.println("x equals " + x);
		
		x++;
		System.out.println("x++ equals " +x);
		x += 10;
		System.out.println("x equals " + x);
		x -= 10;
		System.out.println("x equals " + x);
		x *= 10;
		System.out.println("x equals " + x);
 		x /= 10;
		System.out.println("x equals " + x);
		x %= 10;
		System.out.println("x equals " + x);
		System.out.println();
	}
}

