package main;

import java.util.Scanner;

public class Libreria {
	
	public int riga;
	public int colonna;
	
	CellaLibreria [][] libreria = new CellaLibreria [6][5];
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[6][5];
	Scanner sc=new Scanner(System.in);
	
	//funzione che seleziona la colonna nella quale inserire le tessere
	public int selezionaColonna() {
		int N;  	//variabile che identifica la colonna
		N=sc.nextInt();
		while(N<1&&N>5) {
			System.out.println("Inserimento errato");
			N=sc.nextInt();
		}
		return N;
	}
	
	//funzione per visualizzare a schermo la libreria
	public void visualizzaLibreria(){
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=4;j++) {
				System.out.println(libreria[i][j]);
				System.out.println(tesseraoggetto[i][j]);
			}	
		}
	}
	
	//funzione che restituisce il tipo di tessera presente nella cella	
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
	
	//serie di funzioni per rendere la cella della libreria una determinata tessera oggetto
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
}
