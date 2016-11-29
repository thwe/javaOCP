package vererbung.initBlocks;

public class C extends B
{
	static{
		System.out.println("Klasse C - Statischer Initialisierungsblock");
	}
	
	
	{
		System.out.println("Klasse C - Initialisierungsblock");
	}
	
	public C()
   {
      super();
	 System.out.println ("Klasse C - Konstruktor ohne Parameter");
   }
}
