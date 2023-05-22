package obiettivi_comuni;

import partita.Libreria;

public class mainprovaoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libreria libreria = new Libreria();
		libreria.setCellaVuoto();
		ObiettivoComune oc;
		
		oc=new TerzoObiettivoComune();
		
		libreria.setCellaCornice(0, 0);
		libreria.setCellaLibro(0, 1);
		libreria.setCellaGatto(0, 2);
		libreria.setCellaGatto(0, 3);
		libreria.setCellaCornice(0, 4);
		
		libreria.setCellaCornice(1, 0);
		libreria.setCellaLibro(1, 1);
		libreria.setCellaGatto(1, 2);
		libreria.setCellaGatto(1, 3);
		libreria.setCellaCornice(1, 4);
		
		libreria.setCellaCornice(2, 0);
		libreria.setCellaLibro(2, 1);
		libreria.setCellaGatto(2, 2);
		libreria.setCellaGatto(2, 3);
		libreria.setCellaGioco(2, 4);
		
		libreria.setCellaCornice(3, 0);
		libreria.setCellaLibro(3, 1);
		libreria.setCellaGatto(3, 2);
		libreria.setCellaGatto(3, 3);
		libreria.setCellaCornice(3, 4);
		
		libreria.setCellaGioco(4, 0);
		libreria.setCellaPianta(4, 1);
		libreria.setCellaCornice(4, 2);
		libreria.setCellaCornice(4, 3);
		libreria.setCellaCornice(4, 4);
		
		libreria.setCellaGioco(5, 0);
		libreria.setCellaCornice(5, 1);
		libreria.setCellaCornice(5, 2);
		libreria.setCellaCornice(5, 3);
		libreria.setCellaGioco(5, 4);
		
		
		if(oc.ControlloObiettivoComune(libreria))
		{
			System.out.println("vero");
		}
		else
		{
			System.out.println("falso");
		}
	}

}
