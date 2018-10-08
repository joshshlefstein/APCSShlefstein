
public class MultipleSelection {

	public static void main(String[] args) {
		
		int grade=100;
		if(grade>=90) {
			System.out.println("A");
		}
		else if(grade<90 && grade>=80) {
			System.out.println("B");
		}
		else if(grade==101) {
			System.out.println("Grade is A++");
		}
		else {
			System.out.println("You failed");
		}
	}

}
