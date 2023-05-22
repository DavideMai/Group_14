package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class SestoObiettivoComune extends ObiettivoComune {

	public SestoObiettivoComune() {
		super();
		numero_carta=6;
		descrizione="Otto tessere dello stesso tipo. Non ci sono restrizioni sulla posizione di queste tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		//variabili per tenere conto delle diverse tessere uguali
		int cornice=0, trofeo=0, gioco=0, gatto=0, pianta=0, libro=0;
		
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(libreria.getTessera(i, j)!=TesseraOggetto.VUOTA)
				{
					if(libreria.getTessera(i, j)==TesseraOggetto.CORNICE)
					{
						cornice++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.GATTO)
					{
						gatto++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.GIOCO)
					{
						gioco++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.LIBRO)
					{
						libro++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.TROFEO)
					{
						trofeo++;
					}
					else if(libreria.getTessera(i, j)==TesseraOggetto.PIANTA)
					{
						pianta++;
					}
				}
				if(pianta>7)
				{
					return true;	
				}
				if(trofeo>7)
				{
					return true;		
				}
				if(cornice>7)
				{
					return true;		
				}
				if(gioco>7)
				{
					return true;		
				}
				if(gatto>7)
				{
					return true;		
				}
				if(libro>7)
				{
					return true;		
				}
				
			}
					
		}
		return false;			
	}
		
}