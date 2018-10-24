// Java0705.java
// This program demonstrates how to use a second class separate from the 
// main program class.  This program will not compile because the <fullName>,
// <street> and <cityStateZip> methods are no longer encapsulated in the <Java0705> class.


public class Java0705
{  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0705.JAVA\n");
		fullName();
		street();
		cityStateZip();
		System.out.println();
	}
}


class Address
{
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
