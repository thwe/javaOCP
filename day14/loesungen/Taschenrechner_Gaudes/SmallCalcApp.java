/**
 * 
 */
package smallcalcpack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Stefan Michael Gaudes
 *
 */
public class SmallCalcApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		smallCalcApp();
	}

	private static void smallCalcApp() {

		int i, j;
		double product, result = 0;
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("");
		String s = "";

		System.out.println("Bitte geben Sie eine arithmetische Operation mit den beiden Grundrechenarten\n"
				+ "Addition und Multiplikation ohne Klammern ein - Zur Ausfuehrung das Gleichheitszeichen!");

		while (true) {
			s = scanner.next();
			if (s.endsWith("=")) {
				sb.append(s.substring(0, s.length() - 1));
				break;
			}
			sb.append(s);
		}

		scanner.close();

		System.out.println("Kontrolle 1: die zu verarbeitende Zeichenkette -> '" + sb + "'");

		s = sb.toString();
		String[] summanden;

		// Summanden bestimmen
		if (s.contains("+")) {
			summanden = s.split(Pattern.quote("+"));
		} else {
			summanden = new String[1];
			summanden[0] = s;
		}

		System.out.println("Kontrolle 2: die zu addierenden Terme -> " + Arrays.toString(summanden));

		try {
			// Summanden in Faktoren zerlegen
			String[] faktoren;
			for (i = 0; i < summanden.length; i++) {
				if (summanden[i].contains("*")) {
					// Term enthält Produkt
					faktoren = summanden[i].split(Pattern.quote("*"));
					product = 1.;
					for (j = 0; j < faktoren.length; j++) {
						product *= Double.parseDouble(faktoren[j]);
					}
					result += product;
					// nop();
				} else if (!summanden[i].isEmpty()) {
					// Term ist Einzelzahl
					result += Double.parseDouble(summanden[i]);
				}
			}

			System.out.println("Loesung: " + s + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("Fehler: die Operation enthaelt ungueltige Zeichen!\n" + e.getMessage());
		}

		// 3 + 4 * 5 + 6 + 7 * 8 + 9 + 10 + 11 + 1 * 2 * 3 * 4 * 5 + 12 = 247
		// -3 + 4 * 5 + 6 + -7 * 8 + 9 + 10 + 11 + 1 * 2 * 3 * 4 * 5 + -12 = 105
	}

	// no operation for debugging
	private static void nop() {
		return;
	}

}
