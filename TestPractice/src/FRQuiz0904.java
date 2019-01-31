
public class FRQuiz0904 {

	class Animal {
		private int age;

		public Animal(int a) {
			age = a;
		}
	}

	class Mammal extends Animal {
		private int weight;

		public Mammal(int a, int w) {
			super(a);
		}
	}

	class Cat extends Mammal {
		private String species;

		public Cat(int a, int w, String s) {
			super(a, w);
			species = s;
		}
	}
}
