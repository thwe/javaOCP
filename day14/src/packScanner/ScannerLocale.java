package packScanner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner("12,34").useLocale(Locale.GERMAN);
		Scanner scanner = new Scanner("12,34");
		System.out.println(scanner.nextDouble());

	}

}
