package coll.sets.hashSet.setsII;

import java.util.Comparator;

public class Fahrrad implements Comparable<Fahrrad>{
	private int reifenGroesse;
	private Art art;
	private Farben farbe;
	public static Comparator<Fahrrad> comp = new SortFahrradReifenGroesse(); 
	
	
	public enum Art {
		DAMEN, HERREN, KINDER
	};

	public enum Farben {
		SCHWARZ, ROT, GELB
	};

	public static class SortFahrradReifenGroesse implements Comparator<Fahrrad>{

		@Override
		public int compare(Fahrrad o1, Fahrrad o2) {
			return o1.reifenGroesse -o2.getReifenGroesse();
		}	
	}
	
	public static class SortFahrradArt implements Comparator<Fahrrad>{

		@Override
		public int compare(Fahrrad o1, Fahrrad o2) {
			return o1.art.compareTo(o2.art);
		}	
	}
	
	public static class SortFahrradFarbe implements Comparator<Fahrrad>{

		@Override
		public int compare(Fahrrad o1, Fahrrad o2) {
			return o1.farbe.compareTo(o2.farbe);
		}	
	}
	
	public Fahrrad(int reifenGroesse, Art art, Farben farbe){
		this.reifenGroesse = reifenGroesse;
		this.art = art;
		this.farbe = farbe;
	}
	
	public int getReifenGroesse() {
		return reifenGroesse;
	}

	public void setReifenGroesse(int reifenGroesse) {
		this.reifenGroesse = reifenGroesse;
	}

	public Art getArt() {
		return art;
	}

	public void setArt(Art art) {
		this.art = art;
	}

	public Farben getFarbe() {
		return farbe;
	}

	public void setFarbe(Farben farbe) {
		this.farbe = farbe;
	}

	@Override
	public int compareTo(Fahrrad o) {
		int result =  this.reifenGroesse - o.reifenGroesse;
		
		if (result ==0){
			result = this.farbe.compareTo(o.farbe);
			if(result ==0){
				result = this.art.compareTo(o.art);
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return  this.getReifenGroesse() + " "+ this.getArt() + " "+ this.farbe;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fahrrad){
			return this.reifenGroesse == ((Fahrrad)obj).reifenGroesse
					&& this.art.equals(((Fahrrad)obj).art)
					&& this.farbe.equals(((Fahrrad)obj).farbe)
							;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((art == null) ? 0 : art.hashCode());
		result = prime * result + ((farbe == null) ? 0 : farbe.hashCode());
		result = prime * result + reifenGroesse;
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Fahrrad other = (Fahrrad) obj;
//		if (art != other.art)
//			return false;
//		if (farbe != other.farbe)
//			return false;
//		if (reifenGroesse != other.reifenGroesse)
//			return false;
//		return true;
//	}

	
	
	
}
