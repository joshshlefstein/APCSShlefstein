// Java0323.java
// This program demonstrates escape sequences in Java


public class Java0323
{
	public static void main (String args[])
	{

		//  \n performs a carriage-return and a line-feed
      	System.out.println("\nProgram Java0323.java\n");

      	//  \t performs a horizontal tab
		System.out.println("\tONE\tTWO\tTHREE\n");

		//  \r performs only a carriage-return without a line-feed
		System.out.print("Hello John\r");
		System.out.println("How are you doing?\n");

		//  \\ displays a single backslash
		System.out.println("Path C:\\Java\\bin\n");

		//  \" displays double qoutes
		System.out.println("Enter the name \"Kathy Smith\" with double quotes\n");

	}
}

