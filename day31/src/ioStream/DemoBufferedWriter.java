package ioStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWriter {

	public static void main(String[] args) {
		writeFile();
	}
	
	public static void writeFile(){
		File file = new File("Datei03.txt");
		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		String zeile = "";
		
		try {
			fWriter = new FileWriter(file);
			bWriter = new BufferedWriter(fWriter);
			bWriter.write("Erste Zeile ");
			bWriter.write("Testzeile");
			bWriter.newLine();
			bWriter.write("Zweite Zeile");
			bWriter.newLine();
			
			for (int i = 0; i < 100; i++) {
				zeile = "Das ist die " + i + "te Testzeile";
				bWriter.write(zeile);
				bWriter.newLine();
			}
			bWriter.flush();
			fWriter.flush();
			bWriter.close();
			fWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
