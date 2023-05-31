package partita;

import java.util.Scanner;

import utils.TesseraOggetto;

/**
 * classe che permette di gestire la libreria
 */
public class Libreria {

	public int riga;
	public int colonna;

	TesseraOggetto[][] tesseraOggetto = new TesseraOggetto[6][5];
	TesseraOggetto[][] libreriaAppoggio = new TesseraOggetto[6][5]; // Libreria di appoggio per verifica punteggio
	Scanner sc = new Scanner(System.in);

	/**
	 * funzione che seleziona la colonna nella quale si vuole inserire la/le
	 * tessera/e
	 * 
	 * @return n: numero della colonna
	 */
	public int selezionaColonna() {
		String temp = new String();
		int n = -1;
		do {
			System.out.println("\033[0;32m" + "Scegli la colonna nella quale vuoi inserire le tessere" + "\033[0m");
			temp = sc.nextLine();
			if (isNumeric(temp)) {
				n = Integer.parseInt(temp);
			}
			if ((n < 0 || n > 4) && isNumeric(temp)) {
				System.out.println("\033[0;31m" + "ERRORE. Colonna che non esiste" + "\033[0m");
				System.out.println(" ");
			}
			if (!isNumeric(temp)) {
				System.out.println("\033[0;31m" + "ERRORE. Inserire un numero" + "\033[0m");
				System.out.println(" ");
			}
		} while (n < 0 || n > 4 || !isNumeric(temp));

		return n;
	}

	public Libreria() {

	}

