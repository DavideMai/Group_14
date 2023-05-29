package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class UndicesimoObiettivoComune extends ObiettivoComune {

	public UndicesimoObiettivoComune() {
		super();
		numeroCarta = 11;
		descrizione = "Due righe formate ciascuna da 5 diversi tipi di tessere";

	}

	/**
	 * Controllo undicesimo obiettivo comune: cerco due righe con 5 diversi tipi di
	 * tessere per ognuna Scorro la matrice e se ogni tipo di tessera è uguale a 1,
	 * aumento il contatore. Se il contatore è maggiore o uguale a due risulta true.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */

	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {
		int contatore = 0;

		for (int i = 0; i < 6; i++) // righe
		{
			int[] nTessere = new int[6];

			for (int j = 0; j < 5; j++) // colonne
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
				} else {
					break;
				}

			}

			for (int k = 0; k < 6; k++) {
				if (nTessere[k] == 0) // controllo che una tessera non trovata in precedenza risulti uno per far
										// funzionare l'if sottostante
				{
					nTessere[k]++;
					break;
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
