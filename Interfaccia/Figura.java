package Interfaccia;

public class Figura {

	public static void visualizza(Misurabile figura) {
		double perimetro = figura.getPerimetro();
		double area = figura.getArea();
		System.out.println("Perimetro = " + perimetro +" area = " + area);
	}
	
	public static void main(String[] args) {

		Misurabile scatola = new Quadrato(5.0);
		Misurabile disco = new Cerchio(5.0);
		
		visualizza(scatola);
		visualizza(disco);
	}

}
