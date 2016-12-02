package p025Objekte;

public class Utility {

	public static void sortByName(Person[] ref) {
		int obergrenze = ref.length;
		while (obergrenze > 1) {
			for (int i = 1; i < obergrenze; i++) {
				String a = ref[i].getNachname();
				String b = ref[i - 1].getNachname();
				if (a.compareToIgnoreCase(b) < 0) {
					swap(ref, i, i - 1);
				}
			}
			obergrenze--;
		}
	}

	private static void swap(Person[] ref, int index1, int index2) {
		Person tmp = ref[index1];
		ref[index1] = ref[index2];
		ref[index2] = tmp;
	}

	public static void print(Person[] ref) {
		for (int i = 0; i < ref.length; i++) {
			ref[i].print();
		}

		System.out.println("\n");
	}
}
