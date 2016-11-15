package others_homeworkday09;

public class Kasek_StringUmdrehen {
	public static String umdrehen(String strEingabe) {
		String strAusgabe = "";
		
		for (int i = strEingabe.length() - 1; i >= 0; i--) {
			strAusgabe += strEingabe.charAt(i);
		}
		
		return strAusgabe;
	}
	
	public static void ausgabe(String strAusgabe) {
		System.out.println(strAusgabe);
	}
	
	public static void main(String[] args) {
		String strEingabe = "Das Haus vom Nikolaus";
		String strAusgabe = "";
		
		strAusgabe = umdrehen(strEingabe);
		ausgabe(strAusgabe);
	}
}