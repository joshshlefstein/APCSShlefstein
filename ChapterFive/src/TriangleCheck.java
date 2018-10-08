import java.util.Scanner;

public class TriangleCheck {

	public static void main(String[] args) {
		
 		Scanner input = new Scanner(System.in); //Creates Scanner item
		System.out.print("Side 1:  ");										
		int number1 = input.nextInt();//grabs the first input from keyboard
		System.out.print("Side 2:  ");										
		int number2 = input.nextInt();//grabs the number from the second line
		System.out.print("Side 3:  ");
		int number3= input.nextInt();
		
		if(number1==number2 && number2==number3) {
			System.out.println("Equilatiral");
		}
		else if(number1==number2 || number2==number3 || number3==number1) {
			System.out.println("Isosceles");
		}
		else {
			System.out.println("Scalene");
		}
		//a program that takes lengths of 3 sides as user input and prints if its scalene
		//isosceles or equilatiral
	}

}
