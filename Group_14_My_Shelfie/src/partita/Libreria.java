package partita;

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
		System.out.println("\033[0;32m"+"Scegli la colonna nella quale vuoi inserire le tessere"+"\033[0m");
		N = sc.nextInt();
		while (N < 1 && N > 5) {
			System.out.println("\033[0;31m"+"Colonna che non esiste"+"\033[0m");
			N = sc.nextInt();
		}
		return N;
	}

	/**
	 * funzione necessaria a poter poi rappresentare a schermo la libreria
	 */
	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "\033[0;30m"+"V "+"\033[0m";
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
	
	public String toStringSecondo(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "\033[0;30m"+"VUOTO "+"\033[0m";
			break;
		case GATTO:
			tessera = "\033[0;32m"+"GATTO "+"\033[0m";
			break;
		case PIANTA:
			tessera = "\033[0;35m"+"PIANTA "+"\033[0m";
			break;
		case GIOCO:
			tessera = "\033[0;31m"+"GIOCO "+"\033[0m";
			break;
		case CORNICE:
			tessera = "\033[0;34m"+"CORNICE "+"\033[0m";
			break;
		case TROFEO:
			tessera = "\033[0;36m"+"TROFEO "+"\033[0m";
			break;
		case LIBRO:
			tessera = "\033[0;37m"+"LIBRO "+"\033[0m";
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

	public void setCellaVuoto() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				tesseraoggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
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
				if (getTessera(i, j) != TesseraOggetto.VUOTA) {
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
	 * funzione che inserisce nella libreria le tessere pescate dalla plancia
	 * @param plancia: è l'insieme di tutte le tessere
	 * @param coordinate: contiene le coordinate delle tessere pescate dalla plancia 
	 */
	public void inserimentoTessere(PlanciaGioco plancia, int[][] coordinate) {
		Libreria column = new Libreria();
		Scanner sc=new Scanner(System.in);
		int n = 0, x = 0, y = 0, t = 0;
		int scelta=0;
		int spaziDisponibili=6;
		boolean sceltaa=true;
		
		if(plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]) != TesseraOggetto.VUOTA) {
			t++;
		}
		if(plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) != TesseraOggetto.VUOTA) {
			t++;
		}
		if(plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) != TesseraOggetto.VUOTA) {
			t++;
		}
		
		do {
			n = column.selezionaColonna();
			
			for(int i=0; i<6; i++) {
				if(tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
					spaziDisponibili++;
				}
			}
		}while(spaziDisponibili<t);
			
		do {
			
			System.out.println("Quale tessera vuoi inserire? 1-"
			+toStringSecondo(plancia.getTessera(coordinate[x][y], coordinate[x][y + 1]))+" "+" 2-"
			+toStringSecondo(plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]))+" "+" 3-"
			+toStringSecondo(plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1])));
			scelta=sc.nextInt();
			
			while(scelta==1 && plancia.getTessera(coordinate[x][y], coordinate[x][y + 1])==TesseraOggetto.VUOTA || scelta==2 && plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1])==TesseraOggetto.VUOTA || scelta==3 && plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1])==TesseraOggetto.VUOTA ) {
				System.out.println("\033[0;31m"+"Seleziona una tessera che non sia VUOTA"+"\033[0m");
				scelta=sc.nextInt();
			}
			
			switch(scelta) {
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
					} else if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.GATTO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraoggetto[coordinate[x + 1][y]][coordinate[x + 1][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 1][y], coordinate[x + 1][y + 1]) == TesseraOggetto.TROFEO
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
					} else if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.GATTO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GATTO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.GIOCO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.GIOCO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.LIBRO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.LIBRO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.PIANTA
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.PIANTA;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					} else if (plancia.getTessera(coordinate[x + 2][y], coordinate[x + 2][y + 1]) == TesseraOggetto.TROFEO
							&& tesseraoggetto[i][n] == TesseraOggetto.VUOTA) {
						tesseraoggetto[i][n] = TesseraOggetto.TROFEO;
						plancia.tesseraoggetto[coordinate[x + 2][y]][coordinate[x + 2][y + 1]] = TesseraOggetto.VUOTA;
						break;
					}
				}
				break;
				
			default:
				System.out.println("\033[0;31m"+"Scegli un valore valido"+"\033[0m");
			}
			
			t--;
		} while(t>0);
	}

}
