package Ricor;

import java.util.Scanner;


public class DaCifraALettera {

	public static String NumeriPic(int numero) {
		
		String ret = null;
		switch(numero) {
		case 0: ret= "Zero"; break;
		case 1: ret= "Uno"; break;
		case 2: ret= "Due"; break;
		case 3: ret= "Tre"; break;
		case 4: ret= "Quattro"; break;
		case 5: ret= "Cinque"; break;
		case 6: ret= "Sei"; break;
		case 7: ret= "Sette"; break;
		case 8: ret= "Otto"; break;
		case 9: ret= "Nove"; break;
		}
		return ret;
	}
	
	
	public static void scriviAParole(int numero) {
		if (numero <10) {
			System.out.print(NumeriPic(numero) +" ");
		} else {
			scriviAParole((numero / 10));
			System.out.print(NumeriPic(numero % 10) +" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi il numero");
		int numero = tastiera.nextInt();
		System.out.println("Numero a parole");
		scriviAParole(numero);
		System.out.println();
		System.out.println("Ecco il numero aumentato di 10");
		System.out.println(numero +10);
		scriviAParole(numero+10);
		tastiera.close();
	}

}