package homeworkday12;

public class Buch {

	private String Titel;
	private String Autor;
	private String Verlag;
	private int Seiten;
	
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
		return Seiten;
	}
	public void setSeiten(int seiten) {
		this.Seiten = seiten;
	}
	// Konstruktor
	public Buch(String titel, String autor,String verlag,int seiten) {
		this.Titel = titel;
		this.Autor = autor;
		this.Verlag = verlag;
		this.Seiten = seiten;
	}
	
	
	public void showObj() {
		System.out.println("Titel: " + Titel);
		System.out.println("Autor: " + Autor);
		System.out.println("Verlag: " + Verlag);
		System.out.println("Seitenzahl: " + Seiten);
	}
	
	
	
}
