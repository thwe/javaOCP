package p021TypKonvertierungReferenzen;

public class ApplikationTyKonvertierung {

	public static void main(String[] args) {
		//showAccess();
		
		// Implizite Typkonvertierung
		// implKonvertierung(); 
		
		// Explizite Konvertierung
		explKonvertierung01();
		explKonvertierung02();

	}
	
	private static void implKonvertierung(){
		Sohn refSohn = new Sohn();
		Vater refVater = refSohn;
		refSohn.methode1();
		refSohn.methode2();
		refVater.methode1();
	}
	
	
	private static void explKonvertierung01(){
		Sohn refSohn = new Sohn();
		Vater refVater = refSohn; // vergleichbar mit: = new Sohn();
		Sohn refSohn2 = (Sohn) refVater;
		
		/*  refSohn2 = (Sohn)refVater
		 * ist nur dann zulässig, wenn die Referenz 
		 * refVater auf ein Objekt vom Typ Sohn zeigt.
		 * 
		 * Sonst gibt es Class Cast Exception
		 */
		
		refSohn.methode1();
		refSohn.methode2();
		refSohn2.methode1();
		refSohn2.methode2();
		refVater.methode1();
		((Sohn)refVater).methode2();
	}
	
	private static void explKonvertierung02(){
		//Zweiter Fall 
		Vater refVater = new Vater();
		Sohn refSohn = (Sohn)refVater;
		//		Exception in thread "main" java.lang.ClassCastException: p021TypKonvertierungReferenzen.Vater cannot be cast to p021TypKonvertierungReferenzen.Sohn
		//		at p021TypKonvertierungReferenzen.ApplikationTyKonvertierung.explKonvertierung(ApplikationTyKonvertierung.java:46)
		//		at p021TypKonvertierungReferenzen.ApplikationTyKonvertierung.main(ApplikationTyKonvertierung.java:12)
		
		//refSohn.methode1();
		//refSohn.methode2();
		
	}
	
	private static void showAccess(){
		Vater vater = new Vater();
		System.out.println(vater.wert1);
		vater.methode1();
		
		Sohn sohn = new Sohn();
		System.out.println(sohn.wert1);
		System.out.println(sohn.wert2);
		sohn.methode1();
		sohn.methode2();
		
		Vater mensch01 = new Sohn();
		System.out.println(mensch01.wert1);
		mensch01.methode1();
		
		//Motivation
		//System.out.println(mensch01.wert2);
		//mensch01.methode2();
		
		
		
	}

}
