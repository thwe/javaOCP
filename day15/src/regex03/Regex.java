package regex03;

import java.util.regex.*;
/**
 * zero-length-match
 * 
 * To provide the most flexibility, Matcher.find(), when 
 * coupled with the greedy quantifiers ? or *, allow for 
 * (somewhat unintuitively) the idea of a zero-length match. 
 * 
 * As an experiment, modify the previous Regex.java class and
 * add an invocation of m.end() to the S.O.P. in the while loop. 
 * 
 * With that modification in place, the invocation
 * java Regex "a?" "aba"
 * should produce something very similar to this: 
 * Pattern is a?
 * 0 1 a
 * 1 1
 * 2 3 a
 * 3 3
 * 
 * The lines of output 1 1 and 3 3 are examples of zero-length matches.
 * Zero-length matches can occur in several places:
 * 
 * ** After the last character of source data (the 3 3 example)
 * ** In between characters after a match has been found (the 1 1 example)
 * ** At the beginning of source data (try java Regex "a?" "baba")
 * ** At the beginning of zero-length source data
 */
public class Regex {
	public static void main(String[] args) {
		method01();
		method02();
		method03();
		method04();
	}

	public static void method01() {

		String str = "12345";
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(5));

		Pattern p = Pattern.compile("\\d\\w");
		Matcher m = p.matcher("ab4 56_7ab");
		System.out.println("Pattern is " + m.pattern());
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}

	public static void method02() {
		Pattern p1 = Pattern.compile("a?");
		Matcher m1 = p1.matcher("aba");
		System.out.println("Pattern is " + m1.pattern());
		while (m1.find()) {
			System.out.println(m1.start() + " " + m1.end() + " " + m1.group());
		}
	}

	public static void method03() {
		Pattern p1 = Pattern.compile("\\d*");
		Matcher m1 = p1.matcher("ab34ef");
		System.out.println("Pattern is " + m1.pattern());
		while (m1.find()) {
			System.out.println(m1.start() + " " + m1.end() + " " + m1.group());
		}
	}

	public static void method04() {

		String str = "12345";
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(5));
	}

}