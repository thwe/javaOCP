package overloading.o02WideningVSVarArgs.combination;
/**
 * You can successfully combine var-args 
 * with either widening or boxing
 *
 */
public class Vararg {

	static void wide_vararg(long... x){
		System.out.println("long ...");
	}
	
	static void box_vararg( Integer... x){
		System.out.println("Integer ...");
	}
	
	public static void main(String[] args) {
		int i = 5;
		
		wide_vararg(i,i);
		
		box_vararg(i,i);
		
		

	}

}
