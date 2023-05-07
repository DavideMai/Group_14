package obiettivi;

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

}
