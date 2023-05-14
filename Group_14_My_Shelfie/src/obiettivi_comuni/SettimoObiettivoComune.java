package obiettivi_comuni;

import partita.Libreria;

public class SettimoObiettivoComune extends ObiettivoComune {

	public SettimoObiettivoComune() {
		super();
		numero_carta=7;
		descrizione="Cinque tessere dello stesso tipo che formano una diagonale";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		//controllo prima diagonale
		if(libreria.getTessera(0,0)!=null)
		{
			
			if(libreria.getTessera(0,0)==libreria.getTessera(1,1) && libreria.getTessera(0,0)==libreria.getTessera(2,2) && libreria.getTessera(0,0)==libreria.getTessera(3,3) && libreria.getTessera(0,0)==libreria.getTessera(4,4) )
			{
				return true;
			}
		}
		
		//controllo seconda diagonale
		if(libreria.getTessera(1,0)!=null)
		{
			
			if(libreria.getTessera(1,0)==libreria.getTessera(2,1) && libreria.getTessera(1,0)==libreria.getTessera(3,2) && libreria.getTessera(1,0)==libreria.getTessera(4,3) && libreria.getTessera(1,0)==libreria.getTessera(5,4) )
			{
				return true;
			}
		}
		
		//controllo terza diagonale
		if(libreria.getTessera(0,4)!=null)
		{
			
			if(libreria.getTessera(0,4)==libreria.getTessera(1,3) && libreria.getTessera(0,4)==libreria.getTessera(2,2) && libreria.getTessera(0,4)==libreria.getTessera(3,1) && libreria.getTessera(0,4)==libreria.getTessera(4,0) )
			{
				return true;
			}
		}
		
		//controllo quarta diagonale
		if(libreria.getTessera(1,4)!=null)
		{
			
			if(libreria.getTessera(1,4)==libreria.getTessera(2,3) && libreria.getTessera(1,4)==libreria.getTessera(3,2) && libreria.getTessera(1,4)==libreria.getTessera(4,1) && libreria.getTessera(1,4)==libreria.getTessera(5,0) )
			{
				return true;
			}
		}
		
		return false;
	}

}
