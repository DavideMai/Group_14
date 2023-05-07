package obiettivi;

import utils.TesseraOggetto;

public class PrimoObiettivoPersonale extends ObiettivoPersonale {

	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public PrimoObiettivoPersonale() {
		ObiettivoPersonale[0][2] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[2][2] = TesseraOggetto.GATTO;
		ObiettivoPersonale[3][4] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[4][1] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[4][4] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[5][0] = TesseraOggetto.CORNICE;
	}

}
