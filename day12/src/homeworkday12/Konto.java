package homeworkday12;



public class Konto {
	private Person person;
	private double kontostand;
	public Konto (String name, String vorname, float kontostand)
	{
	person.setName(name);
	person.setVorname(vorname);
	this.setKontostand(kontostand);
	}
	
	public Person getName(){
		return person;
		
		
	}
	
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
}
