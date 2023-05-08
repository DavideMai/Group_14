package obiettivi;

import utils.TesseraOggetto;

public class DodicesimoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public DodicesimoObiettivoPersonale() {
		ObiettivoPersonale[0][4] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[2][0] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[2][2] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[3][3] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[4][1] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][2] = TesseraOggetto.GATTO;
	}

}
