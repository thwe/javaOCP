package homeworkday13;

/**
 * Mit Hilfe dieser Klasse laesst sich die Summe zweier grosser positiver Zahlen
 * berechnen.
 * 
 * Die Methode add() addiert Zahlen stellenweise nach dem Schema der
 * schriftlichen Addition, wie es Grundsch�lern beigebracht wird.
 */

public class BigInteger {

	// Zeichenpuffer fuer die gro�e Zahl
	private StringBuffer digits = new StringBuffer();

	/** Hilfsmittel zur Bearbeitung der Aufgabe - ANFANG **/

	// *** Hinzufuegen eines Strings pString zu einem StringBuffer digits ***
	// digits = digits.append(pString);

	// Laenge des StringBuffers digits (int)
	// digits.length()

	// Zugriff auf die Laenge des StringBuffers eines beliebigen BigIntegers b
	// b.digits.length()

	// Einfuegen von 0 an die erste Stelle des BigIntegers result ueber den
	// StringBuffer digits
	// result.digits.insert(0, 0);

	// Hinzufuegen einer Ziffer ans Ende des BigIntegers result ueber den
	// StringBuffer digits
	// result.digits.append(1);

	// Stellenweise Zugriff auf die Ziffern eines Buffers (BigIntegers)
	// for (int i = digits.length()-1; i >=0; i--){
	// getDigit(i); //
	// }
	// getDigit(i) - Ziffer an der i-ten Stelle s. bereits vorhandene Methode
	// die erste Stelle eines StringBuffers (auch Strings = Zeichenkette) hat
	// den Index 0

	// Ausgabe des StringBuffers digits auf der Konsole
	// System.out.print(digits);

	// Fuer das Arbeiten mit dem StringBuffer beachten Sie auch:
	// http://download.oracle.com/javase/6/docs/api/java/lang/StringBuffer.html

	// Klasse f�r eine Zeichenkette: String
	// Deklaration und Initialiseren einer Zeichenkette testString: String
	// testString = new String("testString");
	// Deklaration und Initialiseren einer leeeren Zeichenkette: String
	// testString = new String("");

	// Fuer das Arbeiten mit dem String beachten Sie auch:
	// http://download.oracle.com/javase/6/docs/api/java/lang/String.html

	/** Hilfsmittel zur Bearbeitung der Aufgabe - ENDE **/

	/**
	 * Default-Konstruktor f�r den Wert null
	 */
	// Methode muss fertig implementiert werden

	/**
	 * Konstruktor f�r den Wert der int-Zahl n
	 * 
	 * @param n
	 */
	// Methode muss fertig implementiert werden

	/**
	 * Konstruktor, der denWert aus dem String s liest
	 * 
	 * @param pString
	 */

	/**
	 * Gibt die Ziffer des BigIntegers an der Stelle p zurueck
	 *
	 * @param p
	 *            Position des Ziffers
	 * @return Ziffer an der Position p.
	 * 
	 *         Steht in einem Zeichen c zum Beispiel '3' und soll aus diesem die
	 *         Ganzzahl 3 werden, so besteht die traditionelle Art darin, eine
	 *         '0' abzuziehen. Die ASCII-Null '0' hat den char-Wert 48, '1' dann
	 *         49, bis '9' schlie�lich 57 erreicht.
	 * 
	 *         So ist logischerweise '3' � '0' = 51 � 48 = 3.) Die
	 *         digit()-Methode ist dazu eine Alternative. Wir nutzen sie in
	 *         einem kleinen Beispiel, um eine Zeichenkette mit Ziffern
	 *         schlie�lich in eine Ganzzahl zu konvertieren.
	 * 
	 *         Quelle: Kapitel 4.2.3 Ziffern einer Basis - Java ist auch eine
	 *         Insel
	 *         http://openbook.rheinwerk-verlag.de/javainsel/javainsel_04_002.
	 *         html#dodtp0b270e00-e3a1-4095-aa33-a58a636b5466
	 */
	private int getDigit(int p) {
		if (p >= digits.length())
			return 0;

		return digits.charAt(p) - '0';
	}

	/**
	 * Addition zweier BigInteger. Die Methode addiert Zahlen stellenweise nach
	 * dem Schema der schriftlichen Addition, wie es Grundschuelern beigebracht
	 * wird.
	 * 
	 * @param b
	 * @return Summe der zwei BigInteger
	 */
	public BigInteger add(BigInteger b) {

		// Rueckgabewert der Methode
		BigInteger result = new BigInteger();

		// ...
		// Methode muss fertig implementiert werden
		// ...

		// Umkehrung des Buffers, da die Ziffern in umgekehrter Reihenfolge
		// eingetragen werden
		result.digits.reverse();
		return result;

	}

	/** Ausgabe eines BigIntegers auf der Konsole */
	public void print() {
		// Methode muss fertig implementiert werden

	}
}
