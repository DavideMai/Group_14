package partita;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
		int numeroRimanentiPrimoObiettivo;
		int numeroRimanentiSecondoObiettivo;
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
				System.out.println("Vuoi inserire un nuovo giocatore? Se si', inserisci T, altrimenti inserisci F");
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
				do {
					System.out.println("Inserisci nome del giocatore: ");
					nome = sc.nextLine();
				} while (nome.equals(""));
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
		numeroRimanentiPrimoObiettivo = numberPlayer;
		numeroRimanentiSecondoObiettivo = numberPlayer;

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
		 * ciclo che permette a ogni giocatore di pescare le tessere e inserirle nella
		 * libreria. Controlla anche gli obiettivi comuni a ogni turno e se la partita è
		 * terminata
		 */
		int[][] coordinate;
		do {
			for (int i = 0; i < numberPlayer; i++) {
				System.out.println("Turno del giocatore: " + giocatori.get(i).getNome());
				plancia.visualizzaPlancia();
				giocatori.get(i).getObiettivoPersonale().VisualizzaObiettivoPersonale();
				System.out.println(obiettivoComune.getDescrizione());
				System.out.println(obiettivoComune2.getDescrizione());
				giocatori.get(i).getLibreria().visualizzaLibreria();
				coordinate = plancia.PescaTessere(giocatori.get(i).getLibreria().numeroMassimoDaPescare());
				giocatori.get(i).getLibreria().inserimentoTessere(plancia, coordinate);
				giocatori.get(i).getLibreria().visualizzaLibreria();
				if (giocatori.get(i).getLibreria().controlloLibreria() && !terminata) {
					terminata = true;

					giocatori.get(i).AumentaPunteggioGiocatore(1); // il primo giocatore a riempire la libreria riceve
																	// un punto
				}

				if (numeroRimanentiPrimoObiettivo != 0) {
					giocatori.get(i).controlloPrimoObiettivoComune(obiettivoComune, numeroRimanentiPrimoObiettivo);
				}
				if (numeroRimanentiSecondoObiettivo != 0) {
					giocatori.get(i).controlloSecondoObiettivoComune(obiettivoComune2, numeroRimanentiSecondoObiettivo);
				}
				plancia.ControlloTessere();
				/**
				 * il seguente try-catch fa sì che si attendano 5 secondi tra un turno e l'altro
				 */
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (terminata) {
					System.out.println("Partita terminata");
					break;
				}
			}

		} while (!terminata);
		/**
		 * il seguente ciclo for calcola i punteggi per gli obiettivi personali e li
		 * visualizza a schermo
		 */
		for (int i = 0; i < numberPlayer; i++) {
			giocatori.get(i).assegnaPunteggioObiettivoPersonale();
			System.out
					.println(giocatori.get(i).getNome() + " ha ottenuto " + giocatori.get(i).getPunteggio() + " punti");
		}

	}
}
