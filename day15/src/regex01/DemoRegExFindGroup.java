package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Die Matcher-Klasse kann feststellen, ob sich eine durch ein Muster 
 * beschriebene Teilfolge im String befindet. Dazu dient die Methode find().
 * 
 * Sie hat zwei Aufgaben: 
 * Zunächst sucht sie nach einer Fundstelle und gibt bei Erfolg true zurück.
 * Das Nächste ist, dass jedes Matcher-Objekt einen Zustand mit Fundstellen besitzt,
 * den find() aktualisiert.
 * 
 *
 */
public class DemoRegExFindGroup {

	public static void main(String[] args) {
		//findGroupStart01();
		findGroupStart02();

	}
	
	public static void findGroupStart01() {
		Pattern p1 = Pattern.compile(".*xx");
		Matcher m1 = p1.matcher("yyxxxyxx");

		while (m1.find()) {
			System.out.println(m1.start() + " " + m1.group());
		}

		// System.out.println(m1.matches());

		// m1.find();
		// The find() method returns true if it gets a match,
		// and remembers the start position of the match.

		// m1.start();
		// If find() returns true, you can call the start() method
		// to get the starting position of the match

		// m1.group();
		// you can call the group() method to get the string that
		// represents the actual bit of source data that was matched
	}
	
	public static void findGroupStart02() {
		// Hier nur *
		Pattern p2 = Pattern.compile(".*xx");
		Matcher m2 = p2.matcher("yyyxxaaxx");

		while (m2.find()) {
			System.out.println(m2.start() + " " + m2.group());
		}

		// *?
		System.out.println("// *?");
		Pattern p3 = Pattern.compile(".*?xx");
		Matcher m3 = p3.matcher("yyyxxaaxx");

		while (m3.find()) {
			System.out.println(m3.start() + " " + m3.group());
		}
		

		Matcher m = Pattern.compile(".*?(xx)").matcher("yyxxzzxx4.");

		while (m.find()) {

			// sysout all xx:

			System.out.println(m.start() + "" + m.group());

		}

	}


}
