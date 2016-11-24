package regex02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2RegEx {
	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("0[xX][0-9\\sa-fA-F]+"); // the expression
		Matcher m1 = p1.matcher("12 0x 0x12 0Xf11 0x1g"); // the source

		while (m1.find()) {
			System.out.print("m1: " +m1.start() + " ");
			System.out.println(m1.group());
		}
		System.out.println();
		
		//^ - dient zur Negation von Komma (alles au�er) 
		Pattern p2 = Pattern.compile("proj1([^,])*"); // the expression
		Pattern p3 = Pattern.compile("proj1([^.])*"); // the expression
		
		Matcher m2 = p2.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java"); // the
																					// source
		Matcher m3 = p3.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java"); 
		
		while (m2.find()) {
			System.out.print("m2: " +  m2.start() + " ");
			System.out.println(m2.group());
		}
		
		while (m3.find()) {
			System.out.print("m3: " + m3.start() + " ");
			System.out.println(m3.group());
		}

		System.out.println();
		Pattern p4 = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); // the
																														// expression
		Matcher m4 = p4.matcher("12 � m8.kyong@yahoo.com.de"); // the source -
																// interessant
																// wenn ^ oben
																// fehlt
		while (m4.find()) {
			System.out.print(m4.start() + " ");
			System.out.println(m4.group());
		}
	}
}
