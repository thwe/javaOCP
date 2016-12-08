package packEnums.enums07;

public class Coffee7 {

	CoffeeSize7 size7;

	public static void main(String[] args) {
		Coffee7 drink71 = new Coffee7();
		drink71.size7 = CoffeeSize7.BIG;

		Coffee7 drink72 = new Coffee7();
		drink72.size7 = CoffeeSize7.OVERWHELMING;

		System.out.println(drink71.size7.getOunces()); // prints 8

		for (CoffeeSize7 cs : CoffeeSize7.values()) {
			System.out.println(cs + " " + cs.getOunces());
		}
		
		for (String string : args) {
		}
	}

	// Note: Every enum has a static method, values(), that returns an array of
	// the enum's
	// values in the order they're declared.

	String str;

	// Note: Every enum has a static method, values(), that returns an array of
	// the enum's
	// values in the order they're declared.
}
