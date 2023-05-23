package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class QuartoObiettivoComune extends ObiettivoComune {

	public QuartoObiettivoComune() {
		super();
		numero_carta=4;
		descrizione="Due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2- Le tessere dei due gruppi devono essere dello stesso tipo";
		// TODO Auto-generated constructor stub
	}

	/**
	 * Controllo quarto obiettivo comune: cerco 4 tessere dello stesso tipo 2x2, se le trovo, metto le 
	 * tessere VUOTE per evitare di contare due volte. Se il contatore è maggiore o uguale a 2 allora ritorna vero.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano 
	 */
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		int contatore=0;

		Libreria libreria_virtuale= new Libreria(libreria);
		
		/*for(int i=0; i<6; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(libreria.getTessera(i, j)==TesseraOggetto.CORNICE)
				{
					libreria_virtuale.setCellaCornice(i, j);
				}
				else if(libreria.getTessera(i, j)==TesseraOggetto.GATTO)
				{
					libreria_virtuale.setCellaGatto(i, j);
				}
				else if(libreria.getTessera(i, j)==TesseraOggetto.GIOCO)
				{
					libreria_virtuale.setCellaGioco(i, j);
				}
				else if(libreria.getTessera(i, j)==TesseraOggetto.LIBRO)
				{
					libreria_virtuale.setCellaLibro(i, j);
				}
				else if(libreria.getTessera(i, j)==TesseraOggetto.PIANTA)
				{
					libreria_virtuale.setCellaPianta(i, j);
				}
				else if(libreria.getTessera(i, j)==TesseraOggetto.TROFEO)
				{
					libreria_virtuale.setCellaTrofeo(i, j);
				}
				else if(libreria.getTessera(i, j)==TesseraOggetto.VUOTA)
				{
					libreria_virtuale.setCellaVuota(i, j);
				}
			}
		}*/
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(libreria_virtuale.getTessera(i, j)!=TesseraOggetto.VUOTA)
				{
					if(libreria_virtuale.getTessera(i, j)==libreria_virtuale.getTessera(i+1, j) && libreria_virtuale.getTessera(i, j)==libreria_virtuale.getTessera(i, j+1) && libreria_virtuale.getTessera(i, j)==libreria_virtuale.getTessera(i+1, j+1))
					{
						contatore++;
						libreria_virtuale.setCellaVuota(i, j);
						libreria_virtuale.setCellaVuota(i+1, j);
						libreria_virtuale.setCellaVuota(i+1, j+1);
						libreria_virtuale.setCellaVuota(i, j+1);
								
					}
				}
				
			}
		}
		
		if(contatore>=2)
		{
			return true;
		}
		
		return false;
	}
	

}
