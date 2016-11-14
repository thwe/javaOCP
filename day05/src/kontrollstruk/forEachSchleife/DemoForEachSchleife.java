package kontrollstruk.forEachSchleife;

public class DemoForEachSchleife {

	public static void main(String[] args) {
		
		// for (String string : args) {
		// System.out.println(string);
		// }
		// demoArray(args);

		String[] strArray = { "1..", "2..", "3.." };
		demoArray(strArray);

		int[] iArray = { 1, 2, 3, 4, 5 };
		demoArray(iArray);

	}

	public static void demoArray(String[] strArray) {
		for (String string : strArray) {
			System.out.println(string);
		}
	}

	public static void demoArray(int[] strArray) {
		for (int zahl : strArray) {
			System.out.println(zahl);
		}
	}

}
