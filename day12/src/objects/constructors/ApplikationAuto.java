package objects.constructors;

public class ApplikationAuto {

	public static void main(String[] args) {
		Auto myAuto;
		//Auto - Typ des Objekts - Referenztyp 
		//myAuto (Objektname) - Referenzavariable - zeigt auf das Objekt
		
		myAuto = new Auto();
		//Es wurde ein Objekt erzeugt (instantiiert)
		//Schl�sselwort new zur Erzeugung des Objekts
		//Auto() - hier wird der Konstruktor der Klasse Auto aufgerufen
		//Wird kein Konstruktor angegeben
		//Dann gibt es einen Default Konstruktor
		
		System.out.println(myAuto.farbe);
		System.out.println(myAuto.getPferdeStaerke());
		//Zugriff auf Instanzmethoden oder Attribute: Punktnotation
		//Objektname + Punkt + Methodenname/Attributname
		System.out.println(myAuto.isLeasing());
		System.out.println(myAuto.getKmStand());
		
		Auto auto01 = new Auto();
		auto01.report();
		
		Auto auto02 = new Auto(80);
		auto02.report();
		
		Auto auto03 = new Auto(120, 2000, "VW Passat");
		auto03.report();
		
		//Anonymes Objekt
		new Auto(200, 2000, "VW Golf").report();
		
		//Nach Erzeugung k�nnen die Zust�nde des Objekts 
		//mit den settern ver�ndert werden
		auto03.setFarbe("Rot");
		auto03.report();
		Auto autoIndividuell = new Auto("Pink",116,"Scoda 8",12500,3000,true);
		autoIndividuell.report();

	}

}
