package obiettivi_personali;

import utils.TesseraOggetto;

public class DodicesimoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public DodicesimoObiettivoPersonale() {
		ObiettivoPersonale[0][4] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[2][0] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[2][2] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[3][3] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[4][1] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][2] = TesseraOggetto.GATTO;
	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][4] == TesseraOggetto.GIOCO) {
			contatore += 1;
		}
		if (tesseraoggetto[2][0] == TesseraOggetto.TROFEO) {
			contatore += 1;
		}
		if (tesseraoggetto[2][2] == TesseraOggetto.CORNICE) {
			contatore += 1;
		}
		if (tesseraoggetto[3][3] == TesseraOggetto.PIANTA) {
			contatore += 1;
		}
		if (tesseraoggetto[4][1] == TesseraOggetto.LIBRO) {
			contatore += 1;
		}
		if (tesseraoggetto[4][2] == TesseraOggetto.GATTO) {
			contatore += 1;
		}
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
