package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegexGreedy {

	public static void main(String[] args) {
		//greedy01();
		// ? for zero or once
		
		//greedy02();
		// * Zero or more occurrences
		
		//greedy03();
		// + is one or more 
		
		reluctant01();

	}

	public static void greedy01() {
		// ? for zero or once
		Pattern p1 = Pattern.compile("\\d*-?");
		Pattern p2 = Pattern.compile("(\\d*-?)*");

		Matcher m1 = p1.matcher("212-");
		Matcher m2 = p1.matcher("212");
		Matcher m3 = p1.matcher("212--");
		System.out.println(m1.matches()); // true
		System.out.println(m2.matches()); // true
		System.out.println(m3.matches()); // false

		Matcher m4 = p2.matcher("212-");
		Matcher m5 = p2.matcher("212");
		Matcher m6 = p2.matcher("212-3434-");
		Matcher m7 = p2.matcher("2123434");

		System.out.println("m4.matches():" + m4.matches());
		System.out.println("m5.matches():" + m5.matches());
		System.out.println("m6.matches():" + m6.matches());
		System.out.println("m7.matches():" + m7.matches());
	}

	public static void greedy02() {
		// * Zero or more occurrences
		// reluctant - widerwillig
		// The greedy quantifiers does in fact read the entire 
		// source data, and then it works backward (from the right)
		// until it finds the rightmost match. 
		// s 535/497
		
		Pattern p1 = Pattern.compile("\\d*");
		Pattern p2 = Pattern.compile(".*xx");
		Pattern p3 = Pattern.compile(".*?x");

		Matcher m1 = p1.matcher("");
		Matcher m2 = p1.matcher("2");
		Matcher m3 = p1.matcher("2223456");

		Matcher m4 = p2.matcher(".#yyxxxxyxx");
		Matcher m5 = p3.matcher(".#yyxxxxyxx");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());

		//System.out.println(m4.matches());
		while(m4.find()){
			System.out.println(m4.start() + " " + m4.group());
		}
		
		//System.out.println(m5.matches());
		while(m5.find()){
			System.out.println(m5.start() + " " + m5.end() + " "+ m5.group());
		}
	}
	
	public static void greedy03(){
		// + is one or more 
	
		Pattern p1 = Pattern.compile("\\d+");
		Pattern p2 = Pattern.compile("\\d+a");
		
		Matcher m1 = p1.matcher("");
		Matcher m2 = p1.matcher("2");
		Matcher m3 = p1.matcher("23456");
		
		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
	}
	
	public static void reluctant01() {
		// ? for zero or once
		Pattern p1 = Pattern.compile("\\d*\\-??");
		Pattern p2 = Pattern.compile("(\\d*\\-??)*");

		Matcher m1 = p1.matcher("212-");
		while(m1.find()){
			System.out.println("m1: " + m1.start() + " " + m1.group());
		}
		
		Matcher m2 = p1.matcher("212");
		while(m2.find()){
			System.out.println("m2: " + m2.start() + " " + m2.group());
		}
		Matcher m3 = p1.matcher("212--"); // false
		
		Matcher m4 = p2.matcher("212-");
		
		
		Matcher m5 = p2.matcher("212-3434-425-");
		while(m5.find()){
			System.out.println("m5: " + m5.start() + " " + m5.group());
		}
		
		Matcher m6 = p2.matcher("");
		Matcher m7 = p2.matcher("---");
		Matcher m8 = p2.matcher("2123434425");

		System.out.println(m1.matches());
//		System.out.println(m2.matches());
//		System.out.println(m3.matches());
//
//		System.out.println(m4.matches());
//		System.out.println(m5.matches());
//		System.out.println(m6.matches());
//		System.out.println(m7.matches());
//		System.out.println(m8.matches());
	}
}
