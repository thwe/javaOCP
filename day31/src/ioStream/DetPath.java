package ioStream;
public class DetPath{
	

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
	windowsPath = userDir + "\\Dateien\\";
	linuxPath = userDir + "/Dateien/";
	
	//Relativer Pfad mit betriebssystemspezifischen Trennzeichen
	//Funktioniert mit allen Betriebssystemen
	windowsPath = userDir +  fileSeparator+ "Dateien" + fileSeparator;
	linuxPath = userDir + fileSeparator+ "Dateien" + fileSeparator;
	osPath = userDir + fileSeparator+ "Dateien" + fileSeparator;
	
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