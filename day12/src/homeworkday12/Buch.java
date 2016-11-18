package homeworkday12;

public class Buch {

	private String Titel;
	private String Autor;
	private String Verlag;
	private int seiten;
	
	//Getter/Setter
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getTitel() {
		return Titel;
	}
	public void setTitel(String titel) {
		Titel = titel;
	}
	
	public String getVerlag() {
		return Verlag;
	}
	public void setVerlag(String verlag) {
		Verlag = verlag;
	}
	public int getSeiten() {
		return seiten;
	}
	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}
	// Konstruktor
	public Buch(String titel, String autor) {
		Titel = titel;
		Autor = autor;
	}
	public Buch(String verlag) {
		Verlag = verlag;
	}
	public Buch(int seiten) {
		this.seiten = seiten;
	}
	
	public Buch() {
		// TODO Auto-generated constructor stub
	}
	public void showObj() {
		System.out.println("titel: " + Titel);
		System.out.println("Autor: " + Autor);
		System.out.println("Verlag: " + Verlag);
		System.out.println("Seitenzahl: " + this.seiten);
	}
	
	
	
}
