package packScanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("tutego 12 1973 12,03 True "
			+"	12345677890000 1100100 100"); 
		if(scanner.hasNext()){
			System.out.println(scanner.hasNext());
			System.out.println(scanner.next());
			System.out.println(scanner.hasNextByte());
			System.out.println(scanner.nextByte());
			System.out.println(scanner.hasNextInt());
			System.out.println(scanner.nextInt());
			System.out.println(scanner.hasNextDouble());
			System.out.println(scanner.nextDouble());
			System.out.println(scanner.hasNextBoolean());
			System.out.println(scanner.nextBoolean());
			System.out.println(scanner.hasNextLong());
			System.out.println(scanner.nextLong());
			scanner.useRadix(2);
			System.out.println(scanner.hasNextByte());
			System.out.println(scanner.nextByte());
			scanner.useRadix(10);
			System.out.println(scanner.hasNextInt());
			System.out.println(scanner.nextInt());
			scanner.close();
		}
		

	}

}
