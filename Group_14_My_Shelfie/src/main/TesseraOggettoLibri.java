package main;

public class TesseraOggettoLibri {
	private int numeroLibriDisponibili = 22;
	TipologieTessereOggetto tipologia = TipologieTessereOggetto.LIBRI;
	
	public void riduciNumeroLibri(int numero) {		
		numeroLibriDisponibili = numeroLibriDisponibili - numero;
	}
	
	public int getNumeroLibriDisponibili() {
		return numeroLibriDisponibili;
	}
}