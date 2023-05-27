package partita;

import java.util.Scanner;

import utils.TesseraOggetto;

/**
 * classe che permette di gestire la libreria
 */
public class Libreria {

	public int riga;
	public int colonna;

	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[6][5];
	Scanner sc = new Scanner(System.in);

	/**
	 * funzione che seleziona la colonna nella quale si vuole inserire la/le
	 * tessera/e
	 * 
	 * @return N: numero della colonna
	 */
	public int selezionaColonna() {
		String temp = new String();
		int N = -1;
		do {
			System.out.println("\033[0;32m" + "Scegli la colonna nella quale vuoi inserire le tessere" + "\033[0m");
			temp = sc.nextLine();
			if (isNumeric(temp)) {
				N = Integer.parseInt(temp);
			}
			if ((N < 0 || N > 4) && isNumeric(temp)) {
				System.out.println("\033[0;31m" + "ERRORE. Colonna che non esiste" + "\033[0m");
				System.out.println(" ");
			}
			if (!isNumeric(temp)) {
				System.out.println("Inserire un numero");
				System.out.println(" ");
			}
		} while (N < 0 || N > 4 || !isNumeric(temp));

		return N;
	}

	public Libreria() {

	}

	public Libreria(Libreria l) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (l.getTessera(i, j) == TesseraOggetto.CORNICE) {
					tesseraoggetto[i][j] = TesseraOggetto.CORNICE;
				} else if (l.getTessera(i, j) == TesseraOggetto.GATTO) {
					tesseraoggetto[i][j] = TesseraOggetto.GATTO;
				} else if (l.getTessera(i, j) == TesseraOggetto.GIOCO) {
					tesseraoggetto[i][j] = TesseraOggetto.GIOCO;
				} else if (l.getTessera(i, j) == TesseraOggetto.LIBRO) {
					tesseraoggetto[i][j] = TesseraOggetto.LIBRO;
				} else if (l.getTessera(i, j) == TesseraOggetto.PIANTA) {
					tesseraoggetto[i][j] = TesseraOggetto.PIANTA;
				} else if (l.getTessera(i, j) == TesseraOggetto.TROFEO) {
					tesseraoggetto[i][j] = TesseraOggetto.TROFEO;
				} else if (l.getTessera(i, j) == TesseraOggetto.VUOTA) {
					tesseraoggetto[i][j] = TesseraOggetto.VUOTA;
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

	public void setCellaVuota(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.VUOTA;
	}

	public void setCellaVuoto() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				tesseraoggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
	}

	public void CellaConfinantedx(Libreria l, int riga, int colonna) {
		l.getTessera(riga, colonna + 1);
	}

	public void CellaConfinantesx(Libreria l, int riga, int colonna) {

		l.getTessera(riga, colonna - 1);
	}

	public void CellaConfinantesopra(Libreria l, int riga, int colonna) {

		l.getTessera(riga - 1, colonna);
	}

