package p01Operationen;
/**
 * Polymorphie von Operationen
 * 
 * Eine Klasse stellt einen Namensraum dar. Damit ist es möglich,
 * dass verschiedene Klassen dieselbe Operation implementieren, 
 * in anderen Worten, derselbe Methodenkopf kann in verschiedenen
 * Klassen auftreten.
 * 
 * Je nach Klasse kann eine Operation in verschiedenen Implementierungen
 * – sprich in verschiedener Gestalt – auftreten. Man spricht hierbei
 * auch von der Vielgestaltigkeit (Polymorphie) von Operationen.
 */
public class PolymorphieMethoden {

	public static void main(String[] args) {
		Person person = new Person("Miller", "Johann", 80);
		person.print();

		Bruch bruch = new Bruch(2,1);
		bruch.print();
	}

}
