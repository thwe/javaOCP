package pizza.topping;

import pizza.Pizza;

public class Ham extends Topping {

	public Ham(Pizza below) {
		super (below);
		setPrice(245);
		setHot (false);
		setVegetable(false);
		setName ( "Ham");
	}
}
