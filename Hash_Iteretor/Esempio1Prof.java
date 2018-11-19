package Hash_Iteretor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
public class Esempio1Prof {

	public static void main(String[] args) {
	
	Set<String> set = new HashSet<String>();
	
	set.add("Citta 1");
	set.add("Citta 2");
	set.add("Citta 3");
	set.add("Citta 4");
	set.add("Citta 5");
	set.add("Citta 3");
	
	System.out.println(set);

	Iterator<String> iterator = set.iterator();
	
	while (iterator.hasNext()) {
		System.out.println(iterator.next().toUpperCase() + " ");
	}
	
	System.out.println("");
		
		Set<String> lset = new LinkedHashSet<String>();
		
		lset.add("Citta 1");
		lset.add("Citta 2");
		lset.add("Citta 3");
		lset.add("Citta 4");
		lset.add("Citta 5");
		lset.add("Citta 3");
		
		System.out.println(lset);

		Iterator<String> iterator2 = set.iterator();
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next().toUpperCase() + " ");
		}
	
	}	
}
