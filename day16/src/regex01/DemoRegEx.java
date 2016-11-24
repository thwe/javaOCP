package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegEx {

	public static void main(String[] args) {
		// regexStern();
		// *
		// * repr‰sentiert beliebige Menge von Zeichen
		// * Zero or more occurrences Pdf 531/493
		// Zeichen(nachdem wir suchen) steht links vom Operator

		// regexPunkt();
		// . Ein beliebiges zeichen - genau einmal

		// regexLeerzeichen();
		// \s ein beliebiges Leerzeichen
		// \S Ein Zeichen, das kein Leerzeichen ist

		// regexWort();
		// \w word character (letters, digits, or "_")

		// regexZahl();
		// \d - eine Zahl zwischen 0 und 9

		regexKeineZahl();
		// \D - ein Zeichen, das keine Zahl ist

	}

	public static void regexStern() {
		// Pattern pr‰sentiert den regul‰ren Ausdruck
		Pattern p1 = Pattern.compile("ab"); // 1a und 1b
		Pattern p2 = Pattern.compile("a*b"); // mehrere as und 1b
		// * repr‰sentiert beliebige Menge von Zeichen
		// * Zero or more occurrences Pdf 531/493
		// Zeichen(nachdem wir suchen) steht links vom Operator

		// Matcher Objekt, das Objekt auf das der regul‰re
		// Ausdruck getestet wird

		Matcher m1 = p1.matcher("aaab");
		Matcher m2 = p2.matcher("aaab");
		Matcher m3 = p2.matcher("b");
		Matcher m4 = p2.matcher("acccb");

		// Muster vorhanden
		boolean musterVorhanden = m1.matches();
		System.out.println(musterVorhanden);
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
	}

	public static void regexPunkt() {
		Pattern p1 = Pattern.compile("a*.b");
		// . Ein beliebiges zeichen - genau einmal
		Pattern p2 = Pattern.compile("a*.*b");

		Matcher m1 = p1.matcher("aaa#b");
		Matcher m2 = p1.matcher("@b");
		Matcher m3 = p1.matcher("@@b");
		Matcher m4 = p2.matcher("aaa#b");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
	}

	public static void regexLeerzeichen() {
		Pattern p1 = Pattern.compile("a*\\sb");
		// \s ein Leerzeichen (Leerzeichen \t \n \r)

		// \S EinZeichen, das kein Leerzeichen ist
		Pattern p2 = Pattern.compile("a*\\Sb");

		Matcher m1 = p1.matcher("aaa b");
		Matcher m2 = p1.matcher("aaa	b"); // Tab Zeichen dahinter
		Matcher m3 = p1.matcher("aaa\tb");
		Matcher m4 = p1.matcher("aaa\nb");
		Matcher m5 = p1.matcher("aaa\rb");
		Matcher m6 = p2.matcher("aaa\rb");
		Matcher m7 = p2.matcher("aaa?b");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
		System.out.println(m5.matches());
		System.out.println(m6.matches());
		System.out.println(m7.matches());
	}

	public static void regexWort() {
		// \w word character (letters, digits or "_")
		Pattern p1 = Pattern.compile("a*\\w*b");

		Matcher m1 = p1.matcher("aaa_b");
		Matcher m2 = p1.matcher("@b");
		Matcher m3 = p1.matcher("aaBlau_12b");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
	}

	public static void regexZahl() {
		// \d - eine Zahl zwischen 0 und 9
		Pattern p1 = Pattern.compile("a*\\db");
		Pattern p2 = Pattern.compile("a*\\d*b");

		Matcher m1 = p1.matcher("a2b");
		Matcher m2 = p2.matcher("a22b");
		Matcher m3 = p2.matcher("a2234b");
		Matcher m4 = p2.matcher("ab");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
	}

	public static void regexKeineZahl() {
		// \D - ein Zeichen, das keine Zahl ist
		Pattern p1 = Pattern.compile("a*\\Db");
		Pattern p2 = Pattern.compile("a*\\D*b");

		Matcher m1 = p1.matcher("a-b");
		Matcher m2 = p2.matcher("aﬂb");
		Matcher m3 = p2.matcher("a@#'*b");
		Matcher m4 = p2.matcher("ab");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
	}
}
