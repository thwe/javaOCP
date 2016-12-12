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
public class Bankkonto {

	private double kontostand;

	public void einzahlen(double betrag) throws TransaktionsException {
		if (betrag <= 0D) {
			throw new TransaktionsException(betrag);
		} else {
			kontostand += betrag;
		}
	}

	public void auszahlen(double betrag) throws TransaktionsException {
		if (betrag >= kontostand) {
			throw new TransaktionsException("Auszahlungsbetrag übersteigt Kontostand => ", betrag);
		} else {
			kontostand -= betrag;
		}
	}

	public double getKontostand() {
		return kontostand;
	}

}
