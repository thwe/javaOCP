package garbageCollector;

public class DemoGC1 {

	Integer int1 = new Integer(42); 
	//Lebensdauer bestimmt durch eines evtl. Objekts der Klasse DemoGC1
	
	static Integer int2 = new Integer(43);
	//Lebensdauer ist nicht an ein Objekt DemoGC1 gekoppelt 
	//existiert so lange, bis die Klasse geladen ist
	
	{
		Integer int3 = new Integer(44);
	}
	
	//Nach Durchlaufen des Initialisierungsblocks steht int3 
	//nicht zur Verfügung (lebensdauer vorbei) 
	//Objekt int3 - kann aufgeräumt werden
	
	void methodInt(){
		Integer int4 = new Integer(45);
		
		Runtime rt = Runtime.getRuntime();
		rt.freeMemory();
		
		Object o;
		
	}
	
	
}
