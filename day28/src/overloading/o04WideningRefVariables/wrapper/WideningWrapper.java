package overloading.o04WideningRefVariables.wrapper;

public class WideningWrapper {

	public static void main(String[] args) {
		WideningWrapper wrapper = new WideningWrapper();
		wrapper.goL(5L); //Boxing
		//wrapper.goL(new Integer(5));
		//The method test(Long) in the type WideningWrapper is not 
		//applicable for the arguments (Integer)
		
		// It's not legal to widen from one wrapper class to another,
		// because the wrapper classes are peers to one another.
		
		wrapper.goN(new Integer(5));
		//Integer is a Number
	}

	
	void goL(Long x){
		System.out.println("Long ... ");
	}
	
	void goN(Number x){
		System.out.println("Number ... ");
	}
}
