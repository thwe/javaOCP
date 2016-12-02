package p021TypKonvertierungReferenzen.tiere;

public class Cat extends Animal {
	// Attribut
	protected String race;
	private static int catCounter;
	
	//Konstruktoren
	public Cat(){
		super(); //steht auch implizit dabei
		catCounter++;
		System.out.println("I am Cat no.: " + catCounter);	
	}
	
	public Cat(String name){
		this();
		this.name = name;
	}
	
	public Cat(String name, int age){
		this(name);
		this.age = age;
	}
	
	public Cat (String name, int age, String race){
		this(name,age);
		this.race = race;
	}
	// Methoden
	public void meow(){
		System.out.println("Meeeoowww ...");
	}
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public void report() {
		// Hier wird report aus Animal �berschrieben
		// System.out.printf("My age is: %3d, my name is %s: race: %s \n",
		// this.age, this.getName(), this.rasse);
		super.report();
		System.out.printf("race: %s \n\n", this.race);
		

	}
}
