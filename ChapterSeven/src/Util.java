// Util.java
// This file is the <Util> class.  This file can compile by itself, but
// it cannot execute.  It requires the Java0713.java driver program to
// test the <Util> class.  


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
	
	public static String spaces(int n)
	{
		String temp = "";
		for (int k = 1; k <= n; k++)
		   temp += " ";
		return temp;
	}	
	
	public static void heading(String name, String lab, String date, String points)
	{
		int nameTab   = 28 - name.length();
		int labTab    = 28 - lab.length();
		int dateTab   = 28 - date.length();
		int pointsTab = 28 - points.length();
		
		Util.skip(2);
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("**                                                **");
		System.out.println("**  Student Name:     " + name + spaces(nameTab) + "**");
		System.out.println("**                                                **");
		System.out.println("**  Lab Assignment:   " + lab + spaces(labTab) + "**");
		System.out.println("**                                                **");
		System.out.println("**  Date Due:         " + date + spaces(dateTab) + "**");
		System.out.println("**                                                **");
		System.out.println("**  Point Version:    " + points + spaces(pointsTab) + "**");
		System.out.println("**                                                **");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		Util.skip(2);
	}


}


