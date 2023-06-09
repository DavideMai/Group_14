package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class QuintoObiettivoComune extends ObiettivoComune {

	public QuintoObiettivoComune() {
		super();
		numeroCarta = 5;
		descrizione = "Tre colonne formate ciascuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";

	}

	/**
	 * Controllo quinto obiettivo comune: scorro la libreria, cercando tre colonne
	 * formate da 6 tessere con max 3 tipi diversi per colonna.
	 *
	 * Se il contatore è maggiore o uguale a 3 ritorna vero
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */

	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {
		int contatore = 0;
		for (int j = 0; j < 5; j++) {
			int[] nTessere = new int[6];
			boolean controllo = false;
			for (int i = 0; i < 6; i++) {
				if (libreria.getTessera(i, j) != TesseraOggetto.VUOTA) {
					if (libreria.getTessera(i, j) == TesseraOggetto.CORNICE) {
						nTessere[0]++;
					} else if (libreria.getTessera(i, j) == TesseraOggetto.GATTO) {
						nTessere[1]++;
					} else if (libreria.getTessera(i, j) == TesseraOggetto.GIOCO) {
						nTessere[2]++;
					} else if (libreria.getTessera(i, j) == TesseraOggetto.LIBRO) {
						nTessere[3]++;
					} else if (libreria.getTessera(i, j) == TesseraOggetto.PIANTA) {
						nTessere[4]++;
					} else if (libreria.getTessera(i, j) == TesseraOggetto.TROFEO) {
						nTessere[5]++;
					}
				} else {
					controllo = true;
					break;
				}

			}
			if (controllo != true) {
				int contatore2 = 0;
				for (int k = 0; k < 6; k++) {
					if (nTessere[k] == 0) {
						contatore2++;
					}
				}
				if (contatore2 >= 3) {
					contatore++;
				}
				if (contatore >= 3) {
					return true;
				}
			}
		}
		return false;
	}

}
