/**
 * Aufgabe: 13.2 Exceptions zu Tag26 (08.12.2016)
 * <p>
 * Erstellen Sie eine Klasse <code>Bankkonto</code>. Eine Kontoführung soll
 * durch Einzahlungen und Auszahlungen simuliert werden. Die Klasse
 * <code>Bankkonto</code> besitzt die Methoden:
 * <ul>
 * <li><code>public void einzahlen (double betrag)</code></li>
 * <li><code>public void auszahlen (double betrag) </code></li>
 * <li><code>public double getKontostand() </code></li>
 * </ul>
 * </p>
 * <p>
 * Die Methoden <code>einzahlen()</code> und <code>auszahlen()</code> werfen
 * eine Exception vom Typ TransaktionsException beim Auftreten eines
 * Transaktionsfehlers. Leiten Sie hierzu die Klasse
 * <code>TransaktionsException</code> von der Klasse <code>Exception</code> ab.
 * Ein Transaktionsfehler wird durch einen negativen Einzahlungsbetrag oder ein
 * nicht ausreichend großes Guthaben für einen Auszahlungsbetrag verursacht. Die
 * Methode <code>getKontostand()</code> liefert den aktuellen Kontostand, der
 * durch ein privates Datenfeld realisiert wird.
 * </p>
 */
package aufgaben.aufgabe13_2_exceptions;

/**
 * @author Hardy Scheel
 */
public class TestBankkonto {
	public static void main(String[] args) {
		Bankkonto konto = new Bankkonto();
		double betrag;
		System.out.println("Kontostand: " + konto.getKontostand());

		try {
			betrag = 123.45;
			System.out.println();
			System.out.println("Einzahlung: " + betrag);
			konto.einzahlen(betrag);
			System.out.println("Kontostand: " + konto.getKontostand());
		} catch (TransaktionsException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			// Negative Einzahlung
			betrag = -12.45;
			System.out.println();
			System.out.println("Einzahlung: " + betrag);
			konto.einzahlen(betrag);
			System.out.println("Kontostand: " + konto.getKontostand());
		} catch (TransaktionsException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			betrag = 12;
			System.out.println();
			System.out.println("Auszahlung: " + betrag);
			konto.auszahlen(betrag);
			System.out.println("Kontostand: " + konto.getKontostand());
		} catch (TransaktionsException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			// Konto überziehen
			betrag = 130;
			System.out.println();
			System.out.println("Auszahlung: " + betrag);
			konto.auszahlen(betrag);
			System.out.println("Kontostand: " + konto.getKontostand());
		} catch (TransaktionsException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
