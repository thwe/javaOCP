

public class Animal {
	//Attribute
	private String name;
	protected int age;
	
	//Methoden
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void report(){
		System.out.printf("My age is: %3d and my name is %s:\n\n", this.age, this.name);
	}
}
