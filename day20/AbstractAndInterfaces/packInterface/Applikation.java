package packInterface;

public class Applikation {

	public static void main(String[] args) {
		ImplementierendeKlasse iKlasse = new ImplementierendeKlasse();
		iKlasse.method01();
		iKlasse.method02();
		iKlasse.method03();
		
		//Besonderheit - Polymorphie
		ISchnittstelle iSchnittstelle = new ImplementierendeKlasse(); 
		iSchnittstelle.method01();
		iSchnittstelle.method02();
		//iSchnittstelle.method03();
		//Geht wegen stat. Polymorphie nicht
		((ImplementierendeKlasse) iSchnittstelle).method03();
		
		ISchnittstelle iSchnittstelle2 = new ImplementierendeKlasse2(); 
		iSchnittstelle2.method01();
		iSchnittstelle2.method02();
		//iSchnittstelle2.method04();
		//Geht wegen stat. Polymorphie nicht
		((ImplementierendeKlasse2) iSchnittstelle2).method04();
		
		ISchnittstelle iSchnittstelle3 = new SubImplementierendeKlasse(); 
		iSchnittstelle3.method01();
		iSchnittstelle3.method02();
		//iSchnittstelle3.method03();
		//Geht wegen stat. Polymorphie nicht
		((ImplementierendeKlasse) iSchnittstelle3).method03();
		((SubImplementierendeKlasse) iSchnittstelle3).method05();
		
		ISchnittstelle[] array = new ISchnittstelle[3];
		array[0] = iSchnittstelle;
		array[1] = iSchnittstelle2;
		array[2] = iSchnittstelle3;
		
		
				
	}

}
