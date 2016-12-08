/**
 * Aufgabe 15.2: Anonyme Klasse zu Tag24 (06.12.2016)
 * <p>
 * Es wird ein Betankungsvorgang simuliert. Dazu werden die Klassen Tank, Tank-
 * saeule und das Interface FuellstandSensor benötigt. Zusätzlich wird das 
 * Interface FuellstandSensor in einer anonymen Klasse implementiert.
 * </p>
 * <p>
 * Der Tankvorgang wird mit dem Entnehmen des Tankstutzens aus der Tanksäule mit 
 * der Methode tankstutzenEntnehmen() eingeleitet. Anschließend beginnt durch 
 * Aufruf der Methode startTanken() das Befüllen. In startTanken() muss zuerst 
 * ein FuellstandSensor mit Hilfe einer anonymen Klasse erzeugt und der Methode 
 * anmeldenFuellstandSensor() übergeben werden. Nach Aufruf der Methode 
 * anmeldenFuellstandSensor() kann der eigentliche Füllvorgang beginnen. 
 * Durch Aufruf der Methode fuellen() wird der Tank jedes Mal um einen Liter 
 * gefüllt. Durch wiederholten Aufruf der Methode fuellen() wird der Tank aufgefüllt, 
 * bis das Maximalvolumen des Tanks erreicht ist. Nach jedem Auffüllen des Tanks um 
 * einen weiteren Liter wird die Methode meldeFuellstand() der anonymen Klasse 
 * – welche das Interface FuellstandSensor implementiert – aufgerufen. Innerhalb 
 * dieser Methode wird überprüft, ob der Tank vollständig gefüllt wurde. Ist dies der Fall, 
 * so wird der Tankvorgang beendet. Zusätzlich gibt die Methode meldeFuell-
 * stand() den aktuellen Füllstand auf der Konsole aus. 
 */
package aufgaben.anonyme_klasse;

/**
 * Stellt einen Tank dar. :)
 * @author Hardy Scheel
 */
public class Tank {

	private int maxVolumen;
	private int tankinhalt;
	private FuellstandSensor fuellstandSensor;

	public Tank(int volumen) {
		this.setMaxVolumen(volumen);
		System.out.println("Tankinhalt: " + getMaxVolumen());
	}

	/**
	 * Füllt den Tank auf bis er voll ist. Übermittelt Füllstand an FuellstandSensor.
	 * <p>
	 * "<code> while (getTankinhalt() < getMaxVolumen()) { </code> "<br>
	 * Muss < maxVolumen sein, denn beim 49. Mal (von 50) wird aufgefüllt auf 50
	 * </p>
	 * <p>
	 * Debug - Füllstand anzeigen:
	 * <pre>
	 * while (getTankinhalt() < getMaxVolumen()) {
	 * 	setTankinhalt(fuellen());
	 * 	System.out.println(getTankinhalt() + " ");	// debug
	 * 	getFuellstandSensor().meldeFuellstand(getTankinhalt(), getMaxVolumen());
	 * }
	 * </pre>
	 * </p>
	 * @param fuellstandSensor
	 */
	public void anmeldenFuellstandSensor(FuellstandSensor fuellstandSensor) {
		setFuellstandSensor(fuellstandSensor);
		
		while (getTankinhalt() < getMaxVolumen()) {
			setTankinhalt(fuellen());
			getFuellstandSensor().meldeFuellstand(getTankinhalt(), getMaxVolumen());
		}
	}

	/**
	 * Füllt Tank um je einen Wert.
	 * @return
	 */
	public int fuellen() {
		int fillLevel = getTankinhalt();
		return ++fillLevel;
	}

	public int getTankinhalt() {
		return tankinhalt;
	}

	public void setTankinhalt(int tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public int getMaxVolumen() {
		return maxVolumen;
	}

	public void setMaxVolumen(int maxVolumen) {
		this.maxVolumen = maxVolumen;
	}

	public FuellstandSensor getFuellstandSensor() {
		return fuellstandSensor;
	}

	public void setFuellstandSensor(FuellstandSensor fuellstandSensor) {
		this.fuellstandSensor = fuellstandSensor;
	}

}
