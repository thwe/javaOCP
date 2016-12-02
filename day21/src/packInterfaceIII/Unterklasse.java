package packInterfaceIII;

public class Unterklasse extends Oberklasse implements ISchnittstelle{

	//enthält bereits die OberKlasse eine Methode mit 
    //der gleichen Signatur, wie die Schnittstelle selbst
    //so wird die erneute Implementierung der Methode von der Subklasse nicht erzwungen
	
	@Override
	public void methode2() {
		
		
	}
	
	
}
