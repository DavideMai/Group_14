package obiettivi_comuni;

import partita.Libreria;

public class PrimoObiettivoComune extends ObiettivoComune {

	public PrimoObiettivoComune() {
		super();
		numero_carta=1;
		descrizione="Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}

