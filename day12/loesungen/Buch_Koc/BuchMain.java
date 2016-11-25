package Buch_Koc;

public class BuchMain {

	public static void main(String[] args) {
		
		
		//B�cher ohne parameter konstruktor
		Buch buch1= new Buch();
		Buch buch2= new Buch();
		Buch buch3= new Buch();
		
		buch1.setAnzahlSeiten(250);
		buch1.setAutor("Joanne K. Rowling");
        buch1.setTitel("Harry Potter:");
        buch1.setVerlag("Carlsen");
        buch1.Info();
        
        
		//B�cher mit parameter konstruktor
		Buch buch4= new Buch("SCJP","Katy Sierra", "Mc Graw", 850);
		Buch buch5= new Buch("Java ist auch eine Insel ",  "Christian Ullenboom ", "Galileo computing ", 1000);
		Buch buch6= new Buch(" Java 7 - Mehr als eine Insel", " Christian Ullenboom", "Galileo computing ", 1150);
		
buch4.Info();
buch5.Info();
		

	}

}
