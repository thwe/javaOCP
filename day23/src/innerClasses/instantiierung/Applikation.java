package innerClasses.instantiierung;

public class Applikation {

	public static void main(String[] args) {
		//Option 1.:
		//Instanz der ‰uﬂeren Klasse: outClass (refVariable) 
		OutClass outClass = new OutClass();
		OutClass.InClass inClass;
		//Beim Typ der inneren Klasse muss die ‰uﬂere Klasse 
		//auch angegeben werden
		//Allgemein: AussereKlasse.InnereKlasse
		
		inClass = outClass.new InClass();
		//Der Konstruktor der inneren Klasse wird aus dem Objekt 
		//der ‰uﬂeren Klasse aufgerufen
		
		inClass.seeOut();
		
		//Option 2:
		//Kurzschreibweise mit einer Anweisung
		OutClass.InClass inClass2 = new OutClass().new InClass();
		inClass2.seeOut();
		
		//Option 3: 
		OutClass.InClass inClass3 = new OutClass().instantiateInClass();
		inClass3.seeOut();
		
		
	}

}
