package packSer.demoSer06.ver01;

import java.io.Serializable;

class Dog { // not serializable !
}

class MyDog extends Dog implements Serializable {
	private Collar myCollar;
	private int dogSize;
	
	public MyDog(Collar collar, int size) {
		super();
		myCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return myCollar;
	}
	
	@Override
	public String toString() {
		
		return myCollar + " dogSize:"+ dogSize ;
	}
}
