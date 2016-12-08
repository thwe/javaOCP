package Aufgaben.CDListe;

public class CdListe {

	public String archivTitel;
	public int maxAnzahl;
	public int counter = 0;
	public Cd[] CdArray;

	// public CdListe() {
	//
	// }

	public CdListe(String archivTitel, int maxAnzahl) {
		CdArray = new Cd[maxAnzahl];
		this.archivTitel = archivTitel;
		this.maxAnzahl = maxAnzahl;
	}

	public void cdHinzufuegen(String cdTitel, String kuenstler, int jahr) {
		if (counter < maxAnzahl) {
			CdArray[counter] = new Cd(cdTitel, kuenstler, jahr);
			counter++;
		} else {
			System.out.println("Kein Platz mehr für weitere CDs");
		}
	}

	public void cdHinzufuegen(Cd cd) {
		if (null == cd) { // testet auf null-Objekt
			System.out.println("Es wurde kein CD-Objekt übergeben.");
			return;
		}
		if (counter < maxAnzahl) {
			CdArray[counter] = cd;
			counter++;
		} else {
			System.out.println("Kein Platz mehr für weitere CDs");
		}
	}

	public void listeAnzeigen() {
		System.out.println(archivTitel + " " + maxAnzahl);
		// System.out.println(this.counter);
		if (counter > 0) {
			for (int i = 0; i < maxAnzahl; i++) {
				// System.out.println(i + ": " + CdArray[i]);
				// wenn in CdArray[i] kein Objekt vorhanden ist, kracht in Zeile
				// 39 ohne Überprüfung in Zeile 38
				if (CdArray[i] instanceof Cd) { // alternativ: if(CdArray[i] !=
												// null){
					System.out.println(CdArray[i]);
				}
			}
			if (counter == maxAnzahl) {
				System.out.println("Die Liste ist voll.\n");
			} else {
				System.out.println("Es sind noch Plätze frei.\n");
			}
		} else {
			System.out.println("Keine Titel vorhanden.\n");
		}

	}

	public class Cd {
		public String cdTitel;
		public String kuenstler;
		public int jahr;

		Cd(String cdTitel, String kuenstler, int jahr) {
			this.cdTitel = cdTitel;
			this.kuenstler = kuenstler;
			this.jahr = jahr;

		}

		public String toString() {
			String str = new String(cdTitel + " " + kuenstler + " " + jahr);
			return str;
		} // Methode muss zwingend überschrieben werden, auch wenn sie nicht
			// explizit aufgerufen wird. Sie wird hier in Zeile 52 mit
			// System.out.println(CdArray[i]); aufgerufen
	}
}
