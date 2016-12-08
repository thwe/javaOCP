package anonymousInnerClasses.interfaces03;

public class MyWonderfulClass {
	
	void go() {
		Bar b = new Bar();

		// Option 1
		Foo foo = new Foo() {

			@Override
			public void foof() {
				System.out.println("Foofy");
			}
		};

		b.doStuff(foo);

		// Option 2
		b.doStuff(new Foo() {

			@Override
			public void foof() {
				System.out.println("Foofy");
			}
		});
	}
}

interface Foo {
	void foof();
}

class Bar {
	void doStuff(Foo f) {
		f.foof();
	}
}