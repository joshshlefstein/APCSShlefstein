// Java0710.java
// This program introduces user-defined methods with parameters.
// The purpose of using parameters may be hard to tell, but at this 
// stage concentrate on the mechanics and the manner in which information
// is passed from one program module to another program module.


public class Java0710
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0710.JAVA\n");
		displayParameter(100);
		System.out.println();
	}
	
	public static void displayParameter(int number)
	{
		System.out.println();
		System.out.println("The parameter value is " + number);
		System.out.println();
	}	
   
}


