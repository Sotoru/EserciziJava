package Ricor;

import java.util.Scanner;

public class Fattoriale {

	public static double fat (double n) {
		
		double f = 0;
		
		if (n != 0) {
			
			f= n * fat(n-1) ; 
			
		} else {
			f = 1;
		}
		return f;
	}
	
	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		double n;
		System.out.println("Inserisci il numero");
		n = tastiera.nextInt();
		System.out.println(fat(n));
		tastiera.close();
	}
}
