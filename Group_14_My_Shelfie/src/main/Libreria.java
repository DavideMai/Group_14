package main;

public class Libreria {
	public int riga=6,colonna=5;
	
	CellaLibreria [][] arraylibreria = new CellaLibreria [riga][colonna];
	
	public String Selezione (int riga ,int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		String contenuto = new String();
		contenuto = arraylibreria[riga][colonna].contenuto;
		return contenuto;
	}
}
