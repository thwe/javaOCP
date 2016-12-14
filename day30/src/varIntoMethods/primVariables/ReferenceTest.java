package varIntoMethods.primVariables;
/**
 * So for a primitive variable, you're passing a copy of
 * the bits representing the value. For example, if you 
 * pass an int variable with the value of 3, you're 
 * passing a copy of the bits representing 3. 
 * The called method then gets its own copy of the value.
 * 
 * When a primitive variable is passed to a method, 
 * it is passed by value, which means 
 * pass-by-copy-of-the-bits-in-the-variable.
 *
 */
public class ReferenceTest {

	public static void main(String[] args) {
		int a = 1;
		ReferenceTest rTest = new ReferenceTest();
		System.out.println("Before modify() a= " + a);
		rTest.modify(a);
		System.out.println("After modify() a= " + a);
	}
	
	void modify(int number){
		number = number +1;
		System.out.println("number= " + number);
	}

}
