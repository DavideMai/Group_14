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

}
