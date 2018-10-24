package ClasseAstratta;

public class Gatto extends Felino{

	public Gatto() {
		super();
	}
	
	public Gatto(String nome) {
		super(nome);
	}
	
	public void parla() {
		System.out.println("Miao");
	}
	
	public void faiLeFusa() {
		System.out.println("Fusa..... ruufff");

	}

	public static void main(String[] args) {
		
		Felino gatto1= new Gatto("ciccio");
		
		
		gatto1.dormi();
		gatto1.parla();
		
		// questa non può essere usata perchè non è definita nelle classi astratte
		// gatto1.faiLeFusa();
		
	}
}

