package obiettivi_personali;

import utils.TesseraOggetto;

public class SestoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public SestoObiettivoPersonale() {
		ObiettivoPersonale[0][2] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[0][4] = TesseraOggetto.GATTO;
		ObiettivoPersonale[2][3] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][1] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[4][3] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[5][0] = TesseraOggetto.PIANTA;
	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][2] == TesseraOggetto.TROFEO) {
			contatore++;
		}
		if (tesseraoggetto[0][4] == TesseraOggetto.GATTO) {
			contatore++;
		}
		if (tesseraoggetto[2][3] == TesseraOggetto.LIBRO) {
			contatore++;
		}
		if (tesseraoggetto[4][1] == TesseraOggetto.GIOCO) {
			contatore++;
		}
		if (tesseraoggetto[4][3] == TesseraOggetto.GIOCO) {
			contatore++;
		}
		if (tesseraoggetto[5][0] == TesseraOggetto.PIANTA) {
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
