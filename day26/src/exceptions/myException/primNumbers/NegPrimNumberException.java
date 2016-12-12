package exceptions.myException.primNumbers;

public class NegPrimNumberException extends Exception{

	public NegPrimNumberException() {
		super("Is not a prim number ...");
	}
	
	public NegPrimNumberException(int number) {
		super("Zero or negative number ..." + number);
	}
	
}
