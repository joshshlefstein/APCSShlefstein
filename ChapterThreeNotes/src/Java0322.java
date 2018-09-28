// Java0322.java
// This program demonstrates "type casting" between different data types.


public class Java0322
{
	public static void main (String args[])
	{
		int intVal    = 65;
		double dblVal = 70.1;
		char chrVal  = 'B';
      	System.out.println("(double) intVal 65    becomes " + (double) intVal);
		System.out.println("(char)   intVal 65    becomes " + (char) intVal);
		System.out.println("(int)    dblVal 70.1  becomes " + (int) dblVal);
		System.out.println("(char)   dblVal 70.1  becomes " + (char) dblVal);
		System.out.println("(int)    chrVal B     becomes " + (int) chrVal);
		System.out.println("(double) chrVal B     becomes " + (double) chrVal);
		System.out.println();
	}
}

