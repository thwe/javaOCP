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
 * Stellt eine Tanksäule dar. :)
 * @author Hardy Scheel
 */
public class Tanksaeule {

	private Tank tank;
	private boolean stopFuellen;

	public Tanksaeule() {
		System.out.println("Tanksäule bereit.");
	}

	/**
	 * Beziehung zu Tank herstellen.
	 * @param tank
	 */
	public void tankstutzenEntnehmen(Tank tank) {
		this.setTank(tank);
	}

	/**
	 * Weist den Tank an sich selbst voll zu befüllen.
	 * <p>
	 * Einzelansicht der anonymen Klasse "FuellstandSensor":
	 * <pre>
	 * new FuellstandSensor() {
	 * 	<code>@Override
	 * 	public void meldeFuellstand(int fuellstand, int maxVolumen) {
	 * 					
	 * 		if (fuellstand != maxVolumen) {
	 * 			System.out.println(fuellstand + "/" + maxVolumen);
	 * 		}
	 * 					
	 * 		if (fuellstand == maxVolumen) {
	 * 			System.out.println(fuellstand + "/" + maxVolumen);
	 * 			setStopFuellen(true);
	 * 			System.out.println("Tank voll!");
	 * 		}
	 * 	}
	 * });
	 * </pre>
	 * </p>
	 */
	public void startTanken() {

		if (!isStopFuellen()) {
			getTank().anmeldenFuellstandSensor(new FuellstandSensor() {
				@Override
				public void meldeFuellstand(int fuellstand, int maxVolumen) {
					
					if (fuellstand != maxVolumen) {
						System.out.println(fuellstand + "/" + maxVolumen);
					}
					
					if (fuellstand == maxVolumen) {
						System.out.println(fuellstand + "/" + maxVolumen);
						setStopFuellen(true);
						System.out.println("Tank voll!");
					}
				}
			});
		}
		else {
			System.out.println("Kann Tankvorgang nicht starten, Tank ist bereits voll!");
			}
	}

	public boolean isStopFuellen() {
		return stopFuellen;
	}

	public void setStopFuellen(boolean stopFuellen) {
		this.stopFuellen = stopFuellen;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

}
