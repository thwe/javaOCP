package PizzaAufgabe;

public class ToppingSalami extends Topping {

	public ToppingSalami(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getPrice() {
		int price = 225;
		return price;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return true;
	}

}
