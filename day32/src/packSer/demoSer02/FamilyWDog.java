package packSer.demoSer02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FamilyWDog {

	public static void main(String[] args) {
		Person opa = new Person("Eugen");
		Person oma = new Person("Theresia");
		Person papa = new Person("Ladislaus");
		Person mama = new Person("Katharina");
		Person kind1 = new Person("Fritzchen");
		Person kind2 = new Person("Anne");
		Dog dog = new Dog("Horst");
		//DogWSer dogWSer = new DogWSer("Horst");
		papa.setFather(opa.getName());
		papa.setMother(oma.getName());
		kind1.setFather(papa.getName());
		kind1.setMother(mama.getName());
		kind2.setFather(papa.getName());
		kind2.setMother(mama.getName());
		
		//Serialisieren der Familie	
		try{
			FileOutputStream fs = new FileOutputStream("familyWdog.ser");
			ObjectOutputStream oOStream = new ObjectOutputStream(fs);
			oOStream.writeObject(kind1);
			oOStream.writeObject(kind2);
			oOStream.writeObject(papa);
			oOStream.writeObject(mama);
			oOStream.writeObject(dog);
			//java.io.NotSerializableException: packSer.demoSer02.Dog
			//at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1164)
			//at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:330)
			//at packSer.demoSer02.FamilyWDog.main(FamilyWDog.java:34)
			oOStream.flush();
			oOStream.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//Rekonstruieren der Familie
		kind1 = null;
		kind2 = null;
		papa = null;
		mama = null;
		dog = null;
		try{
			FileInputStream fis = new FileInputStream("familyWdog.ser");
			ObjectInputStream is = new ObjectInputStream(fis);
			kind1 = (Person)is.readObject();
			kind2 = (Person)is.readObject();
			papa = (Person)is.readObject();
			mama = (Person)is.readObject();
			dog = (Dog)is.readObject();
			//java.io.WriteAbortedException: writing aborted; java.io.NotSerializableException: packSer.demoSer02.Dog
			//at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1331)
			//at java.io.ObjectInputStream.readObject(ObjectInputStream.java:349)
			//at packSer.demoSer02.FamilyWDog.main(FamilyWDog.java:55)
			
			//Überprüfen
			System.out.println(" ---- ");
			System.out.println(kind1.getName() + " " + kind2.getName());
			System.out.println(kind1.getFather() + " " + kind2.getFather());
			System.out.println(kind1.getMother() + " " + kind2.getMother());
			
			System.out.println(" ---- ");
			System.out.println(papa.getName() + " " + mama.getName());
			System.out.println(papa.getFather() + " " + mama.getFather());
			System.out.println(papa.getMother() + " " + mama.getMother());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
