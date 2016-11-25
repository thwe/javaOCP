package objects.initBlocks.mixed;

public class ApplikationAuto {

	public static void main(String[] args) {
		System.out.println(Auto.demoClassVar);
		Auto.reportStatic();

		Auto auto01 = new Auto();
		auto01.report();
		
		Auto auto02 = new Auto(150);
		auto02.report();
	}

}
