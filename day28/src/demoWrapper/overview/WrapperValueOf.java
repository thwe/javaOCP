package demoWrapper.overview;
//valueOf() take a String as an argument 

//throws a NumberFormatException (a.k.a. NFE) if the String argument is not
//properly formed, 
//and can convert String objects from different bases (radix), when the
//underlying primitive type is any of the four integer types.

//valueOf() returns a newly created wrapped object of the type that
//invoked the method.
public class WrapperValueOf {

	public static void main(String[] args) {
		integerValueOf();

	}
	
	public static void integerValueOf(){
		Integer iInt1 = Integer.valueOf(101011);
		System.out.println(iInt1);
		
		Integer iInt2 = Integer.valueOf("101011");
		System.out.println(iInt2);
		
		Integer iInt3 = Integer.valueOf("101011",2);
		System.out.println(iInt3);
		
		Integer iInt4 = Integer.valueOf("43",10);
		System.out.println(iInt4);
		
	}
	
	public static void booleanValueOf(){
		Boolean bool1 = Boolean.valueOf(true);
		System.out.println(bool1);
		
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println(bool2);
		
	}
	
	public static void charValueOf(){
		Character c = Character.valueOf('c');	
			
	}

}
