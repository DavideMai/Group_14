package obiettivi_personali;

import utils.TesseraOggetto;

public class DodicesimoObiettivoPersonale extends ObiettivoPersonale {
	public TesseraOggetto[][] obiettivoPersonale = new TesseraOggetto[6][5];

	public DodicesimoObiettivoPersonale() {
		obiettivoPersonale[0][4] = TesseraOggetto.GIOCO;
		obiettivoPersonale[2][0] = TesseraOggetto.TROFEO;
		obiettivoPersonale[2][2] = TesseraOggetto.CORNICE;
		obiettivoPersonale[3][3] = TesseraOggetto.PIANTA;
		obiettivoPersonale[4][1] = TesseraOggetto.LIBRO;
		obiettivoPersonale[4][2] = TesseraOggetto.GATTO;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (obiettivoPersonale[i][j] == null) {
					obiettivoPersonale[i][j] = TesseraOggetto.VUOTA;
				}
			}
		}
	}

	public int controllaObiettivoPersonale(TesseraOggetto[][] tesseraOggetto) {
		int punteggio = 0;
		int contatore = 0;
		if (tesseraOggetto[0][4] == TesseraOggetto.GIOCO) {
			contatore += 1;
		}
		if (tesseraOggetto[2][0] == TesseraOggetto.TROFEO) {
			contatore += 1;
		}
		if (tesseraOggetto[2][2] == TesseraOggetto.CORNICE) {
			contatore += 1;
		}
		if (tesseraOggetto[3][3] == TesseraOggetto.PIANTA) {
			contatore += 1;
		}
		if (tesseraOggetto[4][1] == TesseraOggetto.LIBRO) {
			contatore += 1;
		}
		if (tesseraOggetto[4][2] == TesseraOggetto.GATTO) {
			contatore += 1;
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

	@Override
	public void visualizzaObiettivoPersonale() { // funzione per visualizzare la carta obiettivo personale
		System.out.println("\033[0;36m" + "Visualizzazione Obiettivo Personale" + "\033[0m");
		System.out.println(" ");
		String riga = new String();
		System.out.println("    0 | 1 | 2 | 3 | 4 |");
		System.out.println("  ---------------------");
		for (int i = 0; i < 6; i++) {
			riga = "";
			for (int j = 0; j < 5; j++) {
				riga = riga + toString(this.obiettivoPersonale[i][j]) + "|";
			}
			System.out.println(i + " |" + riga);

		}
	}

	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "\033[0;30m" + " V " + "\033[0m";
			break;
		case GATTO:
			tessera = "\033[0;32m" + " C " + "\033[0m";
			break;
		case PIANTA:
			tessera = "\033[0;35m" + " P " + "\033[0m";
			break;
		case GIOCO:
			tessera = "\033[0;31m" + " G " + "\033[0m";
			break;
		case CORNICE:
			tessera = "\033[0;34m" + " F " + "\033[0m";
			break;
		case TROFEO:
			tessera = "\033[0;36m" + " T " + "\033[0m";
			break;
		case LIBRO:
			tessera = "\033[0;37m" + " L " + "\033[0m";
			break;
		}
		return tessera;
	}
}
