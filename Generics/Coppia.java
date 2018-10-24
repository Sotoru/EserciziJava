package Generics;

public class Coppia<T> {
	private T primo;
	private T secondo;
	
	public Coppia() {
		primo= null;
		secondo = null;
	}
	
	public Coppia(T primoEl, T secondoEl) {
		primo=primoEl;
		secondo = secondoEl;
	}

	public T getPrimo() {
		return primo;
	}

	public void setPrimo(T primo) {
		this.primo = primo;
	}

	public T getSecondo() {
		return secondo;
	}

	public void setSecondo(T secondo) {
		this.secondo = secondo;
	}
	
	public String toString() {
		return ("il primo è " + primo.toString() + "e il secondo " + secondo.toString());
	}
	
	public boolean equals(Object altroOggetto) {
		
		if (altroOggetto == null) {
			return false;
		} else if (getClass() != altroOggetto.getClass()) {
			
			return false;
		} else {
			
			Coppia<T> altraCoppia= (Coppia<T>) altroOggetto;
			return (primo.equals(altraCoppia.primo) && secondo.equals(altraCoppia.secondo) );
			
			
		}
		
	}
	
}


