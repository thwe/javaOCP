package coll.interfaces.iComparator;

import java.util.Comparator;

public class SortArtikelNachArtNr implements Comparator<Artikel>{

	@Override
	public int compare(Artikel o1, Artikel o2) {
		return o1.getArtNr().compareToIgnoreCase(o2.getArtNr());
	}

}
