package kontrollstruk.forSchleife;

public class DemoForSchleife {

	static int j = 100;

	public static void main(String[] args) {
		demoForSchleife1(5);
		// demoForSchleife2(5);
		// demoForSchleife3(5);
		// demoForSchleife4(5);
		// demoForSchleife5(10, 0);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

	// Standard for Schleife
	public static void demoForSchleife1(int upperBound) {
		for (int i = 0; i <= upperBound; i++) {
			System.out.printf("i: %d upperBound: %d %n", i, upperBound);
			System.out.println("i: " + i + "upperBound: " + upperBound + "\n");
		}
		// System.out.println("i: " + i);
		// Es kompiliert nicht,
		// ist ausserhalb der for Schleife nicht sichtbar
	}

	public static void demoForSchleife2(int upperBound) {
		int i = 10;
		for (i = 0; i <= upperBound; i++) {
			System.out.printf("i: %d upperBound: %d %n", i, upperBound);
		}
		System.out.println("i: " + i + "j: " + j);
	}

	public static void demoForSchleife3(int upperBound) {
		int i = 1;
		for (; i <= upperBound; i++) {
			System.out.printf("i: %d upperBound: %d %n", i, upperBound);
		}
		System.out.println("i: " + i + " j: " + j);
	}

	public static void demoForSchleife4(int upperBound) {
		int i = 1;
		for (;;) {
			if (i <= upperBound) {
				System.out.printf("i: %d upperBound: %d %n", i, upperBound);
			} else {
				break;
			}
			i++;
		}
		System.out.println("i: " + i + " j: " + j);
	}

	public static void demoForSchleife5(int upperBound, int bound) {
		int i, j = 10;
		for (i = 0, j = 3; i < upperBound && j > bound; i++, j--) {
			System.out.printf("i: %d j: %d %n", i, j);
		}
	}

	public static void demoForSchleife6(int upperBound) {
		for (int i = 0; i < upperBound; i++)
			;
		// For Schleife geht auch ohne Klammer, btaucht aber eine Anweisung
	}

}
