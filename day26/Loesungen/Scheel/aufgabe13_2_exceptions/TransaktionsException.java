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
public class TransaktionsException extends Exception {

	public TransaktionsException(double betrag) {
		super("Transaktionsfehler: Negativer Einzahlungsbetrag => " + betrag);
	}

	public TransaktionsException(String message, double betrag){
		super("Transaktionsfehler: " + message + betrag);
	}
	
}
