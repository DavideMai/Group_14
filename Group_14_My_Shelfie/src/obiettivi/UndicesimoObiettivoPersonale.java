package obiettivi;

import utils.TesseraOggetto;

public class UndicesimoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public UndicesimoObiettivoPersonale() {
		ObiettivoPersonale[1][1] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[3][1] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[3][2] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][4] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[5][0] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[5][3] = TesseraOggetto.GATTO;

	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[1][1] == TesseraOggetto.TROFEO) {
			contatore++;
		}
		if (tesseraoggetto[3][1] == TesseraOggetto.CORNICE) {
			contatore++;
		}
		if (tesseraoggetto[3][2] == TesseraOggetto.LIBRO) {
			contatore++;
		}
		if (tesseraoggetto[4][4] == TesseraOggetto.PIANTA) {
			contatore++;
		}
		if (tesseraoggetto[5][0] == TesseraOggetto.GIOCO) {
			contatore++;
		}
		if (tesseraoggetto[5][3] == TesseraOggetto.GATTO) {
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
