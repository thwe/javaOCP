package objects.initBlocks.mixed;

public class Auto {

	// Klassenvariable
	public static int demoClassVar;

	// Attribute oder Instanzvariablen
	
	private int pferdeStaerke;
	private String modell;
	private int kmStand;
	private int hubraum;
	private boolean leasing;

	// Statische Initialisierungsblöcke
	static {
		System.out.println("SIB demoClassVar: " + demoClassVar);
		demoClassVar = 100;
		System.out.println("SIB demoClassVar: " + demoClassVar);
	}

	static {
		System.out.println("SIB demoClassVar: " + demoClassVar);
		demoClassVar = 999;
		reportStatic();
	}

	// Initialisierungsblöcke
	{
		//System.out.println("IB farbe: " + farbe);
		farbe = "schwarz";
		//System.out.println("IB farbe: " + farbe);
	}

	{
		//System.out.println("IB farbe: " + farbe);
		farbe = "rot";
		//System.out.println("IB farbe: " + farbe);
	}
	public String farbe = "weiss";
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

	public Auto(String farbe, int pferdeStaerke, String modell, int kmStand, int hubraum, boolean leasing) {
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
	
	public static void reportStatic(){
		System.out.println("demoClassVar: " + demoClassVar);
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

	@Override
	public String toString() {
		return modell;
	}

}
