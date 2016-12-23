package coll.maps.hashmaps.mapsII;

public class PersonDiffHC extends Person{
	private String vorname;
	private String nachname;
	private int alter;

	Integer i;

	public PersonDiffHC(String vn, String nn, int a) {
		this.vorname = vn;
		this.nachname = nn;
		this.alter = a;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof PersonDiffHC) {
			PersonDiffHC other = (PersonDiffHC) o;
			return (this.vorname.equals(other.vorname) && this.nachname.equals(other.nachname));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return vorname.hashCode() + nachname.hashCode();
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
