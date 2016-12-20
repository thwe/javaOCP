package packSer.demoSer06.ver03;

import java.io.Serializable;

class Dog { // not serializable !
	private Collar collar = new Collar(34);
	private int dogSize = 45;

	public Dog(){
		
	}
	
	public Dog(Collar collar, int size) {
		this.collar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar c) {
		 this.collar = c;
	}
	
	public int getDogSize() {
		return dogSize;
	}

	public void setDogSize(int dogSize) {
		this.dogSize = dogSize;
	}
}

class MyDog extends Dog implements Serializable {
	private Collar myCollar;
	private int dogSize;
	
	public MyDog(Collar collar, int size) {
		super(collar,size);
		myCollar = collar;
		dogSize = size;
	}
	
	
	@Override
	public String toString() {	
		return this.getCollar() + " dogSize:"+ this.getDogSize() ;
	}
}
