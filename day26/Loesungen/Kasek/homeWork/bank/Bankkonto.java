package homeWork.bank;

public class Bankkonto {
	double kontostand = 0.0;
	
	public void einzahlen(double betrag) throws TransaktionsException {
		if (betrag >= 0) {
			kontostand += betrag;
		} else {
			throw new TransaktionsException();
		}
	}
	
	public void auszahlen(double betrag) throws TransaktionsException {
		if (kontostand - betrag >= 0) {
			kontostand -= betrag;
		} else {
			throw new TransaktionsException();
		}
	}
	
	public double getKontostand() {
		return kontostand;
	}
}