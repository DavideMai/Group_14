package obiettivi_comuni;

import java.util.Random;

import partita.Libreria;

/**
 * La classe astratta "ObiettivoComune" rappresenta un obiettivo comune del
 * gioco Le sottoclassi di questa classe astratta implementeranno le
 * funzionalità specifiche se l'obiettivo è stato raggiunto
 *
 */
public abstract class ObiettivoComune {

	protected int numeroCarta;
	protected String descrizione;

	/**
	 * Costruttore predefinito della classe ObiettivoComune Inizializza i membri
	 * dati "numero_carta" e "descrizione" con valori di default
	 */
	public ObiettivoComune() // costruttore
	{
		this.numeroCarta = -1;
		this.descrizione = "";
	}

	/**
	 * Restituisce il numero della carta dell'obiettivo comune
	 *
	 * @return Il numero della carta dell'obiettivo comune.
	 */
	public int getNumeroCarta() {
		System.out.println("   ");
		System.out.println("\033[0;32m" + "Numero carta obiettivo comune: " + "\033[0m");
		return numeroCarta;
	}

	/**
	 * Restituisce la descrizione dell'obiettivo comune.
	 * 
	 * @return La descrizione dell'obiettivo comune.
	 */
	public String getDescrizione() {
		System.out.println("     ");
		System.out.println("\033[0;32m" + "Descrizione obiettivo comune: " + "\033[0m");
		return descrizione;
	}

	/**
	 * Genera un numero casuale compreso tra 0 e 11.
	 * 
	 * @return Un numero casuale.
	 */

	public static int generateRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(12);
		return randomNum;
	}

	/**
	 * Funzione che viene sovrascritta per ogni obiettivo comune
	 * 
	 * @param libreria
	 * @return un valore booleano
	 */

	public abstract boolean controlloObiettivoComune(Libreria libreria);

}
