// Java0703.java
// This program introduces user-created class methods.
// The three program statements of the Java0702.java program
// are now divided into three user-created methods.


public class Java0703
{
	
	public static void main(String[] args)
	{
		System.out.println("\nJAVA0703.JAVA\n");
		Java0703.fullName();
		Java0703.street();
		Java0703.cityStateZip();
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
