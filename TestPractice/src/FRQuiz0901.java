
public class FRQuiz0901 {

	class Engine {
		private int horsepower;

		public Engine(int hp) {
			horsepower = hp;
		}
	}

	class Car {
		String type;
		Engine engine;

		public Car(String t, int hp) {
			type = t;

			engine = new Engine(hp);

		}
	}
}
