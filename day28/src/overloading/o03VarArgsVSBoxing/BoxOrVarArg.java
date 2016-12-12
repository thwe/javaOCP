package overloading.o03VarArgsVSBoxing;
/**
 * Boxing beats var-args
 * 
 * A good way to remember this rule is to notice that the var-args 
 * method is "looser" than the other method, in that it could handle
 * invocations with any number of byte parameters. 
 * 
 * A var-args method is more like a catch-all method, in terms of what
 * invocations it can handle, and as we'll see in Chapter 5, it makes
 * most sense for catch-all capabilities to be used as a last resort.
 * 
 */
public class BoxOrVarArg {

	public static void main(String[] args) {
	byte b = 5;
	go(b,b);
	}
	
	static void go(Byte x, Byte y){
		System.out.println("Byte, Byte");
	}
	
	static void go(byte...bs ){
		System.out.println("byte...");
	}

}
