package utils;

public class Regolamento {
	String pescaggio = new String();
	String inserimento = new String();
	String ripristino = new String();
	String obiettiviComuni = new String();
	String obiettiviPersonali = new String();
	String finePartita = new String();

	public Regolamento() {
		pescaggio = "Si possono pescare da una a tre tessere con le seguente regole:\n- Devono essere adiacenti\n- Devono formare una linea retta\n- Devono avere tutte almeno un lato librero all'inizio del turno";
		inserimento = "Le tessere pescate devono essere inserite tutte nella stessa colonna della propria libreria, nell'ordine che si preferisce";
		ripristino = "Quando non ci sono più tessere adiacenti tra loro, la plancia viene rigenerata";
		obiettiviComuni = "Quando un giocatore completa un obiettivo comune, ottiene un punteggio in base a quanti giocatori l'hanno già completato.\nIl giocatore non può ricevere dei punti per aver completato lo stesso obiettivo comune più volte";
		obiettiviPersonali = "Ogni giocatore ha un obiettivo personale generato casualmente. Ogni casella colorata dell'obiettivo personale rappresenta una cella della propria libreria da riempire con una determinata tessera oggetto.\nSi ottengono punti in base a quante tessere corrispondono alla fine della partita";
		finePartita = "Quando un giocatore riempie la propria libreria, si innesca la fine della partita. Questo giocatore guadagna un punto, e la partita termina quando è il turno del primo giocatore";

	}
	
	public void visualizzaRegolamento(int n) {
		switch(n) {
		case 1:
			System.out.println(pescaggio);
			break;
		case 2:
			System.out.println(inserimento);
			break;
		case 3:
			System.out.println(ripristino);
			break;
		case 4:
			System.out.println(obiettiviComuni);
			break;
		case 5:
			System.out.println(obiettiviPersonali);
			break;
		case 6:
			System.out.println(finePartita);
			break;
		case 7:
			System.out.println("\033[0;32m" + "Fine visualizzazione regolamento, ritorno alla partita" + "\033[0m");
			System.out.println(" ");
			break;
		default:
			System.out.println("\033[0;31m" + "Inserire un numero corretto" + "\033[0m");
			System.out.println(" ");
			break;
		}
	}

}