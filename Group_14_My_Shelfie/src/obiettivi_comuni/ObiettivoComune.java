package obiettivi_comuni;

import java.util.Random;

public class ObiettivoComune {

	protected int numero_carta;
	protected String descrizione;

	public ObiettivoComune() // costruttore
	{
		this.numero_carta =-1;
		this.descrizione = "";
	}
	
	public int getNumeroCarta()
	{
		return numero_carta;
	}
	
	public String getDescrizione()
	{
		return descrizione;
	}

	/*public void GeneraObiettivo() {

		descrizione[0] = "Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		descrizione[1] = "Quattro tessere dello stesso tipo ai quattro angolo della libreria";
		descrizione[2] = "Quattro gruppi separati formati ciasuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		descrizione[3] = "Due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2- Le tessere dei due gruppi devono essere dello stesso tipo";
		descrizione[4] = "Tre colonne formate ciascuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";		
		descrizione[5] = "Otto tessere dello stesso tipo. Non i sono restrizioni sulla posizione di queste tessere";
		descrizione[6] = "Cinque tessere dello stesso tipo che formano una diagonale";
		
		descrizione[7] = "Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righe diverse possono avere combinazioni diverse di tipi di tessere";
		descrizione[8] = "Due colonne formate ciascuna da 6 diversi tipi di tessere";
		descrizione[9] = "Due righe formate ciascuna da 5 diversi tipi di tessere";
		descrizione[10] = "Cinque tessere dello stesso tipo che formano una X";
		descrizione[11] = "Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
	}*/
	

	public static int generateRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(12);
		return randomNum;
	}
	
	public void ControlloObiettivoComune()
	{
		
	}
}
