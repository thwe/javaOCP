/**
 * Aufgabe: BigInteger zu Tag13 (21.11.2016)
 * <p>
 * Aufgabe 1 beschreibt die Implementierung der Klasse BigInteger. Aufgabe 2 fokussiert die 
 * Entwicklung der Klasse ApplicationBigInteger mit dem entsprechenden Hauptprogramm, mit Hilfe 
 * dessen Sie die Klasse BigInteger testen können. Entwickeln Sie die beiden Klassen nebeneinander, 
 * d.h. implementieren Sie Ihre Klasse ApplicationBigInteger so weit mit, dass Sie damit die neuen 
 * Eigenschaften Ihrer Klasse BigInteger sukzessive testen können. 
 * </p>
 */
package aufgaben;

/**
 * Mit Hilfe dieser Klasse lässt sich die Summe zweier grosser positiver Zahlen
 * berechnen.
 * <p>
 * Die Methode add() addiert Zahlen stellenweise nach dem Schema der
 * schriftlichen Addition, wie es Grundschülern beigebracht wird.
 * </p>
 * 
 * @author Hardy Scheel
 */
public class BigInteger {

	/**
	 * Speicher/Puffer für ganze große Zahlen (BigInteger).
	 */
	private StringBuffer digits = new StringBuffer();

	/**
	 * Default-Konstruktor für den Wert 'null'.
	 */
	public BigInteger() {
		this("");
	}

	/**
	 * Konstruktor für den Wert der int-Zahl n
	 * 
	 * @param n
	 */
	public BigInteger(int n) {
		this.digits.append(n);
	}

	/**
	 * Konstruktor, der den Wert aus dem String s liest.
	 * 
	 * @param s
	 */
	public BigInteger(String s) {
		this.digits.append(s);
	}

	/**
	 * Gibt die Ziffer des BigIntegers an der Stelle p zurueck.
	 * <p>
	 * Steht in einem Zeichen c zum Beispiel '3' und soll aus diesem die
	 * Ganzzahl 3 werden, so besteht die traditionelle Art darin, eine '0'
	 * abzuziehen. Die ASCII-Null '0' hat den char-Wert 48, '1' dann 49, bis '9'
	 * schließlich 57 erreicht. <br>
	 * <br>
	 * So ist logischerweise '3' – '0' = 51 – 48 = 3.) Die digit()-Methode ist
	 * dazu eine Alternative. Wir nutzen sie in einem kleinen Beispiel, um eine
	 * Zeichenkette mit Ziffern schließlich in eine Ganzzahl zu konvertieren.
	 * <br>
	 * <br>
	 * Quelle: Kapitel 4.2.3 Ziffern einer Basis - Java ist auch eine Insel <br>
	 * http://openbook.rheinwerk-verlag.de/javainsel/javainsel_04_002.
	 * html#dodtp0b270e00-e3a1-4095-aa33-a58a636b5466
	 * </p>
	 * 
	 * @param p
	 *            Position der Ziffer.
	 * @return Ziffer an der Position p.
	 */
	private int getDigit(int p) {
		// if (p >= digits.length())
		// return 0;

		return digits.charAt(p) - '0';
	}

	/**
	 * Addition zweier BigInteger. Die Methode addiert Zahlen stellenweise nach
	 * dem Schema der schriftlichen Addition, wie es Grundschuelern beigebracht
	 * wird. <br>
	 * <br>
	 * Die Addition wird durchgeführt mit der Zahl aus dem instantiiertem Objekt
	 * und einer weiteren übergebenenen Zahl.
	 * 
	 * @param b	Zweite große Zahl die mit der ersten addiert werden soll.
	 * @return Summe der Addition zweier BigInteger.
	 */
	public BigInteger add(BigInteger b) {

		/**
		 * Ergebnis der Addition und Rückgabewert.
		 */
		BigInteger result = new BigInteger();
		/**
		 * Übertrag aus der Addition einer Zahlenstelle.
		 */
		int carryover = 0;
		/**
		 * Summe der Addition inkl. Übertrag einer Zahlenstelle.
		 */
		int sum = 0;

		/**
		 * Ermittle die Zahlenlänge der größten BigInteger Zahl von zwei
		 * BigIntegers.
		 */
		int lengthOfTheGreaterOne = getBigIntegerLengthOfTheGreaterOne(b);

		/**
		 * Überladene BigInteger 'b': Fülle an vorderster Stelle Nullen auf wenn
		 * Länge kleiner ist wie größte BigInteger Zahl.
		 */
		b.fillBigIntegerWithZeros(lengthOfTheGreaterOne);
		
		/**
		 * Instantiiertes Objekt (BigInteger): Fülle an vorderster Stelle Nullen
		 * auf wenn Länge kleiner ist wie größte BigInteger Zahl.
		 */
		if (this.digits.length() < lengthOfTheGreaterOne) {
			int numberOfZeros = lengthOfTheGreaterOne - this.digits.length();
			this.digits.reverse();
			
			for (int i = 0; i < numberOfZeros; i++) {
				this.digits.append(0);
//				this.digits.insert(0,'0');						// weitere Möglichkeit
			}

			this.digits.reverse();
		}

		/**
		 * Stellenweises Additionverfahren mit Übertrag.
		 */
		for (int i = lengthOfTheGreaterOne - 1; i >= 0; i--) {
			sum = getDigit(i) + b.getDigit(i) + carryover;

			if (sum > 9) {
				carryover = 1;
				result.digits.append(sum - 10);
			} else {
				carryover = 0;
				result.digits.append(sum);
			}
		}

		if (carryover > 0) {
			result.digits.append(carryover);
		}

		/**
		 * Umkehrung des Ergebnisses, da die Ziffern in umgekehrter Reihenfolge
		 * eingetragen werden.
		 */
		result.digits.reverse();
		return result;

	}

	/**
	 * Ermittelt die Zahlenlänge der größten BigInteger Zahl von zwei
	 * BigIntegers.
	 * 
	 * @param b
	 * @return
	 */
	private int getBigIntegerLengthOfTheGreaterOne(BigInteger b) {
		if (this.digits.length() >= b.digits.length()) {
			return this.digits.length();
		} else {
			return b.digits.length();
		}
	}

	/**
	 * Fülle an vorderster Stelle Nullen auf wenn Länge kleiner ist wie größte
	 * BigInteger Zahl.
	 * 
	 * @param maxLength
	 *            Füllt vorn Nullen bis zu maxLength auf.
	 * @return
	 */
	private StringBuffer fillBigIntegerWithZeros(int maxLength) {
		if (this.digits.length() < maxLength) {

			int numberOfZeros = maxLength - this.digits.length();
			this.digits.reverse();

			for (int i = 0; i < numberOfZeros; i++) {
				this.digits.append(0);
			}

			this.digits.reverse();

		}

		return this.digits;
	}

	/**
	 * Outputs the summation of all BigIntegers to the command line.
	 * 
	 * @param pNumber
	 *            Number of BigInteger to sum
	 * @param sum
	 *            Summation of all BigIntegers
	 */
	public void printAdditionResult(int n) {
		System.out.println("Die Summe der " + n + " Zahlen, die Sie eingegeben haben, ist: " + this.digits);
	}

}
