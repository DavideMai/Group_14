package obiettivi;

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

}
