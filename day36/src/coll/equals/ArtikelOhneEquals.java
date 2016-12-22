package coll.equals;

public class ArtikelOhneEquals {

	private String artNr;
	private String name;
	
	public ArtikelOhneEquals(String artNr, String name) {
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
		
		return (name + " "  + artNr);
	}
	
	
}
