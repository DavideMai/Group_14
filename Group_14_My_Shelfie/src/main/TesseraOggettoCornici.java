package main;

public class TesseraOggettoCornici extends TessereOggetto{
	private int numeroCorniciDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.CORNICI;
	
	public void riduciNumeroCornici(int numero) {		
		numeroCorniciDisponibili = numeroCorniciDisponibili - numero;
	}
	
	public int getNumeroCorniciDisponibili() {
		return numeroCorniciDisponibili;
	}
}
