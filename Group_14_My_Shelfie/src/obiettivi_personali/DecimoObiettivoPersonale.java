package obiettivi_personali;

import utils.TesseraOggetto;

public class DecimoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public DecimoObiettivoPersonale() {
		ObiettivoPersonale[0][2] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[1][1] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[2][2] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[3][3] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[4][4] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[5][0] = TesseraOggetto.GATTO;
	}


	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][2] == TesseraOggetto.LIBRO) {
			contatore++;
		}
		if (tesseraoggetto[1][1] == TesseraOggetto.PIANTA) {
			contatore++;
		}
		if (tesseraoggetto[2][2] == TesseraOggetto.CORNICE) {
			contatore++;
		}
		if (tesseraoggetto[3][3] == TesseraOggetto.TROFEO) {
			contatore++;
		}
		if (tesseraoggetto[4][4] == TesseraOggetto.GIOCO) {
			contatore++;
		}
		if (tesseraoggetto[5][0] == TesseraOggetto.GATTO) {
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
