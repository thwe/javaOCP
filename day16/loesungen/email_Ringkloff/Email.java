package email_Ringkloff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CORBA.MARSHAL;

public class Email {
	//Attribute
	private String absender;
	private String empfaenger;
	private String betreff;
	private String text;
	
	//Konstruktor
	public Email(){
		
	}
	public Email(String absender, String empfaenger, 
			String betreff, String test){
		this.setAbsender(absender);
		this.setEmpfaenger(empfaenger);
		this.setBetreff(betreff);
		this.setText(test);
	}
	
	//Methoden
	public String getAbsender() {
		return absender;
	}
	public void setAbsender(String absender) {
		this.absender = absender;
	}
	public String getEmpfaenger() {
		return empfaenger;
	}
	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}
	public String getBetreff() {
		return betreff;
	}
	public void setBetreff(String betreff) {
		this.betreff = betreff;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void report(){
		System.out.println("-----------------------------------------------");
		System.out.println("Mail von: " + absender);
		System.out.println("An: " + empfaenger);
		System.out.println("Betreff: " + betreff);
		System.out.println("Text: \n" + text);
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
	boolean isValid (String address){
		
		String empfaengerX = address;
		
		Pattern p1 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+[.][a-zA-Z]{2,4}");
		Matcher m1 = p1.matcher(empfaengerX);
		boolean matchX = m1.matches();
		//System.out.println(m1.matches());
	
		return matchX;
	}
}
