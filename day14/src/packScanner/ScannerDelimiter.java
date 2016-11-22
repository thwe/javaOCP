package packScanner;

import java.util.Scanner;

public class ScannerDelimiter {

	public static void main(String[] args) {
		String text1 = "Hänsel und Gretel \n gingen durch den Wald";
		String text2 = "Hänsel-und-Gretel \n gingen-durch-den-Wald";
		String text3 = "Hänsel;und;Gretel \n gingen;durch;den;Wald";
		String text4 = "Hänsel\tund\tGretel \n gingen\tdurch\tden\tWald";
		
		Scanner sc = new Scanner(text1);
//		System.out.println(sc.hasNextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.hasNextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.findInLine("Wald"));
//		System.out.println(sc.findInLine("ete"));
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		
		Scanner sc2 = new Scanner(text2).useDelimiter("-");
//		System.out.println(sc2.hasNextLine());
//		System.out.println(sc2.nextLine());
//		System.out.println(sc2.hasNextLine());
//		System.out.println(sc2.nextLine());
//		System.out.println(sc2.findInLine("Wald"));
//		System.out.println(sc2.findInLine("ete"));
//		System.out.println(sc2.next());
//		System.out.println(sc2.next());
//		
		Scanner sc3 = new Scanner(text3).useDelimiter(";");
//		System.out.println(sc3.hasNextLine());
//		System.out.println(sc3.nextLine());
//		System.out.println(sc3.hasNextLine());
//		System.out.println(sc3.nextLine());
//		System.out.println(sc3.findInLine("Wald"));
//		System.out.println(sc3.findInLine("ete"));
//		System.out.println(sc3.next());
//		System.out.println(sc3.next());
		
		Scanner sc4= new Scanner(text4);
//		System.out.println(sc4.hasNextLine());
//		System.out.println(sc4.nextLine());
//		System.out.println(sc4.hasNextLine());
//		System.out.println(sc4.nextLine());
		System.out.println(sc4.findInLine("Wald"));
		System.out.println(sc4.findInLine("ete"));
		System.out.println(sc4.next());
		System.out.println(sc4.next());
		
		
	}

}
