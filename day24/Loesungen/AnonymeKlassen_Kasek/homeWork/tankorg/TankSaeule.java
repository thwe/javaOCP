package homeWork.tankorg;

public class TankSaeule {
	private Tank tank;
	private boolean stopFuellen;
	
	public TankSaeule() {
		
	}
	
	public void tankstutzenEntnehmen(Tank tank) {
		this.tank = tank;
		stopFuellen = false;
	}
	
	public void startTanken() {
		// Anonyme Klasse
		tank.anmeldenFuellstandSensor(new FuellstandSensor() {
			
			@Override
			public void meldeFuellstand(int fuellstand, int maxVolumen) {
				if (fuellstand < maxVolumen) {
					System.out.println("Aktueller Fuellstand: " + fuellstand + "l von " + maxVolumen + "l.");
				} else {
					System.out.println("Maximaler Fuellstand von " + fuellstand + "l erreicht.");
					stopFuellen = true;
				}
			}
		}, this);
	}
	
	public boolean isStopFuellen() {
		return stopFuellen;
	}
}