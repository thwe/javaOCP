package Konto_Demircan.Aufgaben3;

public class KontoTest {
	public static void kontoVergleich(Konto k1, Konto k2) {
		if (k1.getKontostand() > k2.getKontostand()) {
			System.out.println(k1.getPerson() + " hat mehr Geld auf dem Konto als " + k2.getName());
		} else {
			System.out.println(k2.getName() + " hat mehr Geld auf dem Konto als " + k1.getName());
		}
	}



	public static void main(String[] args) {
		Konto konto1 = new Konto("M�ller", "Hans", 500);
		Konto konto2 = new Konto("Krause", "Peter", 1500);
		Konto konto3 = new Konto("B�hm", "Harald", 330);
		Person person1 = new Person("Miller","Thomas");
	    Konto konto4 = new Konto(person1,238);
		kontoVergleich(konto1, konto2);
		kontoVergleich(konto2, konto3);
		kontoVergleich(konto1, konto3);
		kontoVergleich(konto1, konto4);
	}
}