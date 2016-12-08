package anonymeKlasse;

public class Tank {

	private int maxVolumen;
	
	private int tankinhalt;
	
	private Fuellstandsensor fuellstandsensor;
	
	interface Fuellstandsensor{
		public void meldeFuellstand(int fuellstand, int maxVolumen);
	}
	
	public Tank(int maxvolumen){
		this.maxVolumen = maxvolumen;
	}
	
	public void anmeldenFuellstandsensor(Fuellstandsensor fuellstandsensor){
		this.fuellstandsensor = fuellstandsensor;
	}
	
	public int fuellen(){
		tankinhalt++;
		
		this.fuellstandsensor.meldeFuellstand(tankinhalt, maxVolumen);
		
		return tankinhalt;
	}

	public int getMaxVolumen() {
		return maxVolumen;
	}

	public void setMaxVolumen(int maxVolumen) {
		this.maxVolumen = maxVolumen;
	}

	public int getTankinhalt() {
		return tankinhalt;
	}

	public void setTankinhalt(int tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public Fuellstandsensor getFuellstandsensor() {
		return fuellstandsensor;
	}

	public void setFuellstandsensor(Fuellstandsensor fuellstandsensor) {
		this.fuellstandsensor = fuellstandsensor;
	}
}
