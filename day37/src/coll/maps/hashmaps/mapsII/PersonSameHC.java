package coll.maps.hashmaps.mapsII;

public class PersonSameHC extends Person{
	private String vorname;
	private String nachname;
	private int alter;
	private final int hash_Code = 55;

	Integer i;

	public PersonSameHC(String vn, String nn, int a) {
		this.vorname = vn;
		this.nachname = nn;
		this.alter = a;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof PersonSameHC) {
			PersonSameHC other = (PersonSameHC) o;
			return (this.vorname.equals(other.vorname) && this.nachname.equals(other.nachname));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return hash_Code;
	}

	@Override
	public String toString() {
		return vorname + " " + nachname + " " + alter;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
