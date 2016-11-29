package zeile1;

public class VisibilitySameClass {

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
	
	public void method(){
		System.out.println(this.attr01);
		System.out.println(this.attr02);
		System.out.println(this.attr03);
		System.out.println(this.attr04);
		
		this.method01();
		this.method02();
		this.method03();
		this.method04();
	}

	public static void main(String[] args) {
		VisibilitySameClass vClass = new VisibilitySameClass();
		System.out.println(vClass.attr01);
		System.out.println(vClass.attr02);
		System.out.println(vClass.attr03);
		System.out.println(vClass.attr04);
		
		vClass.method01();
		vClass.method02();
		vClass.method03();
		vClass.method04();
	}
}
