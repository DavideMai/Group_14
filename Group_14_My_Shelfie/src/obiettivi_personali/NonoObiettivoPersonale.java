package obiettivi_personali;

import utils.TesseraOggetto;

public class NonoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public NonoObiettivoPersonale() {
		ObiettivoPersonale[0][4] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[1][1] = TesseraOggetto.GATTO;
		ObiettivoPersonale[2][2] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[3][0] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[4][3] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[5][3] = TesseraOggetto.GIOCO;
	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][4] == TesseraOggetto.CORNICE) {
			contatore++;
		}
		if (tesseraoggetto[1][1] == TesseraOggetto.GATTO) {
			contatore++;
		}
		if (tesseraoggetto[2][2] == TesseraOggetto.TROFEO) {
			contatore++;
		}
		if (tesseraoggetto[3][0] == TesseraOggetto.PIANTA) {
			contatore++;
		}
		if (tesseraoggetto[4][3] == TesseraOggetto.LIBRO) {
			contatore++;
		}
		if (tesseraoggetto[5][3] == TesseraOggetto.GIOCO) {
			contatore++;
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
