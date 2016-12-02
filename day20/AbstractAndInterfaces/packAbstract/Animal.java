package packAbstract;

public abstract class Animal {
	
	//Attribute
	private String name;
	protected int age;
	
	private static int objCounter;
	
	//Konstruktoren
	public Animal(){
		setCounterAndMonitorInfo();
	}
	
	public Animal(String name){
		this();
		this.name = name;
	}
	
	//Methoden
	protected abstract void eat();
	protected abstract void drink();
	//static abstract void eatStatic();
	//Keine abstrakte statische Methoden
	
	public void report(){
		System.out.printf("My age is: %3d and my name is %s:\n\n", this.age, this.name);
	}
	
	public static void reportStatic(){
		System.out.printf("reportStatic() \n");
	}
	
	private void setCounterAndMonitorInfo(){
		objCounter++;
		System.out.println("I am Animal no.: " + objCounter);	
	}
}
