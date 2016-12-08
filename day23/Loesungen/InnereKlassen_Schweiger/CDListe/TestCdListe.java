package Aufgaben.CDListe;

public class TestCdListe {

	public static void main(String[] args) {

		CdListe liste = new CdListe("Klassik", 3);
		liste.listeAnzeigen();
		liste.cdHinzufuegen("Zauberflöte", "Mozart", 2003);
		liste.cdHinzufuegen("Nussknacker", "Tschaikowsky", 2001);
		liste.listeAnzeigen();
		liste.cdHinzufuegen ("Für Elise", "Beethoven", 1990);
		liste.listeAnzeigen();

// zusätzlicher Code, nicht Bestandteil der Aufgabe
		CdListe.Cd cd1 = liste.new Cd("Zauberflöte", "Beethoven", 2005);
		liste.cdHinzufuegen(cd1);
		liste.listeAnzeigen();
		CdListe.Cd cd2 = new CdListe("Jazz", 3).new Cd("Zauberflöte", "Beethoven", 2005);
		// CdListe Jazz kann nicht aufgerufen werden, weil es nicht referenziert
		// wird (=anonymes Objekt)
		
		CdListe.Cd cd3 = null;
		liste.cdHinzufuegen(cd3);
	}

}
