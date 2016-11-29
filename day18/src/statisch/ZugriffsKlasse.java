package statisch;

public class ZugriffsKlasse extends InstanzKlasse {
	// Attribute und Klassenvariablen
	public static int staticVar = 3;
	public int iVar = 10;
	InstanzKlasse iKlasse = new InstanzKlasse();
	static InstanzKlasse sKlasse = new InstanzKlasse();

	// Zugriff aus einem statischen Kontext
	static void method01() {
		// System.out.println(iKlasse.zahl1);
		// System.out.println(this.iKlasse.zahl1);
		// Cannot make a static reference to the non-static field iKlasse
		// System.out.println(this.iVar);
		// System.out.println(super.zahl1);

		System.out.println(sKlasse.zahl1);
		System.out.println(staticVar);

		// Zugriff von aussen
		System.out.println(InstanzKlasse.zahl2);
		InstanzKlasse.printStatisch();

		// Zugriff auf lokale Instanzvariablen
		InstanzKlasse instanzKlasse = new InstanzKlasse();
		System.out.println(instanzKlasse.zahl1);
		instanzKlasse.printNichtStatisch();

		System.out.println(instanzKlasse.zahl2); // - hier Warnung
		System.out.println(InstanzKlasse.zahl2);
		instanzKlasse.printStatisch(); // Warnung - Aufruf
		InstanzKlasse.printStatisch();
	}

	// Zugriff aus einem nicht statischen Kontext
	public void method02() {
		System.out.println(iKlasse.zahl1);
		System.out.println(this.iKlasse.zahl1);
		iKlasse.printNichtStatisch();

		System.out.println(sKlasse.zahl1);
		System.out.println(staticVar);

		// Zugriff auf lokale Instanzvariablen
		InstanzKlasse instanzKlasse = new InstanzKlasse();
		System.out.println(instanzKlasse.zahl1);
		instanzKlasse.printNichtStatisch();

		System.out.println(instanzKlasse.zahl2); // - hier Warnung
		System.out.println(InstanzKlasse.zahl2);
		instanzKlasse.printStatisch(); // Warnung - Aufruf
		InstanzKlasse.printStatisch();

		System.out.println(this.iVar);
		System.out.println(super.zahl1);
	}

}
