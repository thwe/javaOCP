package demoVarArgs;

/**
 * 
 * Methoden mit varaibaler Argumentenzahl
 *
 */
public class DemoVarArgs {

	public static void main(String[] args) {
		//max();
		//max(11);
		//max(11,22);
		//max(11,33,99,22,44,55);
		int[] zahlen = new int[]{11,33,99,22,44,55};
		max(zahlen);
	}

	static int max(int... zahlen) {
		if (zahlen == null || zahlen.length == 0) {
			System.out.println("Keine Zahlen");
		}

		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] > maximum) {
				maximum = zahlen[i];
			}
		}

		if (zahlen.length != 0) {
			System.out.println("Maximum ist: " + maximum);
		}
		return maximum;
	}

}
