package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegExSQBrackets {

	public static void main(String[] args) {
		//regexSQBrackets();
		regexSQBrackets02();
	}

	public static void regexSQBrackets(){
		Pattern p1 = Pattern.compile("[abc]");
		//Ein Zeichen aus der Klammer: a, b oder c
		Pattern p2 = Pattern.compile("[a-z]");
		Pattern p3 = Pattern.compile("[a-z]*");
		
		Matcher m1 = p1.matcher("a");
		Matcher m2 = p1.matcher("c");
		Matcher m3 = p1.matcher("ab");
		Matcher m4 = p1.matcher("abc");
		
		Matcher m5 = p2.matcher("a");
		Matcher m6 = p2.matcher("t");
		Matcher m7 = p2.matcher("ab");
		Matcher m8 = p2.matcher("abcd");
		
		Matcher m9 = p3.matcher("aabb");
		
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches()); //false
		System.out.println(m4.matches() + "\n"); //false 
		
		System.out.println(m5.matches());
		System.out.println(m6.matches());
		System.out.println(m7.matches());
		System.out.println(m8.matches() + "\n");
		
		System.out.println(m9.matches());
		
	}
	
	public static void regexSQBrackets02(){
		Pattern p1 = Pattern.compile("[abc]");
		Pattern p2 = Pattern.compile("\\d*");
		
		Matcher m1 = p1.matcher("a");
		Matcher m2 = p1.matcher("b");
		Matcher m3 = p1.matcher("abf");
		Matcher m4 = p1.matcher("aabbcc");
		Matcher m5 = p2.matcher("a34b890ef");
		
		m1.find();
		// Attempts to find the next subsequence of the input sequence
		// that matches the pattern. 
		
		// This method starts at the beginning
		// of this matcher's region, or, if a previous invocation of the
		// method was successful and the matcher has not since been reset
		// , at the first character not matched by the previous match. 
//		System.out.println(m3.find());
//		System.out.println(m3.find());
//		System.out.println(m3.find());
		
		//m3.start();
		//Returns the start index of the previous match. 
		System.out.println(m3.find() + " " + m3.start() + " " + m3.end());
		System.out.println(m3.find() + " " + m3.start() + " " + m3.end());
		//System.out.println(m3.find() + " " + m3.start());
		//Exception in thread "main" java.lang.IllegalStateException: 
		// No match available
		//at java.util.regex.Matcher.start(Matcher.java:325)
		
		while(m4.find()){
			System.out.print(m4.start() + " ");
			System.out.print(m4.end() + " ");
			//Returns the offset after the last character matched. 
			System.out.println(m4.group());
			// Returns the input subsequence matched by the previous match. 
			// For a matcher m with input sequence s, the expressions m.group()
			// and s.substring(m.start(), m.end()) are equivalent. 
			// Note that some patterns, for example a*, match the empty string. 
			// This method will return the empty string when the pattern successfully matches the empty string in the input. 

		}
		System.out.println("\n\n");
		while(m5.find()){
			System.out.print(m5.start() + " ");
			System.out.print(m5.end() + " ");
			System.out.println(m5.group());
		}
		System.out.println(m5.start() + " ");
		System.out.println(m5.start() + " ");
		System.out.println(m5.start() + " ");
	
	System.out.println("".length()); //Leerstring
	}
	
	
}
