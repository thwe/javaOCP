package zeile3;

public class VisibilitySamePackageSubClass {

	public int attr01 = 10;
	protected int attr02 = 20;
	int attr03 = 30;
	private int attr04 = 40;

	public void method01() {
		System.out.println("Public ");
	}

	protected void method02() {
		System.out.println("Protected ");
	}

	void method03() {
		System.out.println("Default ");
	}

	private void method04() {
		System.out.println("Private ");
	}
}
