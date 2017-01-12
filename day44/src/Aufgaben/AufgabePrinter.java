package aufgaben;

class Printer extends Thread {
	
	private char ch;
	private int numberChars;
	private int numberLines;
	
	public Printer(char ch, int numberChars, int numberLines) {
		this.ch = ch;
		this.numberChars = numberChars;
		this.numberLines = numberLines;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < numberLines; i++) {
			synchronized (Printer.class) {
				for (int j = 0; j < numberChars; j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}
		
	}
}

public class AufgabePrinter {

	public static void main(String[] args) {

		Printer p1 = new Printer('a', 10, 20);
		p1.start();
		Printer p2 = new Printer('*', 15, 40);
		p2.start();

	}

}
