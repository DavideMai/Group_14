package partita;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import utils.Cella;
import utils.TesseraOggetto;

public class PlanciaGioco {

	public int contatore_giocatori;
	public int codice_cella;

	// Cella [][] arrayplancia = new Cella [riga][colonna];
	Cella[][] plancia = new Cella[9][9]; // questo attributo viene usato per gestire la plancia
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[9][9]; // matrice per gestire le tessere sulla plancia
	int numeroGatti = 22;
	int numeroTrofei = 22;
	int numeroGiochi = 22;
	int numeroCornici = 22;
	int numeroPiante = 22;
	int numeroLibri = 22;

	// questa funzione seleziona una cella per esempio per pescare una carta dalla
	// plancia

	/*
	 * public boolean Selezione (int riga ,int colonna) { boolean contenuto;
	 * contenuto = plancia[riga][colonna].utilizzabile; return contenuto; } commento
	 * perchè per ora è inutile, sostituita con getTessera.
	 */

	/*
	 * questa funzione imposta lo stato della plancia in / base al numero di
	 * giocatori inizializzando il contenuto di ogni cella, / (di tipo stringa) in
	 * 'cella libera' o ' cella inutilizzabile?, e mettendo quindi a disposizione le
	 * celle al gioco la plancia è formata da 11 righe e colonne; la colonna 0 e la
	 * colonna 11 servono solo per facilitare la funzione di controllo in modo
	 * analogo funziona per le righe.
	 */

