package packSer.demoSer04;

import java.io.Serializable;

class Collar implements Serializable {
	private int collarSize;

	public Collar(int size) {
		collarSize = size;
	}

	public int getCollarSize() {
		return collarSize;
	}
}
