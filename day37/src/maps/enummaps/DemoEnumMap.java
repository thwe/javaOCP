package coll.maps.enummaps;

import java.util.EnumMap;
import java.util.Map;

public class DemoEnumMap {

	enum Zutaten {
		EIER, MEHL, BUTTER;
	}

	public static void main(String[] args) {
		Map<Zutaten, String> kuchenParty = new EnumMap<Zutaten, String>(Zutaten.class);

		kuchenParty.put(Zutaten.EIER, "Paul");
		kuchenParty.put(Zutaten.BUTTER, "Markus");
		kuchenParty.put(Zutaten.MEHL, "Sabine");
		
		for ( Zutaten z : kuchenParty.keySet()) {
			System.out.printf("%s bringt %s mit \n",kuchenParty.get(z), z);
		}
	}
}
