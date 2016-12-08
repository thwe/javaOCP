package packEnums.enums04;

import packEnums.enums04.Coffee.CoffeeSize;

class Coffee {
	
	enum CoffeeSize {
		BIG, HUGE, OVERWHELMING
	}

	CoffeeSize size;
	
	public void methode(){
		size = CoffeeSize.BIG;
	}
}

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee drink2 = new Coffee();
		drink2.size = Coffee.CoffeeSize.BIG;
		// enclosing class name required
		// the syntax for accessing an enum's members depends on where the enum was declared.
	
		drink2.size = CoffeeSize.BIG;
	   //funktionert nur wenn enum CoffeeSize importiert wird
		//import packEnums.enums04.Coffee.CoffeeSize
	}
}
