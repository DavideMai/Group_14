package obiettivi;

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

}
