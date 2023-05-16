package obiettivi_personali;

import utils.TesseraOggetto;

public class NonoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] ObiettivoPersonale = new TesseraOggetto[6][5];

	public NonoObiettivoPersonale() {
		ObiettivoPersonale[0][4] = TesseraOggetto.CORNICE;
		ObiettivoPersonale[1][1] = TesseraOggetto.GATTO;
		ObiettivoPersonale[2][2] = TesseraOggetto.TROFEO;
		ObiettivoPersonale[3][0] = TesseraOggetto.PIANTA;
		ObiettivoPersonale[4][3] = TesseraOggetto.LIBRO;
		ObiettivoPersonale[5][3] = TesseraOggetto.GIOCO;
	}

	public int ControllaObiettivoPersonale(TesseraOggetto[][] tesseraoggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraoggetto[0][4] == TesseraOggetto.CORNICE) {
			contatore++;
		}
		if (tesseraoggetto[1][1] == TesseraOggetto.GATTO) {
			contatore++;
		}
		if (tesseraoggetto[2][2] == TesseraOggetto.TROFEO) {
			contatore++;
		}
		if (tesseraoggetto[3][0] == TesseraOggetto.PIANTA) {
			contatore++;
		}
		if (tesseraoggetto[4][3] == TesseraOggetto.LIBRO) {
			contatore++;
		}
		if (tesseraoggetto[5][3] == TesseraOggetto.GIOCO) {
			contatore++;
		}
		switch (contatore) {
		case 1:
			punteggio = 1;
			break;
		case 2:
			punteggio = 2;
			break;
		case 3:
			punteggio = 4;
			break;
		case 4:
			punteggio = 6;
			break;
		case 5:
			punteggio = 9;
			break;
		case 6:
			punteggio = 12;
			break;
		}
		return punteggio;
	}
	public void VisualizzaObiettivoPersonale9() { // funzione per visualizzare la carta obiettivo personale
		System.out.println("Visualizzazione Obiettivo Personale");
		String riga = new String();
		System.out.println("    0 | 1 | 2 | 3 | 4 |");
		System.out.println("  ---------------------");
		for (int i = 0; i<6; i++) {
			riga = "";
			for (int j = 0; j<5;j++) {
				riga = riga + toString(this.ObiettivoPersonale[i][j]) + "|";
			}
			System.out.println( i + " |" + riga);
			
		}
	}
	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "\033[0;30m"+" V "+"\033[0m";
			break;
		case GATTO:
			tessera = "\033[0;32m"+" C "+"\033[0m";
			break;
		case PIANTA:
			tessera = "\033[0;35m"+" P "+"\033[0m";
			break;
		case GIOCO:
			tessera = "\033[0;31m"+" G "+"\033[0m";
			break;
		case CORNICE:
			tessera = "\033[0;34m"+" F "+"\033[0m";
			break;
		case TROFEO:
			tessera = "\033[0;36m"+" T "+"\033[0m";
			break;
		case LIBRO:
			tessera = "\033[0;37m"+" L "+"\033[0m";
			break;
		}
		return tessera;
	}
}
