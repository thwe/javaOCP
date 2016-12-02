package p023InterfaceCasts;

public class OberKlasse extends OberOberKlasse implements Schnittstelle {

	@Override
	public void methode() {
		System.out.println("Oberklasse.methode()");
	}
	
	public void methodeOK() {
		System.out.println(getClass().getName() + ".methodeOK()");
	}

}
