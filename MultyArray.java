/*
	i valori che superano la soglia dopo la f cercafigura diventano 1.0 in caso contrario 0.0
	
*/

import java.text.DecimalFormat;


public class MultyArray {
	
	public static void popolaArray(double figura[][]) {
		
		 for (int i = 0; i < figura.length; i++) 
	     {
	        for (int j = 0; j < figura.length; j++) 
	        {
	          figura[i][j] = ((double)Math.random() * 8) +1;
	        }
	     }
		
	}
	
	public static double[][] cercaFigura(double[][] figura, double soglia) {
		double[][] array = figura;
		
		for (int i =0; i < figura.length; i++) {
			for (int j = 0; j < figura.length; j++) {
				if (figura[i][j] < soglia ) {
					
					figura[i][j] = 0.0;
					array[i][j] = figura[i][j];
					
				} else {
					figura[i][j] = 1.0;
					array[i][j] = figura[i][j];
				}		
			}
		}
		return array;
	
	}
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	
	public static void stampaArray(double[][] figura) {
		for (int i=0; i<figura.length; i++) {
			for(int j=0; j<figura.length; j++) {
				System.out.print(df2.format(figura[i][j]) +" " );
			}
			System.out.println();
		}
		
		}
	
	public static double calcolaSoglia(double figura[][]) {
		
		double soglia = 0.0;	
	
		for (int i =0; i < figura.length; i++) {
			for (int j = 0; j < figura.length; j++) {
				soglia += figura[i][j];	
			}
	}
		return soglia / Math.pow(figura.length, 2) ;
	}		

	public static void main(String[] args) {
			
		double[][] figura = new double [4][4];
		
		
		popolaArray(figura);
		System.out.println("Primo array");
		System.out.println("");
		stampaArray(figura);
		System.out.println("");
		System.out.println("Secondo array");
		stampaArray(cercaFigura(figura,calcolaSoglia(figura)));

		
		
	}

}
