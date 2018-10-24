// Java0704.java
// This program example displays the same output as the previous program.
// This time the methods are called directly without using the class identifier.
// Omitting the class identifier is possible because all the methods are
// located in the same <Java0704> class.


public class Java0704
{
	
	public static void main(String[] args)
	{
		System.out.println("\nJAVA0704.JAVA\n");
		fullName();
		street();
		cityStateZip();
		System.out.println();
	}	
   
	public static void fullName()
	{
		System.out.println("Kathy Smith");
	}

	public static void street()
	{
		System.out.println("7003 Orleans Court");
	}

	public static void cityStateZip()
	{
		System.out.println("Kensington, Md. 20795");
	}
  
}
