// Java0712.java
// This program demonstrates passing two parameters to a method.
// The <showArea> method is called twice.  In this case reversing
// the sequence of the parameters is not a problem. 


public class Java0712
{
  
	public static void main(String args[])
	{
		System.out.println("\nJAVA0712.JAVA\n");
		int width = 100;
		int heigth = 50;
		showArea(width,heigth);
		showArea(heigth,width);
		System.out.println();
	}
	
	public static void showArea(int w, int h )
	{
		System.out.println();
		int area = w * h;
		System.out.println("The rectangle area is " + area);
		System.out.println();
	}	
   
}


