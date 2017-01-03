package CollectAutos;

public abstract class Auto {
	
	private int baujahr;
	private  String modell;

public Auto(String modell, int baujahr) {
	
	super();
	this.modell = modell;
	this.baujahr = baujahr;
	
}

public int getBaujahr() {
	return baujahr;
}

public void setBaujahr(int baujahr) {
	this.baujahr = baujahr;
}

public String getModell() {
	return modell;
}

public void setModell(String modell) {
	this.modell = modell;
}


}
