package obiettivi_comuni;

import partita.Libreria;

public class SestoObiettivoComune extends ObiettivoComune {

	public SestoObiettivoComune() {
		super();
		numero_carta=6;
		descrizione="Otto tessere dello stesso tipo. Non i sono restrizioni sulla posizione di queste tessere";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}

}
