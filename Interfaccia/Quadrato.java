package Interfaccia;

public class Quadrato implements Misurabile{

	private double lato;
	
	public Quadrato(double l) {
		super();
		lato = l;
	}
	
	public double getArea() {
		return lato * lato;
	}
	
	public double getPerimetro() {
		return lato *4;
	}
	
	
	
}
