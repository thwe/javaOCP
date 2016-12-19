package packSer.demoSer05;

/**
 * But what would happen if we didn't have access to the Collar class source code?
 * 
 * In other words, what if making the Collar class serializable was not an option? 
 * Are we stuck with a non-serializable Dog?
 * 
 * Obviously we could subclass the Collar class, mark the subclass as Serializable,
 * and then use the Collar subclass instead of the Collar class. But that's not always an
 * option either for several potential reasons:
 * 
 * 1. The Collar class might be final, preventing subclassing.
 * 
 * OR
 * 
 * 2. The Collar class might itself refer to other non-serializable objects, and without
 * knowing the internal structure of Collar, you aren't able to make all these fixes 
 * (assuming you even wanted to TRY to go down that road).
 * 
 * OR
 * 
 * 3. Subclassing is not an option for other reasons related to your design.
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
}
