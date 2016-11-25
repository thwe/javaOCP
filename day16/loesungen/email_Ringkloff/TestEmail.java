package email_Ringkloff;

public class TestEmail {

	public static void main(String[] args) {
		Email email01 = new Email("Klaus.Gross*","Lotte.Klein@gmz.de",
				"Hallo","Hallo Welt");
		
		boolean switchX  = 	email01.isValid(email01.getEmpfaenger());
		
			if (switchX){
				email01.report();
			}else{
				email01.report();
				System.out.println("Die Email konnte nicht verschickt werden! ");
				System.out.println("Die Email-Adresse des Empfaenger ist ung�ltig.");
			}

	}

}
