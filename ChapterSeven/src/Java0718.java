// Java0718.java
// This program reviews different ways to call a return method.


public class Java0718 
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0718.JAVA\n");
		
		System.out.println("Sum: " + getSum(200,300));
		
		int sum = getSum(200,300);
		System.out.println("Sum: " + sum);
		
		if (getSum(100,300) > 0)
			System.out.println("Sum > 0");
		else
			System.out.println("Sum <= 0");
		
		System.out.println();
	}  
   
   
	public static int getSum(int n1, int n2)
	{
		int sum = n1 + n2;
		return sum;  
	}
   
}


