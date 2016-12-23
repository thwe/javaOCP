
/*
 * Question 7
 */
public class Tour {
	public static void main(String[] args) {
		Cathedral c = new Cathedral();
		// insert code here
		Cathedral.Sanctum s = c.new Sanctum();  //Zugriff auf innere Klassen Methode
		s.go();
	}
}
class Cathedral {
	class Sanctum {
		void go() {
			System.out.println("spooky");
			}
	}
}