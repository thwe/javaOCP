package packSer.demoSer06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {
	public static void main(String[] args) {
		Collar c = new Collar(3);
		MyDog d = new MyDog(c, 5);
		System.out.println("before: collar size is " + d.getCollar().getCollarSize());
		try {
			FileOutputStream fs = new FileOutputStream("myDogSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("myDogSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (MyDog) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after: collar size is " + d.getCollar().getCollarSize());
	}
}