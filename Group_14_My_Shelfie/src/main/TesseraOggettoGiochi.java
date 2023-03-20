package main;

public class TesseraOggettoGiochi {
	private int numeroGiochiDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.GIOCHI;
	
	public void riduciNumeroGiochi(int numero) {		
		numeroGiochiDisponibili = numeroGiochiDisponibili - numero;
	}
	
	public int getNumeroGiochiDisponibili() {
		return numeroGiochiDisponibili;
	}
}
