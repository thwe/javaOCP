package coll.interfaces.iComparator;

public class Artikel {

	private String artNr;
	private String name;
	
	public Artikel(String artNr, String name) {
		this.artNr = artNr;
		this.name = name;
	}

	public String getArtNr() {
		return artNr;
	}

	public void setArtNr(String artNr) {
		this.artNr = artNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {	
		return (artNr + " "  + name);
	}
}
