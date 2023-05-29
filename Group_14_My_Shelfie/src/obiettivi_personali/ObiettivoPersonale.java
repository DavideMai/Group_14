package obiettivi_personali;

import utils.TesseraOggetto;

/**
 * Superclasse astratta, così da poter creare diversi obiettivi personali con le
 * classi figlie
 * 
 * @author david
 *
 */
public abstract class ObiettivoPersonale {
	public ObiettivoPersonale() {

	}

	/**
	 * Metodo astratto che permette a ogni sottoclasse di visualizzare l'obiettivo
	 * personale
	 */
	public void visualizzaObiettivoPersonale() {
	}

	/**
	 * metodo stratto che, passata una libreria, controlla quante caselle
	 * dell'obiettivo personale sono state completate
	 * 
	 * @param tesseraoggetto la libreria del giocatore
	 * @return l'aumento del punteggio
	 */
	public abstract int controllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto);

}
