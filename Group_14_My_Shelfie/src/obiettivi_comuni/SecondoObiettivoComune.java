package obiettivi_comuni;

import partita.Libreria;

public class SecondoObiettivoComune extends ObiettivoComune {

	public SecondoObiettivoComune() {
		super();
		numero_carta=2;
		descrizione="Quattro tessere dello stesso tipo ai quattro angolo della libreria";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) 
	{
		//controllo i 4 angoli della libreria
		if(libreria.getTessera(0,0)==libreria.getTessera(0,4)&& libreria.getTessera(0,0)==libreria.getTessera(5,0) && libreria.getTessera(0,0)==libreria.getTessera(5, 4))
		{
			return true;
		}
		return false;
	}
	

}
