package lokaleKlasse;

public class TestEmail {

	public static void main(String[] args) {
		
		Email e1 = new Email("Hallo", "Hallo Welt", "Klaus.Gross*", "lotte.test@gmx.de");
		e1.senden();
		
		Email e2 = new Email("Hallo", "Hallo Welt", "Klaus.Gross*", "Lotte.Kleingmz.de");
		e2.senden();
		
		Email e3 = new Email("Hallo", "Hallo Welt", "Klaus.Gross@brennt-punkt.de", "Lotte.Klein@gmz.de");
		e3.senden();
	}

}
