package ioStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) {
		writeFile();

	}

	public static void writeFile(){
		File file = new File("Datei02.txt");
		FileWriter fWriter = null;
		
		try {
			fWriter = new FileWriter(file);
			fWriter.write("Guten Morgen");
			fWriter.flush();
			fWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
