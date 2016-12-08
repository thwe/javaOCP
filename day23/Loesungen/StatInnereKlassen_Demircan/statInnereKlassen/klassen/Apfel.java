package hausaufgaben.statInnereKlassen.klassen;

public class Apfel extends Obst {

	public Apfel(int anzahl) {
		super("Apfel", anzahl);

	}

	public String getObstname() {
		return this.name;
	}

	public int getAnzahl() {
		return this.anzahl;
	}
}