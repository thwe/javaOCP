package PizzaAufgabe;

public class ToppingCheese extends Topping {

	public ToppingCheese(Pizza pizza) {
		super(pizza);

	}

	@Override
	public int getPrice() {
		int price = 195;
		return price;
	}

	@Override
	public boolean isVegetable() {

		return true;
	}

	@Override
	public boolean isHot() {

		return false;
	}

}
