package interfaces.iComparator;

import java.util.Comparator;

public class SortArtikelNachName implements Comparator<Artikel>{

	@Override
	public int compare(Artikel o1, Artikel o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
