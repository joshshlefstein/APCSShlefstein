import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {

		System.out.println("Please enter an array of numbers, type in 0 when finished!");
		int in = reader.nextInt();
		while (in != 0) {
			array.add(in);
			in = reader.nextInt();
		}

		// the user typed 0,
		PrintArray1();

		System.out.println("What number would you like to delete?");
		int del = reader.nextInt();
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == del) {
				array.remove(i);
				break;
			}
		}
		// break will put us right here
		PrintArray1();
	}

	public static void PrintArray1() {
		System.out.println("-------------------------------------");
		for (int i : array) {
			System.out.println(i);
		}
	}

}
