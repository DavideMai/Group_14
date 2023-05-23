package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class NonoObiettivoComune extends ObiettivoComune{

	public NonoObiettivoComune() {
		super();
		numero_carta=9;
		descrizione="Due colonne formate ciascuna da 6 diversi tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	/**
	 * Controllo nono obiettivo comune: cerco 2 colonne con 6 diversi tipi di tessere scorrendo la libreria
	 * se il numero di ogni tessera per colonna è uguale a uno allora aumento il contatore. Risulta true se il
	 * contatore è maggiore o uguale a 2
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano 
	 */
	
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		int contatore=0; //contatore per controllare numero max di colonne
		
		for(int j=0; j<5; j++) //scorro le colonne
		{
			int ntessere[] = new int[6]; //salvo il numero di tessere diverse nella stessa colonna
			
			for(int i=0; i<6; i++) //scorro le righe
			{
				if(libreria.getTessera(i,j)!=TesseraOggetto.VUOTA)
				{
					if(libreria.getTessera(i,j)==TesseraOggetto.CORNICE)
					{
						ntessere[0]++;
					}
					else if(libreria.getTessera(i,j)==TesseraOggetto.GATTO)
					{
						ntessere[1]++;
					}
					else if(libreria.getTessera(i,j)==TesseraOggetto.GIOCO)
					{
						ntessere[2]++;
					}
					else if(libreria.getTessera(i,j)==TesseraOggetto.LIBRO)
					{
						ntessere[3]++;
					}
					else if(libreria.getTessera(i,j)==TesseraOggetto.PIANTA)
					{
						ntessere[4]++;
					}
					else if(libreria.getTessera(i,j)==TesseraOggetto.TROFEO)
					{
						ntessere[5]++;
					}
					
				}
			}
			if(ntessere[0]==1 && ntessere[1]==1 && ntessere[2]==1 && ntessere[3]==1 && ntessere[4]==1 && ntessere[5]==1)
			{
				
				contatore++;
				
			}
			if(contatore>=2)
			{
				return true;
			}
		}
		
		return false;
	}
}
