package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class PrimoObiettivoComune extends ObiettivoComune {

	public PrimoObiettivoComune() {
		super();
		numero_carta=1;
		descrizione="Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		// TODO Auto-generated constructor stub
	}

	/**
	 * Controllo primo obiettivo comune: cerca che le tessere inserite siano dello stesso tipo di quelle a destra
	 * o sopra, se verificato le metto nulle nella libreria_virtuale per evitare di contare le coppie due volte. Controlla che il 
	 * contatore sia maggiore o uguale a 6.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano 
	 */
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		

	
		Libreria libreria_virtuale= new Libreria(); //libreria d'appoggio
		libreria_virtuale=libreria;

		int contatore=0;
		
		//ciclo controllo riga 5 e sopra
		for(int j=0; j<4; j++)
		{
			if(libreria_virtuale.getTessera(5, j)!=TesseraOggetto.VUOTA)
			{
				if(libreria_virtuale.getTessera(5, j)==libreria_virtuale.getTessera(5, j+1))
				{
					libreria_virtuale.setCellaVuota(5, j);
					libreria_virtuale.setCellaVuota(5, j+1);
					contatore++;
					
					
				}
				else if(libreria_virtuale.getTessera(5, j)==libreria_virtuale.getTessera(4, j))
				{
					libreria_virtuale.setCellaVuota(5, j);
					libreria_virtuale.setCellaVuota(4, j);
					contatore++;
					
				}
			}
		}
		//controllo riga 4 e sopra
		for(int j=0; j<4; j++)
		{
			if(libreria_virtuale.getTessera(4, j)!=TesseraOggetto.VUOTA)
			{
				if(libreria_virtuale.getTessera(4, j)==libreria_virtuale.getTessera(4, j+1))
				{
					libreria_virtuale.setCellaVuota(4, j);
					libreria_virtuale.setCellaVuota(4, j+1);
					contatore++;
					
					
				}
				else if(libreria_virtuale.getTessera(4, j)==libreria_virtuale.getTessera(3, j))
				{
					libreria_virtuale.setCellaVuota(4, j);
					libreria_virtuale.setCellaVuota(3, j);
					contatore++;
					
				}
			}		
		}
	
		//controllo riga 3 e sopra
		for(int j=0; j<4; j++)
		{
			if(libreria_virtuale.getTessera(3, j)!=TesseraOggetto.VUOTA)
			{
				if(libreria_virtuale.getTessera(3, j)==libreria_virtuale.getTessera(3, j+1))
				{
					libreria_virtuale.setCellaVuota(3, j);
					libreria_virtuale.setCellaVuota(3, j+1);
					contatore++;
					
					
				}
				else if(libreria_virtuale.getTessera(3, j)==libreria_virtuale.getTessera(2, j))
				{
					libreria_virtuale.setCellaVuota(3, j);
					libreria_virtuale.setCellaVuota(2, j);
					contatore++;
					
				}
			}		
		}
		
		//controllo riga 2 e sopra
		for(int j=0; j<4; j++)
		{
			if(libreria_virtuale.getTessera(2, j)!=TesseraOggetto.VUOTA)
			{
				if(libreria_virtuale.getTessera(2, j)==libreria_virtuale.getTessera(4, j+1))
				{
					libreria_virtuale.setCellaVuota(2, j);
					libreria_virtuale.setCellaVuota(2, j+1);
					
					contatore++;
					
					
				}
				else if(libreria_virtuale.getTessera(2, j)==libreria_virtuale.getTessera(1, j))
				{
					libreria_virtuale.setCellaVuota(2, j);
					libreria_virtuale.setCellaVuota(1, j);
					contatore++;
					
				}
			}		
		}
		
		//controllo riga 1 e sopra
		for(int j=0; j<4; j++)
		{
			if(libreria_virtuale.getTessera(1, j)!=TesseraOggetto.VUOTA)
			{
				if(libreria_virtuale.getTessera(1, j)==libreria_virtuale.getTessera(1, j+1))
				{
					libreria_virtuale.setCellaVuota(1, j);
					libreria_virtuale.setCellaVuota(1, j+1);
					
					contatore++;
					
					
				}
				else if(libreria_virtuale.getTessera(1, j)==libreria_virtuale.getTessera(0, j))
				{
					libreria_virtuale.setCellaVuota(1, j);
					libreria_virtuale.setCellaVuota(0, j);
					contatore++;
					
				}
			}		
		}
		
		//controllo ultima colonna
		if(libreria_virtuale.getTessera(5, 4)!=TesseraOggetto.VUOTA && libreria_virtuale.getTessera(4, 4)!=TesseraOggetto.VUOTA)
		{
			if(libreria_virtuale.getTessera(5, 4)==libreria_virtuale.getTessera(4, 4))
			{
				contatore++;
				
				libreria_virtuale.setCellaVuota(5, 4);
				libreria_virtuale.setCellaVuota(4, 4);
			}
		}
		
		if(libreria_virtuale.getTessera(4, 4)!=TesseraOggetto.VUOTA && libreria_virtuale.getTessera(3, 4)!=TesseraOggetto.VUOTA)
		{
			if(libreria_virtuale.getTessera(4, 4)==libreria_virtuale.getTessera(3, 4))
			{
				contatore++;
				
				libreria_virtuale.setCellaVuota(4, 4);
				libreria_virtuale.setCellaVuota(3, 4);
			}
		}
		
		if(libreria_virtuale.getTessera(3, 4)!=TesseraOggetto.VUOTA && libreria_virtuale.getTessera(2, 4)!=TesseraOggetto.VUOTA)
		{
			if(libreria_virtuale.getTessera(3, 4)==libreria_virtuale.getTessera(2, 4))
			{
				contatore++;
				
				libreria_virtuale.setCellaVuota(3, 4);
				libreria_virtuale.setCellaVuota(2, 4);
			}
		}
		 
		if(libreria_virtuale.getTessera(2, 4)!=TesseraOggetto.VUOTA && libreria_virtuale.getTessera(1, 4)!=TesseraOggetto.VUOTA)
		{
			if(libreria_virtuale.getTessera(2, 4)==libreria_virtuale.getTessera(1, 4))
			{
				contatore++;
				
				libreria_virtuale.setCellaVuota(2, 4);
				libreria_virtuale.setCellaVuota(1, 4);
			}
		}
		
		if(libreria_virtuale.getTessera(1, 4)!=TesseraOggetto.VUOTA && libreria_virtuale.getTessera(0, 4)!=TesseraOggetto.VUOTA)
		{
			if(libreria_virtuale.getTessera(1, 4)==libreria_virtuale.getTessera(0, 4))
			{
				contatore++;
				
				libreria_virtuale.setCellaVuota(1, 4);
				libreria_virtuale.setCellaVuota(0, 4);
			}
		}
			
		//controllo se contatore ha trovato 6 coppie di tessere uguali
		if(contatore>=6)
		{
			return true;
		}
			
		return false;
	}	
}