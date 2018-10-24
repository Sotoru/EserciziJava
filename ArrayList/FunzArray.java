package ArrayList;

import java.util.ArrayList;

public class FunzArray {

	public static ArrayList<Character> rimuoviDupplicati( ArrayList<Character> dati) {
		
		ArrayList<Character> newList = new ArrayList<Character>();

		for (int i = 0; i < dati.size(); i++) {
		    if (!newList.contains(dati.get(i)))
		        newList.add((dati.get(i)));
		}

		return newList;
	}
	
	
	
	public static ArrayList<String> getStringheComuni(ArrayList<String> l1 ,ArrayList<String> l2) {
		
		ArrayList<String> stringa = new ArrayList<>();
		
		for (int i=0; i< l1.size(); i++) {
			for (int j=0; j< l2.size(); j++)
				if(l1.contains(l2.get(j))) {
					stringa.add(l2.get(j));
				}		
		}	
		
		ArrayList<String> stringaFinale = new ArrayList<>();

		for (int i = 0; i < stringa.size(); i++) {
		    if (!stringaFinale.contains(stringa.get(i)))
		        stringaFinale.add((stringa.get(i)));
		}

		
	
		return stringaFinale;
	}
	
	public static void main (String[] args) {
		ArrayList<Character> a1 = new ArrayList<Character>(); 
		
		char a = 'a';
		char b = 'b';
		char c = 'c';
		char p = 'p';

		
		a1.add(a);
		a1.add(a);
		a1.add(b);
		a1.add(c);
		a1.add(b);
		a1.add(c);
		a1.add(a);
		a1.add(p);

		System.out.println(a1);
		
		System.out.println(rimuoviDupplicati(a1));
		
		ArrayList<String> l1 = new ArrayList<>(); 
		ArrayList<String> l2 = new ArrayList<>(); 
		
		l1.add("Ciao");
		l1.add("Mamma");
		l1.add("Come");
		l1.add("Stai?");
		l2.add("Ciao");
		l2.add("Bene");
		l2.add("Mamma");

		System.out.println(l1);
		System.out.println(l2);

		System.out.println(getStringheComuni(l1,l2));
	}
	
	
	
}
