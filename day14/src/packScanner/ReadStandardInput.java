package packScanner;

import java.util.Scanner;

public class ReadStandardInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = null;
		System.out.println("Bitte eine Zeichenfolge eingeben");
		while (true) {
			s = scanner.next();
			System.out.println(s);
			if (s.equals("e")) {
				break;
			}
		}
		
		scanner.close();
		System.out.println("Hallo");

	}

}
