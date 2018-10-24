package ClasseAstratta;

public abstract class Felino extends Animali {

	public Felino() {
		super();
	}
	
	public Felino(String nome) {
		super(nome);
	}
	
	public void dormi() {
		System.out.println("sto dormendo... roof...");
	}
}
