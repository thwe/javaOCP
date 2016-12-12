package overloading.o02WideningVSVarArgs;
/**
 * Widening beats var-args
 * 
 * A good way to remember this rule is to notice that the var-args method
 * is "looser" than the other method, in that it could handle invocations
 * with any number of byte parameters. 
 * 
 */
public class AddVarargs {

	static void go(int x, int y){
		System.out.println("int, int");
	}
	
	static void go(byte...bs){
		System.out.println("byte ...");
	}
	
	public static void main(String[] args) {
		byte b = 5;
		go (b,b); //int, int

	}

}
