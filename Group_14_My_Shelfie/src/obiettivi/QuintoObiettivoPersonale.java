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

}
