package Buch_Koc;

public class Buch {
	
	
	private String titel;
	private String autor;
	private String verlag; 
	private int anzahlSeiten;
	
	
	public Buch() {

	
	}
	
	
	public Buch(String titel, String autor, String verlag, int anzahlSeiten) {
		this.titel = titel;
		this.autor = autor;
		this.verlag = verlag;
		this.anzahlSeiten = anzahlSeiten;
	}

public void Info () {
	
	System.out.println("Titel :" + titel);
	System.out.println("Autor :" + autor);
	System.out.println("Verlag :" + verlag);
	System.out.println("AnzahlSeiten : " + anzahlSeiten);

}


	public String getTitel() {
		return titel;
	}


	public void setTitel(String titel) {
		this.titel = titel;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getVerlag() {
		return verlag;
	}


	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}


	public int getAnzahlSeiten() {
		return anzahlSeiten;
	}


	public void setAnzahlSeiten(int anzahlSeiten) {
		this.anzahlSeiten = anzahlSeiten;
	}
	
	

}
