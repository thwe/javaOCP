package equals;

public class ArtikelMitEquals {

	private String artNr;
	private String name;

	public ArtikelMitEquals(String artNr, String name) {
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
	public boolean equals(Object obj) {
		if (obj instanceof ArtikelMitEquals) {
			return this.artNr.equals(((ArtikelMitEquals) obj).getArtNr())
					&& this.name.equals(((ArtikelMitEquals) obj).getName());
		}
		return false;
	}

	// Auto-generiert von Eclipse
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// ArtikelMitEquals other = (ArtikelMitEquals) obj;
	// if (artNr == null) {
	// if (other.artNr != null)
	// return false;
	// } else if (!artNr.equals(other.artNr))
	// return false;
	// if (name == null) {
	// if (other.name != null)
	// return false;
	// } else if (!name.equals(other.name))
	// return false;
	// return true;
	// }

	@Override
	public String toString() {

		return (name + " " + artNr);
	}

	
	
}
