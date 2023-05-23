package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class TerzoObiettivoComune extends ObiettivoComune {

	public TerzoObiettivoComune() {
		super();
		numero_carta=3;
		descrizione="Quattro gruppi separati formati ciasuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		// TODO Auto-generated constructor stub
	}

	/**
	 * Controllo terzo obiettivo comune: cerco 4 tessere uguali sulla stessa riga o colonna scorrendo la libreria,
	 * se la trovo, metto le celle VUOTE per non contare due volte. Ritorna vero se il contatore risulta maggiore o uguale a 4
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano 
	 */
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		int contatore=0; 
		Libreria libreria_virtuale;
		libreria_virtuale=libreria;
		for(int i=0; i<6; i++) //scorro le righe
		{
			for(int j=0; j<5; j++) //scorro le colonne
			{
				String tessera=libreria_virtuale.getTessera(i, j).toString();
				if(j+3 < 5 && libreria_virtuale.getTessera(i, j)!=TesseraOggetto.VUOTA && tessera.equals(libreria_virtuale.getTessera(i,j+1).toString()) && tessera.equals(libreria_virtuale.getTessera(i,j+2).toString()) && tessera.equals(libreria_virtuale.getTessera(i,j+3).toString()))
				{
					contatore++;
					libreria_virtuale.setCellaVuota(i, j);
					libreria_virtuale.setCellaVuota(i, j+1);
					libreria_virtuale.setCellaVuota(i, j+2);
					libreria_virtuale.setCellaVuota(i, j+3);
				}
				
				if(i+3 < 6 && libreria_virtuale.getTessera(i, j)!=TesseraOggetto.VUOTA && tessera.equals(libreria_virtuale.getTessera(i+1,j).toString()) && tessera.equals(libreria_virtuale.getTessera(i+2,j).toString()) && tessera.equals(libreria_virtuale.getTessera(i+3,j).toString()))
				{
					contatore++;
					libreria_virtuale.setCellaVuota(i, j);
					libreria_virtuale.setCellaVuota(i+1, j);
					libreria_virtuale.setCellaVuota(i+2, j);
					libreria_virtuale.setCellaVuota(i+3, j);
				}
			}
		}
		
		if(contatore>=4)
		{
			return true;
		}
		
		return false;
	}
}
