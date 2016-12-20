package packSer.demoSer02;

import java.io.Serializable;

public class DogWSer implements Serializable{
	private String name;

	public DogWSer(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
