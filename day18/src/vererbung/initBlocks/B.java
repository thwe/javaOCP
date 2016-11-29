package vererbung.initBlocks;

public class B extends A {

	static{
		System.out.println("Klasse B - Statischer Initialisierungsblock");
	}
	
	{
		System.out.println("Klasse B - Initialisierungsblock");
	}
	
	public B() {
		System.out.println("Klasse B - Konstruktor ohne Parameter");
	}
}
