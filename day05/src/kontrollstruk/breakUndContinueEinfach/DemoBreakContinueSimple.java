package kontrollstruk.breakUndContinueEinfach;

public class DemoBreakContinueSimple {

	public static void main(String[] args) {
		//demoBreak();
		//demoSwitchBreak();
		demoContinue();
	}

	public static void demoBreak() {
		int product = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				product = i * j;
				System.out.printf("%4d %4d %6d %n", i, j, product);
				if (product == 25) {
					System.out.println("BREAK");
					break;
				}
			}
		}
	}
	
	public static void demoContinue(){
		int product = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = 23; j < 27; j++) {
				product = i * j;
				if (product == 25) {
					System.out.println("CONTINUE");
					continue;
				}
				System.out.printf("%4d %4d %6d %n", i, j, product);
			}
		}
	}
	
	public static void demoSwitchBreak(){
	
		for (int i = 1; i < 10; i++) {
			switch (i) {
			case 1:
				System.out.printf("i:%2d %n", i); break;
			case 2: 
				System.out.printf("i:%2d	i²: %2d %n", i, i*i); break;
			case 3: 
				System.out.printf("i:%2d	i³: %2d %n", i,  i*i*i); break;
			default: System.out.printf("i:%2d ist groesser als drei %n", i); break;
			}
		}
	}

}
