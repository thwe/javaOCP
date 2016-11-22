package packScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		
		//Scanner scanner = new Scanner(new File("EastOfJava.txt"));
		//Scanner scanner = new Scanner(new File(determineAbsPath()));
		Scanner scanner = new Scanner(new File(determineRelPath()));
		String zeile = null;
		while (scanner.hasNextLine()){
			zeile = scanner.nextLine();
			processLine(zeile);
			System.out.println(zeile);
		}
		scanner.close();
	}
	
	public static void processLine(String zeile){
		String[] worte = zeile.split(" ");
		char ersteBuchstabe= ' ';
		for (int i = 0; i < worte.length; i++) {
			ersteBuchstabe = worte[i].trim().charAt(0);
			
			System.out.print(ersteBuchstabe + " ");
		}
		System.out.println();
	}
	
	public static String determineAbsPath(){
		String filePath = new File("EastOfJava.txt").getAbsolutePath();
		System.out.println(filePath);
		
		String windowsPath = "C:\\dateienTepfenhart\\workspaceJava20161102\\Tag14_20161122\\Dateien\\EastOfJava.txt";
		String linuxPath = "/media/sf_VMAustauschOrdner/Dateien/EastOfJava.txt";
		
		String operatingSystem = System.getProperty("os.name");
		System.out.println(operatingSystem);
		
		if(operatingSystem.equals("Windows 7")){
			filePath = windowsPath;
		}else if(operatingSystem.equals("Linux")){
			filePath = linuxPath;
		}
		
		return filePath;
	}
	
	public static String determineRelPath(){
		
		String windowsPath = null; 
		String linuxPath = null;
		String osPath = null; //Beliebiges Betriebssystem
		String filePath = null;
		
		String operatingSystem = System.getProperty("os.name");
		System.out.println(operatingSystem);
		
		String userDir =  System.getProperty("user.dir");
		System.out.println("Aktuelles Arbeitsverzeichnis: " + userDir);
		
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("Trennzeichen fuer die Bestandteile eines Pfadnamens: " + fileSeparator);
	
		//Relativer Pfad mit konkreten Trennzeichen
		//Funktioniert nur mit dem jeweiligen Betriebssystem
		windowsPath = userDir + "\\Dateien\\EastOfJava.txt";
		linuxPath = userDir + "/Dateien/EastOfJava.txt";
		
		//Relativer Pfad mit betriebssystemspezifischen Trennzeichen
		//Funktioniert mit allen Betriebssystemen
		windowsPath = userDir +  fileSeparator+ "Dateien" + fileSeparator+ "EastOfJava.txt";
		linuxPath = userDir + fileSeparator+ "Dateien" + fileSeparator+ "EastOfJava.txt";
		osPath = userDir + fileSeparator+ "Dateien" + fileSeparator+ "EastOfJava.txt";
		
		if(operatingSystem.equals("Windows 7")){
			filePath = windowsPath;
		}else if(operatingSystem.equals("Linux")){
			filePath = linuxPath;
		}else{
			filePath = osPath;
		}
		
		return filePath;
	}
}
