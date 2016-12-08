package anonymeKlasse;

import anonymeKlasse.Tank.Fuellstandsensor;

public class Tanksaeule {

	private Tank tank;

	private boolean stopFuellen;
	
	public void tankstutzenEntnehmen(Tank tank){
		this.tank = tank;
	}
	
	public void startTanken(){
		System.out.println("TANK SAUELE BEREIT ...");
		Fuellstandsensor sensor = new Fuellstandsensor() {
			
			@Override
			public void meldeFuellstand(int fuellstand, int maxVolumen) {				
				if(!stopFuellen){
					if(fuellstand < maxVolumen){
						System.out.println("Aktueller Fuellstand: " + fuellstand + "L von " + maxVolumen + "L.");
					} else {
						System.out.println("Maximaler Fuellstand von " + fuellstand + "L erreicht");
						stopFuellen = true;
					}
				}
			}
		};

		tank.anmeldenFuellstandsensor(sensor);
		
		while(!stopFuellen){
			this.tank.fuellen();
		}
		this.setStopFuellen(true);
		System.out.println("Tanken beendet.");
	}

	public boolean isStopFuellen() {
		return stopFuellen;
	}

	public void setStopFuellen(boolean stopFuellen) {
		this.stopFuellen = stopFuellen;
	}
}
