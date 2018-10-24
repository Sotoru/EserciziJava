import java.util.Scanner;
import java.util.ArrayList;

public class ListaSpesa {

	public static void main (String[] args) {
		
		ArrayList<String> listaDelleCoseDaFare = new ArrayList<String>();
		
		System.out.println("Inserisci gli elementi per la lista quando richiesto");
		
		boolean fatto = false;
		Scanner tastiera = new Scanner (System.in);
		
		while (!fatto) {
			System.out.println("Inserisci un elemento:");
			String elemento = tastiera.nextLine();
			listaDelleCoseDaFare.add(elemento);
			System.out.println("Vuoi aggiungere altri elementi?");
			String risposta = tastiera.nextLine();
			
			if (!risposta.equalsIgnoreCase("si")) 
				fatto= true;
		}
		
		System.out.println("La lista contiene:");
		
		for (int i=0; i < listaDelleCoseDaFare.size(); i++) {
			System.out.println(listaDelleCoseDaFare.get(i));
		}
		
	}
}
