package obiettivi_comuni;

import partita.Libreria;

public class UndicesimoObiettivoComune extends ObiettivoComune {

	public UndicesimoObiettivoComune() {
		super();
		numero_carta=11;
		descrizione="Cinque tessere dello stesso tipo che formano una X";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		for(int i=0; i<5; i++) //riga
		{
			
			for(int j=0; j<4; j++) //colonna
			{
				if(libreria.getTessera(i,j)!= null && libreria.getTessera(i+1, j+1)!=null && libreria.getTessera(i+2, j+2)!=null && libreria.getTessera(i,j+2)!=null && libreria.getTessera(i+2, j)!=null) //controllo che la diagonale non sia vuota
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
