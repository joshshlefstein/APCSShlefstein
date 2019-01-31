
public class FRQuiz1204 {
	public static void main(String[] args) {
		long fibo[] = new long[20];
		fibo[0] = 0;
		fibo[1] = 1;
		System.out.println(fibo[0] + "\n" + fibo[1]);
		for (int i = 2; i < fibo.length; i++) {
			System.out.println(computeFibo(fibo, i));
		}
	}

	public static long computeFibo(long[] list, int n) {
		int i = n;
		list[i] = list[i - 1] + list[i - 2];
		return list[i];

	}
}
