// Java0720.java
// This program demonstrates a user-declared <Util> class with a variety
// of methods that can be used in any program.


public class Java0720
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0720\n");
		Util.skip(2);
		System.out.println("This message is left justified");
		Util.skip(2);
		Util.center("This message is centered");
		Util.skip(2);
		Util.rightJustify("This message is right justified");
		Util.skip(1);
	}   
      
}


class Util
{
	
	public static void skip(int n)
	{
		for (int k = 1; k <= n; k++)
			System.out.println();
	}
	
	public static void center(String str)
	{
		int len = str.length();
		int tab = (80 - len) / 2;
		for (int k = 1; k <= tab; k++)
		   System.out.print(" ");
		System.out.println(str);		  
	} 

	public static void rightJustify(String str)
	{
		int len = str.length();
		int tab = 80 - len;
		for (int k = 1; k <= tab; k++)
		   System.out.print(" ");
		System.out.println(str);		  
	} 

}


