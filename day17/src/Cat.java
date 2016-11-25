

public class Cat extends Animal {
	// Attribut
	protected String rasse;

	// Methoden
	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	@Override
	public void report() {
		// Hier wird report aus Animal �berschrieben
		// System.out.printf("My age is: %3d, my name is %s: race: %s \n",
		// this.age, this.getName(), this.rasse);
		super.report();
		System.out.printf("race: %s \n", this.rasse);
		

	}
}
