import java.util.Scanner;


public class PrimoProgramma {
	
	enum Punteggio {A, B, C} 

	
	public static void main(String[] args) { 
		
		Scanner Tastiera = new Scanner(System.in);

		String s1, s2;

		
		System.out.println("Ciao");
		System.out.println("Inserisci la  stringhe:");
		
		s1 = Tastiera.nextLine();
		s2 = Tastiera.nextLine();

		//metodo alternativo per scrivere if - else 
	String s3 = (s1.equals(s2)) ? s1 : s2;
	
	if (s1.equals(s2)) {
		System.out.println("Le stringhe sono uguali");
		System.exit(0);
		
	} else {
		System.out.println("No non sono uguali");
	}
	
	if (s1.equalsIgnoreCase(s2)) {
		System.out.println("Le stringhe sono uguali senza considerare il maiusc");
	} else {
		System.out.println("Le stringhe non sono uguali anche con il maiusc");
	}
	
	System.out.println(s3);
	
	String s1Up = s1.toUpperCase();
	String s2Up = s2.toUpperCase();
	
	if (s1Up.compareTo(s2Up) < 0) {
		System.out.println(s1 + " Segue in ordine alfabetico " + s2);

	} else {
		System.out.println(s2 + "Segue in ordine alfabetico" + s1);
	}
}

}

