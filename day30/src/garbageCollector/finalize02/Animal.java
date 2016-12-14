package garbageCollector.finalize02;

import java.util.ArrayList;

public class Animal {

	//Attribute
	protected String name;
	protected int age;
	
	private int nummer;
	public static int counter;
	
	static ArrayList<Animal> aList = new ArrayList<Animal>(); 
	
	
	//Konstruktoren
	public Animal(){
		counter++;
		nummer = counter;
		System.out.println("I am animal no.: " + nummer);
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
		System.out.printf("My age is: %d and my name is %s:\n\n", this.age, this.name);
	}
	
	@Override
	protected void finalize() throws Throwable
	   {
		aList.add(this);  
		System.out.println ("\t\t\t Animal " + nummer + " wurde gerufen");
	   }
	
	
}
