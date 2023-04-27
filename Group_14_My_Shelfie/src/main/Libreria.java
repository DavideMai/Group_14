package main;

public class Libreria {
	public int riga=6,colonna=5;
	
	CellaLibreria [][] arraylibreria = new CellaLibreria [6][5];
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[6][5];
	public String Selezione (int riga ,int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		String contenuto = new String();
		contenuto = arraylibreria[riga][colonna].contenuto;
		return contenuto;
	}
	//serie di funzioni per rendere la cella della libreria una determinata tessera oggetto
		public void SetCellaTrofeo(int riga, int colonna) {
			tesseraoggetto[riga][colonna] = TesseraOggetto.TROFEO;
		}
		public void SetCellaPianta(int riga, int colonna) {
			tesseraoggetto[riga][colonna] = TesseraOggetto.PIANTA;
		}
		public void SetCellaGatto(int riga, int colonna) {
			tesseraoggetto[riga][colonna] = TesseraOggetto.GATTO;
		}
		public void SetCellaGioco(int riga, int colonna) {
			tesseraoggetto[riga][colonna] = TesseraOggetto.GIOCO;
		}
		public void SetCellaCornice(int riga, int colonna) {
			tesseraoggetto[riga][colonna] = TesseraOggetto.CORNICE;
		}
		public void SetCellaLibro(int riga, int colonna) {
			tesseraoggetto[riga][colonna] = TesseraOggetto.LIBRO;
		}
}
