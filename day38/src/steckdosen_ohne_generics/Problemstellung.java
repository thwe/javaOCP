package steckdosen_ohne_generics;

class TVEN {}
class TVDE {}

class SteckdoseEN {
	private TVEN tv;
	
	void anschliessen(TVEN tv) {
		this.tv = tv;
	}
	
	public TVEN getTv() {
		return tv;
	}
}

class SteckdoseDE {
	private TVDE tv;
	
	void anschliessen(TVDE tv) {
		this.tv = tv;
	}
	
	public TVDE getTv() {
		return tv;
	}
}

public class Problemstellung {

	public static void main(String[] args) {
		// 1. Es gibt Steckdosen
		// 2. Es gibt TV-Geräte
		// 3. Englische TV passen nicht für die deutschen Steckdosen und umgekehrt
		
		SteckdoseDE sdDE = new SteckdoseDE();
		
		TVEN tvEN = new TVEN();
		sdDE.anschliessen(tvEN);	//darf nicht gehen
		
		SteckdoseEN sdEN = new SteckdoseEN();
		
		TVDE tvDE = new TVDE();
		sdEN.anschliessen(tvDE);	//darf nicht gehen
		
		
		sdDE.anschliessen(tvDE);	//soll gehen
		sdEN.anschliessen(tvEN);	//soll gehen
		
	}

}
