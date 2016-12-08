package packEnums.enums07;

enum CoffeeSize7 {
	// 8, 10 & 16 are passed to the constructor
	BIG(8), HUGE(10), OVERWHELMING(16);
	// we want ko know the actual size in ounces, that map the
	// to each of the three CoffeeSize constants

	// Constructor
	CoffeeSize7(int ounces) {
		this.ounces = ounces;
	}
	// You can NEVER invoke an enum constructor directly. The enum constructor
	// is invoked automatically, with the arguments you define after the
	// constant
	// value. For example, BIG(8) invokes the CoffeeSize constructor that takes
	// an int, passing the int literal 8 to the constructor. (Behind the scenes,
	// of
	// course, you can imagine that BIG is also passed to the constructor, but
	// we
	// don't have to know—or care—about the details.)

	// You can define more than one argument to the constructor, and you can
	// overload the enum constructors, just as you can overload a normal class
	// constructor.
	// To initialize a CoffeeType with both the number of ounces and, say, a lid
	// type,
	// you'd pass two arguments to the constructor as BIG(8, "A"), which means
	// you have a constructor in CoffeeSize that takes both an int and a String.

	// And finally, you can define something really strange in an enum that
	// looks like an
	// anonymous inner class. It's known as a constant specific class body, and
	// you use
	// it when you need a particular constant to override a method defined in
	// the enum.

	public String getLidCode() { // override the method
		// defined in CoffeeSize
		return "A";
	}
	// the semicolon is REQUIRED when more code follows

	// instance variables
	private int ounces;

	public int getOunces() {
		return ounces;
	}

}
