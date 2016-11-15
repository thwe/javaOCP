package aufgaben;

/**
 * A command line program that outputs the poem 'Little witch' as a text to the
 * command line.
 * <p>
 * Aufgabe:<br>
 * Erstellen Sie im Folgenden ein Programm namens LittleWitch.java, das die
 * Vormittagsgestaltung kleinen Hexe gemäß eines bekannten Kindergedichtes
 * beschreibt.<br>
 * a) Definieren Sie sich dazu eine ganzzahlige Variable clock, deren Wert der
 * Reihe nach die Uhrzeiten zwischen 6 und 12 Uhr durchläuft. <br>
 * b) Halten Sie Ihre Ausgabeanweisungen frei von Redundanzen. <br>
 * c) Verwenden Sie soweit sinnvoll eine Auswahl-Anweisung, um das Verhalten der
 * kleinen Hexe in Abhängigkeit der aktuellen Uhrzeit festzulegen. <br>
 * d) Das Programm soll die folgende Ausgabe erzeugen: <br>
 * Morgens früh um 6<br>
 * kommt die kleine Hex.<br>
 * Morgens früh um 7<br>
 * schabt sie gelbe Rüben.<br>
 * Morgens früh um 8<br>
 * wird Kaffee gemacht.<br>
 * Morgens früh um 9<br>
 * geht sie in die Scheun'.<br>
 * Morgens früh um 10<br>
 * hackt sie Holz und Spän'.<br>
 * Feuert an um 11,<br>
 * kocht dann bis um 12:<br>
 * Fröschebein und Krebs und Fisch.<br>
 * Hurtig Kinder kommt zu Tisch!
 * </p>
 * Datum: 09.11.2016
 * 
 * @author Hardy Scheel
 * @version 1.0
 */
public class LittleWitch {

	/**
	 * LittleWitch poem begins at 6 o'clock.
	 */
	final static byte ClockLowerLimit = 6;
	/**
	 * LittleWitch poem ends at 12 o'clock.
	 */
	final static byte ClockUpperLimit = 12;
	/**
	 * Stores textlines of the poem.
	 */
	static String poem;
	/**
	 * (Optional: The use of this variable is optional.) A control character
	 * <code>\n</code> to break a text line for further text processing.
	 */
	final static char n = '\n';

	public static void main(String[] args) {

		poem = generatePoemTextLines(ClockLowerLimit, ClockUpperLimit);

		writePoemToConsole(poem);

	}

	/**
	 * Generates a command line text (from poem) for the given time.
	 * 
	 * @param clock
	 *            the time the poem starts
	 * @param boundary
	 *            the time the poem ends
	 * @return a String that contains the poem text lines
	 */
	public static String generatePoemTextLines(byte clock, byte boundary) {

		String text = "";

		do {

			switch (clock) {
			case 6:
				text += "Morgens früh um 6" + n;
				text += "kommt die kleine Hex." + n;
				break;
			case 7:
				text += "Morgens früh um 7" + n;
				text += "schabt sie gelbe Rüben." + n;
				break;
			case 8:
				text += "Morgens früh um 8" + n;
				text += "wird Kaffee gemacht." + n;
				break;
			case 9:
				text += "Morgens früh um 9" + n;
				text += "geht sie in die Scheun'." + n;
				break;
			case 10:
				text += "Morgens früh um 10" + n;
				text += "hackt sie Holz und Spän'." + n;
				break;
			case 11:
				text += "Feuert an um 11," + n;
				break;
			case 12:
				text += "kocht dann bis um 12:" + n;
				text += "Fröschebein und Krebs und Fisch." + n;
				text += "Hurtig Kinder kommt zu Tisch! " + n;
				break;
			default:
				break;
			}

			clock++;

		} while (clock <= boundary);

		return text;

	}

	/**
	 * Outputs the poem to the command line prompt (console).
	 * 
	 * @param p
	 *            A String that contains the text lines of the poem.
	 */
	public static void writePoemToConsole(String p) {

		System.out.println(p);

	}

}
