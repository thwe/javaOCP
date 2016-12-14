package overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Unterklasse extends Oberklasse {
	@Override
	/**
	 * The argument list must exactly match that of the overridden method. If
	 * they don't match, you can end up with an overloaded method you didn't
	 * intend.
	 */
	public void methode1(String str, int i, long lon) {
		System.out.printf("String: %s int: %d long: %d %n", str, i, lon);
	}

	/**
	 * The return type must be the same
	 */
	public int methode2(String str) {
		System.out.println("methode2 Unterklasse");
		return 2;
	}

	/**
	 * The return type must be the same as, or a subtype of, the return type
	 * declared in the original overridden method in the superclass. (covariant
	 * return.)
	 * 
	 */
	public Unterklasse methode3(String str) {
		return this;
	}

	public Unterklasse2 methode4(String str) {
		return new Unterklasse2();
	}

	public Cat methode5(String str) {
		return (Cat) new Animal();
	}

	// Bei primitiven Datentypen gibt es keinen kovarianten Rückgabetyp
	// public int method(){
	// return 7;
	// }

	/**
	 * The access level can't be more restrictive than the overridden method's.
	 * 
	 * public kann nicht zu: private, paketsichtbar oder protected werden
	 */
	public void methode6(String str) {
		System.out.println("String: " + str);
		;
	}

	/**
	 *
	 * protected kann nicht zu: private, paketsichtbar werden
	 */
	protected void methode7(String str) {
		System.out.println("String: " + str);
		;
	}

	/**
	 *
	 * paketsichtbar kann nicht zu: private werden
	 */
	void methode8(String str) {
		System.out.println("String: " + str);
	}

	/**
	 * Liegt eine private Methode vor, die der privaten Methode einer oberen
	 * Klasse entspricht, dann wird die obere Methode nicht überschrieben, es
	 * wird eine neue Methode deklariert (Es ist kein Überladen)
	 * 
	 */
	private void methode9(String str) {

		System.out.println("Unterklasse: " + str);
		;
	}

	/**
	 * The access level CAN be less restrictive than that of the overridden
	 * method.
	 * 
	 * paketsichtbar -> protected, public protected -> public
	 */
	public void methode10(String str) {
		System.out.println("String: " + str);
		;
	}

	/*
	 * A subclass within the same package as the instance's superclass can
	 * override any superclass method that is not marked private or final. A
	 * 
	 * Cannot override the final method from Oberklasse
	 * 
	 * You cannot override a method marked final.
	 */
	// public void methode11(String str){
	// System.out.println("String: " + str);;
	// }
	/**
	 * The overriding method CAN throw any unchecked (runtime) exception,
	 * regardless of whether the overridden method declares the exception.
	 */
	public void methode12(String str) throws RuntimeException {
		System.out.println("String: " + str);
		;
		FileNotFoundException f;
		SQLException s;
	}

	/**
	 * The overriding method must NOT throw checked exceptions that are new or
	 * broader than those declared by the overridden method.
	 * 
	 * FileNotFoundException -> IOException: Broader Geht nicht SQLException:
	 * Newer geht nicht
	 */
	public void methode13(String str) throws FileNotFoundException {
		// FileNotFoundException -> IOException - > Exception
		System.out.println("String: " + str);
	}

	/**
	 * The overriding method can throw narrower or fewer exceptions. Just
	 * because an overridden method "takes risks" doesn't mean that the
	 * overriding subclass' exception takes the same risks. Bottom line: an
	 * overriding method doesn't have to declare any exceptions that it will
	 * never throw, regardless of what the overridden method declares.
	 * 
	 * IOException -> FileNotFoundException : geht (narowing) IOException -> gar
	 * Nichts: geht (fewer)
	 */
	public void methode14(String str) throws FileNotFoundException {
		// FileNotFoundException -> IOException - > Exception
		System.out.println("String: " + str);
	}

	/**
	 * You cannot override a method marked static. Die untere Methode
	 * überschreibt nicht die obere Methode
	 */
	public static void methode15(String str) {
		// FileNotFoundException -> IOException - > Exception
		System.out.println("String Unterklasse: " + str);
	}
}
