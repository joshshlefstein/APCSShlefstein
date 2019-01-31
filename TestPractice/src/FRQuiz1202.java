
public class FRQuiz1202 {
	public static void main(String[] args) {
		int list[] = { 84, 86, 91, 92, 91, 90 };

		System.out.println(getMean(list));

	}

	public static double getMean(int[] list) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < list.length; i++) {
			sum = sum + list[i];
		}
		average = sum / list.length;
		return average;
	}
}
