package Aufgaben;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class FormatGeburtsort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // System.in legt fest, dass
					// die Eingabe über Konsole erfolgt. Hier kann auch ein File stehen o.ä.
		
		System.out.println(
				"Bitte geben Sie Ihren Geburtsort(1=de, 2=it, 3=es, 4=en) und Ihr Geburtsdatum (YYYY MM DD) ein.");
		int ort = scanner.nextInt();
		Calendar c = Calendar.getInstance();		// per Default englisch
		c.set(scanner.nextInt(), scanner.nextInt() - 1, scanner.nextInt());

		Date d2 = c.getTime();
		// System.out.println(d2);

		Locale locl = testInput(ort);
		// Locale loc2 = Locale.getDefault();
		// Locale loc3 = Locale.CHINA;
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locl);
		System.out.println(df.format(d2));

	}

	public static Locale testInput(int ort) {
		Locale input = new Locale(""); 
		switch (ort) {
		case 1:
			input = new Locale("de");
			break;
		case 2:
			input = new Locale("it");
			break;
		case 3:
			input = new Locale("es");
			break;
		case 4:
			input = new Locale("en");
			break;
		default:
			input = new Locale("de");
		}
		return input;
	}
}
