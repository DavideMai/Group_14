package obiettivi_comuni;

import partita.Libreria;

public class QuartoObiettivoComune extends ObiettivoComune {

	public QuartoObiettivoComune() {
		super();
		numero_carta=4;
		descrizione="Due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2- Le tessere dei due gruppi devono essere dello stesso tipo";
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ControlloObiettivoComune(Libreria libreria) {
		// TODO Auto-generated method stub
		return false;
	}

}
