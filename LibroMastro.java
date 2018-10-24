


import java.util.Scanner;



public class LibroMastro {	
	
		private  int venditeEffettutate;
		private  int venditeMax;
		private  double[] vendite;
		
		LibroMastro(int venditeMassime) {
			this.venditeMax = venditeMassime;
			this.vendite = new double[venditeMax];
			this.venditeEffettutate = 0;
		}
	

		public  void aggiungiVendita(double d) {
			
			if (this.venditeEffettutate < this.venditeMax) {
				
				this.vendite[venditeEffettutate] = d;
				
				this.venditeEffettutate++;
				
			} else {
				System.out.println("Vendite massime");
			}
		}
		
		public int getNumeroVendite() {
			return this.venditeEffettutate;
		}
		
		public double getTotaleVendite() {
			
			double somma = 0;
			for (int i=0; i<this.vendite.length; i++) {
				somma += this.vendite[i];
			}
			return somma;
		}
		
		public  void StampaVendite() {
			
			for (int i=0; i<this.vendite.length; i++) {
				System.out.println(this.vendite[i]);
			}
		}
		
		public double getMedia() {
			double somma = 0;
			for (int i=0; i<this.vendite.length; i++) {
				somma += this.vendite[i];
			}
			return somma / (vendite.length);
		}
		
		public void getVenditeAlDiSopra(double v) {
			for (int i=0; i<this.vendite.length; i++) {
				if(v < vendite[i]) 
					System.out.println(vendite[i]);
			}
		}
		
		
		public static void main(String[] args) {
			
			LibroMastro prova1 = new LibroMastro(3);
			Scanner tastiera = new Scanner(System.in);
				double d;	
				
				do{
					
				System.out.println("Aggiungi vendita:");
				d =tastiera.nextDouble();
				prova1.aggiungiVendita(d);
				
				}
				while (prova1.getNumeroVendite() < 3);
				
				prova1.StampaVendite();
				
				System.out.println("Totale Vendite!");

				System.out.println(prova1.getTotaleVendite());
				System.out.println("Media!");

				System.out.println(prova1.getMedia());
				double v;
				
				System.out.println("dimmi una soglia");

				v =tastiera.nextDouble();

				System.out.println("Vendite al di sopra sono");
				prova1.getVenditeAlDiSopra(v);


				tastiera.close();
				System.exit(0);
		}
		
}
