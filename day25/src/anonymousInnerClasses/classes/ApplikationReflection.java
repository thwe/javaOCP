package anonymousInnerClasses.classes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 
 * @author mtepfenhart
 *
 *	" ... Reflection is commonly used by programs which require the ability
 * 	to examine or modify the runtime behavior of applications running
 *  in the Java virtual machine. This is a relatively advanced feature
 *  and should be used only by developers who have a strong grasp of 
 *  the fundamentals of the language. With that caveat in mind, 
 *  reflection is a powerful technique and can enable applications to
 *  perform operations which would otherwise be impossible. ..."
 *	
 *	Reflection Tutorial:
 *
 *	https://docs.oracle.com/javase/tutorial/reflect/index.html
 *	
 *	" ... A method contains executable code which may be invoked. 
 *	
 *	Methods are inherited and in non-reflective code behaviors such
 *	as overloading, overriding, and hiding are enforced by the compiler.
 * 	In contrast, reflective code makes it possible for method selection
 *  to be restricted to a specific class without considering its 
 *  superclasses. Superclass methods may be accessed but it is possible
 *  to determine their declaring class; this is impossible to discover
 *  programmatically without reflection and is the source of many subtle
 *  bugs.
 *  
 *  The java.lang.reflect.Method class provides APIs to access 
 *  information about a method's modifiers, return type, parameters,
 *  annotations, and thrown exceptions. It also be used to invoke 
 *  methods. ..."
 *	
 *	https://docs.oracle.com/javase/tutorial/reflect/member/method.html
 */

public class ApplikationReflection {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Point pointAIK1 = new Point(10,20){
			
			@Override
			public String toString() {

				return "x: " + getX() + " y: " + getY();
			}
			
			public double quote(){
				return (double)getX()/getY();
			}
			
		};
		
		
		 Class<? extends Point> clazz = pointAIK1.getClass();
	        Method quote = clazz.getDeclaredMethod("quote");
	        quote.invoke(pointAIK1);
	       
	        System.out.println(quote.invoke(pointAIK1));
		
	}
	

}
