package demoVarArgs;

/**
 * 
 * Methoden mit varianler Argumentenzahl
 *
 */
public class DemoVarArgsOverload {

	public static void main(String... args) {
		//max();
		//max(11);
		//max(11,22);
		//max(11,33,99,22,44,55);
		int[] zahlen = new int[]{11,33,99,22,44,55};
		max(zahlen);
	}

	static int max (int... zahlen) {
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

	/**�berladung mit einer Methode, deren Parameter ein Array 
	 * darstellen ist nicht m�glich, da der Kompiler im beiden F�llen
	 * intern mit einem Array abreitet 
	 * 
	 * 
	 */
//	static int max(int[] zahlen) {
//		if (zahlen == null || zahlen.length == 0) {
//			System.out.println("Keine Zahlen");
//		}
//
//		int maximum = Integer.MIN_VALUE;
//		for (int i = 0; i < zahlen.length; i++) {
//			if (zahlen[i] > maximum) {
//				maximum = zahlen[i];
//			}
//		}
//
//		if (zahlen.length != 0) {
//			System.out.println("Maximum ist: " + maximum);
//		}
//		return maximum;
//	}
	/**
	 * Variable Argumentlisten d�rfen nur den letzten Parameter bilden, sonst
	 * k�nnte der Compiler bei den Parametern nicht richtig zuordnen, was nun
	 * ein Vararg und was schon der n�chste gef�llte Parameter ist.
	 * 
	 * Bei fehlerhafter Syntax gibt es Kompilierfehler 
	 */
	static int max(int anzahl, int... zahlen){
		
		System.out.println("Es soll das Maximum von " + anzahl +
		"Zahlen berechnet werden");
		
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
	
	/**
	 * 
	 * Beispielmethode f�r eine �berladung
	 */
	static int max(int zahl1, int zahl2) {
		

		int maximum = Integer.MIN_VALUE;
		if(zahl1>=zahl2){
			maximum = zahl1;
		}else{
			maximum = zahl2;
		}
		
			System.out.println("Maximum ist: " + maximum);
		return maximum;
	}
	
	
	
}
