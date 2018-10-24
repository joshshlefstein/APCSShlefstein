// Java0714.java
// This program demonstrates a common mistake made by students.
// Parameters are declared in the method heading, but may not be
// declared in the method call.  This program will not compile.


public class Java0714
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0714.JAVA\n");
		showDifference(int num1, int num2);			// line 1
		System.out.println();
	}
	
	public static void showDifference(int a, b)		// line 2
	{
		System.out.println();
		int difference = a - b;
		System.out.println("The difference is " + difference);
		System.out.println();
	}	
   
}


