package packSer.demoSer08;

/**
 * But what would happen if we didn't have access to the Collar class source code?
 * 
 * In other words, what if making the Collar class serializable was not an option? 
 * Are we stuck with a non-serializable Dog?
 * 
 */
class Collar {
	private int collarSize;

	public Collar(int size) {
		collarSize = size;
	}

	public int getCollarSize() {
		return collarSize;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kragen: " + collarSize;
	}
}
