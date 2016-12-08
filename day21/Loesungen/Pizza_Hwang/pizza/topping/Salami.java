package pizza.topping;

import pizza.Pizza;

public class Salami extends Topping {

	public Salami(Pizza below) {
		super (below);
		setPrice(225);
		setHot(true);
		setVegetable(false);
		setName ("Salami");
	}
}
