package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class SecondoObiettivoComune extends ObiettivoComune {

	public SecondoObiettivoComune() {
		super();
		numeroCarta = 2;
		descrizione = "Quattro tessere dello stesso tipo ai quattro angoli della libreria";

	}

	/**
	 * Controllo secondo obiettivo comune: cerca le quattro tessere nei 4 angoli
	 * della libreria e controlla che siano uguali.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */

	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {
		// controllo i 4 angoli della libreria
		if (libreria.getTessera(0, 0) != TesseraOggetto.VUOTA && libreria.getTessera(0, 4) != TesseraOggetto.VUOTA
				&& libreria.getTessera(5, 0) != TesseraOggetto.VUOTA
				&& libreria.getTessera(5, 4) != TesseraOggetto.VUOTA) {
			if (libreria.getTessera(0, 0) == libreria.getTessera(0, 4)
					&& libreria.getTessera(0, 0) == libreria.getTessera(5, 0)
					&& libreria.getTessera(0, 0) == libreria.getTessera(5, 4)) {
				return true;
			}
		}

		return false;
	}

}
