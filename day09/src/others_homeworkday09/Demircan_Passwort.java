package Aufgabenhaus;

public class Passwort {

	public static int grosszaehler = 0;
	public static int kleinbuchstaben = 0;
	public static int sonderzeichen = 0;
	public static int zahlen = 0;

	public static void main(String[] args) {
		for (String x : args) {
			aufgabe4(x);
		}
		// aufgabe4(args[0]);

		// aufgabe4(args[1]);

	}

	public static void aufgabe4(String eingabe) {

		System.out.println("Paswort:" + eingabe);
		if (eingabe.length() < 11) {
			System.out.println("Bitte geben Sie mindestens 10 Zeichen ein!!!");
		} else {
			for (int i = 0; i < eingabe.length(); i++) {
				char charCode = eingabe.charAt(i);

				// if (charCode > 64 && charCode < 91) {
				if (charCode >= 'A' && charCode <= 'Z') {
					grosszaehler++;
				} else {
					if (charCode > 47 && charCode < 58) {

						zahlen++;
					} else if (charCode > 96 && charCode < 123) {
						// System.out.println("Es gibt eine Kleinbuchstabe");
						kleinbuchstaben++;
					} else if ((charCode > 32 && charCode < 48) || (charCode > 90 && charCode < 97)
							|| (charCode > 57 && charCode < 65) || (charCode > 122 && charCode < 127)) {
						// System.out.println("Es gibt eine Sonderzeichen");
						sonderzeichen++;
					}

				}
			}

			if (grosszaehler == 0) {
				System.out.println("Bitte geben Sie mindestens eine Grossbuchstaben ein !!!");
			}
			if (zahlen == 0) {
				System.out.println("Bitte geben Sie mindestens eine Zahl  ein !!!");
			}
			if (kleinbuchstaben == 0) {
				System.out.println("Bitte geben Sie mindestens eine Kleinbuchstaben  ein !!!");
			}
			if (sonderzeichen == 0) {
				System.out.println("Bitte geben Sie mindestens eine Sonderzeichen ein !!!");
			}

			System.out.println("Die Namenlaenge ist :" + eingabe.length());

		}

	}
}
