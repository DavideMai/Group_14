package obiettivi_comuni;

import partita.Libreria;

public class DecimoObiettivoComune extends ObiettivoComune {

	public DecimoObiettivoComune() {
		super();
		numero_carta=10;
		descrizione="Due righe formate ciascuna da 5 diversi tipi di tessere";
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		for(int j=0; j<3; j++) //colonna
		{
			
			for(int i=0; i<4; i++) //riga
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
