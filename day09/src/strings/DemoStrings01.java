package strings;

public class DemoStrings01 {

	public static void main(String[] args) {
		int anzParameter = args.length;
		// deklStrings(anzParameter);
		// konstruktorenStrings();
		// primToStrings();
		// stringsToPrim();
		// compareStrings();
		// manipulateStrings();
		compareStringObjects();
		// aufgaben();
	}

	/**
	 * Deklaration Literalschreibweise Verwendung des Plus - Operators
	 * 
	 * @param argsLength
	 *            Anzahl der Kommandozeilenparameter
	 */
	public static void deklStrings(int argsLength) {
		String gruss1 = "Hallo Programmierer";
		gruss1 = gruss1 + ",";
		String ausgabe = gruss1 + " es wurden " + argsLength + " Parameter übergeben.";
		System.out.println(ausgabe);
	}

	public static void konstruktorenStrings() {
		// Parameterloser Konstruktor
		String leer = new String();
		System.out.println(leer);

		// Kopier Konstruktor
		String kopie = new String("Original");
		System.out.println(kopie);

		char[] cArray = { 'J', 'a', 'v', 'a' };
		String ausChars = new String(cArray);
		System.out.println(ausChars);
	}

	/**
	 * Umwandlung von primitiv nach String
	 */
	public static void primToStrings() {
		int a = 12;
		float f = 1.45f;

		String aString1 = "" + a;
		System.out.println(aString1);
		String fString1 = "" + f;
		System.out.println(fString1);

		String aString2 = String.valueOf(a);
		System.out.println(aString2);
		String fString2 = String.valueOf(f);
		System.out.println(fString2);
	}

	public static void stringsToPrim() {

		// String -> boolean
		String bString = "true";
		boolean bool = Boolean.parseBoolean(bString);
		System.out.println(bool);

		// String -> byte
		String byteString = "127";
		byte byt = Byte.parseByte(byteString);
		System.out.println(byt);

		// String -> short
		String shortString = "255";
		short s = Short.parseShort(shortString);
		System.out.println(s);

		// String -> int
		String intString = "12345";
		int i = Integer.parseInt(intString);
		System.out.println(i);

		// String - > long
		String longString = "1234567890";
		long l = Long.parseLong(longString);
		System.out.println(l);

		// String - > float
		String floatString = "12.4f";
		float f1 = Float.parseFloat(floatString);
		System.out.println(f1);

		// String -> double
		String doubleString = "1.125738999";
		double d = Double.parseDouble(doubleString);
		System.out.println(d);

		// String (ungültiges Format) -> Zahl
		String keineZahl = "ag4612";
		int zahl = 0;
		try {
			zahl = Integer.parseInt(keineZahl);
			// Exception in thread "main" java.lang.NumberFormatException:
			// For input string: "ag4612"
		} catch (NumberFormatException e) {
			System.out.println("Es wurde keine Zahl eingegeben");
			// e.printStackTrace();
		}
		System.out.println(zahl);

		// String (ungültiges Format) -> boolean
		String keinBoolean = "TREU Guten orgen";
		boolean bool1 = Boolean.parseBoolean(keinBoolean);
		// Achtung: Keine Meldung über falsches Format
		// Wir bekommen false zurück
		System.out.println(bool1);

	}

	public static void compareStrings() {
		String text = "Initializes a newly created String object so that it"
				+ " represents the same sequence of characters as the argument;"
				+ " in other words, the newly created string is a copy of the "
				+ "argument string. Unless an explicit copy of original is needed, "
				+ "use of this constructor is unnecessary since Strings are immutable.";

		// Die Methode contains
		System.out.println("text.contains(\"Initializes\")");
		System.out.println(text.contains("Initializes"));

		// Die Methode startsWith
		System.out.println("text.startsWith(\"Initializes\")");
		System.out.println(text.startsWith("Initializes"));

		// Die Methode endsWith
		System.out.println("text.endsWith(\"Initializes\")");
		System.out.println(text.endsWith("Initializes"));
		System.out.println("text.endsWith(\"immutable.\")");
		System.out.println(text.endsWith("immutable."));

		// Die Methode indexOf
		System.out.println("text.indexOf(\"immutable.\")");
		System.out.println(text.indexOf("immutable."));
		System.out.println(text.length());
		System.out.println("text.indexOf('c')");
		System.out.println(text.indexOf('c'));

		// Die Methode lastIndexOf
		System.out.println("text.lastIndexOf(\"uff.\")");
		System.out.println(text.lastIndexOf("uff."));
		System.out.println("text.lastIndexOf(\"are\")");
		System.out.println(text.lastIndexOf("are"));
		System.out.println("text.lastIndexOf('i')");
		System.out.println(text.lastIndexOf('i'));

		// Die Methode charAt
		System.out.println("text.charAt(133)");
		System.out.println(text.charAt(133));

		// Die Methode substring
		System.out.println(text.substring(20, 27));
		System.out.println(text.substring(0));
	}

