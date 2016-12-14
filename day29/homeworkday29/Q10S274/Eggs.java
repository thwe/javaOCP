package Q10S274;

public class Eggs {
		public static void main(String[] args) {
	
		Dozens [] da = new Dozens[3];
		da[0] = new Dozens();
		Dozens d = new Dozens();
		da[1] = d;
		d = null;
		da[1] = null;
		// do stuff
		System.out.println();
		
}
}

