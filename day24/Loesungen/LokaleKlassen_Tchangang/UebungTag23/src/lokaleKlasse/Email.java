package lokaleKlasse;

public class Email {

	private String betreff;
	private String text;
	private String empfaenger;
	private String absender;	
	private final String defaultServername = "it-designers.de";

	public Email(String betr, String text, String empf, String abs) {
		this.betreff = betr;
		this.text = text;
		this.empfaenger = empf;
		this.absender = abs;
	}

	public void senden() {
		class InternetMailAdress {			
			
			private boolean isValid(String adress) {
				boolean result = false;

				if (adress != null && adress.length() > 1) {
					if (adress.charAt(0) != '@' || adress.charAt(0) != '*') {// beginnt mit einem Zeichen welche nicht @ oder *

						if (adress.contains("@")) {
							if (countChar(adress, '@') == 1) {//max@maier@gmx.de
								String emfaengerName = adress.split("@")[0];
								String serverName = adress.split("@")[1];
								
								if(isNameConform(emfaengerName) && isNameConform(serverName)){
									result = true;
								}
							}
						}
					}
				}

				return result;
			}

			private int countChar(String word, char character) {
				int occurence = 0;
				for (char c : word.toCharArray()) {
					if (c == character) {
						occurence++;
					}
				}

				return occurence;
			}

			private boolean isNameConform(String name) {
				boolean wert = false;
				if (name.matches("[a-zA-Z0-9_.-]*")) {
					wert = true;
				}
				return wert;
			}
			
			protected String formattedAddress(String address){
				String temp = " ";
				if (address != null && address.length() > 1) {
					if (address.charAt(0) != '@' || address.charAt(0) != '*') {
						if (!address.contains("@") && address.charAt(address.length() - 1) == '*'/*&& isNameConform(address)*/ ) {							
							temp = address.replace('*', ' ').trim() + "@" + defaultServername;
						} else if(address.contains("@")) {
							temp = address;
						}
					}
				}
				return temp;
			}
		}

		absender = new InternetMailAdress().formattedAddress(absender);
		empfaenger = new InternetMailAdress().formattedAddress(empfaenger);
		
		if (new InternetMailAdress().isValid(absender) && new InternetMailAdress().isValid(empfaenger)) {
			
			System.out.println("-----------------------------------------------");
			System.out.println("Mail von: " + absender);
			System.out.println("An: " + empfaenger);
			System.out.println("Betreff: " + betreff);
			System.out.println("Text: " + text);
			System.out.println("-----------------------------------------------");
			
		} else {
			System.out.println("Die Email konnte nicht verschickt werden!");
			System.out.println("Die Email-Adresse des Absenders ist ungültig.");
		}
	}
}
