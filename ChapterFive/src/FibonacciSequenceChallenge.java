
public class FibonacciSequenceChallenge {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 0;
		System.out.println(a);
		for (int i = 1; i <= 7; i++) {
			b = a + c;
			System.out.println(b);
			c = b + a;
			System.out.println(c);
			a = c + b;
			System.out.println(a);

		}
	}

}
