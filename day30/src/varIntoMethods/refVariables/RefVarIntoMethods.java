package varIntoMethods.refVariables;
/**
 * When you pass an object variable into a method, you must 
 * keep in mind that you're passing the object reference, 
 * and not the actual object itself. 
 * 
 * Remember that a reference variable holds bits that represent 
 * (to the underlying VM) a way to get to a specific object in 
 * memory (on the heap). 
 * More importantly, you must remember that you aren't even 
 * passing the actual reference variable, but rather a copy of 
 * the reference variable.
 */
public class RefVarIntoMethods {

	/**
	 * Hier wird beim Aufruf die Kopie einer Referenzvariable übergeben
	 * Dieser zeigt auf das urspüngliche Objekt 
	 * D.h. wir haben ein Objekt und zwei Referenzvariablen
	 */
	void methWithRefVar01(RefType rt){
		int temp = rt.getZahl1();
		rt.setZahl1(rt.getZahl2());
		rt.setZahl2(temp);
		System.out.println("methWithRefVar01: " + rt);
	}
	
	void methWithRefVar02(RefType rt){
		rt = new RefType(rt.getZahl2(), rt.getZahl1(), rt.getStr1());
		System.out.println("methWithRefVar02: " + rt);
	}
	
	void methWithRefVar03(final RefType rt){
		int temp = rt.getZahl1();
		rt.setZahl1(rt.getZahl2());
		rt.setZahl2(temp);
		System.out.println("methWithRefVar03: " + rt);
	}
	
	void methWithRefVar04(final RefType rt){
		//rt = new RefType(rt.getZahl2(), rt.getZahl1(), rt.getStr1());
		//The final local variable rt cannot be assigned. It must be blank
		//and not using a compound assignment
		System.out.println("methWithRefVar04: " + rt);
	}
	
	RefType methWithRefVar05(RefType rt){
		rt = new RefType(rt.getZahl2(), rt.getZahl1(), rt.getStr1());
		System.out.println("methWithRefVar05: " + rt);
		return rt;
	}
}
