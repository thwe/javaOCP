package innerClasses.zugriffsModifizierer;

public class OutClass {

	//Attribute
	private int number = 8;
	
	//Erlaubte Modifizierer final, abstract, public, private, protected, strictfp
	//final bedeutet, dass die Klasse nicht abegeleitet werden kann
	//abstract: bedeutet, dass wir eine instantiierbare Unterklasse benötigen
	//da aus der inneren Klasse selbts keine Instanz erzeigt werden kann
	//private: Instantiieren von ausserhalb nicht möglich
	//protected: paketsichtbar + Kindsklassen
	//strictfp: Genauigkeit der Fließkommazahlen
	public class InClass{
		public void seeOut(){
			System.out.println("priv Attr. der äußeren Klasse: " + number);			
		}
	}
}

