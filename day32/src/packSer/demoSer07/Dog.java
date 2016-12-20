package packSer.demoSer07;

import java.io.Serializable;

class Dog implements Serializable {
	private transient Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return theCollar;
	}
}
