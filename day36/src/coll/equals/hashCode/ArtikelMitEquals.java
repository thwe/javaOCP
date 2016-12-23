package coll.equals.hashCode;

/**
 * 
 * Die Klasse HashSet<E> verwendet zur Speicherung von 
 * Objektreferenzen eine besondere Technik: das so genannte 
 * Hashing (auch Streuspeicher-Verfahren genannt). Bei diesem 
 * Verfahren wird jedem Objekt eine Zahl, der so genannte Hash-
 * Code, zugeordnet. Dieser dient als Index in einer Tabelle, in
 * der die Objekte gespeichert werden.
 * 
 * Für die Berechnung von Hash-Codes werden Hash-Funktionen 
 * verwendet. Dies sind mathematische Funktionen, die sich 
 * dadurch auszeichnen, dass sie sich schnell berechnen lassen
 * und einen breit gestreuten Wertebereich haben. Ihr Ziel ist es,
 * einem Objekt einen möglichst eindeutigen Kennwert zuzuordnen. 
 * Dabei führt eine kleine Änderung der Ausgangsdaten oft zu einem 
 * völlig anderen Hash-Code. Damitkönnen die Objekte möglichst gut
 * verteilt werden. Ein bestimmtes Objekt erhält stets denselben
 * Hash-Code. 
 * 
 * Es ist jedoch möglich, dass zwei unterschiedliche Objekte denselben
 * Hash-Code erhalten, d. h. Hash-Funktionen sind i.d.R. nicht umkehrbar. 
 * Um später zu prüfen, ob ein Objekt in der Tabelle enthalten ist, 
 * wird der Tabellenindex jedes Mal erneut aus dem Hash-Code berechnet.
 * Durch den so möglichen direkten Tabellenzugriff lässt sich ein Objekt
 * sehr viel schneller wieder finden als durch sequenzielles Suchen.
 * 
 * In der Praxis ist die Tabelle in der Regel kleiner als der Wertebereich
 * der Hash- Funktion. Daher müssen die Hash-Codes mit Hilfe des Restwert
 * -Operators % auf die tatsächliche Tabellengröße abgebildet werden. 
 * Daneben kann es vorkommen, dass zwei verschiedene Objekte den gleichen
 * Hash-Code haben bzw. dass ihr Hash-Code durch die Berechnung des 
 * Restwertes mit Hilfe des Restwert-Operators % auf den gleichen Index 
 * abgebildet wird. Darum werden in der Tabelle nicht einzelne Objekte, 
 * sondern Listen von Objekten (sog. Eimer, engl. Buckets) mit dem 
 * gleichen Hash- Code gespeichert. Für die Suche spielt das keine
 * große Rolle, da diese Listen in der Regel sehr klein und schnell 
 * zu durchsuchen sind.
 * 
 * Beim Zugriff wird also zunächst in der Methode hashCode() der Hash-
 * Code berechnet, mit dem Restwert-Operator auf die Tabellengröße 
 * angepasst, um die richtige Liste zu finden und anschließend mit 
 * Hilfe der equals()-Methode nach dem richtigen Objekt gesucht. 
 * Dies muss nicht das ursprünglich eingefügte Objekt sein, da die 
 * equals()-Methode lediglich auf inhaltliche Gleichheit prüft 
 * (nur ihre Basisimplementierung in der Klasse Object prüft auf Identität).
 *
 */
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artNr == null) ? 0 : artNr.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

//	@Override
//	public int hashCode() {
//		return 42;
//	}
	
	
	@Override
	public String toString() {

		return (name + " " + artNr + " " +  hashCode());
	}

	
	
}
