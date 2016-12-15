package ioStream;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		createFile();

	}

	
	public static void createFile(){
		File file = new File("Datei01.txt");
		System.out.println(file.exists());
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
	}
}
