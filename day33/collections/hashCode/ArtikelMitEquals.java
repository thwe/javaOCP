package hashCode;

/**
 * 
 * Die Klasse HashSet<E> verwendet zur Speicherung von 
 * Objektreferenzen eine besondere Technik: das so genannte 
 * Hashing (auch Streuspeicher-Verfahren genannt). Bei diesem 
 * Verfahren wird jedem Objekt eine Zahl, der so genannte Hash-
 * Code, zugeordnet. Dieser dient als Index in einer Tabelle, in
 * der die Objekte gespeichert werden.
 * 
 * F�r die Berechnung von Hash-Codes werden Hash-Funktionen 
 * verwendet. Dies sind mathematische Funktionen, die sich 
 * dadurch auszeichnen, dass sie sich schnell berechnen lassen
 * und einen breit gestreuten Wertebereich haben. Ihr Ziel ist es,
 * einem Objekt einen m�glichst eindeutigen Kennwert zuzuordnen. 
 * Dabei f�hrt eine kleine �nderung der Ausgangsdaten oft zu einem 
 * v�llig anderen Hash-Code. Damitk�nnen die Objekte m�glichst gut
 * verteilt werden. Ein bestimmtes Objekt erh�lt stets denselben
 * Hash-Code. 
 * 
 * Es ist jedoch m�glich, dass zwei unterschiedliche Objekte denselben
 * Hash-Code erhalten, d. h. Hash-Funktionen sind i.d.R. nicht umkehrbar. 
 * Um sp�ter zu pr�fen, ob ein Objekt in der Tabelle enthalten ist, 
 * wird der Tabellenindex jedes Mal erneut aus dem Hash-Code berechnet.
 * Durch den so m�glichen direkten Tabellenzugriff l�sst sich ein Objekt
 * sehr viel schneller wieder finden als durch sequenzielles Suchen.
 * 
 * In der Praxis ist die Tabelle in der Regel kleiner als der Wertebereich
 * der Hash- Funktion. Daher m�ssen die Hash-Codes mit Hilfe des Restwert
 * -Operators % auf die tats�chliche Tabellengr��e abgebildet werden. 
 * Daneben kann es vorkommen, dass zwei verschiedene Objekte den gleichen
 * Hash-Code haben bzw. dass ihr Hash-Code durch die Berechnung des 
 * Restwertes mit Hilfe des Restwert-Operators % auf den gleichen Index 
 * abgebildet wird. Darum werden in der Tabelle nicht einzelne Objekte, 
 * sondern Listen von Objekten (sog. Eimer, engl. Buckets) mit dem 
 * gleichen Hash- Code gespeichert. F�r die Suche spielt das keine
 * gro�e Rolle, da diese Listen in der Regel sehr klein und schnell 
 * zu durchsuchen sind.
 * 
 * Beim Zugriff wird also zun�chst in der Methode hashCode() der Hash-
 * Code berechnet, mit dem Restwert-Operator auf die Tabellengr��e 
 * angepasst, um die richtige Liste zu finden und anschlie�end mit 
 * Hilfe der equals()-Methode nach dem richtigen Objekt gesucht. 
 * Dies muss nicht das urspr�nglich eingef�gte Objekt sein, da die 
 * equals()-Methode lediglich auf inhaltliche Gleichheit pr�ft 
 * (nur ihre Basisimplementierung in der Klasse Object pr�ft auf Identit�t).
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
