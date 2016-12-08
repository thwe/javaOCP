package packEnums.enums06;

//Think of an enum as a kind of class, that looks something (but not exactly) like this:
public class CoffeeSize6 {

	// Konstanten
	public static final CoffeeSize6 BIG = new CoffeeSize6("BIG", 0);
	public static final CoffeeSize6 HUGE = new CoffeeSize6("HUGE", 1);
	public static final CoffeeSize6 OVERWHELMING = new CoffeeSize6("OVERWHELMING", 2);

	// Datenfelder
	private final String enumName;
	private final int index;

	// Konstruktor
	public CoffeeSize6(String enumName, int index) {
		this.enumName = enumName;
		this.index = index;
	}

	public static void main(String[] args) {
		System.out.print(CoffeeSize6.BIG.enumName + " ");
		System.out.println(CoffeeSize6.BIG.index);
		
		System.out.print(CoffeeSize6.HUGE.enumName + " ");
		System.out.println(CoffeeSize6.HUGE.index);
		
		System.out.print(CoffeeSize6.OVERWHELMING.enumName + " ");
		System.out.println(CoffeeSize6.OVERWHELMING.index);

	}

}
