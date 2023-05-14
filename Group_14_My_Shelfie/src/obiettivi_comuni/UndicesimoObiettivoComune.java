package obiettivi_comuni;

import partita.Libreria;

public class UndicesimoObiettivoComune extends ObiettivoComune {

	public UndicesimoObiettivoComune() {
		super();
		numero_carta=11;
		descrizione="Due righe formate ciascuna da 5 diversi tipi di tessere";
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		
		return false;
	}

	
}
