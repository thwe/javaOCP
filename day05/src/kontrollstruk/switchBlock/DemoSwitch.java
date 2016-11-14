package kontrollstruk.switchBlock;

public class DemoSwitch {

	public static void main(String[] args) {
		//methodIfElse();
		//methodSwitch();
		//methodSwitchChar();
		methodSwitchChar('A');
		//methodSwitchCaseValue();
		//methodSwitchWhile();
	}

	public static void methodIfElse() {
		int x = 3;

		if (x == 1) {
			System.out.println("x equals 1");
		} else if (x == 2) {
			System.out.println("x equals 2");
		} else if (x == 3) {
			System.out.println("x equals 3");
		} else {
			System.out.println("No idea what x is");
		}
	}
	
	public static void methodSwitch() {
		 int x =5;
		//char, byte, short, int, enum
		switch (x) {
		case 1:
			System.out.println("x equals 1");
			break;
		case 2:
			System.out.println("x equals 2");
			break;
		case 3:
			System.out.println("x equals 3");
			break;
		default:
			System.out.println("No idea what x is");
			break;
		}
	}
	
	public static void methodSwitchChar() {
		char x = 65; //Alternativ: 'A'
		System.out.println(x);
		switch (x) {
		case 'A':
			System.out.println("x equals 1");
			break;
		case 'b':
			System.out.println("x equals 2");
			break;
		case 'c':
			System.out.println("x equals 3");
			break;
		default:
			System.out.println("No idea what x is");
			break;
		}
	}
	
	public static void methodSwitchChar(char x) {
		
		System.out.println(x);
		switch (x) {
		case 'A':
			System.out.println("x equals 1");
			break;
		case 'b':
			System.out.println("x equals 2");
			break;
		case 'c':
			System.out.println("x equals 3");
			break;
		default:
			System.out.println("No idea what x is");
			break;
		}
	}
	
	public static void methodSwitchCaseValue(){
		final int a = 2;
		final int b;
		b=2;
		int c = 3;
		int x = 0;
		switch (x) {
		case a:
			System.out.println("a");
			break;
//		case b:
//			System.out.println("b");
//			break;
//		case c:
//			System.out.println("b");
//			break;
		default:
			break;
		}
	}
	public static void methodSwitchWhile() {
		short x = 0;
		while (x<10) {
			switch (x) {
			case 1:
				System.out.println("x equals 1");
				break;
			case 2:
				System.out.println("x equals 2");
				break;
			case 3:
				System.out.println("x equals 3");
				break;
			default:
				System.out.println("No idea what x is");
				break;
			}
			
			x++;
		}
		
	}
}
