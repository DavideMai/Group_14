package obiettivi;

import utils.TesseraOggetto;

public class TerzoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public TerzoObiettivoPersonale() {
		ObiettivoPersonale[0][4] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[1][2] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[2][0] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[3][3] = TesseraOggetto.GATTO;
		ObiettivoPersonale[4][1] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[5][3] = TesseraOggetto.PIANTA;
	}

}
