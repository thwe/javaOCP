package homeWork.tankorg;

public class Tank {
	private int maxVolumen;
	private int tankinhalt;
	
	public Tank(int volumen, int tankinhalt) {
		maxVolumen = volumen;
		this.tankinhalt = tankinhalt;
	}
	
	public void anmeldenFuellstandSensor(FuellstandSensor fuellstandSensor, TankSaeule tankSaeule) {
		if (!tankSaeule.isStopFuellen()) {
//		while(!tankSaeule.getStopFuellen()) {
			fuellen();
			fuellstandSensor.meldeFuellstand(tankinhalt, maxVolumen);
//		}
			anmeldenFuellstandSensor(fuellstandSensor, tankSaeule);
		}
	}
	
	public int fuellen() {
		return tankinhalt++;
	}
}