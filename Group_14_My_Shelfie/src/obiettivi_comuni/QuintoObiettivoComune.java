package obiettivi_comuni;

import partita.Libreria;

public class QuintoObiettivoComune extends ObiettivoComune {

	public QuintoObiettivoComune() {
		super();
		numero_carta=5;
		descrizione="Tre colonne formate ciascuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
