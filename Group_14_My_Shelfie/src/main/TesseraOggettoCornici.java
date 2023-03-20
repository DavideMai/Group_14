package main;

public class TesseraOggettoCornici {
	private int numeroCorniciDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.CORNICI;
	
	public void riduciNumeroCornici(int numero) {		
		numeroCorniciDisponibili = numeroCorniciDisponibili - numero;
	}
	
	public int getNumeroCorniciDisponibili() {
		return numeroCorniciDisponibili;
	}
}
