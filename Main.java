import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

	Scanner tastiera = new Scanner(System.in);
	
		
	int metri, kilogrammi, centimetri;

	
	System.out.println("inserisci il peso");
	kilogrammi = tastiera.nextInt();

	System.out.println("inserisci l'altezza(metri)");
	metri = tastiera.nextInt();
	
	System.out.println("Inserisci i centimetri ");
	centimetri = tastiera.nextInt();
	
	double altezza = metri + centimetri * 0.01;
	double imc = kilogrammi / (altezza * altezza) ;
	
	tastiera.close();
	
	
	System.out.println(imc);
		if (imc<18.5 ) {
			System.out.println("Peso normale");
		} if (imc <25 ) {
			System.out.println("Sovrappeso");
		} else {
			System.out.println("Obeso");
		}
	}

}
