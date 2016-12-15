package ioStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		readFile();

	}

	public static void readFile(){
		File file = new File("Datei02.txt");
		FileReader freader = null;
		
		try {
			freader = new FileReader(file);
			System.out.println(freader.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
