package packSer.demoSer02.ver02;

import java.io.Serializable;

public class Dog implements Serializable{
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
