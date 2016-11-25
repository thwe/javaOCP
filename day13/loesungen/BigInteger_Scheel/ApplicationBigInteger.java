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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Dieses Kommandozeilenprogramm summiert mindestens zwei bis beliebig viele
 * ganze Zahlen vom Typ BigInteger. Die einzugebenden BigInteger Zahlen können
 * beliebig groß bzw. lang sein.
 * <p>
 * Das hierbei angewandte Additionsverfahren (Methode: BigInteger.add()) addiert
 * je Berechnungsvorgang zwei ganze (BigInteger) Zahlen gleichzeitig. Stelle für
 * Stelle von hinten beginnend werden die zwei ganzen Zahlen addiert und der
 * eventuelle Rest auf die nächste Stelle übertragen.
 * </p>
 * 
 * @author Hardy Scheel
 *
 */
public class ApplicationBigInteger {

	/**
	 * Liest einen String von der Konsole (Benutzereingabe).
	 * 
	 * @return Benutzereingabe von der Konsole als String.
	 */
	public static String readFromConsole() {
		String number = new String("");
		BufferedReader bufferOne = new BufferedReader(new InputStreamReader(System.in));

		try {
			number = bufferOne.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return number;
	}

	/**
	 * Summiert beliebig viele große Zahlen (BigIntegers).
	 * <p>
	 * Methode sumBigInteger(int pNumber) um eine beliebige Anzahl von großen
	 * Zahlen aufzusummieren.
	 * </p>
	 * 
	 * @param pNumber
	 *            Anzahl der BigInteger welche aufaddiert werden sollen.
	 * @return Summe der BigIntegers, welche aufaddiert werden sollen.
	 */
	public static BigInteger sumBigInteger(int pNumber) {

		BigInteger sum = new BigInteger(readFromConsole());
		BigInteger nextBI = null;

		for (int i = 0; i < pNumber - 1; i++) {
			System.out.println("Bitte nächste Zahl eingeben: ");
			nextBI = new BigInteger(readFromConsole());
			sum = sum.add(nextBI);

		}
		return sum;

	}

	public static void main(String[] args) {

		int n = 0; // Anzahl der Zahlen, welche aufaddiert werden sollen

		System.out.println("Wieviele Zahlen sollen aufaddiert werden?");
		System.out.println("Bitte geben Sie die Anzahl ein!");

		n = Integer.parseInt(readFromConsole());

		BigInteger sumBI = new BigInteger();
		sumBI = sumBigInteger(n);
		sumBI.printAdditionResult(n);

	}

}
