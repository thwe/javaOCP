package pizza.bottom;

import pizza.Pizza;

public abstract class Bottom implements Pizza {
	
	private int price = 0;
	private boolean hot = false;
	private boolean vegetable = true;
	private String name = "";
	
	public Bottom() {
		hot = false; 
		vegetable = true;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	@Override
	public boolean isVegetable() {
		return vegetable;
	}

	@Override
	public boolean isHot() {
		return hot;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String toString () {
		return this.name;
	}
}
