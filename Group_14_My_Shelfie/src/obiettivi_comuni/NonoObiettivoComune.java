package obiettivi_comuni;

import partita.Libreria;

public class NonoObiettivoComune extends ObiettivoComune{

	public NonoObiettivoComune() {
		super();
		numero_carta=9;
		descrizione="Due colonne formate ciascuna da 6 diversi tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}
}
