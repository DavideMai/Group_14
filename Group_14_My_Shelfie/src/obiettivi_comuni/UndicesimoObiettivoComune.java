package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class UndicesimoObiettivoComune extends ObiettivoComune {

	public UndicesimoObiettivoComune() {
		super();
		numero_carta=11;
		descrizione="Due righe formate ciascuna da 5 diversi tipi di tessere";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		int contatore=0; 
		int[] ntessere = new int[6];
		
		for(int i=0; i<6; i++) //righe
		{
			for(int j=0; j<5; j++) //colonne
			{
				if(libreria.getTessera(i,j)!=null)
				{
					
					if(libreria.getTessera(i,j)==TesseraOggetto.CORNICE)
					{
						ntessere[0]++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.GATTO)
					{
						ntessere[1]++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.GIOCO)
					{
						ntessere[2]++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.LIBRO)
					{
						ntessere[3]++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.PIANTA)
					{
						ntessere[4]++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.TROFEO)
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
