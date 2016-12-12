package overloading.o01WideningPrim;
/**
 * In every case, when an exact match isn't found, the JVM uses the method 
 * with the smallest argument that is wider than the parameter. You can verify
 * for yourself that if there is only one version of the go() method, and it 
 * takes a double, it will be used to match all four invocations of go().
 */
public class EasyOver {

	static void go(int x){
		System.out.println("int ");
	}
		
	
//	static void go(long x){
//		System.out.println("long ");
//	}
	
	static void go(double x){
		System.out.println("double ");
	}
	
	public static void main(String[] args) {
		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;
		
		 go(b); //int
		 go(s); //int
		// the calls that use byte and the short arguments are implicitly
		// widened to match the version of the go() method that takes an int.
		 
		 go(l); //long
		// the call with the long uses the long version of go()
		 
		 go(f);//double
		// the call that uses a float is matched to the method that takes a double
	}
}
