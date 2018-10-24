package Generics;
import java.util.Scanner;

public class CoppiaGenerica {

	public static void main(String[] args) {

		Coppia<String> coppiaSegreta = new Coppia<String>("ciao","mamma");
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserire due parole:");
		String p1 = tastiera.nextLine();
		String p2 = tastiera.nextLine();
		
		Coppia<String> nuovaCoppia = new Coppia<String> (p1, p2);
	
		if (nuovaCoppia.equals(coppiaSegreta)) {
			System.out.println("Bravo");

		} else {
			System.out.println("Hai sbagliato");
			System.out.println("Le parole sono \n" + coppiaSegreta.getPrimo() + "\n" + coppiaSegreta.getSecondo());

		}
		tastiera.close();
	}
	

}
