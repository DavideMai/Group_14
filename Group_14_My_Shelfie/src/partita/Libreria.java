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
		N = sc.nextInt();
		while (N < 1 && N > 5) {
			System.out.println("Inserimento errato");
			N = sc.nextInt();
		}
		return N;
	}

	/**
	 * funzione necessaria a poter poi rappresentare a schermo la libreria
	 */
	public String toString() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				return tesseraoggetto[i][j] + " ";
			}
		}
		return null;
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

	public void setCellaPianta(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.PIANTA;
	}

	public void setCellaGatto(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GATTO;
	}

	public void setCellaGioco(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GIOCO;
	}

	public void setCellaCornice(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.CORNICE;
	}

	public void setCellaLibro(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.LIBRO;
	}

	/**
	 * funzione che visualizza a schermo la libreria
	 */
	public void visualizzaLibreria() {
		System.out.println(toString());
	}

	/**
	 * funzione che controlla se la libreria è piena oppure ha ancora celle libere
	 */
	public void controlloLibreria() {
		boolean controllo = false;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (getTessera(i, j) == TesseraOggetto.VUOTA) {
					controllo = false;
				} else {
					controllo = true;
					break;
				}
			}
		}
	}

	public void inserimentoTessere(PlanciaGioco plancia) {
		Libreria column=new Libreria();
		int n=0;
		int[][] coordinate;
		int x1=0, y1=0, x2=0, y2=0, x3=0, y3=0;
		
		coordinate=plancia.PescaTessere();
		
		x1=coordinate[0][0];
		y1=coordinate[0][1];
		x2=coordinate[1][0];
		y2=coordinate[1][1];
		x3=coordinate[2][0];
		y3=coordinate[2][1];
		
		n=column.selezionaColonna();
		
		for(int i=0; i<6; i++) {
			if(plancia.getTessera(x1, y1)==TesseraOggetto.CORNICE && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.CORNICE;
			}
			else if(plancia.getTessera(x1, y1)==TesseraOggetto.GATTO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.GATTO;
			}
			else if(plancia.getTessera(x1, y1)==TesseraOggetto.GIOCO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.GIOCO;
			}
			else if(plancia.getTessera(x1, y1)==TesseraOggetto.LIBRO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.LIBRO;
			}
			else if(plancia.getTessera(x1, y1)==TesseraOggetto.PIANTA && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.PIANTA;
			}
			else if(plancia.getTessera(x1, y1)==TesseraOggetto.TROFEO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.TROFEO;
			}
		}
		
		for(int i=0; i<6; i++) {
			if(plancia.getTessera(x2, y2)==TesseraOggetto.CORNICE && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.CORNICE;
			}
			else if(plancia.getTessera(x2, y2)==TesseraOggetto.GATTO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.GATTO;
			}
			else if(plancia.getTessera(x2, y2)==TesseraOggetto.GIOCO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.GIOCO;
			}
			else if(plancia.getTessera(x2, y2)==TesseraOggetto.LIBRO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.LIBRO;
			}
			else if(plancia.getTessera(x2, y2)==TesseraOggetto.PIANTA && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.PIANTA;
			}
			else if(plancia.getTessera(x2, y2)==TesseraOggetto.TROFEO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.TROFEO;
			}
		}
		
		for(int i=0; i<6; i++) {
			if(plancia.getTessera(x3, y3)==TesseraOggetto.CORNICE && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.CORNICE;
			}
			else if(plancia.getTessera(x3, y3)==TesseraOggetto.GATTO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.GATTO;
			}
			else if(plancia.getTessera(x3, y3)==TesseraOggetto.GIOCO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.GIOCO;
			}
			else if(plancia.getTessera(x3, y3)==TesseraOggetto.LIBRO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.LIBRO;
			}
			else if(plancia.getTessera(x3, y3)==TesseraOggetto.PIANTA && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.PIANTA;
			}
			else if(plancia.getTessera(x3, y3)==TesseraOggetto.TROFEO && tesseraoggetto[i][n]==TesseraOggetto.VUOTA) {
				tesseraoggetto[i][n]=TesseraOggetto.TROFEO;
			}
		}
	}
	
	public void cancellaTessere(PlanciaGioco plancia) {
		int[][] coordinate;
		int x1=0, y1=0, x2=0, y2=0, x3=0, y3=0;
		
		coordinate=plancia.PescaTessere();
		
		x1=coordinate[0][0];
		y1=coordinate[0][1];
		x2=coordinate[1][0];
		y2=coordinate[1][1];
		x3=coordinate[2][0];
		y3=coordinate[2][1];
		
		plancia.tesseraoggetto[x1][y1]=TesseraOggetto.VUOTA;
		plancia.tesseraoggetto[x2][y2]=TesseraOggetto.VUOTA;
		plancia.tesseraoggetto[x3][y3]=TesseraOggetto.VUOTA;
	}

}
