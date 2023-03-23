package main;

public class TesseraOggettoTrofei extends TessereOggetto {
	private int numeroTrofeiDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.TROFEI;
	
	public void riduciNumeroTrofei(int numero) {		
		numeroTrofeiDisponibili = numeroTrofeiDisponibili - numero;
	}
	
	public int getNumeroTrofeiDisponibili() {
		return numeroTrofeiDisponibili;
	}
}
