package packSer.demoSer06.ver02;

import java.io.Serializable;

class Dog { // not serializable !
	private Collar collar;
	private int dogSize;
	
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
	public MyDog(Collar collar, int size) {
		super();
		this.setCollar(collar);
		this.setDogSize(size);
	}

	
	@Override
	public String toString() {	
		return this.getCollar() + " dogSize:"+ this.getDogSize() ;
	}
}
