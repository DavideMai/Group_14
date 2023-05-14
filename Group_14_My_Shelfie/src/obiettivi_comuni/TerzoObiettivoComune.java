package obiettivi_comuni;

import partita.Libreria;

public class TerzoObiettivoComune extends ObiettivoComune {

	public TerzoObiettivoComune() {
		super();
		numero_carta=3;
		descrizione="Quattro gruppi separati formati ciasuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
