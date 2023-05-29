package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class PrimoObiettivoComune extends ObiettivoComune {

	public PrimoObiettivoComune() {
		super();
		numeroCarta = 1;
		descrizione = "Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";

	}

	/**
	 * Controllo primo obiettivo comune: cerca che le tessere inserite siano dello
	 * stesso tipo di quelle a destra o sopra, se verificato le metto nulle nella
	 * libreria_virtuale per evitare di contare le coppie due volte. Controlla che
	 * il contatore sia maggiore o uguale a 6.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */
	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {

		Libreria libreriaVirtuale = new Libreria(libreria); // libreria d'appoggio
		int contatore = 0;

		// ciclo controllo riga 5 e sopra
		for (int j = 0; j < 4; j++) {
			if (libreriaVirtuale.getTessera(5, j) != TesseraOggetto.VUOTA) {
				if (libreriaVirtuale.getTessera(5, j) == libreriaVirtuale.getTessera(5, j + 1)) {
					libreriaVirtuale.setCellaVuota(5, j);
					libreriaVirtuale.setCellaVuota(5, j + 1);
					contatore++;

				} else if (libreriaVirtuale.getTessera(5, j) == libreriaVirtuale.getTessera(4, j)) {
					libreriaVirtuale.setCellaVuota(5, j);
					libreriaVirtuale.setCellaVuota(4, j);
					contatore++;

				}
			}
		}
		// controllo riga 4 e sopra
		for (int j = 0; j < 4; j++) {
			if (libreriaVirtuale.getTessera(4, j) != TesseraOggetto.VUOTA) {
				if (libreriaVirtuale.getTessera(4, j) == libreriaVirtuale.getTessera(4, j + 1)) {
					libreriaVirtuale.setCellaVuota(4, j);
					libreriaVirtuale.setCellaVuota(4, j + 1);
					contatore++;

				} else if (libreriaVirtuale.getTessera(4, j) == libreriaVirtuale.getTessera(3, j)) {
					libreriaVirtuale.setCellaVuota(4, j);
					libreriaVirtuale.setCellaVuota(3, j);
					contatore++;

				}
			}
		}

		// controllo riga 3 e sopra
		for (int j = 0; j < 4; j++) {
			if (libreriaVirtuale.getTessera(3, j) != TesseraOggetto.VUOTA) {
				if (libreriaVirtuale.getTessera(3, j) == libreriaVirtuale.getTessera(3, j + 1)) {
					libreriaVirtuale.setCellaVuota(3, j);
					libreriaVirtuale.setCellaVuota(3, j + 1);
					contatore++;

				} else if (libreriaVirtuale.getTessera(3, j) == libreriaVirtuale.getTessera(2, j)) {
					libreriaVirtuale.setCellaVuota(3, j);
					libreriaVirtuale.setCellaVuota(2, j);
					contatore++;

				}
			}
		}

		// controllo riga 2 e sopra
		for (int j = 0; j < 4; j++) {
			if (libreriaVirtuale.getTessera(2, j) != TesseraOggetto.VUOTA) {
				if (libreriaVirtuale.getTessera(2, j) == libreriaVirtuale.getTessera(4, j + 1)) {
					libreriaVirtuale.setCellaVuota(2, j);
					libreriaVirtuale.setCellaVuota(2, j + 1);

					contatore++;

				} else if (libreriaVirtuale.getTessera(2, j) == libreriaVirtuale.getTessera(1, j)) {
					libreriaVirtuale.setCellaVuota(2, j);
					libreriaVirtuale.setCellaVuota(1, j);
					contatore++;

				}
			}
		}

		// controllo riga 1 e sopra
		for (int j = 0; j < 4; j++) {
			if (libreriaVirtuale.getTessera(1, j) != TesseraOggetto.VUOTA) {
				if (libreriaVirtuale.getTessera(1, j) == libreriaVirtuale.getTessera(1, j + 1)) {
					libreriaVirtuale.setCellaVuota(1, j);
					libreriaVirtuale.setCellaVuota(1, j + 1);

					contatore++;

				} else if (libreriaVirtuale.getTessera(1, j) == libreriaVirtuale.getTessera(0, j)) {
					libreriaVirtuale.setCellaVuota(1, j);
					libreriaVirtuale.setCellaVuota(0, j);
					contatore++;

				}
			}
		}

		// controllo ultima colonna
		if (libreriaVirtuale.getTessera(5, 4) != TesseraOggetto.VUOTA
				&& libreriaVirtuale.getTessera(4, 4) != TesseraOggetto.VUOTA) {
			if (libreriaVirtuale.getTessera(5, 4) == libreriaVirtuale.getTessera(4, 4)) {
				contatore++;

				libreriaVirtuale.setCellaVuota(5, 4);
				libreriaVirtuale.setCellaVuota(4, 4);
			}
		}

		if (libreriaVirtuale.getTessera(4, 4) != TesseraOggetto.VUOTA
				&& libreriaVirtuale.getTessera(3, 4) != TesseraOggetto.VUOTA) {
			if (libreriaVirtuale.getTessera(4, 4) == libreriaVirtuale.getTessera(3, 4)) {
				contatore++;

				libreriaVirtuale.setCellaVuota(4, 4);
				libreriaVirtuale.setCellaVuota(3, 4);
			}
		}

		if (libreriaVirtuale.getTessera(3, 4) != TesseraOggetto.VUOTA
				&& libreriaVirtuale.getTessera(2, 4) != TesseraOggetto.VUOTA) {
			if (libreriaVirtuale.getTessera(3, 4) == libreriaVirtuale.getTessera(2, 4)) {
				contatore++;

				libreriaVirtuale.setCellaVuota(3, 4);
				libreriaVirtuale.setCellaVuota(2, 4);
			}
		}

		if (libreriaVirtuale.getTessera(2, 4) != TesseraOggetto.VUOTA
				&& libreriaVirtuale.getTessera(1, 4) != TesseraOggetto.VUOTA) {
			if (libreriaVirtuale.getTessera(2, 4) == libreriaVirtuale.getTessera(1, 4)) {
				contatore++;

				libreriaVirtuale.setCellaVuota(2, 4);
				libreriaVirtuale.setCellaVuota(1, 4);
			}
		}

		if (libreriaVirtuale.getTessera(1, 4) != TesseraOggetto.VUOTA
				&& libreriaVirtuale.getTessera(0, 4) != TesseraOggetto.VUOTA) {
			if (libreriaVirtuale.getTessera(1, 4) == libreriaVirtuale.getTessera(0, 4)) {
				contatore++;

				libreriaVirtuale.setCellaVuota(1, 4);
				libreriaVirtuale.setCellaVuota(0, 4);
			}
		}

		// controllo se contatore ha trovato 6 coppie di tessere uguali
		if (contatore >= 6) {
			return true;
		}

		return false;
	}
}