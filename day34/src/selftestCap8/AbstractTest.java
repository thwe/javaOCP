package selftestCap8;

/*
 * Question 6
 */
public abstract class AbstractTest {
	public int getNum() {
		return 45;
		}
public abstract class Bar {
	public int getNum() {
		return 38;
		}
}
	public static void main(String[] args) {
		AbstractTest t = new AbstractTest() {	//{} erzeugt anonymous class die implizit AbstratTest "EXTENDED" und KEINE neue Instanz
			public int getNum() {
				return 22;
			}
		};
		AbstractTest.Bar f = t.new Bar() {
			public int getNum() {
				return 57;
				}
			};
			System.out.println(f.getNum() + " " + t.getNum());
	}
}