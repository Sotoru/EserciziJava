import java.util.Scanner;

public class Rettangolo {
	
	
	public static int areaRettangolo (int base, int altezza) {
		int area = (base * altezza) ;
		return area;
	}
	
	public static int areaQuadrato (int lato) {
		return areaRettangolo(lato, lato);
	}

	public static void main(String[] args) {

		int base, altezza, lato; 
		
		Scanner Tastiera = new Scanner(System.in);
		
		System.out.println("inserisci la base");
		
		base = Tastiera.nextInt();
		
		System.out.println("inserisci l'altezza");

		altezza = Tastiera.nextInt();
		
		System.out.println("L'area del rettangolo è " + areaRettangolo(base, altezza));
		
		System.out.println("inserisci il lato");

		lato = Tastiera.nextInt();
		
		System.out.println("L'area del quadrato è " + areaQuadrato(lato));

	}

}
