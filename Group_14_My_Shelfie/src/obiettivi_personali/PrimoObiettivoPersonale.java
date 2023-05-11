package obiettivi_personali;

import utils.TesseraOggetto;

public class PrimoObiettivoPersonale extends ObiettivoPersonale {

	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public PrimoObiettivoPersonale() {
		ObiettivoPersonale[0][2] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[2][2] = TesseraOggetto.GATTO;
		ObiettivoPersonale[3][4] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][1] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[4][4] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[5][0] = TesseraOggetto.CORNICE;
	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) { // funzione che controlla la libreria
																				// con la carta obiettivo personale

		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][2] == TesseraOggetto.GIOCO) {
			contatore += 1;
		}
		if (tesseraoggetto[2][2] == TesseraOggetto.GATTO) {
			contatore += 1;
		}
		if (tesseraoggetto[3][4] == TesseraOggetto.LIBRO) {
			contatore += 1;
		}
		if (tesseraoggetto[4][1] == TesseraOggetto.TROFEO) {
			contatore += 1;
		}
		if (tesseraoggetto[4][4] == TesseraOggetto.PIANTA) {
			contatore += 1;
		}
		if (tesseraoggetto[5][0] == TesseraOggetto.CORNICE) {
			contatore += 1;
		}

		// switch per assegnare i punteggi a seconda delle carte nelle posizioni
		// corrette
		switch (contatore) {
		case 1:
			punteggio = 1;
			break;
		case 2:
			punteggio = 2;
			break;
		case 3:
			punteggio = 4;
			break;
		case 4:
			punteggio = 6;
			break;
		case 5:
			punteggio = 9;
			break;
		case 6:
			punteggio = 12;
			break;
		}

		return punteggio;
	}
}