	public void CellaConfinantesotto(Libreria l, int riga, int colonna) {

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
				if (tesseraoggetto[i][j] != null)
					riga = riga + toString(tesseraoggetto[i][j]);
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
				if (tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
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
				System.out.println("\033[0;36m" + "Quale tessera vuoi inserire?" + "\033[0m" +
						" 1-" + toStringSecondo(plancia.getTessera(coordinate[x][y], coordinate[x][y + 1])) + " " + 
						" 2-" + toStringSecondo(plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1])) + " " +
						" 3-" + toStringSecondo(plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1])));
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
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.CORNICE;
						plancia.tesseraoggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.GATTO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraoggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraoggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraoggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraoggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraoggetto[coordinate[x][y]][coordinate[x][y + 1]] = TesseraOggetto.VUOTA;
						break;
					}
				}
				break;

			case 2:
				for (int i = 5; i >= 0; i--) {
					if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.CORNICE
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.CORNICE;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.GATTO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y],
							coordinate[x + 1][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					}
				}
				break;

			case 3:
				for (int i = 5; i >= 0; i--) {
					if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.CORNICE
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.CORNICE;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.GATTO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y],
							coordinate[x + 2][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
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
		int numeroPescabili[] = { 0, 0, 0, 0, 0 };
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 6; i++) {
				if (this.tesseraoggetto[i][j] == TesseraOggetto.VUOTA) {
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
		return tesseraoggetto;
	}

	TesseraOggetto[][] libreria_appoggio = new TesseraOggetto[6][5]; // Libreria di appoggio per verifica punteggio

	public int ControllaObiettiviFinali() {
		int Punteggio = 0;
		int punteggiofinale[] = new int[6];
		int cont = 0;

		// CONTROLLO TESSERE GATTO
		reset(libreria_appoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] == TesseraOggetto.GATTO) {
					libreria_appoggio[i][j] = tesseraoggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreria_appoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreria_appoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggiofinale[0] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggiofinale[0] = cont;
			}
		}

		// CONTROLLO TESSERE TROFEO
		cont = 0;
		reset(libreria_appoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] == TesseraOggetto.TROFEO) {
					libreria_appoggio[i][j] = tesseraoggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreria_appoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreria_appoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggiofinale[1] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggiofinale[1] = cont;
			}
		}

		// CONTROLLO TESSERE CORNICI
		cont = 0;
		reset(libreria_appoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] == TesseraOggetto.CORNICE) {
					libreria_appoggio[i][j] = tesseraoggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreria_appoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreria_appoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggiofinale[2] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggiofinale[2] = cont;
			}
		}

		// CONTROLLO TESSERE LIBRI
		cont = 0;
		reset(libreria_appoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] == TesseraOggetto.LIBRO) {
					libreria_appoggio[i][j] = tesseraoggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreria_appoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreria_appoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggiofinale[3] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggiofinale[3] = cont;
			}
		}

		// CONTROLLO TESSERE GIOCHI
		cont = 0;
		reset(libreria_appoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] == TesseraOggetto.GIOCO) {
					libreria_appoggio[i][j] = tesseraoggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreria_appoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreria_appoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggiofinale[4] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggiofinale[4] = cont;
			}
		}

		// CONTROLLO TESSERE PIANTE
		cont = 0;
		reset(libreria_appoggio);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] == TesseraOggetto.PIANTA) {
					libreria_appoggio[i][j] = tesseraoggetto[i][j];
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (libreria_appoggio[i][j] == getDestra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSotto(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSinistra(i, j)) {
					cont++;
				}
				if (libreria_appoggio[i][j] == getSopra(i, j)) {
					cont++;
				}
				libreria_appoggio[i][j] = TesseraOggetto.VUOTA;
			}
		}

		if (cont == 0) {
			punteggiofinale[5] = 0;
		} else {
			if (cont < 4 && cont > 1) {
				cont++;
				punteggiofinale[5] = cont;
			}
		}

		for (int k = 0; k < 6; k++) {
			if (punteggiofinale[k] == 3) {
				Punteggio += 2;
			} else if (punteggiofinale[k] == 4) {
				Punteggio += 3;
			} else if (punteggiofinale[k] == 5) {
				Punteggio += 5;
			} else if (punteggiofinale[k] > 5) {
				Punteggio += 8;
			}
		}
		return Punteggio;
	}

	public TesseraOggetto getDestra(int riga, int colonna) {
		if (colonna == 4) {
			return TesseraOggetto.VUOTA;
		}
		return libreria_appoggio[riga][colonna + 1];
	}

	public TesseraOggetto getSopra(int riga, int colonna) {
		if (riga == 0) {
			return TesseraOggetto.VUOTA;
		}
		return libreria_appoggio[riga - 1][colonna];
	}

	public TesseraOggetto getSotto(int riga, int colonna) {
		if (riga == 5) {
			return TesseraOggetto.VUOTA;
		}
		return libreria_appoggio[riga + 1][colonna];
	}

	public TesseraOggetto getSinistra(int riga, int colonna) {
		if (colonna == 0) {
			return TesseraOggetto.VUOTA;
		}
		return libreria_appoggio[riga][colonna - 1];
	}

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
