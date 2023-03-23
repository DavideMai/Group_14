package main;

public class TesseraOggettoGatti extends TessereOggetto{
	private int numeroGattiDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.GATTI;
	
	public void riduciNumeroGatti(int numero) {		
		numeroGattiDisponibili = numeroGattiDisponibili - numero;
	}
	
	public int getNumeroGattiDisponibili() {
		return numeroGattiDisponibili;
	}
}
