package packFormatPrintF;

import java.util.Locale;

public class DemoFormat {

	public static void main(String[] args) {
		rootInt();
		rootIntLocal();
		printString();
		printBoolean();
	}

	
	public static void rootInt(){
		double x = 0;
		for (int i = 9990; i < 10000; i++) {
			x = Math.sqrt(i);
			System.out.format("Die Wurzel aus %5d ist %6.2f%n",i,x );
			//Erkl�rung %5d es werden genau 5 Stellen f�r die Ausgabe der 
			//Zahl reserviert
			
			//Erkl�rung %6.2f 
			//mindestens 6 Stellen fuer die Gesamtausgabe
			//(Vorzeichen, Zahl, Komma; Nachkommastellen)
		}
	}
	
	public static void rootIntLocal(){
		for (int i = 9990; i < 10000; i++) {
			double x = Math.sqrt(i);
			System.out.format(Locale.GERMANY, "Die Wurzel aus %5d ist %6.2f%n",i,x );
			//Erkl�rung %5d es werden genau 5 Stellen f�r die Ausgabe der 
			//Zahl reserviert
			
			//Erkl�rung %6.2f 
			//mindestens 6 Stellen fuer die Gesamtausgabe
			//(Vorzeichen, Zahl, Komma; Nachkommastellen)
			
			//Erkl�rung: Durch Locale wird Komma durch Punktz ersetzt
		}
		System.out.println(Locale.getDefault());
	}
	
	public static void printString(){
		String temp = "heute morgen";
		String s = String.format("Hallo %10s. Es gab einen Anruf von %20s %s." , 
				"Chris", "Joy", temp);
		System.out.println(s);
		
	}
	
	
	public static void printBoolean(){
		String temp = "heute morgen";
		boolean bool = true;
		String s = String.format("Hallo %b. Es gab einen Anruf von %B %s." , 
				bool, bool, temp);
		System.out.println(s);
		
	}
	
}
