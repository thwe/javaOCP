package packSer.demoSer07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {
	public static void main(String[] args) {
		Collar c = new Collar(3);
		Dog d = new Dog(c, 5);
		System.out.println("before: collar size is " + d.getCollar().getCollarSize());
		try {
			FileOutputStream fs = new FileOutputStream("dogSerColltrans.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		c = null;
		d = null;
		
		try {
			FileInputStream fis = new FileInputStream("dogSerColltrans.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(d);
		System.out.println("after: collar size is " + d.getCollar().getCollarSize());
	}
}