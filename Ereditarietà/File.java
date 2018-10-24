package Ereditarietà;

public class File extends Documento{

	private String nomePercorso;

	public String toString() {
		return "Il nomePercorso è" + this.nomePercorso + "e il testo è" + super.toString();
	}
	
	
}
