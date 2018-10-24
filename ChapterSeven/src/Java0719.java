// Java0719.java
// This program demonstrates how to create a four-function <Calc> class with return methods.


public class Java0719
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0719\n");
		int nbr1 = 1000;
		int nbr2 = 100;
		System.out.println(nbr1 + " + " + nbr2 + " = " + Calc.add(nbr1,nbr2));
		System.out.println(nbr1 + " - " + nbr2 + " = " + Calc.sub(nbr1,nbr2));
		System.out.println(nbr1 + " * " + nbr2 + " = " + Calc.mul(nbr1,nbr2));
		System.out.println(nbr1 + " / " + nbr2 + " = " + Calc.div(nbr1,nbr2));
		System.out.println();
	}   
      
}


class Calc
{

	public static int add(int n1, int n2)
	{
		return n1 + n2;
	}
   
	public static int sub(int n1, int n2)
	{
	return n1 - n2;
	}
	
	public static int mul(int n1, int n2)
	{
		return n1 * n2;
	}
	
	public static int div(int n1, int n2)
	{
		return n1 / n2;
	}
			
}
