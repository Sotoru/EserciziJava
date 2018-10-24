import java.util.Scanner;



public class Censura {
	
	public static String censura(String frase,String... indesiderate) {
		for(int i=0;  i <indesiderate.length; i++)
			frase = cancellaStringa(frase,indesiderate[i]);
		return frase;
		
	}

	public static String cancellaStringa(String frase, String stringa) {
		String finale;
		int posizione = frase.indexOf(stringa);
		while (posizione >= 0) {
			finale = frase.substring(posizione + stringa.length());
			frase = frase.substring(0, posizione) + finale;
			posizione = frase.indexOf(stringa);
		}
		return frase;
	}
	
	public static void main(String[] args) {
		System.out.println("Cosa hai mangiato per cena?");
		Scanner Tastiera = new Scanner(System.in);
		String frase = Tastiera.nextLine();
		 frase = censura(frase, "scalera" , "patatine fritte", "salato", "birra");
		frase = censura(frase, ",");
		System.out.println("Saresti più sano se avessi risposto:");
		System.out.println(frase);
		Tastiera.close();
		System.exit(0);
	}

}
