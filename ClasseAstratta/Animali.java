package ClasseAstratta;

public abstract class Animali {

	private String nome;
	
	public Animali() {
		this("Nessun nome");
	}
	
	public Animali(String nome) {
		this.nome= nome;
	}
	
	public abstract void parla();
	public abstract void dormi();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nuovoNome) {
		nome = nuovoNome;
	}
}
