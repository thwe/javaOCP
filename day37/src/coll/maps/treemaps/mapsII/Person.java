package coll.maps.treemaps.mapsII;

public class Person implements Comparable<Person>{

	private String vorname;
	private String nachname;
	private int alter;
	
	public Person(String vorname, String nachname, int alter){
		this.vorname = vorname;
		this.nachname = nachname; 
		this.alter = alter;
	}

	@Override
	public String toString() {	
		return vorname + ", " + nachname + ", " + alter;
	}
	
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public int compareTo(Person p) {
		return vorname.compareToIgnoreCase(p.vorname);
		
		//Hausaufgabe für den Nachmittag ...
	}
	
}
