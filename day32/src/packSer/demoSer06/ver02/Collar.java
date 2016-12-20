package packSer.demoSer06.ver02;

import java.io.Serializable;

/**
 * But what would happen if we didn't have access to the Collar class source code?
 * 
 * 
 * Obviously we could subclass the Collar class, mark the subclass as Serializable,
 * and then use the Collar subclass instead of the Collar class. 
 */
class Collar implements Serializable{
	private int collarSize;

	public Collar(int size) {
		collarSize = size;
	}

	public int getCollarSize() {
		return collarSize;
	}
	
	@Override
	public String toString() {
		return "CollarSize: " + collarSize;
	}
}