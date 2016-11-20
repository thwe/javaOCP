package homeworkday12;

import objects.constructors.Person;

public class Konto {
	private Person person;
	private double kontostand;
	public Konto (String name, String vorname, float kontostand)
	{
	person= new Person();
	person.setName(name);
	person.setVorname(vorname);
	this.setKontostand(kontostand);
	}
	
	public String getName(){
		return person.toString();
		
	}
		

	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
}
