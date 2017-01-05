package LoesungenAuto;

public class VW extends Auto<VW> {

	private String farbe = "blau";
	
	public VW(String modell, int baujahr) {
		super(modell, baujahr);
	}
	
	@Override
	public int compareTo(VW a2) {
		int erg = super.compareTo(a2);
		
		if(erg == 0) {
			erg = farbe.compareTo(a2.farbe);
		}
		
		return erg;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}
