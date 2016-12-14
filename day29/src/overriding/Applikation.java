package overriding;

public class Applikation {

	public static void main(String[] args) {
		Unterklasse unterklasse = new Unterklasse();
		unterklasse.methode1("str", 2, 5L);

		Oberklasse.methode15("Blub");
		Unterklasse.methode15("Bla");

		Oberklasse oberklasse = new Oberklasse();
		oberklasse.methode15("Aufruf refVariable Oberklasse");
		unterklasse.methode15("Aufruf refVariable Unterklasse");
		
		Oberklasse oberklasse2 = new Unterklasse();
		oberklasse2.methode2("");
		oberklasse2.methode15("");
		//RefVariable wird zu Klassennamen korrigiert bei statischen Methoden
		
	}

}
