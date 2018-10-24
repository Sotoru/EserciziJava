package Ereditarietà;

public class Driver {
	
	public static boolean contieneParolaChiave(Documento oggettoDoc, String ParolaChiave) {
		
		if(oggettoDoc.toString().indexOf(ParolaChiave, 0) >= 0) 
			return true;
		
		return false;
		
	}

	public static void main(String[] args) {

		Email email1 = new Email();
		File file1 = new File();
		String prova ="Ciao";
		email1.setMittente("Prova");
		email1.setDestinatario("Ciao");
		
		System.out.println(contieneParolaChiave(email1, prova));
		
	}

}
