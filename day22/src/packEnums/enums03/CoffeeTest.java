package packEnums.enums03;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.setSize(CoffeSize.BIG);
		System.out.println(drink.getSize());

	}

}
