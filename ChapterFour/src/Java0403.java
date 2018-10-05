// Java0403.java
// This program demonstrates the <floor> <ceil> and <round> methods.
// The <floor> method returns the truncation down to the next lower integer.
// The <ceil> method returns the next higher integer.
// The <round> method returns the closest integer.


public class Java0403
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0403.JAVA\n");
		System.out.println("Math.floor(5.001): " + Math.floor(5.001));
		System.out.println("Math.floor(5.999): " + Math.floor(5.999));
		System.out.println("Math.floor(5.5)  : " + Math.floor(5.5));
		System.out.println("Math.floor(5.499): " + Math.floor(5.499));
		System.out.println();

		System.out.println("Math.ceil(5.001) : " + Math.ceil(5.001));
		System.out.println("Math.ceil(5.999) : " + Math.ceil(5.999));
		System.out.println("Math.ceil(5.5)   : " + Math.ceil(5.5));
		System.out.println("Math.ceil(5.499) : " + Math.ceil(5.499));
		System.out.println();

		System.out.println("Math.round(5.001): " + Math.round(5.001));
		System.out.println("Math.round(5.999): " + Math.round(5.999));
		System.out.println("Math.round(5.5)  : " + Math.round(5.5));
		System.out.println("Math.round(5.499): " + Math.round(5.499));
		System.out.println();
	}
}

