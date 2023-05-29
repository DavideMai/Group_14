package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class TerzoObiettivoComune extends ObiettivoComune {

	public TerzoObiettivoComune() {
		super();
		numeroCarta = 3;
		descrizione = "Quattro gruppi separati formati ciasuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";

	}

	/**
	 * Controllo terzo obiettivo comune: cerco 4 tessere uguali sulla stessa riga o
	 * colonna scorrendo la libreria, se la trovo, metto le celle VUOTE per non
	 * contare due volte. Ritorna vero se il contatore risulta maggiore o uguale a 4
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */
	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {

		int contatore = 0;
		Libreria libreriaVirtuale = new Libreria(libreria);
		for (int i = 0; i < 6; i++) // scorro le righe
		{
			for (int j = 0; j < 5; j++) // scorro le colonne
			{
				String tessera = libreriaVirtuale.getTessera(i, j).toString();
				if (j + 3 < 5 && libreriaVirtuale.getTessera(i, j) != TesseraOggetto.VUOTA
						&& tessera.equals(libreriaVirtuale.getTessera(i, j + 1).toString())
						&& tessera.equals(libreriaVirtuale.getTessera(i, j + 2).toString())
						&& tessera.equals(libreriaVirtuale.getTessera(i, j + 3).toString())) {
					contatore++;
					libreriaVirtuale.setCellaVuota(i, j);
					libreriaVirtuale.setCellaVuota(i, j + 1);
					libreriaVirtuale.setCellaVuota(i, j + 2);
					libreriaVirtuale.setCellaVuota(i, j + 3);
				}

				if (i + 3 < 6 && libreriaVirtuale.getTessera(i, j) != TesseraOggetto.VUOTA
						&& tessera.equals(libreriaVirtuale.getTessera(i + 1, j).toString())
						&& tessera.equals(libreriaVirtuale.getTessera(i + 2, j).toString())
						&& tessera.equals(libreriaVirtuale.getTessera(i + 3, j).toString())) {
					contatore++;
					libreriaVirtuale.setCellaVuota(i, j);
					libreriaVirtuale.setCellaVuota(i + 1, j);
					libreriaVirtuale.setCellaVuota(i + 2, j);
					libreriaVirtuale.setCellaVuota(i + 3, j);
				}
			}
		}

		if (contatore >= 4) {
			return true;
		}

		return false;
	}
}
