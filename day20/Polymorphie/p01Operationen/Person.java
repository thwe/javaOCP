package p01Operationen;

public class Person {
	private String name;
	private String vorname;
	private int alter;

	public Person(String name, String vorname, int alter) {
		this.name = name;
		this.vorname = vorname;
		this.alter = alter;
	}

	public void print() {
		System.out.print("Name: " + name);
		System.out.print(" Vorname: " + vorname);
		System.out.println(" Alter: " + alter);
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setVorname(String n) {
		vorname = n;
	}

	public String getVorname() {
		return vorname;
	}
}
