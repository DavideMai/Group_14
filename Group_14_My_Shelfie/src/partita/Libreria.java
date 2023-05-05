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
	
	CellaLibreria [][] libreria = new CellaLibreria [6][5];
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[6][5];
	Scanner sc=new Scanner(System.in);
	
	/**
	 * funzione che seleziona la colonna nella quale si vuole inserire la/le tessera/e
	 * @return N: numero della colonna
	 */
	public int selezionaColonna() {
		int N;  	
		N=sc.nextInt();
		while(N<1&&N>5) {
			System.out.println("Inserimento errato");
			N=sc.nextInt();
		}
		return N;
	}
	
	/**
	 * funzione necessaria a poter poi rappresentare a schermo la libreria
	 */
	public String toString(){
		for(int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				return libreria[i][j] + " ";
			}	
		}
		return null;
	}
	
	/**
	 * funzione che mostra il tipo di tessera presente in una cella	
	 * @param riga: riga della cella
	 * @param colonna: colonna della cella
	 * @return tesseracontrollo: controlla se la cella e' vuota
	 */
	public TesseraOggetto getTessera(int riga, int colonna) {
		TesseraOggetto tesseracontrollo = TesseraOggetto.VUOTA;
			
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.CORNICE) {
			tesseracontrollo = TesseraOggetto.CORNICE;
		}
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.GATTO) {
			tesseracontrollo = TesseraOggetto.GATTO;
		}
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.TROFEO) {
			tesseracontrollo = TesseraOggetto.TROFEO;
		}
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.GIOCO) {
			tesseracontrollo = TesseraOggetto.GIOCO;
		}
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.LIBRO) {
			tesseracontrollo = TesseraOggetto.LIBRO;
		}
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.PIANTA) {
			tesseracontrollo = TesseraOggetto.PIANTA;
		}
		if(tesseraoggetto[riga][colonna] == TesseraOggetto.VUOTA) {
			tesseracontrollo = TesseraOggetto.VUOTA;
		}
		return tesseracontrollo;
	}
	
	/**
	 * serie di funzioni che rendono una cella della libreria un determinato tipo di tessera
	 * @param riga: riga della cella
	 * @param colonna: colonna della cella
	 */
	public void SetCellaTrofeo(int riga, int colonna) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.TROFEO;
	}
	public void SetCellaPianta(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.PIANTA;
	}
	public void SetCellaGatto(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GATTO;
	}
	public void SetCellaGioco(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.GIOCO;
	}
	public void SetCellaCornice(int riga) {
		tesseraoggetto[riga][colonna] = TesseraOggetto.CORNICE;
	}
	public void SetCellaLibro(int riga) {
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
		boolean controllo=false;
		for(int i=0;i<6;i++) {
			for(int j=0;j<5;j++) {
				if(getTessera(i,j)==TesseraOggetto.VUOTA) {
					controllo=false;
				}
				else {
					controllo=true;
					break;
				}
			}
		}
	}
	
	public void inserimentoTessere() {
		
	}
		
}
