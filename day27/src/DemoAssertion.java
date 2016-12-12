/**
 * Mit Assertions besteht die Möglichkeit, zur Laufzeit eines Programms
 * bestimmte Programmeigenschaften zu überprüfen.
 * 
 * Notation von Assertions:
 * 
 * 1) assert Ausdruck1; //erste Variante
 * 
 * In der ersten Variante der assert-Anweisung wird der Boolesche Ausdruck
 * Ausdruck1 ausgewertet. Ergibt Ausdruck1 den Wert true, d.h. die zu
 * überprüfende Eigenschaft ist richtig, so wird die nächste Anweisung nach der
 * Assertion ausgeführt.
 * 
 * Ergibt der Boolesche Ausdruck den Wert false, dann wirft die assert-Anweisung
 * einen AssertionError.
 * 
 * 2 ) assert Ausdruck1 : Ausdruck2; // zweite Variante 
 * 
 * Bei der zweiten Variante der assert-Anweisung wird ebenfalls der Boolesche 
 * Ausdruck Ausdruck1 ausgewertet. Ergibt die Auswertung true, so wird die 
 * Ausführung wiederum nach der Assertion fortgesetzt. Ist Ausdruck1 
 * allerdings false, dann wird Ausdruck2 ausgegeben.
 * 
 * 
 * Situationen: Kontrollflüssen Vor - und Nachbedingungen von Methoden
 * 
 * Einstellungen: - ea / Kommandozeilenschalter
 */
public class DemoAssertion {

	public void printNumberAss1(int number){
		int i = number;
		assert i>0;
	}
	
	public void printNumberAss2(int number){
		int i = number;
		assert i>0 : "Number "+i+" ist kleiner 0" ;
	}
	//Assertion Errors werden üblicherweise 
	//nicht mit try - catch abgefangen 
	public void printNumberAss3(int number){
		int i = number;
		try {
			assert i>0 : "Number "+i+" ist kleiner 0" ;
		} catch (AssertionError e) {
			e.printStackTrace();
		}
		
		System.out.println("Ende Methode");
	}
	
	public void printNumberAss4(int number) {
		int i = number;
		
		try {
			assert (i > 0):i=10;
			System.out.println(i);
		} catch (AssertionError e) {
			e.printStackTrace();
			System.out.println("Number i ist kleiner 0");
		}
		
		System.out.println("i*2 " + i*2);
	}

	
	public static void main(String[] args) {
		DemoAssertion dAssertion = new DemoAssertion();
		//dAssertion.printNumberAss1(-100);
		//dAssertion.printNumberAss2(-100);
		//dAssertion.printNumberAss3(-100);
		dAssertion.printNumberAss4(-100);
	}
}
