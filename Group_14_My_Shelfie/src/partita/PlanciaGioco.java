package partita;

import java.util.Scanner;

import utils.Cella;
import utils.TesseraOggetto;

/**
 * classe che permette di gestire la plancia
 * 
 * @author david
 *
 */
public class PlanciaGioco {

	public int contatoreGiocatori;
	public int codiceCella;
	Cella[][] plancia = new Cella[9][9]; // questo attributo viene usato per gestire la plancia
	TesseraOggetto[][] tesseraOggetto = new TesseraOggetto[9][9]; // matrice per gestire le tessere sulla plancia
	int numeroGatti = 22;
	int numeroTrofei = 22;
	int numeroGiochi = 22;
	int numeroCornici = 22;
	int numeroPiante = 22;
	int numeroLibri = 22;

	/**
	 * questo metodo permette di rendere ogni cella della plancia utilizzabile in
	 * base al numero di giocatori
	 * 
	 * @param contatoreGiocatori il numero di giocatori che partecipano alla partita
	 */
	public void cancellaCelle(int contatoreGiocatori) {
		System.out.println(" ");
		System.out.println("\033[0;32m" + "Preparazione plancia di gioco..." + "\033[0m");

		this.contatoreGiocatori = contatoreGiocatori;

		if (contatoreGiocatori == 2) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					switch (plancia[i][j].codiceCella) {

					case 1:
						plancia[i][j].utilizzabile = false;
						break;
					case 2:
						plancia[i][j].utilizzabile = true;
						break;
					case 3:
						plancia[i][j].utilizzabile = false;
						break;
					case 4:
						plancia[i][j].utilizzabile = false;
						break;
					}
				}
			}
		}
		;
		if (contatoreGiocatori == 3) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					switch (plancia[i][j].codiceCella) {

					case 1:
						plancia[i][j].utilizzabile = false;
						break;
					case 2:
						plancia[i][j].utilizzabile = true;
						break;
					case 3:
						plancia[i][j].utilizzabile = true;
						break;
					case 4:
						plancia[i][j].utilizzabile = false;
						break;
					}
				}
			}
		}
		if (contatoreGiocatori == 4) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					switch (plancia[i][j].codiceCella) {

					case 1:
						plancia[i][j].utilizzabile = false;
						break;
					case 2:
						plancia[i][j].utilizzabile = true;
						break;
					case 3:
						plancia[i][j].utilizzabile = true;
						break;
					case 4:
						plancia[i][j].utilizzabile = true;
						break;
					}
				}
			}
		}
	} // termine di Cancellacelle

	/**
	 * i seguenti metodi servono a inizializzare una determinata cella a una tessera
	 * oggetto
	 * 
	 * @param riga    la riga della cella
	 * @param colonna la colonna della cella
	 */

	public void setCellaTrofeo(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.TROFEO;
		riduciNumeroTessere(TesseraOggetto.TROFEO);
	}

	public void setCellaPianta(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.PIANTA;
		riduciNumeroTessere(TesseraOggetto.PIANTA);
	}

	public void setCellaGatto(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.GATTO;
		riduciNumeroTessere(TesseraOggetto.GATTO);
	}

	public void setCellaGioco(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.GIOCO;
		riduciNumeroTessere(TesseraOggetto.GIOCO);
	}

	public void setCellaCornice(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.CORNICE;
		riduciNumeroTessere(TesseraOggetto.CORNICE);
	}

	public void setCellaLibro(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.LIBRO;
		riduciNumeroTessere(TesseraOggetto.LIBRO);
	}

	/**
	 * riduce di 1 il numero di tessere disponibili
	 * 
	 * @param tessera la tessera di cui bisogna ridurre il numero
	 */

	public void riduciNumeroTessere(TesseraOggetto tessera) {
		switch (tessera) {
		case TROFEO:
			if (numeroTrofei > 0) {
				numeroTrofei--;
			}
			break;
		case PIANTA:
			if (numeroPiante > 0) {
				numeroPiante--;
			}
			break;
		case GATTO:
			if (numeroGatti > 0) {
				numeroGatti--;
			}
			break;
		case GIOCO:
			if (numeroGiochi > 0) {
				numeroGiochi--;
			}
			break;
		case LIBRO:
			if (numeroLibri > 0) {
				numeroLibri--;
			}
			break;
		case CORNICE:
			if (numeroCornici > 0) {
				numeroCornici--;
			}
			break;
		case VUOTA: 
			break;
		}
	}

	/**
	 * Il costruttore PlanciaGioco stabilisce quali celle sono utilizzabili in base
	 * al numero di giocatori nella partita. Il contenuto vale: 1 se inutilizzabile
	 * 2 se utilizzabile con almeno 2 giocatori 3 se utilizzabile con almeno 3
	 * giocatori 4 se utilizzabile con almeno 4 giocatori
	 */
	public PlanciaGioco() {
		// prima riga, tutte le colonne per controllo
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				plancia[i][j] = new Cella();
				tesseraOggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
		plancia[0][0].codiceCella = 1;
		plancia[0][1].codiceCella = 1;
		plancia[0][2].codiceCella = 1;
		plancia[0][3].codiceCella = 3;
		plancia[0][4].codiceCella = 4;
		plancia[0][5].codiceCella = 1;
		plancia[0][6].codiceCella = 1;
		plancia[0][7].codiceCella = 1;
		plancia[0][8].codiceCella = 1;

		// seconda riga, tutte le colonne

		plancia[1][0].codiceCella = 1;
		plancia[1][1].codiceCella = 1; // inutilizzabile
		plancia[1][2].codiceCella = 1;
		plancia[1][3].codiceCella = 2;
		plancia[1][4].codiceCella = 2; // almeno 3 giocatori
		plancia[1][5].codiceCella = 4; // almeno 4 giocatori
		plancia[1][6].codiceCella = 1;
		plancia[1][7].codiceCella = 1;
		plancia[1][8].codiceCella = 1;

		// terza riga, tutte le colonne

		plancia[2][0].codiceCella = 1;
		plancia[2][1].codiceCella = 1;
		plancia[2][2].codiceCella = 3;
		plancia[2][3].codiceCella = 2;
		plancia[2][4].codiceCella = 2; // almeno 2 giocatori
		plancia[2][5].codiceCella = 2;
		plancia[2][6].codiceCella = 3;
		plancia[2][7].codiceCella = 1;
		plancia[2][8].codiceCella = 1;

		// quarta riga, tutte le colonne

		plancia[3][0].codiceCella = 1;
		plancia[3][1].codiceCella = 4;
		plancia[3][2].codiceCella = 2;
		plancia[3][3].codiceCella = 2;
		plancia[3][4].codiceCella = 2;
		plancia[3][5].codiceCella = 2;
		plancia[3][6].codiceCella = 2;
		plancia[3][7].codiceCella = 2;
		plancia[3][8].codiceCella = 3;

		// quinta riga, tutte le colonne

		plancia[4][0].codiceCella = 4;
		plancia[4][1].codiceCella = 2;
		plancia[4][2].codiceCella = 2;
		plancia[4][3].codiceCella = 2;
		plancia[4][4].codiceCella = 2;
		plancia[4][5].codiceCella = 2;
		plancia[4][6].codiceCella = 2;
		plancia[4][7].codiceCella = 2;
		plancia[4][8].codiceCella = 4;

		// sesta riga, tutte le colonne
		plancia[5][0].codiceCella = 3;
		plancia[5][1].codiceCella = 2;
		plancia[5][2].codiceCella = 2;
		plancia[5][3].codiceCella = 2;
		plancia[5][4].codiceCella = 2;
		plancia[5][5].codiceCella = 2;
		plancia[5][6].codiceCella = 2;
		plancia[5][7].codiceCella = 4;
		plancia[5][8].codiceCella = 1;

		// settima riga, tutte le colonne

		plancia[6][0].codiceCella = 1;
		plancia[6][1].codiceCella = 1;
		plancia[6][2].codiceCella = 3;
		plancia[6][3].codiceCella = 2;
		plancia[6][4].codiceCella = 2;
		plancia[6][5].codiceCella = 2;
		plancia[6][6].codiceCella = 3;
		plancia[6][7].codiceCella = 1;
		plancia[6][8].codiceCella = 1;

		// ottava riga, tutte le colonne

		plancia[7][0].codiceCella = 1;
		plancia[7][1].codiceCella = 1;
		plancia[7][2].codiceCella = 1;
		plancia[7][3].codiceCella = 4;
		plancia[7][4].codiceCella = 2;
		plancia[7][5].codiceCella = 2;
		plancia[7][6].codiceCella = 1;
		plancia[7][7].codiceCella = 1;
		plancia[7][8].codiceCella = 1;

		// nona riga, tutte le colonne

		plancia[8][0].codiceCella = 1;
		plancia[8][1].codiceCella = 1;
		plancia[8][2].codiceCella = 1;
		plancia[8][3].codiceCella = 1;
		plancia[8][4].codiceCella = 4;
		plancia[8][5].codiceCella = 3;
		plancia[8][6].codiceCella = 1;
		plancia[8][7].codiceCella = 1;
		plancia[8][8].codiceCella = 1;

	}

	/**
	 * metodo che ritorna la tessera corrispondente alla riga e colonna indicate
	 * 
	 * @param riga    riga della tessera
	 * @param colonna colonna della tessera
	 * @return la tessera presente nelle coordinate
	 */

	public TesseraOggetto getTessera(int riga, int colonna) {
		TesseraOggetto tesseraControllo = TesseraOggetto.VUOTA;

		if (tesseraOggetto[riga][colonna] == TesseraOggetto.CORNICE) {
			tesseraControllo = TesseraOggetto.CORNICE;
		}
		if (tesseraOggetto[riga][colonna] == TesseraOggetto.GATTO) {
			tesseraControllo = TesseraOggetto.GATTO;
		}
		if (tesseraOggetto[riga][colonna] == TesseraOggetto.TROFEO) {
			tesseraControllo = TesseraOggetto.TROFEO;
		}
		if (tesseraOggetto[riga][colonna] == TesseraOggetto.GIOCO) {
			tesseraControllo = TesseraOggetto.GIOCO;
		}
		if (tesseraOggetto[riga][colonna] == TesseraOggetto.LIBRO) {
			tesseraControllo = TesseraOggetto.LIBRO;
		}
		if (tesseraOggetto[riga][colonna] == TesseraOggetto.PIANTA) {
			tesseraControllo = TesseraOggetto.PIANTA;
		}
		if (tesseraOggetto[riga][colonna] == TesseraOggetto.VUOTA) {
			tesseraControllo = TesseraOggetto.VUOTA;
		}
		return tesseraControllo;
	}

	/**
	 * il seguente metodo riconosce le celle confinanti a una data cella e le stampa
	 * a schermo
	 * 
	 * @param riga    riga della cella da studiare
	 * @param colonna colonna della cella da studiare
	 */

	public void celleConfinanti(int riga, int colonna) {

		// cella confinante a sinistra
		System.out.println(plancia[riga][colonna - 1]);

		// cella confinante a destra
		System.out.println(plancia[riga][colonna + 1]);

		// cella confinante superiormente
		System.out.println(plancia[riga - 1][colonna]);

		// cella confinanate inferiormente
		System.out.println(plancia[riga + 1][colonna]);
	}

	/**
	 * metodo che controlla se tutte le tessere confinanti sono di tipo vuoto
	 * 
	 * @param riga
	 * @param colonna
	 * @return true se almeno una delle tessere confinanti non è vuota
	 */
	public Boolean tessereConfinanti(int riga, int colonna) {

		if (getSinistra(riga, colonna) == TesseraOggetto.VUOTA && getDestra(riga, colonna) == TesseraOggetto.VUOTA
				&& getSopra(riga, colonna) == TesseraOggetto.VUOTA && getSotto(riga, colonna) == TesseraOggetto.VUOTA) {
			return false;
		}
		return true;
	}

	/**
	 * visualizza la plancia, con le caselle e tutte le tessere presenti
	 */
	public void visualizzaPlancia() {
		System.out.println("   ");
		System.out.println("\033[0;36m" + "Visualizzazione plancia" + "\033[0m");
		System.out.println(" ");
		System.out.println("\033[0;30m" + "V " + "\033[0m" + "sta per " + "\033[0;30m" + "VUOTO " + "\033[0m" + ", "
				+ "\033[0;32m" + "C " + "\033[0m" + "sta per " + "\033[0;32m" + "GATTO " + "\033[0m" + ", "
				+ "\033[0;35m" + "P " + "\033[0m" + "sta per " + "\033[0;35m" + "PIANTA " + "\033[0m" + ", "
				+ "\033[0;31m" + "G " + "\033[0m" + "sta per " + "\033[0;31m" + "GIOCO " + "\033[0m" + ", "
				+ "\033[0;34m" + "F " + "\033[0m" + "sta per " + "\033[0;34m" + "CORNICE " + "\033[0m" + ", "
				+ "\033[0;36m" + "T " + "\033[0m" + "sta per " + "\033[0;36m" + "TROFEO " + "\033[0m" + "e "
				+ "\033[0;37m" + "L " + "\033[0m" + "sta per " + "\033[0;37m" + "LIBRO " + "\033[0m");
		System.out.println("   ");
		String riga = new String();
		System.out.println("     0 1 2 3 4 5 6 7 8");
		System.out.println("     ");
		for (int i = 0; i < 9; i++) {
			riga = i + "    ";
			for (int j = 0; j < 9; j++) {
				if (tesseraOggetto[i][j] != null)
					riga = riga + toString(tesseraOggetto[i][j]);
			}
			riga = riga + "    " + i;
			System.out.println(riga);
		}
		System.out.println("\n");
		System.out.println("     0 1 2 3 4 5 6 7 8");
		System.out.println(" ");
	}

	/**
	 * funzione che posiziona in modo semi-casuale le tessere sulla plancia
	 */
	public void setCella() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (plancia[i][j].utilizzabile == true && getTessera(i, j) == TesseraOggetto.VUOTA) {
					int scelta = (int) (Math.random() * 6);
					switch (scelta) {
					case 0:
						setCellaTrofeo(i, j);
						break;
					case 1:
						setCellaPianta(i, j);
						break;
					case 2:
						setCellaGatto(i, j);
						break;
					case 3:
						setCellaGioco(i, j);
						break;
					case 4:
						setCellaCornice(i, j);
						break;
					case 5:
						setCellaLibro(i, j);
						break;
					}
				}
			}
		}
	}

	/**
	 * le seguenti funzioni restituiscono le tessere adiacenti a quella data. I
	 * metodi getDoppia restituiscono quelle a distanza 2
	 * 
	 * @param riga    riga della tessera
	 * @param colonna colonna della tessera
	 * @return tessera confinante
	 */

	public TesseraOggetto getSinistra(int riga, int colonna) {
		if (colonna == 0) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga][colonna - 1];
	}

	public TesseraOggetto getdoppiaSinistra(int riga, int colonna) {
		if (colonna == 0 || colonna == 1) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga][colonna - 2];
	}

	public TesseraOggetto getDestra(int riga, int colonna) {
		if (colonna == 8) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga][colonna + 1];
	}

	public TesseraOggetto getdoppiaDestra(int riga, int colonna) {
		if (colonna == 8 || colonna == 7) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga][colonna + 2];
	}

	public TesseraOggetto getSopra(int riga, int colonna) {
		if (riga == 0) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga - 1][colonna];
	}

	public TesseraOggetto getdoppiaSopra(int riga, int colonna) {
		if (riga == 0 || riga == 1) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga - 2][colonna];
	}

	public TesseraOggetto getSotto(int riga, int colonna) {
		if (riga == 8) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga + 1][colonna];
	}

	public TesseraOggetto getdoppiaSotto(int riga, int colonna) {
		if (riga == 8 || riga == 7) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraOggetto[riga + 2][colonna];
	}

	/**
	 * la funzione seguente controlla tutte le tessere della plancia contando quelle
	 * pescabili, in caso ci fosse ancora una tessera pescabile il gioco continua
	 * senno la plancia viene ricaricata con il metodo set cella.
	 */
	public void controlloTessere() {
		int cellePescabili = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (tesseraOggetto[i][j] != TesseraOggetto.VUOTA && plancia[i][j].utilizzabile) {
					if (tessereConfinanti(i, j) == true) {
						cellePescabili++;
						break;
					}
				}
			}
		}
		if (cellePescabili == 0) {
			System.out.println("\033[0;32m" + "riempimento plancia..." + "\033[0m");
			setCella();
		}
	}

	/**
	 * il metodo toString permette di visualizzare le tessere
	 * 
	 * @param t la tessera da visualizzare
	 * @return una stringa per visualizzare le tessere
	 */
	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "  ";
			break;
		case GATTO:
			tessera = "\033[0;32m" + "C " + "\033[0m";
			break;
		case PIANTA:
			tessera = "\033[0;35m" + "P " + "\033[0m";
			break;
		case GIOCO:
			tessera = "\033[0;31m" + "G " + "\033[0m";
			break;
		case CORNICE:
			tessera = "\033[0;34m" + "F " + "\033[0m";
			break;
		case TROFEO:
			tessera = "\033[0;36m" + "T " + "\033[0m";
			break;
		case LIBRO:
			tessera = "\033[0;37m" + "L " + "\033[0m";
			break;
		}
		return tessera;
	}

	/**
	 * questo metodo associa ad ogni tipo enumerativo di tesseraOggetto la parola e
	 * il colore della tessera usati nel gioco permettendo di visualizzare le
	 * tessere colorate
	 * 
	 * @param t oggetto di tipo TesseraOggetto che assume il nome e il colore
	 * @return tessera
	 */
	public String toStringSecondo(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "  ";
			break;
		case GATTO:
			tessera = "\033[0;32m" + "GATTO " + "\033[0m";
			break;
		case PIANTA:
			tessera = "\033[0;35m" + "PIANTA " + "\033[0m";
			break;
		case GIOCO:
			tessera = "\033[0;31m" + "GIOCO " + "\033[0m";
			break;
		case CORNICE:
			tessera = "\033[0;34m" + "CORNICE " + "\033[0m";
			break;
		case TROFEO:
			tessera = "\033[0;36m" + "TROFEO " + "\033[0m";
			break;
		case LIBRO:
			tessera = "\033[0;37m" + "LIBRO " + "\033[0m";
			break;
		}
		return tessera;
	}

	/**
	 * metodo che controlla se una tessera ha almeno un lato vuoto
	 * 
	 * @param riga    riga della tessera
	 * @param colonna colonna della tessera
	 * @return true se ha almeno un lato libero
	 */
	public Boolean latoVuoto(int riga, int colonna) {
		if (getSinistra(riga, colonna) == TesseraOggetto.VUOTA || getDestra(riga, colonna) == TesseraOggetto.VUOTA
				|| getSopra(riga, colonna) == TesseraOggetto.VUOTA || getSotto(riga, colonna) == TesseraOggetto.VUOTA) {
			return true;
		}
		return false;
	}

	/**
	 * questa funzione permette di pescare le tessere dalla plancia, la funzione
	 * ritorna un array dove sono contenute le coordinate delle carte pescate la
	 * funzione permette di pescare soltanto dalle celle con almeno un lato libero e
	 * ovviamente con una tesssera al proprio interno inoltre mostra a schermo
	 * soltanto le carte che possono essere pescate in caso di una seconda o terza
	 * scelta escludendo quelle vuote o quelle senza lato vuoto e usando anche la
	 * condizione che siano adiacenti e che formino soltanto linee rette.
	 * 
	 * @param maxTesserePescabili numero massimo di tessere inseribili nella
	 *                            libreria
	 * @return coordinate, array contenente le coordinate delle tessere pescate
	 */
	public int[][] pescaTessere(int maxTesserePescabili) {
		int[][] coordinate = new int[3][2]; // array che salva le coordinate delle carte pescate
		int i = 0, j = 0, numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, copia = 0,
				copia2 = 0;/*
							 * indice array..., indice array..., variabile di memorizzazione carta pescata
							 * precedentemente..., variabile utilizzata come indice a schermo che permette
							 * la scelta della carta da pescare
							 */
		int x = coordinate[i][j];// variabile usiliaria
		int y = coordinate[i + 1][j];// variabile usiliaria
		Boolean scelta = null, pescabile = false, riprova = false;// varibaili di controllo
		String inserimento = new String(), precedente = new String(), selezione = new String();
		Scanner sc = new Scanner(System.in);
		sc.reset();
//pescaggio prima tessera
		if (maxTesserePescabili >= 1) {
			System.out.println("\033[0;32m" + "pescaggio prima tessera..." + "\033[0m");
			System.out.println();
			do {
				do {
					System.out.println("\033[0;32m" + "inserisci la riga della tessera che vuoi pescare: " + "\033[0m");
					x = sc.nextInt();
					coordinate[i][j] = x;
					System.out.println(
							"\033[0;32m" + "inserisci la colonna della tessera che vuoi pescare: " + "\033[0m");
					y = sc.nextInt();
					coordinate[i][j + 1] = y;
					if (x > 8 || x < 0 || y > 8 || y < 0 || tessereConfinanti(x, y) == false
							|| getTessera(x, y) == TesseraOggetto.VUOTA) {
						System.out.println("\033[0;31m"
								+ "la carta non puo' essere pescata, inserisci nuove coordinate " + "\033[0m");
						System.out.println(" ");
					}
				} while (x > 8 || x < 0 || y > 8 || y < 0);
			} while (latoVuoto(x, y) == false || getTessera(x, y) == TesseraOggetto.VUOTA
					|| tessereConfinanti(x, y) == false);
			System.out.println(" ");
			System.out.println("hai pescato la tessera " + toStringSecondo(tesseraOggetto[x][y]));
			i++;
		}
//pescaggio seconda tessera
		if (maxTesserePescabili >= 2) {
			System.out.println(" ");
			System.out.println("\033[0;32m" + "pescaggio seconda tessera..." + "\033[0m");
			System.out.println();
			sc.nextLine();
			do {
				System.out.println("\033[0;36m" + "Vuoi pescare la seconda tessera?" + "\033[0m" + " Se si', inserisci"
						+ "\033[0;32m" + " T" + "\033[0m" + ", altrimenti inserisci" + "\033[0;31m" + " F" + "\033[0m");
				inserimento = sc.nextLine();
			} while (!inserimento.matches("T") && !inserimento.matches("t") && !inserimento.matches("F")
					&& !inserimento.matches("f"));
			if (inserimento.matches("T") || inserimento.matches("t")) {
				scelta = true;
			} else {
				scelta = false;
			}
			if (scelta == true) {
				while (scelta) {
					System.out.println(
							"la tessera che peschi deve essere adiacente a quella precedente e deve avere almeno un lato libero, scegli tra queste: \n");
					if (getSotto(x, y) != TesseraOggetto.VUOTA && latoVuoto((x + 1), y) == true) {
						System.out.println(
								"1-sotto: " + (x + 1) + "," + y + " " + toStringSecondo(getSotto(x, y)) + "\n");// sotto
						pescabile = true;
						numero1 = 1;
					}
					if (getSopra(x, y) != TesseraOggetto.VUOTA && latoVuoto((x - 1), y) == true) {
						System.out.println(
								"2-sopra: " + (x - 1) + "," + y + " " + toStringSecondo(getSopra(x, y)) + "\n");// sopra
						pescabile = true;
						numero2 = 2;
					}
					if (getDestra(x, y) != TesseraOggetto.VUOTA && latoVuoto(x, (y + 1)) == true) {
						System.out.println(
								"3-destra: " + x + "," + (y + 1) + " " + toStringSecondo(getDestra(x, y)) + "\n");// dx
						pescabile = true;
						numero3 = 3;
					}
					if (getSinistra(x, y) != TesseraOggetto.VUOTA && latoVuoto(x, (y - 1)) == true) {
						System.out.println(
								"4-sinistra: " + x + "," + (y - 1) + " " + toStringSecondo(getSinistra(x, y)) + "\n");// sx
						pescabile = true;
						numero4 = 4;
					}
					if (pescabile == false) {
						System.out.println("\033[0;31m" + "non ci sono più tessere da pescare" + "\033[0m");
						break;
					}
					do {
						do {
							System.out.println("\033[0;32m"
									+ "inserisci il numero della tessera che vuoi pescare (1,2,3,4): " + "\033[0m");
							precedente = sc.nextLine();

							if (isNumeric(precedente)) {
								copia = Integer.parseInt(precedente);
							} else {
								System.out.println("\033[0;31m" + "inserisci un numero!" + "\033[0m");
								System.out.println(" ");
							}
						} while (!isNumeric(precedente));
						if (copia < 1 || copia > 4) {
							System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							System.out.println(" ");
							riprova = true;
						} else if (copia == numero1) {
							break;
						} else if (copia == numero2) {
							break;
						} else if (copia == numero3) {
							break;
						} else if (copia == numero4) {
							break;
						} else {
							System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							System.out.println(" ");
							riprova = true;
						}
					} while (riprova == true);

					switch (copia) {
					case 1:
						coordinate[i][j] = (x + 1);
						coordinate[i][j + 1] = y;
						break;
					case 2:
						coordinate[i][j] = (x - 1);
						coordinate[i][j + 1] = y;
						break;
					case 3:
						coordinate[i][j] = x;
						coordinate[i][j + 1] = (y + 1);
						break;
					case 4:
						coordinate[i][j] = x;
						coordinate[i][j + 1] = (y - 1);
						break;
					}
					System.out.println("hai pescato la tessera "
							+ toStringSecondo(tesseraOggetto[coordinate[i][j]][coordinate[i][j + 1]]));
					scelta = false;
				}
			}
		}
//pescaggio terza tessera 
		if (maxTesserePescabili >= 3 && pescabile) {
			System.out.println(" ");
			System.out.println("\033[0;32m" + "pescaggio terza tessera..." + "\033[0m");
			System.out.println();
			numero1 = 0;
			numero2 = 0;
			numero3 = 0;
			numero4 = 0;

			pescabile = false;

			do {
				System.out.println("\033[0;36m" + "Vuoi pescare la terza tessera?" + "\033[0m" + " Se si', inserisci"
						+ "\033[0;32m" + " T" + "\033[0m" + ", altrimenti inserisci" + "\033[0;31m" + " F" + "\033[0m");
				inserimento = sc.nextLine();
			} while (!inserimento.matches("T") && !inserimento.matches("t") && !inserimento.matches("F")
					&& !inserimento.matches("f"));
			if (inserimento.matches("T") || inserimento.matches("t")) {
				scelta = true;
			} else {
				scelta = false;
			}
			if (scelta == true) {
				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni sopra e sotto
				 */
				if (copia == 1) {
					if ((getSotto(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto((coordinate[i][j] + 1), coordinate[i][j + 1]) == true)) {
						System.out.println("1-sotto: " + (coordinate[i][j] + 1) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getSotto(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero1 = 1;
					}
					if ((getdoppiaSopra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto((coordinate[i][j] - 2), coordinate[i][j + 1]) == true)) {
						System.out.println("2-sopra: " + (coordinate[i][j] - 2) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getdoppiaSopra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero2 = 2;
					}
					i++;
					if (pescabile) {
						do {
							do {
								System.out.println("\033[0;32m" + "scegli la tessera da pescare (1,2):" + "\033[0m");
								selezione = sc.nextLine();

								if (isNumeric(selezione)) {
									copia2 = Integer.parseInt(selezione);
								} else {
									System.out.println("\033[0;31m" + "inserisci un numero!" + "\033[0m");
								}
							} while (!isNumeric(selezione));
							if (copia2 < 1 || copia2 > 2) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							} else if (copia2 == numero1) {
								riprova = false;
								break;
							} else if (copia2 == numero2) {
								riprova = false;
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								riprova = true;
							}
						} while (riprova == true);
						switch (copia2) {
						case 1:
							coordinate[i][j] = (coordinate[i - 1][j] + 1);
							coordinate[i][j + 1] = coordinate[i - 1][j + 1];
							break;
						case 2:
							coordinate[i][j] = (coordinate[i - 1][j] - 2);
							coordinate[i][j + 1] = coordinate[i - 1][j + 1];
							break;
						}
						System.out.println("hai pescato la tessera "
								+ toStringSecondo(tesseraOggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					} else {
						System.out.println("\033[0;31m" + "non ci sono piu' tessere da pescare" + "\033[0m");
						System.out.println(" ");
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					}
				}

				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni sotto e sopra
				 */
				else if (copia == 2) {
					numero1 = 0;
					numero2 = 0;
					numero3 = 0;
					numero4 = 0;
					if ((getSopra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto((coordinate[i][j] - 1), coordinate[i][j + 1]) == true)) {
						System.out.println("1-sopra: " + (coordinate[i][j] - 1) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getSopra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero1 = 1;
					}
					if ((getdoppiaSotto(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto((coordinate[i][j] + 2), coordinate[i][j + 1]) == true)) {
						System.out.println("2-sotto: " + (coordinate[i][j] + 2) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getdoppiaSotto(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero2 = 2;
					}
					i++;
					if (pescabile) {
						do {
							do {
								System.out.println("\033[0;32m" + "scegli la tessera da pescare (1,2):" + "\033[0m");
								selezione = sc.nextLine();

								if (isNumeric(selezione)) {
									copia2 = Integer.parseInt(selezione);
								} else {
									System.out.println("\033[0;31m" + "inserisci un numero!" + "\033[0m");
									System.out.println(" ");
								}
							} while (!isNumeric(selezione));
							if (copia2 < 1 || copia2 > 2) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								System.out.println(" ");
							} else if (copia2 == numero1) {
								riprova = false;
								break;
							} else if (copia2 == numero2) {
								riprova = false;
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								System.out.println(" ");
								riprova = true;
							}
						} while (riprova == true);
						switch (copia2) {
						case 1:
							coordinate[i][j] = (coordinate[i - 1][j] - 1);
							coordinate[i][j + 1] = coordinate[i - 1][j + 1];
							break;
						case 2:
							coordinate[i][j] = (coordinate[i - 1][j] + 2);
							coordinate[i][j + 1] = coordinate[i - 1][j + 1];
							break;
						}
						System.out.println("hai pescato la tessera "
								+ toStringSecondo(tesseraOggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					} else {
						System.out.println("\033[0;31m" + "non ci sono piu' tessere da pescare" + "\033[0m");
						System.out.println(" ");
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					}
				}

				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni a sinistra e una a destra
				 */
				else if (copia == 3) {
					numero1 = 0;
					numero2 = 0;
					numero3 = 0;
					numero4 = 0;
					if ((getDestra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto(coordinate[i][j], (coordinate[i][j + 1] + 1)) == true)) {
						System.out.println("3-destra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] + 1) + "-"
								+ toStringSecondo(getDestra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero3 = 3;
					}
					if ((getdoppiaSinistra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto(coordinate[i][j], (coordinate[i][j + 1] - 2)) == true)) {
						System.out.println("4-sinistra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] - 2) + "-"
								+ toStringSecondo(getdoppiaSinistra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero4 = 4;
					}
					i++;
					if (pescabile) {
						do {
							do {
								System.out.println("\033[0;32m" + "scegli la tessera da pescare (3,4):" + "\033[0m");
								selezione = sc.nextLine();

								if (isNumeric(selezione)) {
									copia2 = Integer.parseInt(selezione);
								} else {
									System.out.println("\033[0;31m" + "inserisci un numero!" + "\033[0m");
									System.out.println(" ");
								}
							} while (!isNumeric(selezione));
							if (copia2 < 3 || copia2 > 4) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								System.out.println(" ");
							} else if (copia2 == numero3) {
								riprova = false;
								break;
							} else if (copia2 == numero4) {
								riprova = false;
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								System.out.println(" ");
								riprova = true;
							}
						} while (riprova == true);
						switch (copia2) {
						case 3:
							coordinate[i][j] = coordinate[i - 1][j];
							coordinate[i][j + 1] = (coordinate[i - 1][j + 1] + 1);
							break;
						case 4:
							coordinate[i][j] = coordinate[i - 1][j];
							coordinate[i][j + 1] = (coordinate[i - 1][j + 1] - 2);
							break;
						}
						System.out.println("hai pescato la tessera "
								+ toStringSecondo(tesseraOggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					} else {
						System.out.println("\033[0;31m" + "non ci sono piu' tessere da pescare" + "\033[0m");
						System.out.println(" ");
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					}
				}

				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni a destra e una a sinistra
				 */
				else if (copia == 4) {
					numero1 = 0;
					numero2 = 0;
					numero3 = 0;
					numero4 = 0;
					if ((getdoppiaDestra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto((coordinate[i][j]), (coordinate[i][j + 1]) + 2) == true)) {
						System.out.println("3-destra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] + 2) + "-"
								+ toStringSecondo(getdoppiaDestra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero3 = 3;
					}
					if ((getSinistra((coordinate[i][j]), coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& latoVuoto((coordinate[i][j]), (coordinate[i][j + 1]) - 1) == true)) {
						System.out.println("4-sinistra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] - 1) + "-"
								+ toStringSecondo(getSinistra((coordinate[i][j]), coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero4 = 4;
					}
					i++;
					if (pescabile) {
						do {
							do {
								System.out.println("\033[0;32m" + "scegli la tessera da pescare (3,4):" + "\033[0m");
								selezione = sc.nextLine();

								if (isNumeric(selezione)) {
									copia2 = Integer.parseInt(selezione);
								} else {
									System.out.println("\033[0;31m" + "inserisci un numero!" + "\033[0m");
									System.out.println(" ");
								}
							} while (!isNumeric(selezione));
							if (copia2 < 3 || copia2 > 4) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								System.out.println(" ");
							} else if (copia2 == numero3) {
								riprova = false;
								break;
							} else if (copia2 == numero4) {
								riprova = false;
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								System.out.println(" ");
								riprova = true;
							}
						} while (riprova == true);
						switch (copia2) {
						case 3:
							coordinate[i][j] = coordinate[i - 1][j];
							coordinate[i][j + 1] = (coordinate[i - 1][j + 1] + 2);
							break;
						case 4:
							coordinate[i][j] = coordinate[i - 1][j];
							coordinate[i][j + 1] = (coordinate[i - 1][j + 1] - 1);
							break;
						}
						System.out.println("hai pescato la tessera "
								+ toStringSecondo(tesseraOggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					} else {
						System.out.println("\033[0;31m" + "non ci sono piu' tessere da pescare" + "\033[0m");
						System.out.println(" ");
						System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
						System.out.println(" ");
					}
				}
			} else {
				System.out.println("\033[0;32m" + "pescaggio finito... proseguire" + "\033[0m");
				System.out.println(" ");
			}

		}
		return coordinate;
	}

	/**
	 * metodo che visualizza l'array bidimensionale di appoggio denominato
	 * coordinate
	 * 
	 * @param coordinate
	 */
	public void visualizzaCoordinate(int[][] coordinate) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(coordinate[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * metodo che controlla se la stringa passata è un numero o meno
	 * 
	 * @param strNum
	 * @return true se è un numero
	 */
	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			@SuppressWarnings("unused")
			int d = Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
