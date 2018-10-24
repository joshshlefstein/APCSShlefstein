// Java0717.java
// This program demonstrates the difference between a 
// void <Sum1> method and a return <Sum2> method.
// There are two differences.
// Void and return methods are declared differently.
// Void and return methods are also called differently.


public class Java0717
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0717.JAVA\n");
		int nbr1 = 1000;
		int nbr2 = 100;
		sum1(nbr1,nbr2);
		System.out.println(nbr1 + " + " + nbr2 + " = " + sum2(nbr1,nbr2));
		System.out.println();
	}  
   
	public static void sum1(int n1, int n2)
	{
		int sum = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + sum);
	}
   
	public static int sum2(int n1, int n2)
	{
		int sum = n1 + n2;
		return sum;  
	}
   
}


