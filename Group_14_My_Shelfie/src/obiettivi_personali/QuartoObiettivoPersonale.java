package obiettivi_personali;

import utils.TesseraOggetto;

public class QuartoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public QuartoObiettivoPersonale() {
		ObiettivoPersonale[1][0] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[1][3] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[2][2] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[3][1] = TesseraOggetto.GATTO;
		ObiettivoPersonale[3][4] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[5][0] = TesseraOggetto.LIBRO;
	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[1][0] == TesseraOggetto.CORNICE) {
			contatore += 1;
		}
		if (tesseraoggetto[1][3] == TesseraOggetto.GIOCO) {
			contatore += 1;
		}
		if (tesseraoggetto[2][2] == TesseraOggetto.PIANTA) {
			contatore += 1;
		}
		if (tesseraoggetto[3][1] == TesseraOggetto.GATTO) {
			contatore += 1;
		}
		if (tesseraoggetto[3][4] == TesseraOggetto.TROFEO) {
			contatore += 1;
		}
		if (tesseraoggetto[5][0] == TesseraOggetto.LIBRO) {
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
