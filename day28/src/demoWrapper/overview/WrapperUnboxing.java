package demoWrapper.overview;
/**
 * It's very common to use wrappers in conjunction with collections. 
 * Any time you want your collection to hold objects and primitives, 
 * you'll want to use wrappers to make those primitives collection-compatible.
 * 
 * The general rule is that boxing and unboxing work wherever you can normally
 * use a primitive or a wrapped object.
 * 
 * The following code demonstrates some legal ways to use boxing:
 *
 */
public class WrapperUnboxing {

	public static void main(String[] args) {
	}
	static boolean go(Integer i){
		Boolean ifSo = true; //boxes the literal 
		Short s = 300; //Boxing
		if(ifSo){ //Unboxing
			System.out.println(++s);//unboxes, increments, reboxes
		}
		
		return !ifSo; //unboxes, returns
	}
	
	public static void compilerDemo(){
		
		Boolean b1 = new Boolean("false");

		if (b1) {
			//Fehlermedung mit 1.4
			//Type mismatch: cannot convert from Boolean to boolean
			System.out.println("Kompilerversion ist höher als 1.4," + " weil kein Kompilierfehler");
			//Ab Version 1.5 erfolgt die Konvertierung von Boolean > boolean automatisch
		}
		
		//Vor Java 1.5
		boolean bool = b1.booleanValue();
		
		if(bool){
			
		}
	}

}
