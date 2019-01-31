import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your password: ");
		String password = input.nextLine();
		
		int i=0;
		while(i==0) {
		if(password.equals("APCS2019")) {
			System.out.println("Correct password");
			i=1;
		}
		else {
			System.out.println("Incorrect password");
			System.out.print("Input your password: ");
			password = input.nextLine();
		}
		}

	}

}