	public static void manipulateStrings() {
		// Stringmanipulation (Strings sind unveränderlich)
		String alt = "If the character oldChar does not occur in" + " the character sequence represented by this String"
				+ " object, then a reference to this String object is"
				+ " returned. Otherwise, a new String object is created "
				+ "that represents a character sequence identical to the"
				+ " character sequence represented by this String object,"
				+ " except that every occurrence of oldChar is replaced " + "by an occurrence of newChar. ";

		// Methode replace
		alt.replace('a', '_');
		System.out.println("alt.replace('a', '_')");
		System.out.println(alt);
		String neu = alt.replace('i', '_');
		System.out.println(neu);
		neu = alt.replace("String", "gnirts");
		System.out.println(neu);
		System.out.println(alt);

		// Methode toLowerCase
		alt.toLowerCase();
		System.out.println("alt.toLowerCase()");
		System.out.println(alt);
		neu = alt.toLowerCase();
		System.out.println("neu = alt.toLowerCase()");
		System.out.println(neu);

		// Methode toUpperCase
		alt.toUpperCase();
		System.out.println("alt.toUpperCase()");
		System.out.println(alt);
		neu = alt.toUpperCase();
		System.out.println("neu = alt.toUpperCase()");
		System.out.println(neu);

		// Methode trim
		String untrimmed = "  Huhu 	";
		untrimmed.trim();
		System.out.println("untrimmed");
		System.out.println(untrimmed);
		String trimmed = untrimmed.trim();
		System.out.println("trimmed");
		System.out.println(trimmed);
	}

	public static void compareStringObjects() {
		// equals
		String name1 = "Anna";
		String name2 = "Anna";
		String name3 = name2;

		System.out.println("name1.equals(name2)");
		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2); // liefert true, weil ich nur ein
											// Objekt habe

		System.out.println("name1.equals(name3)");
		System.out.println(name1.equals(name3));

		System.out.println("name2.equals(name3)");
		System.out.println(name2.equals(name3));

		// equals vs. ==
		String stringTest1 = new String("test");
		String stringTest2 = "test";

		System.out.println("new String(\"test\") == \"test\"");
		System.out.println(new String("test") == "test");
		System.out.println(stringTest1 == stringTest2);
		System.out.println(stringTest1.equals(stringTest2));

		System.out.println("new String(\"test\") == new String(\"test\")");
		System.out.println(new String("test") == new String("test"));

		System.out.println("new String(\"test\")).equals(\"test\")");
		System.out.println((new String("test")).equals("test"));

		System.out.println("\"test\" == \"test\"");
		System.out.println("test" == "test");
		// The last one is equal because the "String constant pool"
		// When the compiler encounters a String literal, it checks the pool
		// to see if an identical String already exists. If a match is found,
		// the reference to the new literal is directed to the existing String,
		// and no new String literal object is created. (The existing String
		// simply has an additional reference.)

		// equalsIgnoreCase
		String name4 = "Anna";
		String name5 = "anna";

		System.out.println("name4.equalsIgnoreCase(name5)");
		System.out.println(name4.equalsIgnoreCase(name5));

		// compareTo
		String name6 = "aaa";
		String name7 = "aaabc";

		System.out.println("name6.compareTo(name7)");
		System.out.println(name6.compareTo(name7));
		// Eselsbrücke (linker Wert - rechter Wert)

		String name88 = "ard";
		String name99 = "";

		System.out.println("name88.compareTo(name99)");
		System.out.println(name88.compareTo(name99));
		// If there is no index position at which they differ, then the shorter
		// string lexicographically precedes the longer string. In this case,
		// compareTo returns the difference of the lengths of the strings --
		// that is, the value:
		// this.length()-anotherString.length()

		// compareToIgnoreCase
		String name8 = "Christa";
		String name9 = "christb";
		String name10 = "Bertha";

		System.out.println("name8.compareToIgnoreCase(name9)");
		System.out.println(name8.compareToIgnoreCase(name9));

		System.out.println("name9.compareToIgnoreCase(name10)");
		System.out.println(name9.compareToIgnoreCase(name10));

		// Methode concat
		String name11 = "bertha";
		String name12 = "anton";

		System.out.println("name11.concat(name12)");
		System.out.println(name11.concat(name12));
		System.out.println(name11);
	}

	public static void aufgaben() {
		String vorname = "Monika";
		char eBuch = vorname.charAt(0);
		System.out.println(eBuch);

		char zwei = '2';
		String kuerzel = "" + eBuch + zwei;
		System.out.println(kuerzel);

		String zeichenkette = "Hallo";
		for (int i = 0; i < zeichenkette.length(); i++) {
			System.out.println(zeichenkette.charAt(i));
		}

	}

}
