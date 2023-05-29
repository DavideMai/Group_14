package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class NonoObiettivoComune extends ObiettivoComune {

	public NonoObiettivoComune() {
		super();
		numeroCarta = 9;
		descrizione = "Due colonne formate ciascuna da 6 diversi tipi di tessere";

	}

	/**
	 * Controllo nono obiettivo comune: cerco 2 colonne con 6 diversi tipi di
	 * tessere scorrendo la libreria se il numero di ogni tessera per colonna è
	 * uguale a uno allora aumento il contatore. Risulta true se il contatore è
	 * maggiore o uguale a 2
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */

	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {

		int contatore = 0; // contatore per controllare numero max di colonne

		for (int j = 0; j < 5; j++) // scorro le colonne
		{
			int nTessere[] = new int[6]; // salvo il numero di tessere diverse nella stessa colonna

			for (int i = 0; i < 6; i++) // scorro le righe
			{
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

				}
			}
			if (nTessere[0] == 1 && nTessere[1] == 1 && nTessere[2] == 1 && nTessere[3] == 1 && nTessere[4] == 1
					&& nTessere[5] == 1) {

				contatore++;

			}
			if (contatore >= 2) {
				return true;
			}
		}

		return false;
	}
}
