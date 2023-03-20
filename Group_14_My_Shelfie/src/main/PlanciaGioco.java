package main;

public class PlanciaGioco {
	
	public int riga=9,colonna=9;
	public int contatore_giocatori, codice_cella;
	int[][] arrayplancia;	
	//questa funzione seleziona una cella per esempio per pescare una carta dalla plancia 
	public int Selezione (int riga ,int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		
		return arrayplancia [riga][colonna];
	}
	/*questa funzione imposta lo stato della plancia in
    / base al numero di giocatori inizializzando il contenuto di ogni cella,
    / (di tipo stringa) in 'cella libera' o ' cella inutilizzabile?, e mettendo quindi a disposizione le celle al gioco 
    */
	public void CancellaCelle (int contatore_giocatori ,int codice_cella) 
	{
		System.out.println("Preparazione plancia di gioco...");
		this.codice_cella = codice_cella;
	    this.contatore_giocatori = contatore_giocatori;
		
		if (contatore_giocatori == 2)
		{
			for (int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++)
				{
					switch (cella.codicecella [i][j])
					
					case 1:
						cella.contenuto = "inutilizzabile";
						break;
					case 2:
						cella.contenuto = "cella libera";
						break;
					case 3:
						cella.contenuto = "inutilizzabile";
						break;
					case 4:
						cella.contenuto = "inutilizzabile";
						break;
				}
			}
		};
		if (contatore_giocatori == 3)
	    {
			for (int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++)
				{
				   switch (cella.codicecella [i][j])
									
				   case 1:
					   cella.contenuto = "inutilizzabile";
					   break;
				   case 2:
					   cella.contenuto = "cella libera";
					   break;
				   case 3:
					   cella.contenuto = "cella libera";
					   break;
				  case 4:
					   cella.contenuto = "inutilizzabile";
					   break;
			}
			}
		}
		if (contatore_giocatori == 3)
		{
			for (int i=0;i<=9;i++) {
			for (int j=0;j<=9;j++)
				{
					switch (cella.codicecella [i][j])
					
					case 1:
						cella.contenuto = "inutilizzabile";
						break;
					case 2:
						cella.contenuto = "cella libera";
						break;
					case 3:
						cella.contenuto = "cella libera";
						break;
					case 4:
						cella.contenuto = "cella libera";
						break;
	      }
      }
		}
	}
   
}
