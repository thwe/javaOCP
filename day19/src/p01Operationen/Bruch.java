package p01Operationen;

public class Bruch {
	private int nenner;
	private int zaehler;

	public Bruch(int nenner, int zaehler) {
		this.nenner = nenner;
		this.zaehler = zaehler;
	}
	
	public void print(){
		System.out.print("Zaehler: " + this.zaehler);
		System.out.println(" Nenner: " + this.nenner);
	}
}
