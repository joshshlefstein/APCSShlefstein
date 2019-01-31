
public class FRQuiz1203 {

	public static void main(String[] args) {
		int list[] = { 1, 6, 3, 8, 3, 9, 10 };
		System.out.println(getMax(list));
	}

	public static int getMax(int[] list) {
		int x = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > x) {
				x = list[i];
			}
		}
		return x;
	}

}
