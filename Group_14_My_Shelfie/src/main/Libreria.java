package main;

public class Libreria {
	public int riga=6,colonna=5;
	
	Cellalibreria [][] arraylibreria = new Cellalibreria [riga][colonna];
	
	public Cellalibreria Selezione (int riga ,int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		
		return arraylibreria[riga][colonna].contenuto [riga][colonna];
	}
}
