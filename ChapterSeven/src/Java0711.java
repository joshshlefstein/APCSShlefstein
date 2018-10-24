// Java0711.java
// This program demonstrates that the calling parameter can be:
// 		a constant, like 100.
// 		a variable, like value
// 		an expression with only constants, like 10 + 5.
// 		an expression with a variable and a constant like value + 5.
// 		A call to a method, which returns a value, like Math.sqrt(100).


public class Java0711
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0711.JAVA\n");
		double value = 100;
		displayParameter(100);
		displayParameter(value);
		displayParameter(100 + 5);
		displayParameter(value + 5);
		displayParameter(Math.sqrt(100));
		System.out.println();
	}
	
	public static void displayParameter(double number)
	{
		System.out.println();
		System.out.println("The parameter value is " + number);
		System.out.println();
	}	
   
}


