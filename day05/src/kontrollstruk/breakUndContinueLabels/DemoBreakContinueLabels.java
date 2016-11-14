package kontrollstruk.breakUndContinueLabels;

public class DemoBreakContinueLabels {

	public static void main(String[] args) {
		// demoBreakLabel();
		 demoContinueLabel();
		// demoSwitchBreakLabel();
	}

	public static void demoBreakLabel() {
		int product = 0;
		outer: for (int i = 0; i < 100; i++) {
			inner: for (int j = 0; j < 100; j++) {
				product = i * j;
				System.out.printf("%4d %4d %6d %n", i, j, product);
				if (product == 25) {
					System.out.println("BREAK");
					break outer;
				}
			}
		}
		System.out.println("Ende der Methode demoBreakLabel()");
	}

	public static void demoContinueLabel() {
		int product = 0;
		outer: for (int i = 0; i < 100; i++) {
			inner: for (int j = 0; j < 100; j++) {
				product = i * j;
				if (product == 25) {
					System.out.println("CONTINUE INNER");
					continue outer;
				}
				System.out.printf("%4d %4d %6d %n", i, j, product);
			}
		}
	}

	public static void demoSwitchBreakLabel() {
		forloop: for (int i = 1; i < 10; i++) {
			switch (i) {
			case 1:
				System.out.printf("i:%2d %n", i);
				break;
			case 2:
				System.out.printf("i:%2d	i²: %2d %n", i, i * i);
				break forloop;
			case 3:
				System.out.printf("i:%2d	i³: %2d %n", i, i * i * i);
				break;
			default:
				System.out.printf("i:%2d ist groesser als drei %n", i);
				break;
			}
		}
	}

}
