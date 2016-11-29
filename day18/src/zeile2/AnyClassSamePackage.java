package zeile2;

public class AnyClassSamePackage {

	public void methodex(){
		VisibilitySamePackage vPackage = new VisibilitySamePackage();
		System.out.println(vPackage.attr01);
		System.out.println(vPackage.attr02);
		System.out.println(vPackage.attr03);
		//System.out.println(vPackage.attr04);
		
		vPackage.method01();
		vPackage.method02();
		vPackage.method03();
		//vPackage.method04();
	}
}
