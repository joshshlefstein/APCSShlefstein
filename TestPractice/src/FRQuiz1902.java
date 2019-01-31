
public class FRQuiz1902 {

	class Widget {
		private int numWidgets;

		public Widget(int nw) {
			numWidgets = nw;
		}

		public int getWidgets() {
			return numWidgets;
		}
	}

	class Pidget extends Widget {
		private int numPidgets;

		public Pidget(int nw, int np) {
			super(nw);
			numPidgets = np;
		}

		public int getPidgets() {
			return numPidgets;
		}
	}
}
