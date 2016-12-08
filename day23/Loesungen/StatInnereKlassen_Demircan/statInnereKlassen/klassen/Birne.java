package hausaufgaben.statInnereKlassen.klassen;

public class Birne extends Obst {

	public Birne(int anzahl) {
		super("Birne", anzahl);

	}

	public String getObstname() {
		return this.name;
	}

	public int getAnzahl() {
		return this.anzahl;
	}
}