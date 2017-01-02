package steckdosen_mit_generics;

interface TV {}
class TVDE implements TV {}
class TVEN implements TV {}

//Generischen Typ definieren:
class Steckdose <T extends TV> {
	private T tv;
	
	void anschliessen(T tv) {
		this.tv = tv;
	}
	
	public T getTv() {
		return tv;
	}
}


public class LoesungMitGenerics {

	public static void main(String[] args) {
		
		// 1. Es gibt Steckdosen
		// 2. Es gibt TV-Geräte
		// 3. Englische TV passen nicht für die deutschen Steckdosen und umgekehrt
		
		Steckdose<TVDE> sdDE = new Steckdose<TVDE>(); //generischen Typ benutzen
		
		TVDE tvDE = new TVDE();
		TVEN tvEN = new TVEN();
		
		sdDE.anschliessen(tvDE);	//soll gehen
		sdDE.anschliessen(tvEN);	//darf nicht kompilieren
		
		Steckdose<TVEN> sdEN = new Steckdose<TVEN>();
		sdEN.anschliessen(tvDE);	//darf nicht kompilieren
		sdEN.anschliessen(tvEN);	//soll gehen
		
		
		Steckdose<String> sdSinnlos = new Steckdose<String>();
		sdSinnlos.anschliessen("Bin keine Steckdose!");

	}

}
