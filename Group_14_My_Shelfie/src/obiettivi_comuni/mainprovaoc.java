package obiettivi_comuni;

import partita.Libreria;

public class mainprovaoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libreria libreria = new Libreria();
		ObiettivoComune oc;
		
		oc=new SettimoObiettivoComune();
		
		libreria.setCellaCornice(0, 0);
		System.out.println(libreria.getTessera(0, 0));
		libreria.setCellaCornice(0, 1);
		libreria.setCellaCornice(0, 2);
		libreria.setCellaCornice(0, 3);
		libreria.setCellaCornice(0, 4);
		
		libreria.setCellaCornice(1, 0);
		libreria.setCellaGioco(1, 1);
		System.out.println(libreria.getTessera(1, 1));
		
		
		if(oc.ControlloObiettivoComune(libreria))
		{
			System.out.println("trovato");
		}
		else
		{
			System.out.println("non trovato");
		}
	}

}