	/**
	 * costruttore della libreria
	 * 
	 * @param l la libreria da copiare
	 */
	public Libreria(Libreria l) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (l.getTessera(i, j) == TesseraOggetto.CORNICE) {
					tesseraOggetto[i][j] = TesseraOggetto.CORNICE;
				} else if (l.getTessera(i, j) == TesseraOggetto.GATTO) {
					tesseraOggetto[i][j] = TesseraOggetto.GATTO;
				} else if (l.getTessera(i, j) == TesseraOggetto.GIOCO) {
					tesseraOggetto[i][j] = TesseraOggetto.GIOCO;
				} else if (l.getTessera(i, j) == TesseraOggetto.LIBRO) {
					tesseraOggetto[i][j] = TesseraOggetto.LIBRO;
				} else if (l.getTessera(i, j) == TesseraOggetto.PIANTA) {
					tesseraOggetto[i][j] = TesseraOggetto.PIANTA;
				} else if (l.getTessera(i, j) == TesseraOggetto.TROFEO) {
					tesseraOggetto[i][j] = TesseraOggetto.TROFEO;
				} else if (l.getTessera(i, j) == TesseraOggetto.VUOTA) {
					tesseraOggetto[i][j] = TesseraOggetto.VUOTA;
				}
			}
		}

	}

	/**
	 * funzione necessaria a poter poi rappresentare a schermo la libreria
	 */
	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "\033[0;30m" + "V " + "\033[0m";
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
	 * funzione necessaria a poter poi rappresentare a schermo la libreria
	 */
	public String toStringSecondo(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "\033[0;30m" + "VUOTO " + "\033[0m";
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
	 * funzione che mostra il tipo di tessera presente in una cella
	 * 
	 * @param riga:    riga della cella
	 * @param colonna: colonna della cella
	 * @return tesseracontrollo: controlla se la cella e' vuota
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
	 * setta la cella della libreria a vuota
	 * 
	 * @param riga    riga della cella
	 * @param colonna colonna della cella
	 */
	public void setCellaVuota(int riga, int colonna) {
		tesseraOggetto[riga][colonna] = TesseraOggetto.VUOTA;
	}

	/**
	 * setta ogni cella della libreria a vuota
	 */
	public void setCellaVuoto() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				tesseraOggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
	}

	/**
	 * accede alla libreria e controlla la cella confinante a destra
	 * 
	 * @param l       libreria da controllare
	 * @param riga    riga della cella da controllare
	 * @param colonna colonna della cella da controllare
	 */
	public void cellaConfinanteDx(Libreria l, int riga, int colonna) {
		l.getTessera(riga, colonna + 1);
	}

	/**
	 * accede alla libreria e controlla la cella confinante a sinistra
	 * 
	 * @param l       libreria da controllare
	 * @param riga    riga della cella da controllare
	 * @param colonna colonna della cella da controllare
	 */
	public void cellaConfinanteSx(Libreria l, int riga, int colonna) {

		l.getTessera(riga, colonna - 1);
	}

	/**
	 * accede alla libreria e controlla la cella confinante sopra
	 * 
	 * @param l       libreria da controllare
	 * @param riga    riga della cella da controllare
	 * @param colonna colonna della cella da controllare
	 */
	public void cellaConfinanteSopra(Libreria l, int riga, int colonna) {

		l.getTessera(riga - 1, colonna);
	}

	/**
	 * accede alla libreria e controlla la cella confinante sotto
	 * 
	 * @param l       libreria da controllare
	 * @param riga    riga della cella da controllare
	 * @param colonna colonna della cella da controllare
	 */
	public void cellaConfinanteSotto(Libreria l, int riga, int colonna) {

		l.getTessera(riga + 1, colonna);
	}

	/**
	 * funzione che visualizza a schermo la libreria
	 */
	public void visualizzaLibreria() {
		System.out.println("   ");
		System.out.println("\033[0;36m" + "Visualizzazione libreria" + "\033[0m");
		System.out.println("    ");
		String riga = new String();
		System.out.println("  | 0 1 2 3 4 |");
		System.out.println("- | - - - - - |");
		for (int i = 0; i < 6; i++) {
			riga = i + " | ";
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] != null)
					riga = riga + toString(tesseraOggetto[i][j]);
			}
			System.out.println(riga + "| ");
		}
		System.out.println("- | - - - - - |");
		int massimo = this.numeroMassimoDaPescare();
		System.out.println("Numero massimo di tessere pescabili: " + "\033[0;32m" + massimo + "\033[0m");
		System.out.println(" ");
	}

	/**
	 * funzione che controlla se la libreria è piena oppure ha ancora celle libere
	 * 
	 * @return controllo: può essere true (libreria piena) oppure false (ci sono
	 *         celle vuote)
	 */

	public boolean controlloLibreria() {
		boolean controllo = true;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.getTessera(i, j).equals(TesseraOggetto.VUOTA)) {
					controllo = false;
				}
			}
		}
		if (controllo) {
			System.out.println("\033[0;31m" + "la libreria e' piena" + "\033[0m");
			System.out.println(" ");
		} else {
			System.out.println("\033[0;32m" + "La libreria ha ancora celle libere" + "\033[0m");
			System.out.println(" ");
		}
		return controllo;
	}

	/**
	 * funzione che inserisce nella libreria le tessere pescate dalla plancia
	 * 
	 * @param plancia:    è l'insieme di tutte le tessere
	 * @param coordinate: contiene le coordinate delle tessere pescate dalla plancia
	 */
	public void inserimentoTessere(PlanciaGioco plancia, int[][] coordinate) {
		Libreria column = new Libreria();
		Scanner sc = new Scanner(System.in);
		int n = 0, x = 0, y = 0, t = 0;
		int scelta = 0;
		int spaziDisponibili = 0;
		String temp = new String();

		if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) != TesseraOggetto.VUOTA) {
			t++; // t è la variabile che conta il numero di tessere da inserire
		}
		if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) != TesseraOggetto.VUOTA) {
			t++; // t è la variabile che conta il numero di tessere da inserire
		}
		if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) != TesseraOggetto.VUOTA) {
			t++; // t è la variabile che conta il numero di tessere da inserire
		}

		do {
			n = column.selezionaColonna(); // n è il numero della colonna scelta
			spaziDisponibili = 0;
			for (int i = 0; i < 6; i++) {
				if (tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
					spaziDisponibili++;
				}
			}
			if (spaziDisponibili < t) {
				System.out.println("\033[0;31m" + "ERRORE. Seleziona una colonna valida" + "\033[0m");
				System.out.println(" ");
			}
		} while (spaziDisponibili < t);

		do {
			do {
				System.out.println("\033[0;36m" + "Quale tessera vuoi inserire?" + "\033[0m" + " 1-"
						+ toStringSecondo(plancia.getTessera(coordinate[x][y], coordinate[x][y + 1])) + " " + " 2-"
						+ toStringSecondo(plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1])) + " "
						+ " 3-" + toStringSecondo(plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1])));
				temp = sc.nextLine();
				if (isNumeric(temp)) {
					scelta = Integer.parseInt(temp);
				}
				if (scelta == 1 && plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.VUOTA
						|| scelta == 2 && plancia.getTessera(coordinate[x + 1][y],
								coordinate[x + 1][y + 1]) == TesseraOggetto.VUOTA
						|| scelta == 3 && plancia.getTessera(coordinate[x + 2][y],
								coordinate[x + 2][y + 1]) == TesseraOggetto.VUOTA) {
					System.out.println("\033[0;31m" + "ERRORE. Seleziona una tessera che non sia VUOTA" + "\033[0m");
					System.out.println(" ");
				}
				if (scelta < 1 || scelta > 3) {
					System.out.println("\033[0;31m" + "ERRORE. Scegli un numero tra 1 e 3" + "\033[0m");
					System.out.println(" ");
				}
			} while (scelta < 1 || scelta > 3
					|| scelta == 1 && plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.VUOTA
					|| scelta == 2 && plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.VUOTA
					|| scelta == 3 && plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.VUOTA);

			switch (scelta) {
			case 1:
				for (int i = 5; i >= 0; i--) {
					if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.CORNICE
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.CORNICE;
						plancia.tesseraOggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.GATTO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraOggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraOggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraOggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraOggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraOggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					}
				}
				break;

			case 2:
				for (int i = 5; i >= 0; i--) {
					if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.CORNICE
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.CORNICE;
						plancia.tesseraOggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.GATTO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraOggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraOggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraOggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraOggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraOggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					}
				}
				break;

			case 3:
				for (int i = 5; i >= 0; i--) {
					if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.CORNICE
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.CORNICE;
						plancia.tesseraOggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.GATTO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraOggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraOggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraOggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraOggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraOggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraOggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraOggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					}
				}
				break;
			}

			t--;
		} while (t > 0);
	}

	/**
	 * questo metodo trova quante tessere si possono pescare al massimo, in base al
	 * numero di celle vuote per ogni colonna della libreria
	 * 
	 * @return massimo: il numero massimo di tessere da pescare
	 */
	public int numeroMassimoDaPescare() {
		int[] numeroPescabili = { 0, 0, 0, 0, 0 };
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 6; i++) {
				if (this.tesseraOggetto[i][j] == TesseraOggetto.VUOTA) {
					numeroPescabili[j]++;
				}
			}
		}
		int massimo = 0;
		for (int k = 0; k < 5; k++) {
			if (numeroPescabili[k] > massimo) {
				massimo = numeroPescabili[k];
			}
		}
		if (massimo >= 3) {
			massimo = 3;
		}
		return massimo;
	}

	public TesseraOggetto[][] getTesseraoggetto() {
		return tesseraOggetto;
	}

	/**
	 * controlla il completamento degli obiettivi di fine partita, e restituisce un
	 * aumento di punteggio
	 * 
	 * @return quanti punti guadagna il giocatore
	 */
	public int controllaObiettiviFinali() {
		int punteggio = 0;
		int punteggioFinale[] = new int[6];
		int cont = 0;

		// CONTROLLO TESSERE GATTO
		reset(libreriaAppoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] == TesseraOggetto.GATTO) {
					libreriaAppoggio[i][j] = tesseraOggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreriaAppoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreriaAppoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggioFinale[0] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggioFinale[0] = cont;
			}
		}

		// CONTROLLO TESSERE TROFEO
		cont = 0;
		reset(libreriaAppoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] == TesseraOggetto.TROFEO) {
					libreriaAppoggio[i][j] = tesseraOggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreriaAppoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreriaAppoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggioFinale[1] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggioFinale[1] = cont;
			}
		}

		// CONTROLLO TESSERE CORNICI
		cont = 0;
		reset(libreriaAppoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] == TesseraOggetto.CORNICE) {
					libreriaAppoggio[i][j] = tesseraOggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreriaAppoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreriaAppoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggioFinale[2] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggioFinale[2] = cont;
			}
		}

		// CONTROLLO TESSERE LIBRI
		cont = 0;
		reset(libreriaAppoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] == TesseraOggetto.LIBRO) {
					libreriaAppoggio[i][j] = tesseraOggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreriaAppoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreriaAppoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggioFinale[3] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggioFinale[3] = cont;
			}
		}

		// CONTROLLO TESSERE GIOCHI
		cont = 0;
		reset(libreriaAppoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] == TesseraOggetto.GIOCO) {
					libreriaAppoggio[i][j] = tesseraOggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreriaAppoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreriaAppoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggioFinale[4] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggioFinale[4] = cont;
			}
		}

		// CONTROLLO TESSERE PIANTE
		cont = 0;
		reset(libreriaAppoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraOggetto[i][j] == TesseraOggetto.PIANTA) {
					libreriaAppoggio[i][j] = tesseraOggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreriaAppoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreriaAppoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreriaAppoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggioFinale[5] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggioFinale[5] = cont;
			}
		}

		for (int k = 0; k < 6; k++) {
			if (punteggioFinale[k] == 3) {
				punteggio += 2;
			} else if (punteggioFinale[k] == 4) {
				punteggio += 3;
			} else if (punteggioFinale[k] == 5) {
				punteggio += 5;
			} else if (punteggioFinale[k] > 5) {
				punteggio += 8;
			}
		}
		return punteggio;
	}

	/**
	 * preleva la tessera oggetto a destra di quella selezionata
	 * 
	 * @param riga    riga della tessera da analizzare
	 * @param colonna colonna della tessera da analizzare
	 * @return la tesseraoggetto
	 */
	public TesseraOggetto getDestra(int riga, int colonna) {
		if (colonna == 4) {
			return TesseraOggetto.VUOTA;
		}
		return libreriaAppoggio[riga][colonna + 1];
	}

	/**
	 * preleva la tessera oggetto sopra quella selezionata
	 * 
	 * @param riga    riga della tessera da analizzare
	 * @param colonna colonna della tessera da analizzare
	 * @return la tesseraoggetto
	 */
	public TesseraOggetto getSopra(int riga, int colonna) {
		if (riga == 0) {
			return TesseraOggetto.VUOTA;
		}
		return libreriaAppoggio[riga - 1][colonna];
	}

	/**
	 * preleva la tessera oggetto sotto quella selezionata
	 * 
	 * @param riga    riga della tessera da analizzare
	 * @param colonna colonna della tessera da analizzare
	 * @return la tesseraoggetto
	 */
	public TesseraOggetto getSotto(int riga, int colonna) {
		if (riga == 5) {
			return TesseraOggetto.VUOTA;
		}
		return libreriaAppoggio[riga + 1][colonna];
	}

	/**
	 * preleva la tessera oggetto a sinistra di quella selezionata
	 * 
	 * @param riga    riga della tessera da analizzare
	 * @param colonna colonna della tessera da analizzare
	 * @return la tesseraoggetto
	 */
	public TesseraOggetto getSinistra(int riga, int colonna) {
		if (colonna == 0) {
			return TesseraOggetto.VUOTA;
		}
		return libreriaAppoggio[riga][colonna - 1];
	}

	/**
	 * passata una matrice di tessere oggetto, setta ogni elemento a vuoto
	 * 
	 * @param t la matrice da settare a vuota
	 */
	public void reset(TesseraOggetto[][] t) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				t[i][j] = TesseraOggetto.VUOTA;
			}
		}
	}

	/**
	 * Metodo che, passata una stringa, controlla se è un numero
	 * 
	 * @param str stringa da controllare
	 * @return true se è un numero, false se non lo è
	 */
	public boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
