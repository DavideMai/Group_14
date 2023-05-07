package obiettivi;

import utils.TesseraOggetto;

public class OttavoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public OttavoObiettivoPersonale() {
		ObiettivoPersonale[0][0] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[0][2] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[1][4] = TesseraOggetto.GATTO;
		ObiettivoPersonale[2][3] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[3][1] = TesseraOggetto.GIOCO;
		ObiettivoPersonale[5][2] = TesseraOggetto.TROFEO;
	}

}
