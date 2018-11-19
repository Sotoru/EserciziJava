package Eccezioni;
import java.util.Scanner;

public class ContaPersone {
	String[] persone = new String[0];
	
	ContaPersone(int numeroPersone) {
		persone = new String[numeroPersone];
	}
	
	public int contatore() { 
		return persone.length;
	}
	
	public void aggiungiPersona(String nome) {
		
		for (int i=0; i < persone.length; i++) {	
			if ( persone[i] == "") {
				persone[i] =nome;
			} else {
				i = persone.length;
			}
		}
	}
	
	public String[] rimuoviPersona() {
		String[] nuovoArray = new String [persone.length -1];
		for (int i=0; i <persone.length-1; i++) {
			nuovoArray[i] = persone[i];
		}
		return persone=nuovoArray;
	}
	
	public static void main(String[] args) {
		Scanner Tastiera = new Scanner(System.in);

		try {
			System.out.println("Inserisci il numero delle persone");
			int c = Tastiera.nextInt();
			ContaPersone p1 = new ContaPersone(c);
			try{
				
			p1.aggiungiPersona("Paolo");
			p1.rimuoviPersona();
			p1.rimuoviPersona();
			if(p1.contatore()<0) 
				throw new Exception("Posti negativi");
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Eccezzione chiamata1");
			}
		if(c<0) {
			throw new Exception("Valore errato");
		}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Eccezzione chiamata2");
		}		
	}
}