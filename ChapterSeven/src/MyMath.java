import java.util.Scanner;
public class MyMath {

	public static void main(String[] args) {
		
		System.out.println(addNum(2,5));
		System.out.println(addNum(10,1000));
		
		System.out.println(addNum(10.5, 1000.1));
		
		System.out.println("The circumference of a circle is "+circumference(5.5));
		
		System.out.println("The radius of a circle of radius 2 is "+ circleArea(2));
		System.out.println("The radius of a circle of radius 4.5 is "+ circleArea(4.5));

		System.out.println("The distance between (20,50) and (10,100) is "+ distance(20,50,10,100));
		
		Scanner keyboard  = new Scanner(System.in);
		System.out.println("Option 1: user inputs a and b, then program solves for side c.");
		System.out.println("Option 2: user inputs b and c, then program solves for side a.");
		
		System.out.print("Option #  ===>>  ");										
		int option  = keyboard.nextInt();
		if (option ==1) {
			System.out.print("Side a  ===>>  ");
			int a= keyboard.nextInt();
			System.out.print("Side b  ===>>  ");
			int b= keyboard.nextInt();
			System.out.println("Side c is "+option1(a,b));
			}
		else if (option ==2) {
			System.out.print("Side a  ===>>  ");
			int a= keyboard.nextInt();
			System.out.print("Side c  ===>>  ");
			int c= keyboard.nextInt();
			System.out.println("Side b is "+option2(a,c));
			
			}
		}
			
			
		
	//create a method that adds two numbers. Defines what the method does. (Just a definition)
	public static int addNum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static double addNum(double num1, double num2) {
		return (num1+num2); //this idea is called overloading which calls different methods based on the input in the main void
	}
	
	public static double circumference(double radius) {
		return 2*radius*Math.PI;
	}
	
	public static double circleArea(double radius) {
		return Math.PI*radius*radius;
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
	}
	     
	public static double option1(double sideA, double sideB) {
		return Math.sqrt((sideA*sideA)+(sideB*sideB));
	}
	
	public static double option2(double sideA, double sideC) {
		return Math.sqrt((sideC*sideC)-(sideA*sideA));
	}
}
