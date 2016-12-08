package PizzaAufgabe;

public class ToppingChili extends Topping {

	public ToppingChili(Pizza pizza) {
		super(pizza);
			}

	@Override
	public int getPrice() {
		int price = 95;
		return price;
	}

	@Override
	public boolean isVegetable() {
		return true;
	}

	@Override
	public boolean isHot() {
		return true;
	}

}
