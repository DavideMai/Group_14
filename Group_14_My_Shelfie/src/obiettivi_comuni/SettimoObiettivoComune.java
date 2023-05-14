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
		// TODO Auto-generated method stub
		return false;
	}

}
