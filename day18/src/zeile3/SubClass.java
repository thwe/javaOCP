package zeile3;


public class SubClass extends VisibilitySamePackageSubClass{
	public void methodex(){
		//Zugriff Über Referenzvariable
		VisibilitySamePackageSubClass vPackage = new VisibilitySamePackageSubClass();
		System.out.println(vPackage.attr01);
		System.out.println(vPackage.attr02);
		System.out.println(vPackage.attr03);
		//System.out.println(vPackage.attr04);
		
		vPackage.method01();
		vPackage.method02();
		vPackage.method03();
		//vPackage.method04();
		
		//Zugriff über Vererbung
		System.out.println(this.attr01);
		System.out.println(this.attr02);
		System.out.println(this.attr03);
		//System.out.println(this.attr04);
		
		this.method01();
		this.method02();
		this.method03();
		//this.method04();
	}
}
