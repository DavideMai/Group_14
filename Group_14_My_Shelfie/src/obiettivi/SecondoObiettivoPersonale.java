package obiettivi;

import utils.TesseraOggetto;

public class SecondoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public SecondoObiettivoPersonale() {
		ObiettivoPersonale[0][2] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[1][1] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[2][0] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[3][2] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[4][4] = TesseraOggetto.GATTO;
		ObiettivoPersonale[5][3] = TesseraOggetto.TROFEO;
	}

}
