package pizza.topping;

import pizza.Pizza;

public class Cheese extends Topping {

	public Cheese(Pizza below) {
		super (below);
		setPrice(195);
		setHot (false);
		setVegetable(false);
		setName ( "Cheese");
	}
}
