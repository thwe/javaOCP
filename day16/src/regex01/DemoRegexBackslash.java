package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegexBackslash {

	public static void main(String[] args) {
		Pattern p1 = Pattern.compile("\\\\");
		Pattern p2 = Pattern.compile("\n");
		Pattern p3 = Pattern.compile("\\\\s");
		Pattern p4 = Pattern.compile("a\\\\\\w*");
		
		Matcher m1 = p1.matcher("\\"); //Escape zeichen muss mit Escape maskiert werden
		Matcher m2 = p2.matcher("\n");
		Matcher m3 = p3.matcher(" ");
		Matcher m4 = p3.matcher("\\s");
		Matcher m5 = p4.matcher("a\\sb1_");
		
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
		System.out.println(m5.matches());

	}

}
