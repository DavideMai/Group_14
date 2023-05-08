package obiettivi;

import utils.TesseraOggetto;

public class SettimoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public SettimoObiettivoPersonale() {
		ObiettivoPersonale[1][1] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[2][0] = TesseraOggetto.GATTO;
		ObiettivoPersonale[2][2] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[3][4] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][3] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[5][4] = TesseraOggetto.CORNICE;
	}

}
