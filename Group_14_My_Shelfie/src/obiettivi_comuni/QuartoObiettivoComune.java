package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class QuartoObiettivoComune extends ObiettivoComune {

	public QuartoObiettivoComune() {
		super();
		numeroCarta = 4;
		descrizione = "Due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2- Le tessere dei due gruppi devono essere dello stesso tipo";

	}

	/**
	 * Controllo quarto obiettivo comune: cerco 4 tessere dello stesso tipo 2x2, se
	 * le trovo, metto le tessere VUOTE per evitare di contare due volte. Se il
	 * contatore è maggiore o uguale a 2 allora ritorna vero.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano
	 */
	@Override
	public boolean controlloObiettivoComune(Libreria libreria) {

		int contatore = 0;

		Libreria libreriaVirtuale = new Libreria(libreria);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (libreriaVirtuale.getTessera(i, j) != TesseraOggetto.VUOTA) {
					if (libreriaVirtuale.getTessera(i, j) == libreriaVirtuale.getTessera(i + 1, j)
							&& libreriaVirtuale.getTessera(i, j) == libreriaVirtuale.getTessera(i, j + 1)
							&& libreriaVirtuale.getTessera(i, j) == libreriaVirtuale.getTessera(i + 1, j + 1)) {
						contatore++;
						libreriaVirtuale.setCellaVuota(i, j);
						libreriaVirtuale.setCellaVuota(i + 1, j);
						libreriaVirtuale.setCellaVuota(i + 1, j + 1);
						libreriaVirtuale.setCellaVuota(i, j + 1);

					}
				}

			}
		}

		if (contatore >= 2) {
			return true;
		}

		return false;
	}

}
