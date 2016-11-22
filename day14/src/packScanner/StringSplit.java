package packScanner;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		String string = "tutego;12;1973;12,03;True;12345677890000;1100100;100"; 
		String[] stringArray = string.split(";");
		System.out.println(Arrays.toString(stringArray));

	}

}
