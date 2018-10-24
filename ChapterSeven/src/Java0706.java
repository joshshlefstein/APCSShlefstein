// Java0706.java
// The problem of Java0705.java is now fixed.  It is possible to declare
// multiple classes in one program.  However, you must use the class-dot-method
// syntax to call any of the <Address> class methods.


public class Java0706
{  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0706.JAVA\n");
		Address.fullName();
		Address.street();
		Address.cityStateZip();
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
