package obiettivi;

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

}
