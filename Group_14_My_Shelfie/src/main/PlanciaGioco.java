package main;

public class PlanciaGioco {
	
	public int contatore_giocatori, codice_cella;
	//Cella [][] arrayplancia = new Cella [riga][colonna];	
	Cella [][] plancia= new Cella [9][9];	//questo attributo viene usato per gestire la plancia
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[9][9];	//matrice per gestire le tessere sulla plancia
	int numeroGatti = 22, numeroTrofei = 22, numeroGiochi = 22, numeroCornici = 22, numeroPiante = 22, numeroLibri = 22;
	
	//questa funzione seleziona una cella per esempio per pescare una carta dalla plancia 
	
	/*public boolean Selezione (int riga ,int colonna) {
		boolean contenuto;
		contenuto = plancia[riga][colonna].utilizzabile;
		return contenuto;
	}
	commento perchè per ora è inutile, sostituita con getTessera.*/
	
	
	
	/*questa funzione imposta lo stato della plancia in
    / base al numero di giocatori inizializzando il contenuto di ogni cella,
    / (di tipo stringa) in 'cella libera' o ' cella inutilizzabile?, e mettendo quindi a disposizione le celle al gioco 
    */
	
	public void CancellaCelle (int contatore_giocatori ) 
	{
		System.out.println("Preparazione plancia di gioco...");
	
	    this.contatore_giocatori = contatore_giocatori;
		
		if (contatore_giocatori == 2)
		{
			for (int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++)
				{
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
		};
		if (contatore_giocatori == 3)
	    {
			for (int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++)
				{
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
		if (contatore_giocatori == 4)
		{
			for (int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++)
				{
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
	}		//termine di Cancellacelle
	//serie di funzioni per rendere la cella della plancia una determinata tessera oggetto
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
	
	//RiduciNumeroTessere serve a ridurre di 1 il numero di tessere disponibili
	
	public void RiduciNumeroTessere(TesseraOggetto tessera) {
		switch(tessera) {
		case TROFEO:
			if(numeroTrofei > 0) {
				numeroTrofei--;
			}
			break;
		case PIANTA:
			if(numeroPiante > 0) {
				numeroPiante--;
			}
			break;
		case GATTO:
			if(numeroGatti > 0) {
				numeroGatti--;
			}
			break;
		case GIOCO:
			if(numeroGiochi > 0) {
				numeroGiochi--;
			}
			break;
		case LIBRO:
			if(numeroLibri > 0) {
				numeroLibri--;
			}
			break;
		case CORNICE:
			if(numeroCornici > 0) {
				numeroCornici--;
			}
		}
	}
	
	/*
	 * Il costruttore PlanciaGioco stabilisce quali celle sono utilizzabili
	 * in base al numero di giocatori nella partita.
	 * Il contenuto vale:
	 * 1 se inutilizzabile
	 * 2 se utilizzabile con almeno 2 giocatori
	 * 3 se utilizzabile con almeno 3 giocatori
	 * 4 se utilizzabile con almeno 4 giocatori
	 */
	
	public PlanciaGioco() {
		//prima riga, tutte le colonne
		
		plancia[0][0].codice_cella = 1;		//inutilizzabile
		plancia[0][1].codice_cella = 1;
		plancia[0][2].codice_cella = 1;
		plancia[0][3].codice_cella = 3;		//almeno 3 giocatori
		plancia[0][4].codice_cella = 4;		//almno 4 giocatori
		plancia[0][5].codice_cella = 1;
		plancia[0][6].codice_cella = 1;
		plancia[0][7].codice_cella = 1;
		plancia[0][8].codice_cella = 1;
		
		
		//seconda riga, tutte le colonne
		
		plancia[1][0].codice_cella = 1;		
		plancia[1][1].codice_cella = 1;
		plancia[1][2].codice_cella = 1;
		plancia[1][3].codice_cella = 2;		//almeno 2 giocatori
		plancia[1][4].codice_cella = 2;
		plancia[1][5].codice_cella = 4;
		plancia[1][6].codice_cella = 1;
		plancia[1][7].codice_cella = 1;
		plancia[1][8].codice_cella = 1;
		
		//terza riga, tutte le colonne
		
		plancia[2][0].codice_cella = 1;		
		plancia[2][1].codice_cella = 1;
		plancia[2][2].codice_cella = 3;
		plancia[2][3].codice_cella = 2;
		plancia[2][4].codice_cella = 2;
		plancia[2][5].codice_cella = 2;
		plancia[2][6].codice_cella = 3;
		plancia[2][7].codice_cella = 1;
		plancia[2][8].codice_cella = 1;
		
		//quarta riga, tutte le colonne
		
		plancia[3][0].codice_cella = 1;		
		plancia[3][1].codice_cella = 4;
		plancia[3][2].codice_cella = 2;
		plancia[3][3].codice_cella = 2;
		plancia[3][4].codice_cella = 2;
		plancia[3][5].codice_cella = 2;
		plancia[3][6].codice_cella = 2;
		plancia[3][7].codice_cella = 2;
		plancia[3][8].codice_cella = 3;
		
		//quinta riga, tutte le colonne
		
		plancia[4][0].codice_cella = 4;		
		plancia[4][1].codice_cella = 2;
		plancia[4][2].codice_cella = 2;
		plancia[4][3].codice_cella = 2;
		plancia[4][4].codice_cella = 2;
		plancia[4][5].codice_cella = 2;
		plancia[4][6].codice_cella = 2;
		plancia[4][7].codice_cella = 2;
		plancia[4][8].codice_cella = 4;
		
		//sesta riga, tutte le colonne
		
		plancia[5][0].codice_cella = 3;		
		plancia[5][1].codice_cella = 2;
		plancia[5][2].codice_cella = 2;
		plancia[5][3].codice_cella = 2;
		plancia[5][4].codice_cella = 2;
		plancia[5][5].codice_cella = 2;
		plancia[5][6].codice_cella = 2;
		plancia[5][7].codice_cella = 4;
		plancia[5][8].codice_cella = 1;
		
		//settima riga, tutte le colonne
		
		plancia[6][0].codice_cella = 1;		
		plancia[6][1].codice_cella = 1;
		plancia[6][2].codice_cella = 3;
		plancia[6][3].codice_cella = 2;
		plancia[6][4].codice_cella = 2;
		plancia[6][5].codice_cella = 2;
		plancia[6][6].codice_cella = 3;
		plancia[6][7].codice_cella = 1;
		plancia[6][8].codice_cella = 1;
		
		//ottava riga, tutte le colonne
		
		plancia[7][0].codice_cella = 1;		
		plancia[7][1].codice_cella = 1;
		plancia[7][2].codice_cella = 1;
		plancia[7][3].codice_cella = 4;
		plancia[7][4].codice_cella = 2;
		plancia[7][5].codice_cella = 2;
		plancia[7][6].codice_cella = 1;
		plancia[7][7].codice_cella = 1;
		plancia[7][8].codice_cella = 1;
		
		//nona riga, tutte le colonne
		
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
	
	//questo metodo restituisce che tessera è presente nella casella
	
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
}
