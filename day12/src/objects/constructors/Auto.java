package objects.constructors;

public class Auto {

	// Attribute oder Instanzvariablen
	// Attribute muessen nicht initialisiert werden
	public String farbe = "weiss";
	private int pferdeStaerke;
	private String modell;
	private int kmStand;
	private int hubraum;
	private boolean leasing;
	
	private Person besitzer; 

	// Konstruktoren
	// werden einmal aufgerufen, wenn ein Objekt erzeugt wird
	// Default Konstruktor - wird automatisch erzeugt
	// wenn kein Konstruktor definiert worden ist
	public Auto() {
		System.out.println("Hier wird ein Objekt erzeugt");
		this.kmStand = 5;
		// this.setKmStand(5);
	}

	public Auto(int pferdeStaerke) {
		this();
		// this() bezieht sich auf einen anderen Konstruktor
		// der gleichen Klasse. Wird this() benutzt, muss es in
		// der ersten Zeile stehen.
		this.pferdeStaerke = pferdeStaerke;
		// Links Attribut - Rechts parameter
	}

	public Auto(int pferdeStaerke, int hubraum, String modell) {
		// this.pferdeStaerke = pferdeStaerke;
		this(pferdeStaerke);
		this.hubraum = hubraum;
		this.modell = modell;
	}

	public Auto(String farbe, int pferdeStaerke, String modell, 
			int kmStand, int hubraum, boolean leasing) {
		this(pferdeStaerke, hubraum, modell);
		this.farbe = farbe;
		this.setKmStand(kmStand);
		this.setLeasing(leasing);	
	}

	// Methoden
	public void report() {
		System.out.println("farbe: " + farbe);
		System.out.println("pferdeStaerke: " + pferdeStaerke);
		System.out.println("modell: " + modell);
		System.out.println("kmStand: " + kmStand);
		System.out.println("hubraum: " + hubraum);
		System.out.println("leasing: " + leasing + "\n");
	}

	public String getFarbe() {
		return farbe;
	}

	// this ist eine Referenz in Objektmethoden und
	// Konstruktoren, die sich auf das aktuelle Exemplar bezieht.
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getPferdeStaerke() {
		return pferdeStaerke;
	}

	public void setPferdeStaerke(int pferdeStaerke) {
		this.pferdeStaerke = pferdeStaerke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getKmStand() {
		return kmStand;
	}

	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}

	public int getHubraum() {
		return hubraum;
	}

	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}

	public boolean isLeasing() {
		return leasing;
	}

	public void setLeasing(boolean leasing) {
		this.leasing = leasing;
	}

	public Person getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Person besitzer) {
		this.besitzer = besitzer;
	}
	
	@Override
	public String toString() {
		return modell;
	}

}
