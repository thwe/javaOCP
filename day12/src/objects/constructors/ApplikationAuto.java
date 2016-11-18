package objects.constructors;

public class ApplikationAuto {

	public static void main(String[] args) {
		Auto myAuto;
		// Auto - Typ des Objekts - Referenztyp
		// myAuto (Objektname) - Referenzavariable - zeigt auf das Objekt

		myAuto = new Auto();
		// Es wurde ein Objekt erzeugt (instantiiert)
		// Schlüsselwort new zur Erzeugung des Objekts
		// Auto() - hier wird der Konstruktor der Klasse Auto aufgerufen
		// Wird kein Konstruktor angegeben
		// Dann gibt es einen Default Konstruktor

		System.out.println(myAuto.farbe);
		System.out.println(myAuto.getPferdeStaerke());
		// Zugriff auf Instanzmethoden oder Attribute: Punktnotation
		// Objektname + Punkt + Methodenname/Attributname
		System.out.println(myAuto.isLeasing());
		System.out.println(myAuto.getKmStand());

		Auto auto01 = new Auto();
		auto01.report();

		Auto auto02 = new Auto(80);
		auto02.report();

		Auto auto03 = new Auto(120, 2000, "VW Passat");
		auto03.report();

		// Nach Erzeugung können die Zustände des Objekts
		// mit den settern verändert werden
		auto03.setFarbe("Rot");
		auto03.report();
		
		Auto autoIndividuell = new Auto("Pink", 116, "Scoda 8", 12500, 3000, true);
		autoIndividuell.report();
		
		Person besitzerAutoInd = new Person();
		besitzerAutoInd.setName("Mueller");
		besitzerAutoInd.setVorname("Peter");
		
		autoIndividuell.setBesitzer(besitzerAutoInd);
		System.out.println(autoIndividuell.getBesitzer());
		System.out.println(besitzerAutoInd);
		
		System.out.println(auto03);
				
		// Anonymes Objekt
		//new Auto(200, 2000, "VW Golf").report();
		
		autoVergleich(auto01,autoIndividuell);
	}
	
	public static void autoVergleich(Auto auto1, Auto auto2){
		if(auto1.getFarbe().equals(auto2.getFarbe()) ){
			System.out.println("Gleiche Farbe");
		}else{
			System.out.println("Farbe ist unterschiedlich");
		}
	}

}
