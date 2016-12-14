package varIntoMethods.refVariables;

public class ReferenceTest {

	public static void main(String[] args) {
		RefVarIntoMethods rMethods = new RefVarIntoMethods();
		

		System.out.println("MethWithRefVar01");
		RefType rType1 = new RefType(100, 200, "300");
		System.out.println(rType1);
		rMethods.methWithRefVar01(rType1);
		System.out.println(rType1);
		System.out.println();
		
		System.out.println("MethWithRefVar02");
		RefType rType2 = new RefType(100, 200, "300");
		System.out.println(rType2);
		rMethods.methWithRefVar02(rType2);
		System.out.println(rType2);
		System.out.println();
		
		System.out.println("MethWithRefVar05");
		RefType rType5 = new RefType(100, 200, "300");
		System.out.println(rType5);
		rType5= rMethods.methWithRefVar05(rType5);
		System.out.println(rType5);
		System.out.println();
		
		System.out.println("MethWithRefVar03");
		RefType rType3 = new RefType(100, 200, "300");
		System.out.println(rType3);
		rMethods.methWithRefVar03(rType3);
		System.out.println(rType3);
		System.out.println();
		
		System.out.println("MethWithRefVar04");
		RefTypeFinal rFinal1 = new RefTypeFinal(100,200,"300");
		System.out.println(rFinal1);
		rFinal1.setZahl1(500);
		System.out.println(rFinal1);
	}

}
