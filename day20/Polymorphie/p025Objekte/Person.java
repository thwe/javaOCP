package p025Objekte;

public class Person {
	
	private String nachname;
	private String vorname;

	public Person(){	
	}
	
	public Person(String nachname, String vorname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}
	
	public String getNachname(){
		return nachname;
	}
	
	public void print(){
		System.out.println(nachname + ", " + vorname);
	}
	
	
}
