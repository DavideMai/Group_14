package partita;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import utils.CellaLibreria;
import utils.TesseraOggetto;

/**
 * classe che permette di gestire la libreria
 */
public class Libreria {

	public int riga;
	public int colonna;

	CellaLibreria[][] libreria = new CellaLibreria[6][5];
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[6][5];
	Scanner sc = new Scanner(System.in);

	/**
	 * funzione che seleziona la colonna nella quale si vuole inserire la/le
	 * tessera/e
	 * 
	 * @return N: numero della colonna
	 */
	public int selezionaColonna() {
		int N;
		do {
			System.out.println("\033[0;32m" + "Scegli la colonna nella quale vuoi inserire le tessere" + "\033[0m");
			N = sc.nextInt();
			if (N < 0 || N > 4) {
				System.out.println("\033[0;31m" + "Colonna che non esiste" + "\033[0m");
			}
		} while (N < 0 || N > 4);

		return N;
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

	/**
	 * serie di funzioni che rendono una cella della libreria un determinato tipo di
	 * tessera
	 * 
	 * @param riga:    riga della cella
	 * @param colonna: colonna della cella
	 */
	public void setCellaTrofeo(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.TROFEO;
	}

	public void setCellaPianta(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.PIANTA;
	}

	public void setCellaGatto(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GATTO;
	}

	public void setCellaGioco(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GIOCO;
	}

	public void setCellaCornice(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.CORNICE;
	}

	public void setCellaLibro(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.LIBRO;
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
		System.out.println("Visualizzazione libreria");
		System.out.println("    ");
		String riga = new String();
		System.out.println("     0 1 2 3 4 ");
		System.out.println("     ");
		for (int i = 0; i < 6; i++) {
			riga = i + "    ";
			for (int j = 0; j < 5; j++) {
				if (tesseraoggetto[i][j] != null)
					riga = riga + toString(tesseraoggetto[i][j]);
			}
			System.out.println(riga);
		}
		int massimo = this.numeroMassimoDaPescare();
		System.out.println("Numero massimo di tessere pescabili: " + massimo);
	}

	/**
	 * funzione che controlla se la libreria è piena oppure ha ancora celle libere
	 * 
	 * @return controllo: può essere false (libreria piena) oppure true (ci sono
	 *         celle vuote)
	 */
	public boolean controlloLibreria() {
		boolean controllo = false;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.getTessera(i, j) != TesseraOggetto.VUOTA) {
					controllo = false;
				} else {
					controllo = true;
					break;
				}
			}
		}
		if (controllo == false) {
			System.out.println("la libreria è piena");
		} else {
			System.out.println("La libreria ha ancora celle libere");
		}
		return controllo;
	}

	/**
	 * funzione che controlla se ci sono abbastanza spazi disponibili nella libreria
	 * per poter inserire le tessere pescate dalla plancia
	 * 
	 * @param plancia:    è l'insieme di tutte le tessere
	 * @param coordinate: contiene le coordinate delle tessere pescate dalla plancia
	 * @return false: non ci sono abbastanza spazi nella libreria per inserire le
	 *         tessere. Rifare il pescaggio delle tessere
	 * @return true: nella libreria ci sono abbastanza spazi per inserire le tessere
	 *         pescate
	 */
	public boolean controlloIncrociato(PlanciaGioco plancia, int[][] coordinate) {
		int x = 0, y = 0, t = 0;
		int spaziDisponibili0 = 0, spaziDisponibili1 = 0, spaziDisponibili2 = 0, spaziDisponibili3 = 0,
				spaziDisponibili4 = 0;

		if (plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) != TesseraOggetto.VUOTA) {
			t++; // t è la variabile che conta il numero di tessere da inserire
		}
		if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) != TesseraOggetto.VUOTA) {
			t++; // t è la variabile che conta il numero di tessere da inserire
		}
		if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) != TesseraOggetto.VUOTA) {
			t++; // t è la variabile che conta il numero di tessere da inserire
		}

		// colonna 0
		for (int i = 0; i < 6; i++) {
			if (tesseraoggetto[i][0] == TesseraOggetto.VUOTA) {
				spaziDisponibili0++;
			}
		}
		// colonna 1
		for (int i = 0; i < 6; i++) {
			if (tesseraoggetto[i][1] == TesseraOggetto.VUOTA) {
				spaziDisponibili1++;
			}
		}
		// colonna 2
		for (int i = 0; i < 6; i++) {
			if (tesseraoggetto[i][2] == TesseraOggetto.VUOTA) {
				spaziDisponibili2++;
			}
		}
		// colonna 3
		for (int i = 0; i < 6; i++) {
			if (tesseraoggetto[i][3] == TesseraOggetto.VUOTA) {
				spaziDisponibili3++;
			}
		}
		// colonna 4
		for (int i = 0; i < 6; i++) {
			if (tesseraoggetto[i][4] == TesseraOggetto.VUOTA) {
				spaziDisponibili4++;
			}
		}

		if (spaziDisponibili0 < t && spaziDisponibili1 < t && spaziDisponibili2 < t && spaziDisponibili3 < t
				&& spaziDisponibili4 < t) {
			return false;
		}
		return true;
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
				} else {
					spaziDisponibili = spaziDisponibili;
				}
			}
			if (spaziDisponibili < t) {
				System.out.println("\033[0;31m" + "Seleziona una colonna valida" + "\033[0m");
			}
		} while (spaziDisponibili < t);

		do {
			do {
				System.out.println("Quale tessera vuoi inserire? 1-"
						+ toStringSecondo(plancia.getTessera(coordinate[x][y], coordinate[x][y + 1])) + " " + " 2-"
						+ toStringSecondo(plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1])) + " "
						+ " 3-" + toStringSecondo(plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1])));
				scelta = sc.nextInt(); // scelta indica quale tessera inserire per prima
				if (scelta == 1 && plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) == TesseraOggetto.VUOTA
						|| scelta == 2 && plancia.getTessera(coordinate[x + 1][y],
								coordinate[x + 1][y + 1]) == TesseraOggetto.VUOTA
						|| scelta == 3 && plancia.getTessera(coordinate[x + 2][y],
								coordinate[x + 2][y + 1]) == TesseraOggetto.VUOTA) {
					System.out.println("\033[0;31m" + "Seleziona una tessera che non sia VUOTA" + "\033[0m");
				}
				if (scelta < 1 || scelta > 3) {
					System.out.println("\033[0;31m" + "Scegli un valore valido" + "\033[0m");
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
	 * @return il numero massimo di tessere da pescare
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
}
