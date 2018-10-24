package Ereditarietà;

public class Email extends Documento{

	private String mittente;
	private String destinatario;
	private String titolo;

	public String getMittente() {
		return mittente;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String toString() {
	
		return "Il mittente è" + this.mittente + "il dest è" + this.destinatario +
				"e il titolo è" + this.titolo;
	
	}
	
}
