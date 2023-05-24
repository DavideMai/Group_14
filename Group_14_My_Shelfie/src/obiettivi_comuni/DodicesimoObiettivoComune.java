package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class DodicesimoObiettivoComune extends ObiettivoComune {

	public DodicesimoObiettivoComune() {
		super();
		numero_carta = 12;
		descrizione = "Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
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
	public boolean ControlloObiettivoComune(Libreria libreria) {
		int[] ntessere_colonna = new int[5]; // 5 elementi per il numero di righe
		int conta = 0;
		ntessere_colonna[0] = NumeroTessereColonna(libreria, 0); // assegno in posizione 0 il numero di tessere della
																	// prima colonna
		ntessere_colonna[1] = NumeroTessereColonna(libreria, 1); // assegno in posizione 1 il numero di tessere della
																	// seconda colonna
		ntessere_colonna[2] = NumeroTessereColonna(libreria, 2); // assegno in posizione 2 il numero di tessere della
																	// terza colonna
		ntessere_colonna[3] = NumeroTessereColonna(libreria, 3); // assegno in posizione 3 il numero di tessere della
																	// quarta colonna
		ntessere_colonna[4] = NumeroTessereColonna(libreria, 4); // assegno in posizione 4 il numero di tessere della
																	// quinta colonna

		/*
		 * System.out.println("Colonna 0 "+ntessere_colonna[0]);
		 * System.out.println("Colonna 1 "+ntessere_colonna[1]);
		 * System.out.println("Colonna 2 "+ntessere_colonna[2]);
		 * System.out.println("Colonna 3 "+ntessere_colonna[3]);
		 * System.out.println("Colonna 4 "+ntessere_colonna[4]);
		 */

		for (int n = 0; n < 5; n++) {

			conta = conta + ntessere_colonna[n];
		}

		// System.out.println("conta: "+conta);

		if (conta == 20 || conta == 15) {

			if (ntessere_colonna[0] < ntessere_colonna[1] && ntessere_colonna[1] < ntessere_colonna[2]
					&& ntessere_colonna[2] < ntessere_colonna[3] && ntessere_colonna[3] < ntessere_colonna[4]) {
				return true; // ordine crescente delle colonne
			} else if (ntessere_colonna[0] > ntessere_colonna[1] && ntessere_colonna[1] > ntessere_colonna[2]
					&& ntessere_colonna[2] > ntessere_colonna[3] && ntessere_colonna[3] > ntessere_colonna[4]) {
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

	public int NumeroTessereColonna(Libreria libreria, int colonna) {
		int ntessere = 0;

		for (int i = 5; i >= 0; i--) {
			if (libreria.getTessera(i, colonna) != TesseraOggetto.VUOTA) {
				ntessere++;
			} else {

				return ntessere;
			}
		}

		return ntessere;
	}
}
