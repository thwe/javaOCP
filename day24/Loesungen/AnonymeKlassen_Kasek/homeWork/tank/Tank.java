package homeWork.tank;

public class Tank {
	private int maxVolumen;
	private int tankinhalt;
	private FuellstandSensor fuellstandSensor;
	
	public Tank(int volumen, int tankinhalt) {
		maxVolumen = volumen;
		this.tankinhalt = tankinhalt;
	}
	
	public void anmeldenFuellstandSensor(FuellstandSensor fuellstandSensor) {
			this.fuellstandSensor = fuellstandSensor;
	}
	
	public int fuellen() {
		tankinhalt++;
		fuellstandSensor.meldeFuellstand(tankinhalt, maxVolumen);
		return tankinhalt;
	}
}