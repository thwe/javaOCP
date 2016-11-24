package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegExSQBrackets {

	public static void main(String[] args) {
		//regexSQBrackets();
		regexSQBrackets02();
		String test= "0123456789";
		String substring = test.substring(0, 10);
		System.out.println(substring);
		
	}
	
	public static void regexSQBrackets(){
		Pattern p1 = Pattern.compile("[abc]");
		//Ein Zeichen aus der Klammer
		Pattern p2 = Pattern.compile("[a-z]");
		Pattern p3 = Pattern.compile("[a-z]*");
		
		Matcher m1 = p1.matcher("a");
		Matcher m2 = p1.matcher("b");
		Matcher m3 = p1.matcher("abf");
		Matcher m4 = p1.matcher("abc");
		
		Matcher m5 = p2.matcher("a");
		Matcher m6 = p2.matcher("t");
		Matcher m7 = p2.matcher("ab");
		Matcher m8 = p2.matcher("abcd");
		
		Matcher m9 = p3.matcher("aabb");
		
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		System.out.println(m4.matches());
		
		System.out.println(m5.matches());
		System.out.println(m6.matches());
		System.out.println(m7.matches());
		System.out.println(m8.matches());
		
		System.out.println(m9.matches());
	}
	
	
	public static void regexSQBrackets02(){
		Pattern p1 = Pattern.compile("[abc]");
		
		Matcher m1 = p1.matcher("a");
		Matcher m2 = p1.matcher("b");
		Matcher m3 = p1.matcher("abf");
		Matcher m4 = p1.matcher("aabbcc");
		
		// Attempts to find the next subsequence of the 
		// input sequence that matches the pattern.
		
		
		//System.out.println(m1.find() + " " +m1.start());
		//System.out.println(m2.find()+ " "  +m2.start());
		
		//Attempts to match the entire region against the pattern.
		//System.out.println(m1.matches());
		//System.out.println(m2.matches());
		
		//System.out.println(m3.find()+ " "  +m1.start());
//		while (m3.find()) {
//			System.out.println(m3.start() + " " + m3.group());
//		}
//		System.out.println(m3.matches() + "\n"); //false
		
		System.out.println(m4.find()+ " "  +m4.start()); 
		System.out.println(m4.find()+ " "  +m4.start()); 
		System.out.println("Hallo");
		while (m4.find()) {
			System.out.println(m4.start() + " " + m4.group());
		}
		System.out.println(m4.matches() + "\n"); //false	
		
	}
	
	
}
