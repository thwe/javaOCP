package p025Objekte;

public class Test {

	public static void main(String[] args) {

		// Sortieren Personen
		Person[] refPersonen = new Person[3];
		refPersonen[0] = new Person("Miller", "Max");
		refPersonen[1] = new Person("Auer", "Ulrike");
		refPersonen[2] = new Person("Maier", "Anton");
		
		//Utility.print(refPersonen);
		//Utility.sortByName(refPersonen);
		//Utility.print(refPersonen);
		
		//Sortieren Studenten
		Student[] refStudenten = new Student[3];
		refStudenten[0] = new Student("Miller", "Max", 1223);
		refStudenten[1] = new Student("Auer", "Ulrike", 1345);
		refStudenten[2] = new Student("Maier", "Anton",2435);
		
		Utility.print(refStudenten);
		Utility.sortByName(refStudenten);
		Utility.print(refStudenten);
	}

}
