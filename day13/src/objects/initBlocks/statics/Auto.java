package objects.initBlocks.statics;

public class Auto {

	// Attribute oder Instanzvariablen
	// Attribute muessen nicht initialisiert werden
	public static int demoClassVar;
	
	//Statische Initialisierungsblöcke
	static {
		System.out.println("demoClassVar: " + demoClassVar);
		demoClassVar = 100;
		System.out.println("demoClassVar: " + demoClassVar);
	}
	
	static {
		System.out.println("demoClassVar: " + demoClassVar);
		demoClassVar = 999;
		report();
	}

	// Konstruktoren
	// werden einmal aufgerufen, wenn ein Objekt erzeugt wird
	// Default Konstruktor - wird automatisch erzeugt
	// wenn kein Konstruktor definiert worden ist
	
	public static void report(){
		System.out.println("demoClassVar: " + demoClassVar);
	}
}
