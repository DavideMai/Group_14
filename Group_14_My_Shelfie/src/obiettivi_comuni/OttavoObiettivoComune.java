package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class OttavoObiettivoComune extends ObiettivoComune {

	public OttavoObiettivoComune() {
		super();
		numeroCarta = 8;
		descrizione = "Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righe diverse possono avere combinazioni diverse di tipi di tessere";
	}

	/**
	 * Controllo ottavo obiettivo comune: scorro la libreria cercando 4 righe con 5
	 * tessere di max 3 diversi tipi. ritorna true se il contatore risulta maggiore
	 * o uguale a 4.
	 * 
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */

	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {
		int contatore = 0;
		for (int i = 0; i < 6; i++) {
			int[] nTessere = new int[6];
			boolean controllo = false;
			for (int j = 0; j < 5; j++) {
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
				if (contatore >= 4) {
					return true;
				}
			}
		}
		return false;
	}

}
