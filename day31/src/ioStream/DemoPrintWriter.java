package ioStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoPrintWriter {

public static void main(String[] args) {
		writeFile();

	}

	
public static void writeFile(){
	File file = new File ("Datei04.txt");
	FileWriter fWriter = null;
	BufferedWriter bWriter = null;
	PrintWriter pWriter = null;
	String zeile = "";
	try {
		fWriter = new FileWriter(file);
		bWriter = new BufferedWriter(fWriter);
		pWriter = new PrintWriter(bWriter);
		
		
		for (int i = 0; i < 100; i++) {
			zeile = "Das ist die " + i + "te Testzeile";
			pWriter.print(zeile);
			pWriter.println();
		}
		
		for (int i = 0; i < 100; i++) {
			pWriter.format("Das ist die  %dte Zeile %n", i);
			pWriter.println();
		}
		
		pWriter.flush();
		pWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
