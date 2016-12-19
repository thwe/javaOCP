package packSer.demoSer02;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 4313020947677191391L;
	// Applikationen, in denen Code und Daten getrennt gehalten werden, 
	// haben grunds�tzlich mit dem Problem der Inkonsistenz beider Bestandteile
	// zu k�mpfen. 
	
	// Das Serialisierungs-API versucht diesem Problem mit einem 
	// Versionierungsmechanismus zu begegnen. 
	
	// Dazu enth�lt das Interface Serializable eine long-Konstante 
	// serialVersionUID, in der eine Versionskennung zur Klasse gespeichert wird.
	
	// Sie wird beim Aufruf von writeObject automatisch berechnet 
	// und stellt einen Hashcode �ber die wichtigsten Eigenschaften der Klasse
	// dar. 
	
	// So gehen beispielsweise Name und Signatur der Klasse, implementierte 
	// Interfaces sowie Methoden und Konstruktoren in die Berechnung ein. 
	
	//Selbst triviale �nderungen wie das Umbenennen oder Hinzuf�gen einer 
	// �ffentlichen Methode ver�ndern die serialVersionUID. 
	
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
