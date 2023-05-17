package obiettivi_comuni;

import partita.Libreria;

public class mainprovaoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libreria libreria = new Libreria();
		ObiettivoComune oc;
		
		oc=new NonoObiettivoComune();
		
		libreria.setCellaGioco(0, 0);
		libreria.setCellaCornice(0, 1);
		
		libreria.setCellaCornice(0, 2);
		libreria.setCellaCornice(0, 3);
		libreria.setCellaCornice(0, 4);
		
		libreria.setCellaCornice(1, 0);
		libreria.setCellaCornice(1, 1);
		
		libreria.setCellaCornice(1, 2);
		libreria.setCellaCornice(1, 3);
		libreria.setCellaCornice(1, 4);
		
		libreria.setCellaTrofeo(2, 0);
		libreria.setCellaTrofeo(2, 1);
		
		libreria.setCellaCornice(2, 2);
		libreria.setCellaCornice(2, 3);
		libreria.setCellaCornice(2, 4);
		
		libreria.setCellaLibro(3, 0);
		libreria.setCellaLibro(3, 1);
		
		libreria.setCellaCornice(3, 2);
		libreria.setCellaCornice(3, 3);
		libreria.setCellaCornice(3, 4);
		
		libreria.setCellaPianta(4, 0);
		libreria.setCellaPianta(4, 1);
		
		libreria.setCellaCornice(4, 2);
		libreria.setCellaCornice(4, 3);
		libreria.setCellaCornice(4, 4);
		
		libreria.setCellaGatto(5, 0);
		libreria.setCellaGatto(5, 1);
		
		libreria.setCellaCornice(5, 2);
		libreria.setCellaCornice(5, 3);
		libreria.setCellaCornice(5, 4);
		
		
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
