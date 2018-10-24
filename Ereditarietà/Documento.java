package Ereditarietà;

public class Documento {

	private String testo;
	
	public String toString() {
		return testo;
	}
	
	public String setString(String modifica) {
		this.testo = modifica;
		return this.testo;
	}

}
