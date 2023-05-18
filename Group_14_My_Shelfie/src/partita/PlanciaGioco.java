package partita;

import java.util.ArrayList;
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
		// serie di funzioni per rendere la cella della plancia una determinata tessera
		// oggetto

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

	// RiduciNumeroTessere serve a ridurre di 1 il numero di tessere disponibili

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

	/*
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

	// questo metodo restituisce che tessera è presente nella casella

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

	// celleConfinanti riconosce le celle confinanti ad una determinata cella e le stampa a schermo

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

	// visualizzaPlancia mostra la casella nella plancia con il tipo di tessera al suo interno

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

	// funzione random che posiziona un qualsiasi dei 6 tipi di tessere sulla plancia

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

	/* le quattro funzioni seguenti restituiscono le celle confinanti alla cella passata come parametro con riga e colonna
	 * i metodi getdoppia restituiscono le tessere a distanza di due celle da quella passata inizialmente
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
	 * pescabili, in caso ci fosse ancora una tessera pescabile il gioco continua senno la plancia
	 * viene ricaricata con il metodo set cella.
	 */
	public void ControlloTessere() {
		boolean controllo;
		int cellepescabili = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (tesseraoggetto[i][j] != TesseraOggetto.VUOTA && plancia[i][j].utilizzabile) {
					if (getSinistra(i, j) != TesseraOggetto.VUOTA && getDestra(i, j) != TesseraOggetto.VUOTA
							&& getSopra(i, j) != TesseraOggetto.VUOTA && getSotto(i, j) != TesseraOggetto.VUOTA) {
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
/*
 * metodo che assegna i colori e le lettere della plancia 
 */
	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "  ";
			break;
		case GATTO:
			tessera = "\033[0;32m"+"C "+"\033[0m";
			break;
		case PIANTA:
			tessera = "\033[0;35m"+"P "+"\033[0m";
			break;
		case GIOCO:
			tessera = "\033[0;31m"+"G "+"\033[0m";
			break;
		case CORNICE:
			tessera = "\033[0;34m"+"F "+"\033[0m";
			break;
		case TROFEO:
			tessera = "\033[0;36m"+"T "+"\033[0m";
			break;
		case LIBRO:
			tessera = "\033[0;37m"+"L "+"\033[0m";
			break;
		}
		return tessera;
	}
/*
 * metodo che permette di cotrollare se una tessera con coordinate riga e colonna ha almeno un lato libero
 */
	public Boolean LatoVuoto(int riga, int colonna) {
		if (getSinistra(riga, colonna) == TesseraOggetto.VUOTA || getDestra(riga, colonna) == TesseraOggetto.VUOTA
				|| getSopra(riga, colonna) == TesseraOggetto.VUOTA || getSotto(riga, colonna) == TesseraOggetto.VUOTA) {
			return true;
		}
		return false;
	}

	/* questa funzione permette di pescare le tessere dalla plancia, la funzione
	* ritorna un array dove sono contenute le coordinate delle carte pescate
	* la funzione permette di pescare soltanto carte con almeno un lato libero e
	* ovviamente con una tesssera al proprio interno
	* inoltre mostra a schermo soltanto le carte che possono essere pescate in caso
	* di una seconda o terza scelta
	* escludendo quelle vuote o quelle senza lato vuoto e usando anche la
	* condizione che siano adiacenti e che formino soltanto linee rette
	* SE AVETE MODIFICHE DA FARE CHE POSSONO ACCORCIARE IL CODICE FATE PURE, QUESTO
	* ERA L'UNICO MODO CHE MI E' VENUTO IN MENTE PER RENDERE
	* L'ESPERIENZA DI GIOCO IL PIU SEMPLICE POSSIBILE
	* */
	public int[][] PescaTessere() {
		int[][] coordinate = new int[3][2]; //array che salva le coordinate delle carte pescate
		int i = 0, j = 0, precedente = 0, selezione = 0;/*indice array...,
		                                                  indice array...,
		                                                  variabile di memorizzazione carta pescata precedentemente...,
		                                                  variabile utilizzata come indice a schermo che permette la scelta della carta da pescare
														*/
		int x = coordinate[i][j];//variabile usiliaria
		int y = coordinate[i + 1][j];//variabile usiliaria
		Boolean scelta, pescabile = false;//varibaili di controllo 

		Scanner sc = new Scanner(System.in);
		
//pescaggio prima tessera
		
		do {
			System.out.println("inserisci la riga della tessera che vuoi pescare: ");
			x = sc.nextInt();
			coordinate[i][j] = x;
			System.out.println("inserisci la colonna della tessera che vuoi pescare: ");
			y = sc.nextInt();
			coordinate[i][j + 1] = y;
			if (LatoVuoto(x, y) == false || getTessera(x, y) == TesseraOggetto.VUOTA) {
				System.out.println("la carta non può essere pescata, inserisci nuove coordinate: ");
			}
		} while (LatoVuoto(x, y) == false || getTessera(x, y) == TesseraOggetto.VUOTA);
		System.out.println("hai pescato la tessera " + tesseraoggetto[x][y]);
		i++;
		
//pescaggio seconda tessera
		
		System.out.println("vuoi pescare un'altra tessera? (scrivi true o false):");
		scelta = sc.nextBoolean();
		while (scelta) {
			System.out.println(
					"la tessera che peschi deve essere adiacente a quella precedente e deve avere almeno un lato libero, scegli tra queste: \n");
			if (getSotto(x, y) != TesseraOggetto.VUOTA && LatoVuoto((x + 1), y) == true) {
				System.out.println("1-sotto: " + (x + 1) + "," + y + " " + getSotto(x, y) + "\n");// sotto
				pescabile = true;
			}
			if (getSopra(x, y) != TesseraOggetto.VUOTA && LatoVuoto((x - 1), y) == true) {
				System.out.println("2-sopra: " + (x - 1) + "," + y + " " + getSopra(x, y) + "\n");// sopra
				pescabile = true;
			}
			if (getDestra(x, y) != TesseraOggetto.VUOTA && LatoVuoto(x, (y + 1)) == true) {
				System.out.println("3-destra: " + x + "," + (y + 1) + " " + getDestra(x, y) + "\n");// dx
				pescabile = true;
			}
			if (getSinistra(x, y) != TesseraOggetto.VUOTA && LatoVuoto(x, (y - 1)) == true) {
				System.out.println("4-sinistra: " + x + "," + (y - 1) + " " + getSinistra(x, y) + "\n");// sx
				pescabile = true;
			}
			if (pescabile == false) {
				System.out.println("non ci sono più tessere da pescare");
				break;
			}
			System.out.println("inserisci il numero della tessera che vuoi pescare (1,2,3,4): ");
			precedente = sc.nextInt();
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
			System.out.println("hai pescato la tessera " + tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]);
			scelta = false;
		    };
//pescaggio terza tessera
			
			pescabile = false;
			sc.reset();
			System.out.println("vuoi pescare un'altra tessera? (scrivi true o false):");
			scelta = sc.nextBoolean();
			if (scelta == true) 
			{
				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due posizioni sopra e sotto
				 */
				if (precedente == 1)
				{
					if ((getSotto(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto((coordinate[i][j] + 1), coordinate[i][j + 1]) == true)) 
					{
						System.out.println("1-sotto: " + (coordinate[i][j] + 1) + "," + coordinate[i][j + 1] + "-"
								+ getSotto(coordinate[i][j], coordinate[i][j + 1]) + "\n");
						pescabile = true;
					}
					if ((getdoppiaSopra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto((coordinate[i][j] - 2), coordinate[i][j + 1]) == true)) 
					{
						System.out.println("2-sopra: " + (coordinate[i][j] - 2) + "," + coordinate[i][j + 1] + "-"
								+ getdoppiaSopra(coordinate[i][j], coordinate[i][j + 1]) + "\n");
						pescabile = true;
					}
					i++;
					if (pescabile)
					{
					System.out.println("scegli la tessera da pescare (1,2):");
					selezione = sc.nextInt();
						switch (selezione) 
						{
						case 1:
							coordinate[i][j] = (coordinate[i-1][j] + 1);
							coordinate[i][j + 1] = coordinate[i-1][j + 1];
							break;
						case 2:
							coordinate[i][j] = (coordinate[i-1][j] - 2);
							coordinate[i][j + 1] = coordinate[i-1][j + 1];
							break;
						}
						System.out.println("hai pescato la tessera " + tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]);
						System.out.println("pescaggio finito... proseguire");
					 }
					else 
					{
						System.out.println("non ci sono più tessere da pescare");
						System.out.println("pescaggio finito... proseguire");
					}
				  }
					
				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due posizioni sotto e sopra
				 */
				else if (precedente == 2)
				{
					if ((getSopra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto((coordinate[i][j] - 1), coordinate[i][j + 1]) == true))
					{
						System.out.println("1-sopra: " + (coordinate[i][j] - 1) + "," + coordinate[i][j + 1] + "-"
								+ getSopra(coordinate[i][j], coordinate[i][j + 1]) + "\n");
						pescabile = true;
					}
					if ((getdoppiaSotto(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto((coordinate[i][j] + 2), coordinate[i][j + 1]) == true)) 
					{
						System.out.println("2-sotto: " + (coordinate[i][j] + 2) + "," + coordinate[i][j + 1] + "-"
								+ getdoppiaSotto(coordinate[i][j], coordinate[i][j + 1]) + "\n");
						pescabile = true;
					 }
					i++;
					if (pescabile) 
					{
					System.out.println("scegli la tessera da pescare (1,2):");
					selezione = sc.nextInt();
						switch (selezione) 
						{
						case 1:
							coordinate[i][j] = (coordinate[i-1][j] - 1);
							coordinate[i][j + 1] = coordinate[i-1][j + 1];
							break;
						case 2:
							coordinate[i][j] = (coordinate[i-1][j] + 2);
							coordinate[i][j + 1] = coordinate[i-1][j + 1];
							break;
						}
						System.out.println("hai pescato la tessera " + tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]);
						System.out.println("pescaggio finito... proseguire");
					}
					else 
					{
						System.out.println("non ci sono più tessere da pescare");
						System.out.println("pescaggio finito... proseguire");
					}
				}
					
				/*
				 * in base alla carta precedente mostra le carte disponibili da pescare due posizioni a sinistra e a destra
				 */
				else if (precedente == 3)
				{
						if ((getDestra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto(coordinate[i][j], (coordinate[i][j + 1] + 1)) == true)) {
							System.out.println("3-destra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] + 1) + "-"
									+ getDestra(coordinate[i][j], coordinate[i][j + 1]) + "\n");
							pescabile = true;
						}
						if ((getdoppiaSinistra(coordinate[i][j],coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto(coordinate[i][j], (coordinate[i][j + 1] - 2)) == true)) {
						System.out.println("4-sinistra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] - 2) + "-"
								+ getdoppiaSinistra(coordinate[i][j], coordinate[i][j + 1]) + "\n");
						    pescabile = true;
						}
						i++;
						if (pescabile) 
						{
							System.out.println("scegli la tessera da pescare (3,4):");
							selezione = sc.nextInt();
							switch (selezione) 
							{
							case 3:
								coordinate[i][j] = coordinate[i-1][j];
								coordinate[i][j + 1] = (coordinate[i-1][j + 1] + 1);
								break;
							case 4:
								coordinate[i][j] = coordinate[i-1][j];
								coordinate[i][j + 1] = (coordinate[i-1][j + 1] - 2);
								break;
							}
							System.out.println("hai pescato la tessera " + tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]);
							System.out.println("pescaggio finito... proseguire");
						}
						else 
						{
							System.out.println("non ci sono più tessere da pescare");
							System.out.println("pescaggio finito... proseguire");
						}
				}
						
		/*
		 * in base alla carta precedente mostra le carte disponibili da pescare due posizioni a destra e a sinistra
		 */
				else if (precedente == 4)
				{
						if((getdoppiaDestra(coordinate[i][j], coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto((coordinate[i][j]), (coordinate[i][j + 1]) + 2) == true))
						{
							System.out.println("3-destra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] + 2) + "-"
									+ getdoppiaDestra(coordinate[i][j], coordinate[i][j + 1]) + "\n");
							pescabile = true;
						}
						if((getSinistra((coordinate[i][j]), coordinate[i][j + 1]) != TesseraOggetto.VUOTA
									&& LatoVuoto((coordinate[i][j]), (coordinate[i][j + 1]) - 1) == true)) 
						{
						System.out.println("4-sinistra: " + coordinate[i][j] + "," + (coordinate[i][j + 1] - 1) + "-"
								+ getSinistra((coordinate[i][j]), coordinate[i][j + 1]) + "\n");
						    pescabile = true;
						}
						i++;
						if (pescabile) 
						{
							System.out.println("scegli la tessera da pescare (3,4):");
							selezione = sc.nextInt();
							switch (selezione) 
							{
							case 3:
								coordinate[i][j] = coordinate[i-1][j];
								coordinate[i][j + 1] = (coordinate[i-1][j + 1] + 2);
								break;
							case 4:
								coordinate[i][j] = coordinate[i-1][j];
								coordinate[i][j + 1] = (coordinate[i-1][j + 1] - 1);
								break;
							}
							System.out.println("hai pescato la tessera " + tesseraoggetto[coordinate[i][j]][coordinate[i][j + 1]]);
							System.out.println("pescaggio finito... proseguire");
						}
						else 
						{
							System.out.println("non ci sono più tessere da pescare");
							System.out.println("pescaggio finito... proseguire");
						}
				  }
				}
				else 
				{
					System.out.println("pescaggio finito... proseguire");
				}
		return coordinate;
	}
	public void VisualizzaCoordinate(int [][] coordinate)
	{
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(coordinate [i][j]+" ");
			}
			System.out.println();
		}
	}
}
