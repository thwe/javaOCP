package packFormatPrintF;

public class DemoPrintF {

	public static void main(String[] args) {
		//trigFunctionsF();
		//trigFunctionsE();
		trigFunctionsG();

	}
	
	public static void trigFunctionsF() {
		for (double x = -0.2; x < 1; x += 0.1) {
			System.out.printf("%5.2f %8.4f %12.6f \n", x, Math.sin(x), Math.cos(x));
		}
	}
	
	public static void trigFunctionsE() {
		for (double x = -0.2; x < 1; x += 0.1) {
			System.out.printf("%7.0e %10.2e %-12.2e \n", x, Math.sin(x), Math.cos(x));
		}
	}
	
	public static void trigFunctionsG() {
		for (double x = -0.2; x < 1; x += 0.1) {
			System.out.printf("%11.2g %4g %g \n", x, Math.sin(x), Math.cos(x));
			//Bei den Nachkommastellen, muss mindestens 2 angegeben werden, sonst Exception
		}
	}
	
	public static void printString(){
		System.out.printf("Dies %10seine%s\n", "ist ", " Zeile");
	}

}
