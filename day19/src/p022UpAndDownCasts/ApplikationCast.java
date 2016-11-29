package p022UpAndDownCasts;

import java.util.Arrays;

/**
 * Up-Cast: Cast in einen Typ, der in der Vererbungshierarchie weiter oben
 * liegt
 * 
 * Down - Cast: Cast in einen Typ, der in der Vererbungshierarchie weiter
 * unten liegt
 * 
 * Bei einem gueltigen Up-Cast ist es nicht erforderlich, den Cast -
 * Operator anzugeben. Up - Cast erfolgt automatisch durch den Compiler.
 * Also implizite Typkonvertierung ...
 * 
 * Ist der formale Parameter einer Methode eine referenz der Klasse Object,
 * so kann jede beliebige Referenz an diese Methode übergeben. Grund: Jede
 * Klasse wird vom Object abgeleitet
 *
 */
public class ApplikationCast {

	public static void main(String[] args) {
		//validCastOperations();
		
		validCastArrays();

	}
	
	
	private static void validCastOperations(){
		// **** UP CAST *****
		
		C c = new C();
		B b = c;
		//Referenz b zeigt auf ein Objekt der Klasse C
		//Impliziter Cast (UpCast) nach B
		
		b.test();
		//Die linke Seite entscheidet darüber welche Methoden zur Verfügung stehen 
	    // auch statische Polymorphie genannt
		
		//Die rechte Seite entscheidet darüber aus welcher Klasse 
		//die Implementierung der Methode kommt 
		//(auch dynamische Polymorpohie genannt)
		
		B b2 = new B();
		A a = b2;
		//Impliziter Cast nach A
		a.test();
		
		Object o = b2;
		//Impliziter Cast nach Object
		
		// *** DOWN CAST
		
		C c2 = (C)b;
		c2.test();
		
		//Hinter b und c2 steckt ein C Objekt
		
		//C c3 = (C)b2; 
		// Hinter b2 ist ein Objekt vom Typ B 
		// Class Cast Exception
		
		//D d = (D)b2;
		//Cannot Cast from B to D
		//zwei völlig unterschiedliche Klassen 
		//nicht in der gleichen Hierarchie - Vererbungsbaum
	}

	
	public static void validCastArrays(){
		String[] arr1 = {"Anna", "Katharina"};
		Object ref1 = arr1;
		//UP-CAST
		//Implizite Typ Konvertierung
		
		String[] arr2 = (String[])ref1;
		//DOWN-CAST
		//Explizite Typ Konvertierung
		
		System.out.println(Arrays.toString(arr2));
		
		//Zweites Beispiel 
		int[] arr3 = {1,2};
		Object ref2 = arr3;
		int[] arr4 = (int[]) ref2;
		
		System.out.println(Arrays.toString(arr4));
		
	}
}
