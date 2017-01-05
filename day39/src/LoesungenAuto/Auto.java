package LoesungenAuto;

public abstract class Auto <T extends Auto<?>> implements Comparable<T> {

	protected int baujahr;
	protected String modell;
	
	public Auto(String modell, int baujahr) {
		this.baujahr = baujahr;
		this.modell = modell;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + ". Modell: " + modell + ", Baujahr " + baujahr;
	}
	
//	Comparable c1 = new VW("Golf", 1990);
//	Comparable c2 = new VW("Polo", 2001);
//	c1.compareTo(c2)	-> 
	
	@Override
	public int compareTo(T a2) {
		
		int res = modell.compareTo(a2.modell);
		
		if(res==0) {
			res = baujahr - a2.baujahr;
		}
		
		return res;
	}
	
	@Override
	public int hashCode() {
		int hashCode = modell == null ? 1 : modell.hashCode();
		return hashCode + baujahr;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if( obj==null ) {
			return false;
		}
		
		if( getClass() != obj.getClass() ) {
			return false;
		}
		
		Auto<?> a2 = (Auto<?>) obj;
		
		return modell.equals(a2.modell) && baujahr == a2.baujahr;
	}
	
}
