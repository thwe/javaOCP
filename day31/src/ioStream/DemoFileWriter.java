package ioStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
	
	static String path= "/home/twerle/Documents/";
		
	public static void main(String[] args) {
		createFile();
		writeFile();

	}
public static void createFile(){
	
	File file = new File(path+"Datei02.txt");
	System.out.println(file.exists());
	
	
	try {
		file.createNewFile();
			}
	catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println(file.exists());
}


	public static void writeFile(){
		File file = new File(path+"Datei02.txt");
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
