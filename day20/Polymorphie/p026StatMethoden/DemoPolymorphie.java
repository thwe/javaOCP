package p026StatMethoden;

public class DemoPolymorphie {

	public static void main(String[] args) {
		//Dynamische Polymorphie 
		//Wie ist es mit statischen Methoden?
		//Polymorphie gilt f�r Instanzmethoden
		
		Mutter mutter01 = new Mutter();
		mutter01.machEtwas();
		mutter01.machEtwasStatisch(); //nicht ganz korrekt
		
		Tochter tochter01 = new Tochter();
		tochter01.machEtwas();
		tochter01.machEtwasStatisch();
		
		Mutter tochter02 = new Tochter();
		tochter02.machEtwas(); //Dynamische Polymorphie
		tochter02.machEtwasStatisch(); //Ausgabe Mutter
		//Dynamische Polymorphie bezieht sich nur auf Instanzmethoden
		
		Tochter.machEtwasStatisch();
		
		
		//statische Polymorphie
		Mutter mutter02 = new Mutter();
		mutter02.machEtwas();
		mutter02.methode01();
		mutter02.methode02();
		
		Tochter tochter03 = new Tochter();
		tochter03.machEtwas();
		tochter03.methode01();
		tochter03.methode02();
		tochter03.methode03();
		
		Mutter tochter04 = new Tochter();
		tochter04.machEtwas();
		tochter04.methode01();
		tochter04.methode02();
		//tochter04.methode03(); 
		//Geht aufgrund des stat. Polymorphie nicht
		//Es k�nnen nur die Methoden aufgerufen werden, die in dem Typ (Klasse)
		//der Referenzvariable enthalten sind
		
		//Abhilfe
		((Tochter) tochter04).methode03(); 
	}

}