	public void CancellaCelle(int contatore_giocatori) {
		System.out.println("Preparazione plancia di gioco...");

		this.contatore_giocatori = contatore_giocatori;

		if (contatore_giocatori == 2) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					switch (plancia[i][j].codice_cella) {

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
		if (contatore_giocatori == 3) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					switch (plancia[i][j].codice_cella) {

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
		if (contatore_giocatori == 4) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					switch (plancia[i][j].codice_cella) {

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

	public void SetCellaTrofeo(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.TROFEO;
		RiduciNumeroTessere(TesseraOggetto.TROFEO);
	}

	public void SetCellaPianta(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.PIANTA;
		RiduciNumeroTessere(TesseraOggetto.PIANTA);
	}

	public void SetCellaGatto(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GATTO;
		RiduciNumeroTessere(TesseraOggetto.GATTO);
	}

	public void SetCellaGioco(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GIOCO;
		RiduciNumeroTessere(TesseraOggetto.GIOCO);
	}

	public void SetCellaCornice(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.CORNICE;
		RiduciNumeroTessere(TesseraOggetto.CORNICE);
	}

	public void SetCellaLibro(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.LIBRO;
		RiduciNumeroTessere(TesseraOggetto.LIBRO);
	}

	/**
	 * riduce di 1 il numero di tessere disponibili
	 * 
	 * @param tessera la tessera di cui bisogna ridurre il numero
	 */

	public void RiduciNumeroTessere(TesseraOggetto tessera) {
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
				tesseraoggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
		plancia[0][0].codice_cella = 1;
		plancia[0][1].codice_cella = 1;
		plancia[0][2].codice_cella = 1;
		plancia[0][3].codice_cella = 3;
		plancia[0][4].codice_cella = 4;
		plancia[0][5].codice_cella = 1;
		plancia[0][6].codice_cella = 1;
		plancia[0][7].codice_cella = 1;
		plancia[0][8].codice_cella = 1;

		// seconda riga, tutte le colonne

		plancia[1][0].codice_cella = 1;
		plancia[1][1].codice_cella = 1; // inutilizzabile
		plancia[1][2].codice_cella = 1;
		plancia[1][3].codice_cella = 2;
		plancia[1][4].codice_cella = 2; // almeno 3 giocatori
		plancia[1][5].codice_cella = 4; // almeno 4 giocatori
		plancia[1][6].codice_cella = 1;
		plancia[1][7].codice_cella = 1;
		plancia[1][8].codice_cella = 1;

		// terza riga, tutte le colonne

		plancia[2][0].codice_cella = 1;
		plancia[2][1].codice_cella = 1;
		plancia[2][2].codice_cella = 3;
		plancia[2][3].codice_cella = 2;
		plancia[2][4].codice_cella = 2; // almeno 2 giocatori
		plancia[2][5].codice_cella = 2;
		plancia[2][6].codice_cella = 3;
		plancia[2][7].codice_cella = 1;
		plancia[2][8].codice_cella = 1;

		// quarta riga, tutte le colonne

		plancia[3][0].codice_cella = 1;
		plancia[3][1].codice_cella = 4;
		plancia[3][2].codice_cella = 2;
		plancia[3][3].codice_cella = 2;
		plancia[3][4].codice_cella = 2;
		plancia[3][5].codice_cella = 2;
		plancia[3][6].codice_cella = 2;
		plancia[3][7].codice_cella = 2;
		plancia[3][8].codice_cella = 3;

		// quinta riga, tutte le colonne

		plancia[4][0].codice_cella = 4;
		plancia[4][1].codice_cella = 2;
		plancia[4][2].codice_cella = 2;
		plancia[4][3].codice_cella = 2;
		plancia[4][4].codice_cella = 2;
		plancia[4][5].codice_cella = 2;
		plancia[4][6].codice_cella = 2;
		plancia[4][7].codice_cella = 2;
		plancia[4][8].codice_cella = 4;

		// sesta riga, tutte le colonne
		plancia[5][0].codice_cella = 3;
		plancia[5][1].codice_cella = 2;
		plancia[5][2].codice_cella = 2;
		plancia[5][3].codice_cella = 2;
		plancia[5][4].codice_cella = 2;
		plancia[5][5].codice_cella = 2;
		plancia[5][6].codice_cella = 2;
		plancia[5][7].codice_cella = 4;
		plancia[5][8].codice_cella = 1;

		// settima riga, tutte le colonne

		plancia[6][0].codice_cella = 1;
		plancia[6][1].codice_cella = 1;
		plancia[6][2].codice_cella = 3;
		plancia[6][3].codice_cella = 2;
		plancia[6][4].codice_cella = 2;
		plancia[6][5].codice_cella = 2;
		plancia[6][6].codice_cella = 3;
		plancia[6][7].codice_cella = 1;
		plancia[6][8].codice_cella = 1;

		// ottava riga, tutte le colonne

		plancia[7][0].codice_cella = 1;
		plancia[7][1].codice_cella = 1;
		plancia[7][2].codice_cella = 1;
		plancia[7][3].codice_cella = 4;
		plancia[7][4].codice_cella = 2;
		plancia[7][5].codice_cella = 2;
		plancia[7][6].codice_cella = 1;
		plancia[7][7].codice_cella = 1;
		plancia[7][8].codice_cella = 1;

		// nona riga, tutte le colonne

		plancia[8][0].codice_cella = 1;
		plancia[8][1].codice_cella = 1;
		plancia[8][2].codice_cella = 1;
		plancia[8][3].codice_cella = 1;
		plancia[8][4].codice_cella = 4;
		plancia[8][5].codice_cella = 3;
		plancia[8][6].codice_cella = 1;
		plancia[8][7].codice_cella = 1;
		plancia[8][8].codice_cella = 1;

	}

	/**
	 * 
	 * @param riga    riga della tessera
	 * @param colonna colonna della tessera
	 * @return la tessera presente nelle coordinate
	 */

	public TesseraOggetto getTessera(int riga, int colonna) {
		TesseraOggetto tesseracontrollo = TesseraOggetto.VUOTA;

		if (tesseraoggetto[riga][colonna] == TesseraOggetto.CORNICE) {
			tesseracontrollo = TesseraOggetto.CORNICE;
		}
		if (tesseraoggetto[riga][colonna] == TesseraOggetto.GATTO) {
			tesseracontrollo = TesseraOggetto.GATTO;
		}
		if (tesseraoggetto[riga][colonna] == TesseraOggetto.TROFEO) {
			tesseracontrollo = TesseraOggetto.TROFEO;
		}
		if (tesseraoggetto[riga][colonna] == TesseraOggetto.GIOCO) {
			tesseracontrollo = TesseraOggetto.GIOCO;
		}
		if (tesseraoggetto[riga][colonna] == TesseraOggetto.LIBRO) {
			tesseracontrollo = TesseraOggetto.LIBRO;
		}
		if (tesseraoggetto[riga][colonna] == TesseraOggetto.PIANTA) {
			tesseracontrollo = TesseraOggetto.PIANTA;
		}
		if (tesseraoggetto[riga][colonna] == TesseraOggetto.VUOTA) {
			tesseracontrollo = TesseraOggetto.VUOTA;
		}
		return tesseracontrollo;
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
		System.out.println("Visualizzazione plancia");
		System.out.println(
				"V sta per vuota, C per gatto, P per pianta, G per gioco, F per cornice, T per trofeo e L per libro");
		System.out.println("   ");
		String riga = new String();
		System.out.println("     0 1 2 3 4 5 6 7 8");
		System.out.println("     ");
		for (int i = 0; i < 9; i++) {
			riga = i + "    ";
			for (int j = 0; j < 9; j++) {
				if (tesseraoggetto[i][j] != null)
					riga = riga + toString(tesseraoggetto[i][j]);
			}
			System.out.println(riga);
		}
	}

	/**
	 * funzione che posiziona in modo semi-casuale le tessere sulla plancia
	 */
	public void SetCella() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (plancia[i][j].utilizzabile == true && getTessera(i, j) == TesseraOggetto.VUOTA) {
					int scelta = (int) (Math.random() * 6);
					switch (scelta) {
					case 0:
						SetCellaTrofeo(i, j);
						break;
					case 1:
						SetCellaPianta(i, j);
						break;
					case 2:
						SetCellaGatto(i, j);
						break;
					case 3:
						SetCellaGioco(i, j);
						break;
					case 4:
						SetCellaCornice(i, j);
						break;
					case 5:
						SetCellaLibro(i, j);
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
		return tesseraoggetto[riga][colonna - 1];
	}

	public TesseraOggetto getdoppiaSinistra(int riga, int colonna) {
		if (colonna == 0 || colonna == 1) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga][colonna - 2];
	}

	public TesseraOggetto getDestra(int riga, int colonna) {
		if (colonna == 8) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga][colonna + 1];
	}

	public TesseraOggetto getdoppiaDestra(int riga, int colonna) {
		if (colonna == 8 || colonna == 7) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga][colonna + 2];
	}

	public TesseraOggetto getSopra(int riga, int colonna) {
		if (riga == 0) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga - 1][colonna];
	}

	public TesseraOggetto getdoppiaSopra(int riga, int colonna) {
		if (riga == 0 || riga == 1) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga - 2][colonna];
	}

