package autos;

public abstract class Auto {

	private int baujahr;
	private String modell;
	
	public Auto(String modell, int baujahr) {
		this.baujahr = baujahr;
		this.modell = modell;
	}
	
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + ". Modell: " + modell + ", Baujahr " + baujahr;
	}
	
}
