package partita;

import java.util.ArrayList;
import java.util.Scanner;
import obiettivi_comuni.*;

public class Partita {
	/**
	 * Classe principale del progetto. Esegue la partita
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PlanciaGioco plancia = new PlanciaGioco();
		ObiettivoComune obiettivoComune = null;
		ObiettivoComune obiettivoComune2 = null;
		Scanner sc = new Scanner(System.in);
		boolean nextPlayer = true;
		String nome = new String();
		int numberPlayer = 0;
		boolean terminata = false;
		int numeroRimanentiPrimoObiettivo = 4;
		int numeroRimanentiSecondoObiettivo = 4;
		String inserimento = new String();
		ArrayList<Giocatori> giocatori = new ArrayList<Giocatori>();
		do {
			/**
			 * il seguente ciclo do - while chiede l'inserimento delle lettere T o F, e
			 * continua a chiedere l'inserimento se l'inserimento non corrisponde a t, T, F,
			 * f.
			 */
			do {
				sc.reset();
				System.out.println("Vuoi inserire un nuovo giocatore? Se sì, inserisci T, altrimenti inserisci F");
				inserimento = sc.nextLine();
			} while (!inserimento.matches("T") && !inserimento.matches("t") && !inserimento.matches("F")
					&& !inserimento.matches("f"));
			if (inserimento.matches("T") || inserimento.matches("t")) {
				nextPlayer = true;
			} else {
				nextPlayer = false;
			}
			if (nextPlayer) {
				numberPlayer++;
				sc.reset();
				System.out.println("Inserisci nome del giocatore: ");
				nome = sc.nextLine();
				giocatori.add(new Giocatori(nome, numberPlayer));
				System.out.println("Inserimento giocatore completato");
				giocatori.get(numberPlayer - 1).AssegnaObiettivoPersonale();
				giocatori.get(numberPlayer - 1).getObiettivoPersonale().VisualizzaObiettivoPersonale();
			}
			/**
			 * throws IllegalArgumentException quando vengono inseriti meno di due giocatori
			 */
			try {
				if (!nextPlayer && numberPlayer <= 1) {
					throw new IllegalArgumentException("Devi inserire almeno due giocatori");
				}
			} catch (IllegalArgumentException e) {
				System.err.println(e.getLocalizedMessage());
			}
		} while ((nextPlayer && numberPlayer < 4) || numberPlayer <= 1);
		plancia.CancellaCelle(numberPlayer);
		plancia.SetCella();

		int PrimoNumero1;
		int SecondoNumero1;
		/**
		 * il do-while seguente genera i due obiettivi comuni della partita in modo che
		 * siano diversi tra loro
		 */
		do {

			int PrimoNumero = ObiettivoComune.generateRandomNumber();
			int SecondoNumero = ObiettivoComune.generateRandomNumber();

			PrimoNumero1 = PrimoNumero; // variabile d'appoggio
			SecondoNumero1 = SecondoNumero; // variabile d'appoggio
			System.out.println("Visualizzazione primo obiettivo comune");
			if (PrimoNumero != SecondoNumero) {
				switch (PrimoNumero) {
				case 0:
					obiettivoComune = new PrimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 1:
					obiettivoComune = new SecondoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 2:
					obiettivoComune = new TerzoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 3:
					obiettivoComune = new QuartoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 4:
					obiettivoComune = new QuintoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 5:
					obiettivoComune = new SestoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 6:
					obiettivoComune = new SettimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 7:
					obiettivoComune = new OttavoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 8:
					obiettivoComune = new NonoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 9:
					obiettivoComune = new DecimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 10:
					obiettivoComune = new UndicesimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 11:
					obiettivoComune = new DodicesimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;

				}
				System.out.println("Visualizzazione secondo obiettivo comune");
				switch (SecondoNumero) {
				case 0:
					obiettivoComune2 = new PrimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 1:
					obiettivoComune2 = new SecondoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 2:
					obiettivoComune2 = new TerzoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 3:
					obiettivoComune2 = new QuartoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 4:
					obiettivoComune2 = new QuintoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 5:
					obiettivoComune2 = new SestoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 6:
					obiettivoComune2 = new SettimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 7:
					obiettivoComune2 = new OttavoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 8:
					obiettivoComune2 = new NonoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 9:
					obiettivoComune2 = new DecimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 10:
					obiettivoComune2 = new UndicesimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 11:
					obiettivoComune2 = new DodicesimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				}

			}

		} while (PrimoNumero1 == SecondoNumero1);

		// System.out.println("Stampa degli obiettivi comuni in corso... \n");

		/**
		 * ciclo che permette a ogni giocatore di fare il suo turno
		 */
		do {
			for (int i = 0; i < numberPlayer; i++) {
				turno(plancia, giocatori.get(i), terminata, obiettivoComune, obiettivoComune2,
						numeroRimanentiPrimoObiettivo, numeroRimanentiSecondoObiettivo);
			}
		} while (!terminata);
		for (int i = 0; i < numberPlayer; i++) {
			VisualizzaPunteggi(giocatori.get(i));
		}
	}

	/**
	 * il seguente metodo fa sì che un giocatore possa pescare le tessere dalla
	 * plancia e che le inserisca nella sua libreria
	 * 
	 * @param plancia          la plancia di gioco da cui si pescano le tessere
	 * @param g                il giocatore che deve pescare le tessere
	 * @param t                variabile booleana, viene settata a true se un
	 *                         giocatore completa la sua libreria
	 * @param ob1              primo obiettivo comune
	 * @param ob2              secondo obiettivo comune
	 * @param rimanentiPrimo   quanti giocatori devono ancora completare il primo
	 *                         obiettivo comune
	 * @param rimanentiSecondo quanti giocatori devono ancora completare il secondo
	 *                         obiettivo comune
	 */
	public static void turno(PlanciaGioco plancia, Giocatori g, boolean t, ObiettivoComune ob1, ObiettivoComune ob2,
			int rimanentiPrimo, int rimanentiSecondo) {
		int[][] coordinate;
		System.out.println("Turno del giocatore: " + g.getNome());
		plancia.visualizzaPlancia();
		g.getObiettivoPersonale().VisualizzaObiettivoPersonale();
		System.out.println(ob1.getDescrizione());
		System.out.println(ob2.getDescrizione());
		g.getLibreria().visualizzaLibreria();
		coordinate = plancia.PescaTessere(g.getLibreria().numeroMassimoDaPescare());
		g.getLibreria().inserimentoTessere(plancia, coordinate);
		g.getLibreria().visualizzaLibreria();
		if (rimanentiPrimo != 0) {
			g.controlloPrimoObiettivoComune(ob1, rimanentiPrimo);
		}
		if (rimanentiSecondo != 0) {
			g.controlloSecondoObiettivoComune(ob2, rimanentiSecondo);
		}
		if (g.getLibreria().controlloLibreria() == false) {
			t = true;
		}
		plancia.ControlloTessere();
	}

	/**
	 * il metodo seguente visualizza il punteggio di un giocatore
	 * 
	 * @param g il giocatore
	 */
	public static void VisualizzaPunteggi(Giocatori g) {
		System.out.println(g.getNome() + " ha ottenuto " + g.getPunteggio() + " punti");
	}
}
