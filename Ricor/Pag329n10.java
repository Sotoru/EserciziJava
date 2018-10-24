package Ricor;
import java.util.Scanner;


public class Pag329n10 {

	public static int stretteDiMano(int n) {
		
		int s=0;
		
		if (n == 0 || n==1) {
			s= s+0;
		} else {
		
			s = n +(stretteDiMano(n-1)) ;
		} 
				
		
		return s;
	}
	
	public static void main(String[] args) {

		int n;
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il numero di persone");
		n= tastiera.nextInt();
		System.out.println("Saranno possibili "+ stretteDiMano(n)+" strette di mano");
		tastiera.close();
	}

}