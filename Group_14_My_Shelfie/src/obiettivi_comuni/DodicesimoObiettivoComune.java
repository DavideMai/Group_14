package obiettivi_comuni;

import partita.Libreria;

public class DodicesimoObiettivoComune extends ObiettivoComune{

	
	public DodicesimoObiettivoComune() {
		super();
		numero_carta=12;
		descrizione="Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean ControlloObiettivoComune(Libreria libreria)
	{
		int[] ntessere_colonna = new int[5]; //5 elementi per il numero di righe
		ntessere_colonna[0]=NumeroTessereColonna(libreria, 0); //assegno in posizione 0 il numero di tessere della prima colonna
		ntessere_colonna[1]=NumeroTessereColonna(libreria, 1); //assegno in posizione 1 il numero di tessere della seconda colonna
		ntessere_colonna[2]=NumeroTessereColonna(libreria, 2); //assegno in posizione 2 il numero di tessere della terza colonna
		ntessere_colonna[3]=NumeroTessereColonna(libreria, 3); //assegno in posizione 3 il numero di tessere della quarta colonna
		ntessere_colonna[4]=NumeroTessereColonna(libreria, 4); //assegno in posizione 4 il numero di tessere della quinta colonna
		
		if(ntessere_colonna[0]<ntessere_colonna[1] && ntessere_colonna[1]< ntessere_colonna[2]&& ntessere_colonna[2] < ntessere_colonna[3] && ntessere_colonna[3]<ntessere_colonna[4])
		{
			return true; //ordine crescente delle colonne
		}
		else if(ntessere_colonna[0] > ntessere_colonna[1] && ntessere_colonna[1] > ntessere_colonna[2]&& ntessere_colonna[2] > ntessere_colonna[3] && ntessere_colonna[3] >ntessere_colonna[4])
		{
			return true; //ordine decrescente delle colonne
		}
		return false;
	}
	
	public int NumeroTessereColonna(Libreria libreria, int colonna)
	{
		int ntessere=0;
		
		for(int i=5; i>=0; i--)
		{
			if(libreria.getTessera(i,colonna)!=null)
			{
				ntessere++;
			}
			else {
				return ntessere;
			}
		}
		
		return ntessere;
	}
}
