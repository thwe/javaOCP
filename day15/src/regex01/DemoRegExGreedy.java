package regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegExGreedy {

	public static void main(String[] args) {
		// greedy01(); //? for zero or once
		// reluctant01();

		// greedy02(); // * is zero or more
		greedy03(); // + one or more

	}

	public static void greedy01() {
		// ? for zero or once
		Pattern p1 = Pattern.compile("\\d*\\-?");
		Pattern p2 = Pattern.compile("(\\d*\\-?)*");

		Matcher m1 = p1.matcher("212-");
		Matcher m2 = p1.matcher("212");
		Matcher m3 = p1.matcher("212--"); // false

		Matcher m4 = p2.matcher("212-");
		Matcher m5 = p2.matcher("212-3434-425-");
		Matcher m6 = p2.matcher("");
		Matcher m7 = p2.matcher("---");
		Matcher m8 = p2.matcher("2123434425");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());

		System.out.println(m4.matches());
		System.out.println(m5.matches());
		System.out.println(m6.matches());
		System.out.println(m7.matches());
		System.out.println(m8.matches());
	}

	public static void greedy02() {
		// * is zero or once
		Pattern p1 = Pattern.compile("\\d*");
		Pattern p2 = Pattern.compile(".*xx");
		Pattern p3 = Pattern.compile(".*?xx");

		Matcher m1 = p1.matcher("");
		Matcher m2 = p1.matcher("2");
		Matcher m3 = p1.matcher("2223456");

		Matcher m4 = p2.matcher("yyxxxxyxx");
		Matcher m5 = p3.matcher("yyxxxxyxx");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());

		System.out.println(m4.matches());
		System.out.println(m5.matches());
	}

	public static void greedy03() {
		// + is one or more
		Pattern p1 = Pattern.compile("\\d+");

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
		Matcher m2 = p1.matcher("212");
		Matcher m3 = p1.matcher("212--"); // false

		Matcher m4 = p2.matcher("212-");
		Matcher m5 = p2.matcher("212-3434-425-");
		Matcher m6 = p2.matcher("");
		Matcher m7 = p2.matcher("---");
		Matcher m8 = p2.matcher("2123434425");

		System.out.println(m1.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());

		System.out.println(m4.matches());
		System.out.println(m5.matches());
		System.out.println(m6.matches());
		System.out.println(m7.matches());
		System.out.println(m8.matches());
	}
}
