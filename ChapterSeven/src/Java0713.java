// Java0713.java
// This program demonstrates that parameter sequence matters.
// In this example method <showDifference> will display different
// results when the calling parameters are reversed.


public class Java0713
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0713.JAVA\n");
		int num1 = 100;
		int num2 = 50;
		showDifference(num1,num2);
		showDifference(num2,num1);
		System.out.println();
	}
	
	public static void showDifference(int a, int b )
	{
		System.out.println();
		int difference = a - b;
		System.out.println("The difference is " + difference);
		System.out.println();
	}	
   
}


