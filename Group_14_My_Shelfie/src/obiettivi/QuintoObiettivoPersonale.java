package obiettivi;

import utils.TesseraOggetto;

public class QuintoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public QuintoObiettivoPersonale() {
		ObiettivoPersonale[0][0] = TesseraOggetto.GATTO;
		ObiettivoPersonale[1][3] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[2][1] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[3][0] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[4][4] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[5][2] = TesseraOggetto.LIBRO;
	}
	public int ControllaObiettivoPersonale(TesseraOggetto [][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][0] == TesseraOggetto.GATTO) {
			contatore += 1;
		}
		if (tesseraoggetto[1][3] == TesseraOggetto.CORNICE) {
			contatore += 1;
		}
		if (tesseraoggetto[2][1] == TesseraOggetto.PIANTA) {
			contatore += 1;
		}
		if (tesseraoggetto[3][0] == TesseraOggetto.TROFEO) {
			contatore += 1;
		}
		if (tesseraoggetto[4][4] == TesseraOggetto.GIOCO) {
			contatore += 1;
		}
		if (tesseraoggetto[5][2] == TesseraOggetto.LIBRO) {
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
