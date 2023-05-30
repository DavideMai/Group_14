package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class DodicesimoObiettivoComune extends ObiettivoComune {

	public DodicesimoObiettivoComune() {
		super();
		numeroCarta = 12;
		descrizione = "Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in piu'. Le tessere possono essere di qualsiasi tipo";
		// TODO Auto-generated constructor stub
	}

	/**
	 * Controllo dodicesimo obiettivo comune: cerco 5 colonne di altezza crescente o
	 * decrescente. Conto che le tessere totali siano 15 o 20 per far si che
	 * l'ordine abbia senso, quindi da altezza 6 a 2 o da 5 a 1. Ritorna true se
	 * obiettivo verificato.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */

	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {
		int[] nTessereColonna = new int[5]; // 5 elementi per il numero di righe
		int conta = 0;
		nTessereColonna[0] = numeroTessereColonna(libreria, 0); // assegno in posizione 0 il numero di tessere della
																// prima colonna
		nTessereColonna[1] = numeroTessereColonna(libreria, 1); // assegno in posizione 1 il numero di tessere della
																// seconda colonna
		nTessereColonna[2] = numeroTessereColonna(libreria, 2); // assegno in posizione 2 il numero di tessere della
																// terza colonna
		nTessereColonna[3] = numeroTessereColonna(libreria, 3); // assegno in posizione 3 il numero di tessere della
																// quarta colonna
		nTessereColonna[4] = numeroTessereColonna(libreria, 4); // assegno in posizione 4 il numero di tessere della
																// quinta colonna

		for (int n = 0; n < 5; n++) {

			conta = conta + nTessereColonna[n];
		}

		if (conta == 20 || conta == 15) {

			if (nTessereColonna[0] < nTessereColonna[1] && nTessereColonna[1] < nTessereColonna[2]
					&& nTessereColonna[2] < nTessereColonna[3] && nTessereColonna[3] < nTessereColonna[4]) {
				return true; // ordine crescente delle colonne
			} else if (nTessereColonna[0] > nTessereColonna[1] && nTessereColonna[1] > nTessereColonna[2]
					&& nTessereColonna[2] > nTessereColonna[3] && nTessereColonna[3] > nTessereColonna[4]) {
				return true; // ordine decrescente delle colonne
			}
		}
		return false;

	}

	/**
	 * funzione che conta il numero di tessere in una colonna
	 * 
	 * @param libreria: libreria del giocatore
	 * @param colonna:  colonna selezionata
	 * @return ntessere: il numero di tessere di ogni colonna
	 */

	public int numeroTessereColonna(Libreria libreria, int colonna) {
		int nTessere = 0;

		for (int i = 5; i >= 0; i--) {
			if (libreria.getTessera(i, colonna) != TesseraOggetto.VUOTA) {
				nTessere++;
			} else {

				return nTessere;
			}
		}

		return nTessere;
	}
}
