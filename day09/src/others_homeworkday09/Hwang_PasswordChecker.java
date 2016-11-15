package hausaufgaben;

import java.io.Console;
import java.util.Scanner;

public class PasswordChecker {
	public static final int ERROR_PASSWORD_LENGTH = 1;
	public static final int ERROR_NO_CAPITAL = 2;
	public static final int ERROR_NO_DIGITS = 4;
	public static final int ERROR_NO_LOWER = 8;
	public static final int ERROR_NO_SPECIAL = 16;
	public static final int ERROR_NOT_ALLOWED = 32;

	public static final int INPUT_STATE_MENU = 0;
	public static final int INPUT_STATE_PASSWORD = 1;
	public static final int INPUT_STATE_CONFIG = 2;

	public static int minLength = 10;

	public static boolean mustHaveCapital = false;
	public static boolean mustHaveDigits = false;
	public static boolean mustHaveLower = false;
	public static boolean mustHaveSpecial = false;
	public static boolean ruleCCDNoLengthCheck = false;

	public static void demoConsole() {
		Console console = System.console();
		System.out.println("console Objekt: " + console);

		if (System.console() != null) {

			System.out.println("Geben Sie bitte Ihr Passwort auf der Konsole ein");

			// readPassword() ist eine nonecho Methode

			// die Eingabe wird auf der Konsole nicht angezeigt

			String passwd = new String(System.console().readPassword());

			System.out.println(passwd);

		}

	}

	public static void main(String[] args) {
		demoConsole();

		if (args.length > 0)
			parseArguments(args[0]);
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int state = INPUT_STATE_MENU;
		boolean q = false;
		do {
			outputToUser(state);
			input = scanner.nextLine();
			switch (state) {
			case INPUT_STATE_MENU:
				if (input.compareTo("1") == 0) {
					state = INPUT_STATE_PASSWORD;
				} else if (input.compareTo("2") == 0) {
					state = INPUT_STATE_CONFIG;
				} else if (input.compareToIgnoreCase("q") != 0) {
					System.out.println("Ungültige Eingabe :");
				} else {
					q = true;
				}
				break;
			case INPUT_STATE_PASSWORD:
				int errorstatus = checkPassword(input);

				if (errorstatus == 0) {
					System.out.println("Das Passwort ist sicher.");
					System.out.println(configToString());
					state = INPUT_STATE_MENU;
				} else {
					System.out.println(getErrorString(input, errorstatus));
				}
				break;
			case INPUT_STATE_CONFIG:
				parseArguments(input);
				state = INPUT_STATE_MENU;
				break;
			}

		} while (!q);

	}

	public static void outputToUser(int state) {
		switch (state) {
		case INPUT_STATE_MENU:
			System.out.println("Geben Sie ein : 1 für die Passworteingabe, 2 für die Konfiguration, q zum Beenden.");
			break;
		case INPUT_STATE_PASSWORD:
			System.out.println("Geben Sie ein Passwort ein :");
			break;
		case INPUT_STATE_CONFIG:
			System.out.println("c = Pflicht Großbuchstabe");
			System.out.println("d = Pflicht Ziffer");
			System.out.println("l = Pflicht Kleinbuchstabe");
			System.out.println("s = Pflicht Sonderzeichen");
			System.out.println("f = Auch mind. 10 Zeichen bei Ziffer und Großbuchstabe");
			System.out.println("Geben Sie eine Konfiguration ein (beliebige Kombination) :");
			break;
		}
	}

	public static int checkPassword(String password) {
		int errorstatus = 0;
		if (!ruleCCDNoLengthCheck || !(mustHaveDigits && mustHaveCapital)) {
			if (password.length() < PasswordChecker.minLength)
				errorstatus += ERROR_PASSWORD_LENGTH;
		}
		if (mustHaveCapital && !hasCapital(password)) {
			errorstatus += ERROR_NO_CAPITAL;
		}
		if (mustHaveDigits && !hasDigits(password)) {
			errorstatus += ERROR_NO_DIGITS;
		}
		if (mustHaveLower && !hasLower(password)) {
			errorstatus += ERROR_NO_LOWER;
		}
		if (mustHaveSpecial && !hasSpecial(password)) {
			errorstatus += ERROR_NO_SPECIAL;
		}
		if (hasNotAllowedChar(password)) {
			errorstatus += ERROR_NOT_ALLOWED;
		}
		return errorstatus;
	}

	public static boolean hasNotAllowedChar(String password) {
		for (char c : password.toCharArray()) {
			if (c < 33 || c > 125)
				return true;
		}
		return false;
	}

	public static boolean hasCapital(String password) {
		for (char c : password.toCharArray()) {
			if (c >= 'A' && c <= 'Z')
				return true;
		}
		return false;
	}

	public static boolean hasLower(String password) {
		for (char c : password.toCharArray()) {
			if (c >= 'a' && c <= 'z')
				return true;
		}
		return false;
	}

	public static boolean hasDigits(String password) {
		for (char c : password.toCharArray()) {
			if (c >= '0' && c <= '9')
				return true;
		}
		return false;
	}

	public static boolean hasSpecial(String password) {
		for (char c : password.toCharArray()) {
			if (!(c >= '0' && c <= '9') && !(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z'))
				return true;
		}
		return false;
	}

	public static String getErrorString(String password, int errorstatus) {
		String errorString = "";
		if ((errorstatus & ERROR_PASSWORD_LENGTH) != 0) {
			errorString += "Das Passwort " + password + " ist zu kurz, es fehlen " + (minLength - password.length())
					+ " Zeichen.\n";
		}
		if ((errorstatus & ERROR_NO_CAPITAL) != 0) {
			errorString += "Das Passwort hat keine Großbuchstaben.\n";
		}
		if ((errorstatus & ERROR_NO_DIGITS) != 0) {
			errorString += "Das Passwort hat keine Ziffern.\n";
		}
		if ((errorstatus & ERROR_NO_LOWER) != 0) {
			errorString += "Das Passwort hat keine Kleinbuchstaben.\n";
		}
		if ((errorstatus & ERROR_NO_SPECIAL) != 0) {
			errorString += "Das Passwort hat keine Sonderzeichen.\n";
		}
		if ((errorstatus & ERROR_NOT_ALLOWED) != 0) {
			errorString += "Das Passwort hat ungültige Zeichen.\n";
		}
		return errorString;
	}

	public static void parseArguments(String s) {
		PasswordChecker.mustHaveCapital = s.contains("c");
		PasswordChecker.mustHaveDigits = s.contains("d");
		PasswordChecker.mustHaveLower = s.contains("l");
		PasswordChecker.mustHaveSpecial = s.contains("s");
		PasswordChecker.ruleCCDNoLengthCheck = s.contains("f");
	}

	public static String configToString() {
		String config = "";
		if (mustHaveCapital)
			config += "c";
		if (mustHaveDigits)
			config += "d";
		if (mustHaveLower)
			config += "l";
		if (mustHaveSpecial)
			config += "s";
		if (ruleCCDNoLengthCheck)
			config += "f";
		return config;
	}
}
