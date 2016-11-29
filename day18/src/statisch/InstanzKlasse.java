package statisch;

public class InstanzKlasse {

	// Attribute und Klassenvariablen
	public int zahl1 = 4;
	public static int zahl2 = 5;

	//Instanzmathode
	public void printNichtStatisch() {
		System.out.println("I am an instance of the class InstanzKlasse");
	}

	//Statische Methode
	static public void printStatisch() {
		System.out.println("I am the class InstanzKlasse");
	}
}
