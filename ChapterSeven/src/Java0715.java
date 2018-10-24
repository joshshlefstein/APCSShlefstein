// Java0715.java
// This program demonstrates that multiple parameters may
// be different data types.


public class Java0715
{ 
	public static void main(String args[])
	{
		System.out.println("\nJAVA0715.JAVA\n");
		multiTypeDemo("Hans",30,3.575);					// three different type parameters method call
		System.out.println();
	}

	public static void multiTypeDemo(String studentName, int studentAge, double studentGPA)	
	{	
		System.out.println("\nThis method has 3 parameters with three different types");
		System.out.println("Name: " + studentName);
		System.out.println("Age:  " + studentAge);
		System.out.println("GPA:  " + studentGPA);	
	}		   
}

