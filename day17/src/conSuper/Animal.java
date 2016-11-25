package conSuper;

public class Animal {
	//Attribute
	protected String name;
	protected int age;
	
	private static int objCounter;
	
	//Konstruktoren
	public Animal(){
		objCounter++;
		System.out.println("I am Animal no.: " + objCounter);	
	}
	
	public Animal(String name){
		this();
		this.name = name;
	}
	
	public Animal(String name, int age){
		this(name);
		this.age = age;
	}
	
	//Methoden
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void report(){
		System.out.printf("My age is: %3d and my name is %s: \n", this.age, this.name);
	}
}
