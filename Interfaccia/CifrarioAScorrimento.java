package Interfaccia;


public class CifrarioAScorrimento implements CodificatoreMessaggio{

	private int chiave;
	private char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};


	
	public CifrarioAScorrimento(int c) {
		
		chiave = c;
	}
	
	
	public CifrarioAScorrimento() {
	
	}

	
	public String codifica(String testoInChiaro) {
		
		  String parolaCifrata = "";

		  
		for(int i = 0; i <testoInChiaro.length(); i++) {
			  char l = testoInChiaro.charAt(i); //salvo il carattere
			  parolaCifrata += spostaCarattere(l);
			  
		}	
		return parolaCifrata;
	}
	
	public char spostaCarattere(char l) {
	
		int pos = 0;
		
			for (int i = 0; i < alfabeto.length; i++) {
				if (alfabeto[i] == l) {
					 pos = i;
					}
			}
		
		char p = alfabeto[chiave + pos];
		
		return p;
	}
	
	
	
	
	
	
	
}

