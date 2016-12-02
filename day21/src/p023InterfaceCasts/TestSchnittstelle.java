package p023InterfaceCasts;

public class TestSchnittstelle {

	public static void main(String[] args) {

		// Schnittstelle schnittstelle01 = new Schnittstelle();
		Schnittstelle schnittstelle02 = new OberKlasse();
		Schnittstelle schnittstelle03 = new UnterKlasse();
		Schnittstelle schnittstelle04 = new UnterKlasse2();

		// stat. Polymorphie
		schnittstelle02.methode();
		// schnittstelle02.methodeOK();

		// dyn. Polymorphie
		schnittstelle02.methode();
		schnittstelle03.methode(); // Methode wurde nicht überschrieben
		schnittstelle04.methode(); // Methode wurde überschrieben
		System.out.println();

		// Zweites Beispiel - Typ der Referenzvariable ist die
		// implementierende Klasse: OberKlasse
		OberKlasse oberKlasse01 = new OberKlasse();
		OberKlasse oberKlasse02 = new UnterKlasse();
		OberKlasse oberKlasse03 = new UnterKlasse2();

		// stat. Polymorphie
		oberKlasse01.methode();
		oberKlasse01.methodeOK();
		System.out.println();

		// dyn. Polymorphie
		oberKlasse01.methode();
		oberKlasse02.methode();
		oberKlasse03.methode();

		// Typkonvertierungen
		Schnittstelle schnittstelle05 = new OberKlasse();
		OberKlasse oberKlasse04 = (OberKlasse) schnittstelle05;

		Schnittstelle schnittstelle06 = new UnterKlasse();
		OberKlasse oberKlasse05 = (OberKlasse) schnittstelle06;

		OberOberKlasse ooOberKlasse = new OberOberKlasse();
		// OberKlasse oberKlasse06 = (OberKlasse) ooOberKlasse;

		OberKlasse oberKlasse07 = new OberKlasse();
		UnterKlasse unterKlasse01 = new UnterKlasse();
		
		Schnittstelle schnittstelle07 = new Schnittstelle() {

			@Override
			public void methode() {
				System.out.println("Anonyme Klasse");

			}
		};

		//oberKlasse07 = (OberKlasse) schnittstelle07;
		//unterKlasse01 = (UnterKlasse) schnittstelle07;
		
		OberKlasse oberKlasse08 = new OberKlasse();
		Schnittstelle schnittstelle08 = new OberKlasse();
		oberKlasse08 = (OberKlasse) schnittstelle08;
		
		UnterKlasse unterKlasse02 = new UnterKlasse(); 
		Schnittstelle schnittstelle09 = new UnterKlasse();
		unterKlasse02 = (UnterKlasse)schnittstelle09;
		oberKlasse08 = (UnterKlasse)schnittstelle09;
		oberKlasse08 = (OberKlasse)schnittstelle09;
	
	}

}
