package overloading.o04WideningRefVariables;
/**
 * The compiler widens the Dog reference to an Animal,
 * and the invocation succeeds. 
 * 
 * The key point here is that reference widening depends 
 * on inheritance, in other words the IS-A test.
 *
 */
public class WideningRefVariables {

	public static void main(String... strings) {
		Dog d = new Dog();
		d.go(d);

		// is this legal ?
		// the go() method thinks it's getting an Animal object,
		// so it will only ask it to do Animal things, which of
		// course anything that inherits from Animal can do

		// So, in this case, the compiler widens the Dog reference
		// to an Animal, and the invocation succeeds.
		
		Pudel p = new Pudel();
		p.go(p);
	}
}
