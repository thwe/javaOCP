package Konto_Demircan.Aufgaben3;



public class Konto {
	private Person person;
	private double kontostand;

	public Konto(String name, String vorname, float kontostand) {

		person = new Person();
		person.setName(name);
		person.setVorname(vorname);

		this.kontostand = kontostand;

	}

	public Konto(Person person, float kontostand) {

		this.person = person;
		this.kontostand = kontostand;
	}

	public double getKontostand() {
		return kontostand;

	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public String getName() {
		return person.getName();
	}

	public void setName(String name) {
		person.setName(name);
	}

	public Person getPerson() {
		return person;
	}

}
