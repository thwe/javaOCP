package ioStream;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {

	public static void main(String[] args) {
		readFile();

	}

	public static void readFile(){
		File file = new File("Datei03.txt");
		FileReader freader = null;
		BufferedReader bReader = null;
		String zeile = null;
		
		try {
			freader = new FileReader(file);
			bReader = new BufferedReader(freader);
			//while((zeile = bReader.readLine())!=null){
				while(bReader.ready()){
					System.out.println(bReader.readLine());
					//System.out.println(zeile);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System s;
		
	}
}
