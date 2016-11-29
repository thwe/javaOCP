package vererbung.conSuper;

public class Cat extends Animal {
	// Attribut
	protected String race;

	private static int catCounter;
	
	//Konstruktoren
	public Cat(){
		//super(); //steht auch implizit dabei
		this.setCounterAndMonitorInfo();	
	}
	
	public Cat(String name){
		super(name);
		this.setCounterAndMonitorInfo();
	}
	
	public Cat(String name, int age){
		super(name, age);
		this.setCounterAndMonitorInfo();
	}
	
	public Cat (String name, int age, String race){
		super(name, age);
		this.setCounterAndMonitorInfo();
		this.setRace(race);
	}
	// Methoden
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public void report() {
		// Hier wird report aus Animal überschrieben
		// System.out.printf("My age is: %3d, my name is %s: race: %s \n",
		// this.age, this.getName(), this.rasse);
		super.report();
		System.out.printf("race: %s \n\n", this.race);
	}
	
	private void setCounterAndMonitorInfo(){
		catCounter++;
		System.out.println("I am Cat no.: " + catCounter);	
	}
}
