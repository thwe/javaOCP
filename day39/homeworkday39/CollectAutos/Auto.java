package CollectAutos;



public abstract class Auto<T extends Auto<?>> implements Comparable<T> {
	
	protected int baujahr;
	protected  String modell;
	

public Auto(String modell, int baujahr) {
	
	super();
	this.modell = modell;
	this.baujahr = baujahr;
	
}

public int getBaujahr() {
	return baujahr;
}

public void setBaujahr(int baujahr) {
	this.baujahr = baujahr;
}

public String getModell() {
	return modell;
}

public void setModell(String modell) {
	this.modell = modell;
}




@Override
public int compareTo(T a2) {
	// TODO Auto-generated method stub
	int res= modell.compareTo(a2.modell);
	return 0;
}

@Override
public boolean equals(Object obj) {
	
	if( obj==null ) {
		return false;
	}
	
	if( getClass() != obj.getClass() ) {
		return false;
	}
	
	Auto a2 = (Auto) obj;
	
	
	return modell.equals(a2.modell) && baujahr == a2.baujahr;
}


@Override
public String toString() {
	return getClass().getSimpleName() + ". Modell: " + modell + ", Baujahr " + baujahr;
}
}
