// Java0716.java
// This program demonstrates how to create a four-function <Calc> class with void methods.


public class Java0716
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0716.JAVA\n");
		int number1 = 1000;
		int number2 = 100;
		Calc.add(number1,number2);		
		Calc.sub(number1,number2);
		Calc.mul(number1,number2);	
		Calc.div(number1,number2);     
		System.out.println();
	}   
      
}


class Calc
{
	
	public static void add(int n1, int n2)
	{
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
	}
   
	public static void sub(int n1, int n2)
	{
		int result = n1 - n2;	
		System.out.println(n1 + " - " + n2 + " = " + result);
	}	
	
	public static void mul(int n1, int n2)
	{
		int result = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + result);
	}
	
	public static void div(int n1, int n2)
	{
		int result = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + result);
	}
			
}
