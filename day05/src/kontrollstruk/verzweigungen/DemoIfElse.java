package kontrollstruk.verzweigungen;

public class DemoIfElse {

	public static void main(String[] args) {
		demoIf(100);
		demoIfElse(101);
		demoIfElseMult(10);
		
		char c=  args[0].charAt(0);
		
	}

	public static void demoIf(int i) {
		if (i <= 100) {
			System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
		}
	}

	public static void demoIfElse(int i) {
		if (i <= 100) {
			System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
		} else {
			System.out.println(i + " ist LEIDER nicht kleiner oder gleich 100");
		}
	}

	public static void demoIfElseMult(int i) {
		if (i <= 10) {
			System.out.println("10");
		} else if (i <= 20) {
			System.out.println("20");
		} else if (i <= 30) {
			System.out.println("30");
		} else {
			System.out.println("Else");
		}
	}

}