	public TesseraOggetto getSotto(int riga, int colonna) {
		if (riga == 8) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga + 1][colonna];
	}

	public TesseraOggetto getdoppiaSotto(int riga, int colonna) {
		if (riga == 8 || riga == 7) {
			return TesseraOggetto.VUOTA;
		}
		return tesseraoggetto[riga + 2][colonna];
	}

	/**
	 * la funzione seguente controlla tutte le tessere della plancia contando quelle
	 * pescabili, in caso ci fosse ancora una tessera pescabile il gioco continua
	 * senno la plancia viene ricaricata con il metodo set cella.
	 */
	public void ControlloTessere() {
		boolean controllo;
		int cellepescabili = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (tesseraoggetto[i][j] != TesseraOggetto.VUOTA && plancia[i][j].utilizzabile) {
					if (tessereConfinanti(i, j) == true) {
						cellepescabili++;
						break;
					}
				}
			}
		}
		if (cellepescabili == 0) {
			System.out.println("riempimento plancia...");
			SetCella();
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
	public Boolean LatoVuoto(int riga, int colonna) {
		if (getSinistra(riga, colonna) == TesseraOggetto.VUOTA || getDestra(riga, colonna) == TesseraOggetto.VUOTA
				|| getSopra(riga, colonna) == TesseraOggetto.VUOTA || getSotto(riga, colonna) == TesseraOggetto.VUOTA) {
			return true;
		}
		return false;
	}

	/**
	 * questa funzione permette di pescare le tessere dalla plancia, la funzione
	 * ritorna un array dove sono contenute le coordinate delle carte pescate la
	 * funzione permette di pescare soltanto carte con almeno un lato libero e
	 * ovviamente con una tesssera al proprio interno inoltre mostra a schermo
	 * soltanto le carte che possono essere pescate in caso di una seconda o terza
	 * scelta escludendo quelle vuote o quelle senza lato vuoto e usando anche la
	 * condizione che siano adiacenti e che formino soltanto linee rette SE AVETE
	 * MODIFICHE DA FARE CHE POSSONO ACCORCIARE IL CODICE FATE PURE, QUESTO ERA
	 * L'UNICO MODO CHE MI E' VENUTO IN MENTE PER RENDERE L'ESPERIENZA DI GIOCO IL
	 * PIU SEMPLICE POSSIBILE
	 */
	public int[][] PescaTessere() {
		int[][] coordinate = new int[3][2]; // array che salva le coordinate delle carte pescate
		int i = 0, j = 0, precedente = 0, selezione = 0, numero_1 = 0, numero_2 = 0, numero_3 = 0,
				numero_4 = 0;/*
								 * indice array..., indice array..., variabile di memorizzazione carta pescata
								 * precedentemente..., variabile utilizzata come indice a schermo che permette
								 * la scelta della carta da pescare
								 */
		int x = coordinate[i][j];// variabile usiliaria
		int y = coordinate[i + 1][j];// variabile usiliaria
		Boolean scelta = null, pescabile = false, scelta2 = null, riprova = false;// varibaili di controllo
		String inserimento = new String();
		Scanner sc = new Scanner(System.in);

//pescaggio prima tessera
		System.out.println("pescaggio prima tessera");
		System.out.println();

		do {
			do {
				System.out.println("\033[0;32m" + "inserisci la riga della tessera che vuoi pescare: " + "\033[0m");
				x = sc.nextInt();
				coordinate[i][j] = x;
				System.out.println("\033[0;32m" + "inserisci la colonna della tessera che vuoi pescare: " + "\033[0m");
				y = sc.nextInt();
				coordinate[i][j + 1] = y;
				if (x > 8 || x < 0 || y > 8 || y < 0 || tessereConfinanti(x, y) == false) {
					System.out.println(
							"\033[0;31m" + "la carta non può essere pescata, inserisci nuove coordinate: " + "\033[0m");
				}
			} while (x > 8 || x < 0 || y > 8 || y < 0);
		} while (LatoVuoto(x, y) == false || getTessera(x, y) == TesseraOggetto.VUOTA
				|| tessereConfinanti(x, y) == false);
		System.out.println("hai pescato la tessera " + toStringSecondo(tesseraoggetto[x][y]));
		i++;
//pescaggio seconda tessera
		System.out.println("pescaggio seconda tessera");
		System.out.println();
		sc.nextLine();
		do {
			System.out.println("Vuoi pescare la seconda tessera? Se sì, inserisci T, altrimenti inserisci F");
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
				if (getSotto(x, y) != TesseraOggetto.VUOTA && LatoVuoto((x + 1), y) == true) {
					System.out.println("1-sotto: " + (x + 1) + "," + y + " " + toStringSecondo(getSotto(x, y)) + "\n");// sotto
					pescabile = true;
					numero_1 = 1;
				}
				if (getSopra(x, y) != TesseraOggetto.VUOTA && LatoVuoto((x - 1), y) == true) {
					System.out.println("2-sopra: " + (x - 1) + "," + y + " " + toStringSecondo(getSopra(x, y)) + "\n");// sopra
					pescabile = true;
					numero_2 = 2;
				}
				if (getDestra(x, y) != TesseraOggetto.VUOTA && LatoVuoto(x, (y + 1)) == true) {
					System.out
							.println("3-destra: " + x + "," + (y + 1) + " " + toStringSecondo(getDestra(x, y)) + "\n");// dx
					pescabile = true;
					numero_3 = 3;
				}
				if (getSinistra(x, y) != TesseraOggetto.VUOTA && LatoVuoto(x, (y - 1)) == true) {
					System.out.println(
							"4-sinistra: " + x + "," + (y - 1) + " " + toStringSecondo(getSinistra(x, y)) + "\n");// sx
					pescabile = true;
					numero_4 = 4;
				}
				if (pescabile == false) {
					System.out.println("\033[0;31m" + "non ci sono più tessere da pescare" + "\033[0m");
					break;
				}
				do {
					System.out.println("\033[0;32m" + "inserisci il numero della tessera che vuoi pescare (1,2,3,4): "
							+ "\033[0m");
					precedente = sc.nextInt();
					if (precedente < 1 || precedente > 4) {
						System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
						riprova = true;
					} else if (precedente == numero_1) {
						break;
					} else if (precedente == numero_2) {
						break;
					} else if (precedente == numero_3) {
						break;
					} else if (precedente == numero_4) {
						break;
					} else {
						System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
						riprova = true;
					}
				} while (riprova == true);

				switch (precedente) {
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
						+ toStringSecondo(tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]));
				scelta = false;
			}
			;
//pescaggio terza tessera    
			System.out.println("pescaggio terza tessera");
			System.out.println();
			numero_1=0;
			numero_2=0;
			numero_3=0;
			numero_4=0;
			
			pescabile = false;
			sc.nextLine();
			do {
				System.out.println("Vuoi pescare la terza tessera? Se sì, inserisci T, altrimenti inserisci F");
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
				if (precedente == 1) {
					if ((getSotto(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto((coordinate[i][j] + 1), coordinate[i][j + 1]) == true)) {
						System.out.println("1-sotto: " + (coordinate[i][j] + 1) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getSotto(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero_1=1;
					}
					if ((getdoppiaSopra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto((coordinate[i][j] - 2), coordinate[i][j + 1]) == true)) {
						System.out.println("2-sopra: " + (coordinate[i][j] - 2) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getdoppiaSopra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero_2=2;
					}
					i++;
					if (pescabile) {
						do {
							System.out.println("\033[0;32m" + "scegli la tessera da pescare (1,2):" + "\033[0m");
							selezione = sc.nextInt();
							if (selezione < 1 || selezione > 2) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							} else if (selezione == numero_1) {
								break;
							} else if (selezione == numero_2) {
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								riprova = true;
							}
						} while (riprova==true);
						switch (selezione) {
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
								+ toStringSecondo(tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("pescaggio finito... proseguire");
					} else {
						System.out.println("\033[0;31m" + "non ci sono più tessere da pescare" + "\033[0m");
						System.out.println("pescaggio finito... proseguire");
					}
				}

				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni sotto e sopra
				 */
				else if (precedente == 2) {
					numero_1=0;
					numero_2=0;
					numero_3=0;
					numero_4=0;
					if ((getSopra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto((coordinate[i][j] - 1), coordinate[i][j + 1]) == true)) {
						System.out.println("1-sopra: " + (coordinate[i][j] - 1) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getSopra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
					}
					if ((getdoppiaSotto(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto((coordinate[i][j] + 2), coordinate[i][j + 1]) == true)) {
						System.out.println("2-sotto: " + (coordinate[i][j] + 2) + "," + coordinate[i][j + 1] + "-"
								+ toStringSecondo(getdoppiaSotto(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
					}
					i++;
					if (pescabile) {
						do {
							System.out.println("\033[0;32m" + "scegli la tessera da pescare (1,2):" + "\033[0m");
							selezione = sc.nextInt();
							if (selezione < 1 || selezione > 2) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							} else if (selezione == numero_1) {
								break;
							} else if (selezione == numero_2) {
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								riprova = true;
							}
						} while (riprova==true);
						switch (selezione) {
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
								+ toStringSecondo(tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("pescaggio finito... proseguire");
					} else {
						System.out.println("\033[0;31m" + "non ci sono più tessere da pescare" + "\033[0m");
						System.out.println("pescaggio finito... proseguire");
					}
				}

				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni a sinistra e a destra
				 */
				else if (precedente == 3) {
					numero_1=0;
					numero_2=0;
					numero_3=0;
					numero_4=0;
					if ((getDestra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto(coordinate[i][j], (coordinate[i][j + 1] + 1)) == true)) {
						System.out.println("3-destra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] + 1) + "-"
								+ toStringSecondo(getDestra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero_3=3;
					}
					if ((getdoppiaSinistra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto(coordinate[i][j], (coordinate[i][j + 1] - 2)) == true)) {
						System.out.println("4-sinistra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] - 2) + "-"
								+ toStringSecondo(getdoppiaSinistra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero_4=4;
					}
					i++;
					if (pescabile) {
						do {
							System.out.println("\033[0;32m" + "scegli la tessera da pescare (3,4):" + "\033[0m");
							selezione = sc.nextInt();
							if (selezione < 3 || selezione > 4) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							} else if (selezione == numero_3) {
								break;
							} else if (selezione == numero_4) {
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								riprova = true;
							}
						} while (riprova==true);
						switch (selezione) {
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
								+ toStringSecondo(tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("pescaggio finito... proseguire");
					} else {
						System.out.println("\033[0;31m" + "non ci sono più tessere da pescare" + "\033[0m");
						System.out.println("pescaggio finito... proseguire");
					}
				}

				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due
				 * posizioni a destra e a sinistra
				 */
				else if (precedente == 4) {
					numero_1=0;
					numero_2=0;
					numero_3=0;
					numero_4=0;
					if ((getdoppiaDestra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto((coordinate[i][j]), (coordinate[i][j + 1]) + 2) == true)) {
						System.out.println("3-destra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] + 2) + "-"
								+ toStringSecondo(getdoppiaDestra(coordinate[i][j], coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero_3=3;
					}
					if ((getSinistra((coordinate[i][j]), coordinate[i][j + 1]) != TesseraOggetto.VUOTA
							&& LatoVuoto((coordinate[i][j]), (coordinate[i][j + 1]) - 1) == true)) {
						System.out.println("4-sinistra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] - 1) + "-"
								+ toStringSecondo(getSinistra((coordinate[i][j]), coordinate[i][j + 1])) + "\n");
						pescabile = true;
						numero_4=4;
					}
					i++;
					if (pescabile) {
						do {
							System.out.println("\033[0;32m" + "scegli la tessera da pescare (3,4):" + "\033[0m");
							selezione = sc.nextInt();
							if (selezione < 3 || selezione > 4) {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
							} else if (selezione == numero_3) {
								break;
							} else if (selezione == numero_4) {
								break;
							} else {
								System.out.println("\033[0;31m" + "numero tessera non valido" + "\033[0m");
								riprova = true;
							}
						} while (riprova==true);
						switch (selezione) {
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
								+ toStringSecondo(tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]));
						System.out.println("pescaggio finito... proseguire");
					} else {
						System.out.println("\033[0;31m" + "non ci sono più tessere da pescare" + "\033[0m");
						System.out.println("pescaggio finito... proseguire");
					}
				}
			} else {
				System.out.println("pescaggio finito... proseguire");
			}
		}
		return coordinate;
	}

	public void VisualizzaCoordinate(int[][] coordinate) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(coordinate[i][j] + " ");
			}
			System.out.println();
		}
	}
}
