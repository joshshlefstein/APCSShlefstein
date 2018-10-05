
public class Practice {

	public static void main(String[] args) {
		// a program that calculates the area of a circle when
		// the radius is 10 and another program when the radius
		// is 5.5
		
		double radiusOne=10;
		double radiusTwo=5.5;
		double areaOne= Math.PI * Math.pow(radiusOne, 2);
		double areaTwo= Math.PI * Math.pow(radiusTwo, 2);
		System.out.println("The area of a circle of radius 10 is "+ areaOne);
		System.out.println("The area of a circle of radius 5.5 is "+ areaTwo);

	}

}
