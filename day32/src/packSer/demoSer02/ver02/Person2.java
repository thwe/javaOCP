package packSer.demoSer02.ver02;

import java.io.Serializable;

public class Person2 implements Serializable{

	private static final long serialVersionUID = -9131825800375311824L;

	private String name;
	private Person2 mother;
	private Person2 father;
	
	public Person2(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person2 getMother() {
		return mother;
	}

	public void setMother(Person2 mother) {
		this.mother = mother;
	}

	public Person2 getFather() {
		return father;
	}

	public void setFather(Person2 father) {
		this.father = father;
	}
	
}
