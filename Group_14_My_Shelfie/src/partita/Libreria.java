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
	public String toString(TesseraOggetto t) {
		String tessera = new String();
		switch (t) {
		case VUOTA:
			tessera = "V ";
			break;
		case GATTO:
			tessera = "C ";
			break;
		case PIANTA:
			tessera = "P ";
			break;
		case GIOCO:
			tessera = "G ";
			break;
		case CORNICE:
			tessera = "F ";
			break;
		case TROFEO:
			tessera = "T ";
			break;
		case LIBRO:
			tessera = "L ";
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
		for(int i=0; i<6; i++) {
			for(int j=0; j<5; j++) {
				tesseraoggetto[i][j]=TesseraOggetto.VUOTA;
			}
		}
	}

	/**
	 * funzione che visualizza a schermo la libreria
	 */
	public void visualizzaLibreria() {
		String riga = new String();
		System.out.println("     0 1 2 3 4 ");
		System.out.println("     ");
		for (int i=0; i<6; i++) {
			riga=i+"    ";
			for (int j=0; j<5; j++) {
				if (tesseraoggetto[i][j] != null)
					riga=riga+toString(tesseraoggetto[i][j]);
			}
			System.out.println(riga);
		}
	}

	/**
	 * funzione che controlla se la libreria è piena oppure ha ancora celle libere
	 * @return controllo: può essere false (libreria piena) oppure true (ci sono celle vuote)
	 */
	public boolean controlloLibreria() {
		boolean controllo = false;
		for (int i=0; i<6; i++) {
			for (int j=0; j<5; j++) {
				if (getTessera(i, j)!=TesseraOggetto.VUOTA) {
					controllo=false;
				} else {
					controllo=true;
					break;
				}
			}
		}
		if(controllo==false) {
			System.out.println("la libreria è piena");
		}
		else {
			System.out.println("La libreria ha ancora celle libere");
		}
		return controllo;
	}

	public void inserimentoTessere(PlanciaGioco plancia , int [][]coordinate) {
		Libreria column=new Libreria();
		int n=0;
		int x1=0, y1=0, x2=0, y2=0, x3=0, y3=0;

		
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
	
	public void cancellaTessere(PlanciaGioco plancia, int [][] coordinate) {
		int x1=0, y1=0, x2=0, y2=0, x3=0, y3=0;
		
		
		
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
