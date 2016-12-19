package packSer.demoSer02.ver02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Family2 {

	public static void main(String[] args) {
		Person2 opa = new Person2("Eugen");
		Person2 oma = new Person2("Theresia");
		Person2 papa = new Person2("Ladislaus");
		Person2 mama = new Person2("Katharina");
		Person2 kind1 = new Person2("Fritzchen");
		Person2 kind2 = new Person2("Anne");
		Dog dog = new Dog("Bello");
		
		papa.setFather(opa);
		papa.setMother(oma);
		kind1.setFather(papa);
		kind1.setMother(mama);
		kind2.setFather(papa);
		kind2.setMother(mama);
		
		//Serialisieren der Familie
		
		try {
			FileOutputStream fOutputStream = new FileOutputStream("family2.ser");
			ObjectOutputStream outputStream = new ObjectOutputStream(fOutputStream);
			
			outputStream.writeObject(dog);
			outputStream.writeObject(kind1);
			outputStream.writeObject(kind2);
			outputStream.writeObject(mama);
			outputStream.writeObject(papa);
			
			outputStream.flush();
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Rekonstruieren Der Familie
		papa = null;
		mama = null;
		kind1 = null;
		kind2 = null;
		dog = null;
		
		
		try {
			FileInputStream fInputStream = new FileInputStream("family2.ser");
			ObjectInputStream oInputStream = new ObjectInputStream(fInputStream);
			dog = (Dog)oInputStream.readObject();
			kind1 =  (Person2)oInputStream.readObject();
			kind2 = (Person2)oInputStream.readObject();
			mama = (Person2)oInputStream.readObject();
			papa = (Person2)oInputStream.readObject();
			
			//Überprüfen
			System.out.println(" ---- ");
			System.out.println(kind1.getName() + " " + kind2.getName());
			System.out.println(kind1.getFather().getName() + " " + kind2.getFather().getName());
			System.out.println(kind1.getMother().getName() + " " + kind2.getMother().getName());
			
			System.out.println(" ---- ");
			System.out.println(papa.getName() + " " + mama.getName());
			System.out.println(papa.getFather().getName() + " " + mama.getFather().getName());
			System.out.println(papa.getMother().getName() + " " + mama.getMother().getName());
			
			oInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
