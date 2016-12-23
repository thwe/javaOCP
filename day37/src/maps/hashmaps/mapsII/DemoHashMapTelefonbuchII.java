package coll.maps.hashmaps.mapsII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DemoHashMapTelefonbuchII {

	public static void main(String[] args) {
		// HashCodeTyp auswählen
		int auswahl = auswahlTreffen();
		int anzahl = 20000;
		long t0 = 0, t1 = 0, t2 = 0, t3 = 0;
		messungenNeu(auswahl, anzahl, t0, t1, t2, t3);
	}

	public static void ergebnisseAusgeben(String name, int anzahl, long... in) {
		System.out.println("Ergebnisse mit " + name + ":");
		System.out.println(anzahl + " Personen erzeugen : " + (in[1] - in[0]) + " ms");
		System.out.println("Telefonbuch er befüllen : " + (in[2] - in[1]) + " ms");
		System.out.println("Personen suchen : " + (in[3] - in[2]) + " ms");
	}

	public static void messungenNeu(int auswahl, int anzahl, long... in) {

		String name = null;

		Set<PersonDiffHC> personSetDiffHC = null;
		Set<PersonSameHC> personSetSameHC = null;

		Map<PersonDiffHC, String> telefonbuchDiffHC = null;
		Map<PersonSameHC, String> telefonbuchSameHC = null;

		in[0] = System.currentTimeMillis();

		switch (auswahl) {
		case 1:

			name = "PersonDiffHC";
			personSetDiffHC = (Set<PersonDiffHC>) genPersons(auswahl, anzahl);
			break;

		case 2:
			name = "PersonSameHC";
			personSetSameHC = (Set<PersonSameHC>) genPersons(auswahl, anzahl);
			break;
		}

		in[1] = System.currentTimeMillis();

		// Telefonbuch erzeugen und befüllen
		switch (auswahl) {
		case 1:
			telefonbuchDiffHC = new HashMap<PersonDiffHC, String>();
			int telnummer1 = 100000;
			telefonbuchDiffHC = (Map<PersonDiffHC, String>) fillPhoneBook(personSetDiffHC, telnummer1);
			break;

		case 2:
			telefonbuchSameHC = new HashMap<PersonSameHC, String>();
			int telnummer2 = 200000;
			telefonbuchSameHC = (Map<PersonSameHC, String>) fillPhoneBook(personSetSameHC, telnummer2);
			break;
		}

		in[2] = System.currentTimeMillis();

		// Telefonnummer suchen
		switch (auswahl) {
		case 1:
			for (PersonDiffHC personDiffHC : personSetDiffHC) {
				if (telefonbuchDiffHC.keySet().contains(personDiffHC)) {
					//System.out.println(personDiffHC + " gefunden");
				}
			}

			break;
		case 2:
			for (PersonSameHC personSameHC : personSetSameHC) {
				if (telefonbuchSameHC.keySet().contains(personSameHC)) {
					//System.out.println(personSameHC + " gefunden");
				}
			}
			break;
		}
		in[3] = System.currentTimeMillis();
		ergebnisseAusgeben(name, anzahl, in);
	}

	public static void messungen(int auswahl, int anzahl, long... in) {

		String name = null;
		switch (auswahl) {
		case 1:
			name = "PersonDiffHC";
			Set<PersonDiffHC> personSetDiffHC;
			Map<PersonDiffHC, String> telefonbuchDiffHC;

			in[0] = System.currentTimeMillis();

			personSetDiffHC = (Set<PersonDiffHC>) genPersons(auswahl, anzahl);
			in[1] = System.currentTimeMillis();
			telefonbuchDiffHC = new HashMap<PersonDiffHC, String>();

			// Telefonbuch befüllen
			in[2] = System.currentTimeMillis();
			int telnummer1 = 100000;
			telefonbuchDiffHC = (Map<PersonDiffHC, String>) fillPhoneBook(personSetDiffHC, telnummer1);
			in[3] = System.currentTimeMillis();

			for (PersonDiffHC personDiffHC : personSetDiffHC) {
				if (telefonbuchDiffHC.containsValue(personDiffHC))
					System.out.println(personDiffHC + " gefunden");
			}

			in[4] = System.currentTimeMillis();

			break;
		case 2:
			name = "PersonSameHC";
			Set<PersonSameHC> personSetSameHC;
			Map<PersonSameHC, String> telefonbuchSameHC;

			in[0] = System.currentTimeMillis();

			personSetSameHC = (Set<PersonSameHC>) genPersons(auswahl, anzahl);

			in[1] = System.currentTimeMillis();
			telefonbuchSameHC = new HashMap<PersonSameHC, String>();

			in[2] = System.currentTimeMillis();
			int telnummer2 = 200000;
			telefonbuchSameHC = (Map<PersonSameHC, String>) fillPhoneBook(personSetSameHC, telnummer2);
			;

			in[3] = System.currentTimeMillis();
			for (PersonSameHC personSameHC : personSetSameHC) {
				if (telefonbuchSameHC.containsValue(personSameHC))
					System.out.println(personSameHC + " gefunden");
			}

			in[4] = System.currentTimeMillis();
			break;
		}

		ergebnisseAusgeben(name, anzahl, in);
	}

	public static int auswahlTreffen() {
		int auswahl = 0;
		try {
			Scanner eingabe = new Scanner(System.in);
			System.out.println("Welcher hashCode() soll verwendet werden?");
			System.out.println("1 - Unterschiedlicher HashCode");
			System.out.println("2 Gleicher HashCode");
			System.out.println("Auswahl: ");
			auswahl = eingabe.nextInt();
		} catch (Exception ex) {
			System.out.println("Fehlerhafte Eingabe!");
			System.exit(1);
		}

		return auswahl;
	}

	public static <T> Map<? extends Person, String> fillPhoneBook(Set<? extends Person> set, int telNr) {
		Map<Person, String> map = new HashMap<Person, String>();
		int telnummer = telNr;
		for (Person person : set) {
			map.put(person, String.valueOf(telnummer));
			telnummer++;
		}
		return map;
	}

	public static <T> Set<? extends Person> genPersons(int fall, int anzahl) {
		Person person = null;
		Set<Person> personSet = new HashSet<Person>();
		switch (fall) {
		case 1:
			for (int i = 0; i < anzahl; i++) {
				person = new PersonDiffHC("vn_" + i, "nn_" + i, i);
				personSet.add(person);
			}
			break;
		case 2:
			for (int i = 0; i < anzahl; i++) {
				person = new PersonSameHC("vn_" + i, "nn_" + i, i);
				personSet.add(person);
			}
			break;
		}
		return personSet;
	}
}
