package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class DecimoObiettivoComune extends ObiettivoComune {

	public DecimoObiettivoComune() {
		super();
		numero_carta=10;
		descrizione="Cinque tessere dello stesso tipo che formano una X";
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Controllo decimo obiettivo comune: cerco cinque tessere dello stesso tipo che formano una x scorrendo la libreria
	 * Ritorna true se obiettivo verificato.
	 * 
	 * @param libreria del giocatore
	 * 
	 * @return valore booleano 
	 */
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		for(int j=0; j<3; j++) //colonna
		{
			
			for(int i=0; i<4; i++) //riga
			{
				if(libreria.getTessera(i,j)!= TesseraOggetto.VUOTA && libreria.getTessera(i+1, j+1)!=TesseraOggetto.VUOTA && libreria.getTessera(i+2, j+2)!=TesseraOggetto.VUOTA && libreria.getTessera(i,j+2)!=TesseraOggetto.VUOTA && libreria.getTessera(i+2, j)!=TesseraOggetto.VUOTA) //controllo che la diagonale non sia vuota
				{
					if(libreria.getTessera(i,j)==libreria.getTessera(i+1,j+1) && libreria.getTessera(i,j)==libreria.getTessera(i+2,j+2) && libreria.getTessera(i,j)== libreria.getTessera(i+2,j) && libreria.getTessera(i,j)==libreria.getTessera(i,j+2)) //controllo che le tessere della diagonale siano uguali
					{
						return true; //condizione verificata
					}
				}
					
			}
		}
		return false;
	}
}
