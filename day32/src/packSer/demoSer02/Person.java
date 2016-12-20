package packSer.demoSer02;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 4313020947677191391L;
	// Applikationen, in denen Code und Daten getrennt gehalten werden, 
	// haben grundsätzlich mit dem Problem der Inkonsistenz beider Bestandteile
	// zu kämpfen. 
	
	// Das Serialisierungs-API versucht diesem Problem mit einem 
	// Versionierungsmechanismus zu begegnen. 
	
	// Dazu enthält das Interface Serializable eine long-Konstante 
	// serialVersionUID, in der eine Versionskennung zur Klasse gespeichert wird.
	
	// Sie wird beim Aufruf von writeObject automatisch berechnet 
	// und stellt einen Hashcode über die wichtigsten Eigenschaften der Klasse
	// dar. 
	
	// So gehen beispielsweise Name und Signatur der Klasse, implementierte 
	// Interfaces sowie Methoden und Konstruktoren in die Berechnung ein. 
	
	//Selbst triviale Änderungen wie das Umbenennen oder Hinzufügen einer 
	// öffentlichen Methode verändern die serialVersionUID. 
	
	private String name;
	private String mother;
	private String father;
	
	public Person(String name){
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	

}
