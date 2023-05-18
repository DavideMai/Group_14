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
		ObiettivoComune obiettivoComune;
		ObiettivoComune obiettivoComune2;
		Scanner sc = new Scanner(System.in);
		boolean nextPlayer = true;
		String nome = new String();
		int numberPlayer = 0;
		boolean terminata = false;
		ArrayList<Giocatori> giocatori = new ArrayList<Giocatori>();
		do {
			System.out.println("Vuoi inserire un nuovo giocatore? Se sì, inserisci true, altrimenti inserisci false");
			nextPlayer = sc.nextBoolean();
			if (nextPlayer) {
				numberPlayer++;
				System.out.println("Inserisci nome del giocatore: ");
				sc.nextLine();
				nome = sc.nextLine();
				giocatori.add(new Giocatori(nome, numberPlayer));
				System.out.println("Inserimento giocatore completato");
				giocatori.get(numberPlayer - 1).AssegnaObiettivoPersonale();
				giocatori.get(numberPlayer -1).getObiettivoPersonale().VisualizzaObiettivoPersonale();
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
		
		plancia.visualizzaPlancia();

		int PrimoNumero1;
		int SecondoNumero1;
		/**
		 * il do-while seguente genera i due obiettivi comuni della partita in modo che
		 * siano diversi tra loro
		 */
		do {

			int PrimoNumero = ObiettivoComune.generateRandomNumber();
			// (int) Math.random() * 12;
			int SecondoNumero = ObiettivoComune.generateRandomNumber();

			PrimoNumero1 = PrimoNumero; // variabile d'appoggio
			SecondoNumero1 = SecondoNumero; // variabile d'appoggio
			if (PrimoNumero != SecondoNumero) {
				switch (PrimoNumero) {
				case 1:
					obiettivoComune = new PrimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 2:
					obiettivoComune = new SecondoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 3:
					obiettivoComune = new TerzoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 4:
					obiettivoComune = new QuartoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 5:
					obiettivoComune = new QuintoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 6:
					obiettivoComune = new SestoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 7:
					obiettivoComune = new SettimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 8:
					obiettivoComune = new OttavoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 9:
					obiettivoComune = new NonoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 10:
					obiettivoComune = new DecimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 11:
					obiettivoComune = new UndicesimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;
				case 12:
					obiettivoComune = new DodicesimoObiettivoComune();
					System.out.println(obiettivoComune.getNumeroCarta() + " ");
					System.out.println(obiettivoComune.getDescrizione() + " ");
					break;

				}

				switch (SecondoNumero) {
				case 1:
					obiettivoComune2 = new PrimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 2:
					obiettivoComune2 = new SecondoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 3:
					obiettivoComune2 = new TerzoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 4:
					obiettivoComune2 = new QuartoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 5:
					obiettivoComune2 = new QuintoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 6:
					obiettivoComune2 = new SestoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 7:
					obiettivoComune2 = new SettimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 8:
					obiettivoComune2 = new OttavoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 9:
					obiettivoComune2 = new NonoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 10:
					obiettivoComune2 = new DecimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 11:
					obiettivoComune2 = new UndicesimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				case 12:
					obiettivoComune2 = new DodicesimoObiettivoComune();
					System.out.println(obiettivoComune2.getNumeroCarta() + " ");
					System.out.println(obiettivoComune2.getDescrizione() + " ");
					break;
				}

			}

		} while (PrimoNumero1 == SecondoNumero1);

		// System.out.println("Stampa degli obiettivi comuni in corso... \n");

		int[][] coordinate;
		/**
		 * il seguente do-while permette ai giocatori di pescare le tessere e di
		 * inserirle nella propria libreria controllando gli obiettivi comuni
		 */
		do {
			for (int i = 0; i < numberPlayer; i++) {
				System.out.println("Turno del giocatore: " + giocatori.get(i).getNome());
				plancia.visualizzaPlancia();
				giocatori.get(i).getLibreria().visualizzaLibreria();
				coordinate = plancia.PescaTessere();
				giocatori.get(i).getLibreria().inserimentoTessere(plancia, coordinate);
				giocatori.get(i).getLibreria().visualizzaLibreria();
				if (giocatori.get(i).getLibreria().controlloLibreria() == false) {
					terminata = true;
				}
				plancia.ControlloTessere();

			}
		} while (!terminata);

	}
}
