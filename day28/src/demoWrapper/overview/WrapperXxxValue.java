package demoWrapper.overview;

/**
 * 
 * convert the value of a wrapped numeric to a primitive Es gibt 36 xxxValue()
 * Methoden Jede Wrapper Klasse hat sechs Methoden - ==> Jedes Wrapper Objekt
 * kann zu jedem primitiven Datentyp umgewandelt werden
 *
 * Die Methoden werden von Number geerbt bzw. überschrieben
 */
public class WrapperXxxValue {

	public static void main(String[] args) {
		// Beispiele

		Integer i5 = new Integer(42);

		byte bi5 = i5.byteValue();
		short si5 = i5.shortValue();
		int ii5 = i5.intValue();
		long li5 = i5.longValue();
		float fi5 = i5.floatValue();
		double di5 = i5.doubleValue();

		Float f6 = new Float(3.14f);
		byte bf6 = f6.byteValue();
		short sf6 = f6.shortValue();
		int if6 = f6.intValue();
		long lf6 = f6.longValue();
		float ff6 = f6.floatValue();
		double df6 = f6.doubleValue();

		Boolean b1 = new Boolean("false");
		System.out.println(b1.booleanValue());
		
		Character c1 = new Character('c');
		System.out.println(c1.charValue());
	}

}
