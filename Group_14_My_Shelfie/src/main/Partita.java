package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Partita {

	public static void main(String[] args) {
		PlanciaGioco plancia = new PlanciaGioco();
		Scanner sc = new Scanner(System.in);
		boolean nextPlayer = true;
		String nome = new String();
		int numberPlayer = 0;
		ArrayList<Giocatori> giocatori = new ArrayList<Giocatori>();
		do {
			System.out.println("Vuoi inserire un nuovo giocatore? Se sì, inserisci true, altrimenti inserisci false");
			nextPlayer = sc.nextBoolean();
			if(nextPlayer) {
				numberPlayer++;
				System.out.println("Inserisci nome del giocatore: ");
				sc.nextLine();
				nome = sc.nextLine();
				giocatori.add(new Giocatori(nome, numberPlayer));
			}
		}while(nextPlayer && numberPlayer<4);
		plancia.CancellaCelle(numberPlayer);
		plancia.SetCella();
		System.out.println("V sta per vuota, C per gatto, P per pianta, G per gioco, F per cornice, T per trofeo e L per libro");
		plancia.visualizzaPlancia();
	}

}
