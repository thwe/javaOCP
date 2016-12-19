package packSer.demoSer03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {
} 

public class SerializeCat {
	public static void main(String[] args) {
		Cat c = new Cat(); // 2
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("catSer.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(c); // 3
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("catSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}