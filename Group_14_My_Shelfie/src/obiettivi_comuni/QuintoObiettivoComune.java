package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class QuintoObiettivoComune extends ObiettivoComune {

	public QuintoObiettivoComune() {
		super();
		numero_carta=5;
		descrizione="Tre colonne formate ciascuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		int contatore=0;
		for(int j=0; j<5; j++)
		{
			int[] ntessere= new int[6];
			boolean controllo=false;
			for(int i=0; i<6; i++)
			{
				if(libreria.getTessera(i, j)!=TesseraOggetto.VUOTA)
				{
					if(libreria.getTessera(i, j)==TesseraOggetto.CORNICE)
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
				}else {
					controllo=true;
					break;
				}
				
			}
			if(controllo!=true)
			{
				int contatore2=0;
				for(int k=0; k<6; k++)
				{
					if(ntessere[k]==0)
					{
						contatore2++;
					}
				}
				if(contatore2>=3)
				{
					contatore++;
				}
				if(contatore>=3)
				{
					return true;
				}
			}
		}
		return false;
	}
	

}
