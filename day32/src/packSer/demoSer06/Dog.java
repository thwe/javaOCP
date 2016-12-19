package packSer.demoSer06;

import java.io.Serializable;

class Dog { // not serializable !
}

class MyDog extends Dog implements Serializable {
	private Collar myCollar;
	private int dogSize;
	
	public MyDog(Collar collar, int size) {
		myCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return myCollar;
	}
	
	
}
