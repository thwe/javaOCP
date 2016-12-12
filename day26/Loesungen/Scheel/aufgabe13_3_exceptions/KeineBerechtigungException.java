/**
 * Aufgabe: 13.3 Exceptions zu Tag26 (08.12.2016)
 * <p>
 * Es soll ein Login-Szenario entwickelt werden. Die Klasse <code>Login</code> 
 * besitzt folgende Instanzvariablen und Methoden:
 * <ul>
 * <li><code>public void anmelden (String benutzer, String passwort)</code> </li> 
 * <li><code>public void abmelden()</code> </li>
 * <li><code>public void bearbeiten()</code> </li>
 * </ul>
 * </p>
 * <p>
 * Die Methode <code>anmelden()</code> setzt bei erfolgreicher Anmeldung die Instanzvariable 
 * angemeldet auf true und wirft bei fehlschlagender Authentisierung ein Objekt der 
 * Klasse <code>ZugriffUngueltigException</code>, die von der Klasse <code>Exception</code> 
 * abgeleitet wird. Ebenfalls soll, wenn ein nicht angemeldeter Benutzer auf die Methode 
 * <code>bearbeiten()</code> zugreifen möchte, eine Ausnahme vom Typ <code>KeineBerechtigungException</code> 
 * geworfen werden. Die Methode <code>abmelden()</code> setzt die Instanzvariable <code>angemeldet</code> 
 * auf false. Die Methode <code>bearbeiten()</code> gibt eine Meldung auf der Konsole aus, um 
 * einen Arbeitsvorgang zu simulieren. Entwickeln Sie die Klassen<code>Login</code>, 
 * <code>ZugriffUngueltigException</code>, <code>KeineBerechtigungException</code>.
 * </p>
 */
package aufgaben.aufgabe13_3_exceptions;

/**
 * @author Hardy Scheel
 */
public class KeineBerechtigungException extends Exception{

	public KeineBerechtigungException() {
		super("== Keine Berechtigung ==");
	}

}
