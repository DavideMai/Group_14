package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Partita {

	public static void main(String[] args) {
		PlanciaGioco plancia = new PlanciaGioco();
		Scanner sc = new Scanner(System.in);
		boolean nextPlayer = true;
		String nome = new String();
		int i = 0;
		ArrayList<Giocatori> giocatori = new ArrayList<Giocatori>();
		do {
			System.out.println("Vuoi inserire un nuovo giocatore? Se sì, inserisci 1, altrimenti inserire 0");
			nextPlayer = sc.nextBoolean();
			if(nextPlayer) {
				i++;
				System.out.println("Inserisci nome del giocatore: ");
				sc.nextLine();
				nome = sc.nextLine();
				giocatori.add(new Giocatori(nome, i));
			}
		}while(nextPlayer && i<4);
		plancia.SetCella();
		plancia.visualizzaPlancia();
	}

}
