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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Hardy Scheel
 */
public class TestLogin {

	public static void main(String[] args) {

		Login login = new Login();
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(inp);

		String benutzer = "";
		String passwort = "";

		try {
			System.out.print("Bitte geben Sie den " + "Benutzernamen ein:");
			benutzer = buffer.readLine();
			System.out.println("Bitte geben Sie das Passwort ein:");
			passwort = buffer.readLine();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			System.out.println("Sie werden angemeldet ...");
			login.anmelden(benutzer, passwort);
			System.out.println("Anmeldung erfolgreich!");
		} catch (ZugriffUngueltigException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			System.out.println("Methode bearbeiten() " + "wird aufgerufen ...");
			login.bearbeiten();
		} catch (KeineBerechtigungException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("Sie werden abgemeldet ...");
		login.abmelden();

		try {
			System.out.println("Methode bearbeiten() " + "wird aufgerufen ...");
			login.bearbeiten();
		} catch (KeineBerechtigungException ex) {
			System.out.println(ex.getMessage());
//			ex.printStackTrace();
		}

	}

}
