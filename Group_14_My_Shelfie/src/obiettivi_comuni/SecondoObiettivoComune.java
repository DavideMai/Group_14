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
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
