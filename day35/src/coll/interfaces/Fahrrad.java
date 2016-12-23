package coll.interfaces;

public class Fahrrad implements Comparable<Fahrrad> {
private int reifenGroesse;
private Art art;
private Farben farbe;

public  enum Art {
	DAMEN, HERREN, KINDER
	};
public  enum Farben{
	SCHWARZ, ROT, GELB
};
// Konstruktor
public Fahrrad(int reifenGroesse, Art art, Farben farbe){
	this.reifenGroesse=reifenGroesse;
	this.art= art;
	this.farbe=farbe;
	
// Getter und Setter
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
// Implement Interface Method
@Override
	// TODO Auto-generated method stub
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
	//return  this.getReifenGroesse() + " "+ this.getArt() + " "+ this.farbe;
	return "Fahrrad [reifenGroesse=" + this.reifenGroesse + ", art=" + this.art + ", farbe=" + this.farbe + "]"+"\n";
}
}
