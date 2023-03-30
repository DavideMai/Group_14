package main;

public class PlanciaGioco {
	
	public final int riga=9;
	public final int colonna=9;
	public int contatore_giocatori, codice_cella;
	Cella [][] arrayplancia = new Cella [riga][colonna];	
	Cella [][] cellatest= new Cella [riga][colonna];
	TesseraOggetto[][] tesseraoggetto = new TesseraOggetto[riga][colonna];
	int numeroGatti = 22, numeroTrofei = 22, numeroGiochi = 22, numeroCornici = 22, numeroPiante = 22, numeroLibri = 22;
	//questa funzione seleziona una cella per esempio per pescare una carta dalla plancia 
	
	public String Selezione (int riga ,int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		String contenuto = new String();
		contenuto = cellatest[riga][colonna].contenuto;
		return contenuto;
	}
	
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
					switch (cellatest[i][j].codice_cella) {
					
					case 1:
						cellatest[i][j].contenuto = "inutilizzabile";
						break;
					case 2:
						cellatest[i][j].contenuto = "cella libera";
						break;
					case 3:
						cellatest[i][j].contenuto = "inutilizzabile";
						break;
					case 4:
						cellatest[i][j].contenuto = "inutilizzabile";
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
				   switch (cellatest[i][j].codice_cella) {
									
				   case 1:
					   cellatest[i][j].contenuto = "inutilizzabile";
					   break;
				   case 2:
					   cellatest[i][j].contenuto = "cella libera";
					   break;
				   case 3:
					   cellatest[i][j].contenuto = "cella libera";
					   break;
				  case 4:
					  cellatest[i][j].contenuto = "inutilizzabile";
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
					switch (cellatest[i][j].codice_cella) {
					
					case 1:
						cellatest[i][j].contenuto = "inutilizzabile";
						break;
					case 2:
						cellatest[i][j].contenuto = "cella libera";
						break;
					case 3:
						cellatest[i][j].contenuto = "cella libera";
						break;
					case 4:
						cellatest[i][j].contenuto = "cella libera";
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
}
