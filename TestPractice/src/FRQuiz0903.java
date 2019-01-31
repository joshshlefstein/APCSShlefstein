
public class FRQuiz0903 {

	class Engine {
		private int horsepower;

		public Engine(int hp) {
			horsepower = hp;
		}
	}

	class Transmission {
		private String type;

		public Transmission(String t) {
			type = t;
		}
	}

	class Car {
		private String make;
		private int year;
		Engine engine;
		Transmission transmission;

		public Car(String m, int y, String t, int hp) {
			make = m;
			year = y;

			engine = new Engine(hp);
			transmission = new Transmission(t);
		}
	}
}
