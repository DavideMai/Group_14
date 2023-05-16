package obiettivi_comuni;

import partita.Libreria;
import utils.TesseraOggetto;

public class OttavoObiettivoComune extends ObiettivoComune {

	
	public OttavoObiettivoComune() {
		super();
		numero_carta=8;
		descrizione="Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righe diverse possono avere combinazioni diverse di tipi di tessere";
		// TODO Auto-generated constructor stub
	}
	
	public int getNumeroCarta()
	{
		return numero_carta;
	}
	
	public String getDescrizione()
	{
		return descrizione;
	}
	
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria)
	{
		return false;
	}
		
		
		
	
}
