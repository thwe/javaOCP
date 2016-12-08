package methodLocalInnerClasses;

public class OutClass {

	private int number = 5;
	private static int numberStatic = 6;
	
	void doSomething() {
		int lokVar = 8;
		final int finLokVar = 10;

		class InMethod {

			public void seeOut() {
				System.out.println(this.getClass().getName());

				System.out.println("Attribut der ‰uﬂeren Klasse: " + number);
				System.out.println("Klassenvariable der ‰uﬂeren Klasse: " + numberStatic);

				// System.out.println("Lokale Variable der umbegebenden Methode:
				// " + lokVar);
				// Cannot refer to the non-final local variable lokVar defined
				// in an enclosing

				System.out.println("Lokale finale Variable der umbegebenden Methode: " + finLokVar);
				// Because the local variables aren't guaranteed to be alive as
				// long
				// as the method-local inner class object, the inner class
				// object can't use them.
				// s. S. 671 im SCJP Buch

				//doSomethingStatic();
				//doSomething(); //Endlosschleife (rekursiver Aufruf) erzeugt
				// StackOverFlowError
			}
		}

		System.out.println("Instanz wurde erzeugt");
		InMethod inMethod = new InMethod();
		inMethod.seeOut();

	}

	static void doSomethingStatic() {
		int lokVar = 8;
		final int finLokVar = 10;

		class InMethod {

			public void seeOut() {
				System.out.println(this.getClass().getName());

				// System.out.println("Attribut der ‰uﬂeren Klasse: " + number);

				System.out.println("Klassenvariable der ‰uﬂeren Klasse: " + numberStatic);

				// System.out.println("Lokale Variable der umbegebenden Methode:
				// " + lokVar);
				// Cannot refer to the non-final local variable lokVar defined
				// in an enclosing

				System.out.println("Lokale finale Variable der umbegebenden Methode: " + finLokVar);
				// Because the local variables aren't guaranteed to be alive as
				// long
				// as the method-local inner class object, the inner class
				// object can't use them.
				// s. S. 671 im SCJP Buch
			}
			
		}
		
		InMethod inMethod = new InMethod();
		inMethod.seeOut();
	}
}
