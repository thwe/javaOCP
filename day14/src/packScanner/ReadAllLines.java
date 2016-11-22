package packScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAllLines {

	public static void main(String[] args) throws FileNotFoundException  {
		Scanner scanner = new Scanner(new File("EastOfJava.txt"));
		String string = null;
		while (scanner.hasNextLine()) {
			string = scanner.nextLine();
			System.out.println(string);
		}
	}

}
