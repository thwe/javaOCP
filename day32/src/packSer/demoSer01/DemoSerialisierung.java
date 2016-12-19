package packSer.demoSer01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Unter Serialisierung wollen wir die F�higkeit verstehen, ein Objekt,
// das im Hauptspeicher der Anwendung existiert, in ein Format zu
// konvertieren, das es erlaubt, das Objekt in eine Datei zu schreiben
// und auch auszulesen
//	Paket java.io
public class DemoSerialisierung {

	public static void main(String[] args) {
		Time time = new Time(11, 52);
		String fileName = "Time.ser";
		writeSerObject(time, fileName);
		readSerObject(fileName);
	}

	public static void writeSerObject(Time pTime, String pFileName) {
		FileOutputStream fStream;
		ObjectOutputStream oStream;

		try {
			fStream = new FileOutputStream(pFileName);
			// FileNotFoundException muss abgefangen werden
			oStream = new ObjectOutputStream(fStream);
			// IOException muss abgefangen werden
			oStream.writeObject(pTime);
			oStream.flush();
			oStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readSerObject(String pFileName) {
		FileInputStream fStream;
		ObjectInputStream oStream;

		try {
			fStream = new FileInputStream(pFileName);
			// FileNotFoundException muss abgefangen werden
			oStream = new ObjectInputStream(fStream);
			// IOException muss abgefangen werden
			Time time= (Time)oStream.readObject();
			System.out.println(time);
			oStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
