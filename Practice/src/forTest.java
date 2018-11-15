import java.util.Scanner;
public class forTest {

	public static void main(String[] args) {
		
		/*Scanner keyboard=new Scanner(System.in);
		System.out.print("Type a number to test if it's even --> ");
		int x=keyboard.nextInt();
		System.out.println(x+" is even: "+isEven(x));
		
		Scanner input=new Scanner(System.in);
		System.out.print("Type a number --> ");
		int y=input.nextInt();
		System.out.println("There are "+ countEven(y)+" even numbers between 1 and "+y+".");
		*/
		fizzBuzz();
	}
	//if a number is even or not.
	public static boolean isEven(int num) {
		boolean even=false;
		if(num%2==0) {
			even=true;
		}
		else 
			even=false;
		
		return even;
	}
	
	//count number of even numbers between 1 and user input
	public static int countEven(int x) {
		int counter=0;
		for(int i=1; i<=x; i++) {
			if(i%2==0) {
				counter++;
			}
			
		}
		return counter;
	}
	
	//write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz"
	//instead of the number and for the multiples of five print "Buzz".
	//for numbers which are multiples of both three and five print "FizzBuzz"
	
	public static void fizzBuzz() {
		for(int i=1; i<=100; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println(i+" FizzBuzz");
			}
			
			else if(i%3==0) {
				System.out.println(i+" Fizz");
			}
			
			else if(i%5==0) {
				System.out.println(i+" Buzz");
			}
			
			else {
				System.out.println(i);
			}
		}
	}
}
