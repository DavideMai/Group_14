package main;

public class TesseraOggettoPiante extends TessereOggetto{
	private int numeroPianteDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.PIANTE;
	
	public void riduciNumeroPiante(int numero) {		
		numeroPianteDisponibili = numeroPianteDisponibili - numero;
	}
	
	public int getNumeroPianteDisponibili() {
		return numeroPianteDisponibili;
	}
}
