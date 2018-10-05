// Java0402.java
// This program shows different arguments that can be used with the <sqrt> method.
// Note how a method call can be the argument of another method call.


public class Java0402
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0402.JAVA\n");
		double n1, n2, n3, n4;
		n1 = Math.sqrt(1024);				// constant argument
		n2 = Math.sqrt(n1);					// variable argument
		n3 = Math.sqrt(n1 + n2);        	// expression argument
		n4 = Math.sqrt(Math.sqrt(256));  	// method argument
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
		System.out.println();
	}
}

