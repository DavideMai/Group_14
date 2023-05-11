package partita;

import java.util.ArrayList;
import java.util.Scanner;

import obiettivi_comuni.DecimoObiettivoComune;
import obiettivi_comuni.DodicesimoObiettivoComune;
import obiettivi_comuni.NonoObiettivoComune;
import obiettivi_comuni.ObiettivoComune;
import obiettivi_comuni.OttavoObiettivoComune;
import obiettivi_comuni.PrimoObiettivoComune;
import obiettivi_comuni.QuartoObiettivoComune;
import obiettivi_comuni.QuintoObiettivoComune;
import obiettivi_comuni.SecondoObiettivoComune;
import obiettivi_comuni.SestoObiettivoComune;
import obiettivi_comuni.SettimoObiettivoComune;
import obiettivi_comuni.TerzoObiettivoComune;
import obiettivi_comuni.UndicesimoObiettivoComune;

public class Partita {

	public static void main(String[] args) {
		PlanciaGioco plancia = new PlanciaGioco();
		ObiettivoComune obiettivoComune = new ObiettivoComune();
		ObiettivoComune obiettivoComune2 = new ObiettivoComune();
		Scanner sc = new Scanner(System.in);
		boolean nextPlayer = true;
		String nome = new String();
		int numberPlayer = 0;
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
				giocatori.get(numberPlayer-1).AssegnaObiettivoPersonale();

			}
		} while (nextPlayer && numberPlayer < 4);
		plancia.CancellaCelle(numberPlayer);
		plancia.SetCella();
		System.out.println(
				"V sta per vuota, C per gatto, P per pianta, G per gioco, F per cornice, T per trofeo e L per libro");
		plancia.visualizzaPlancia();
		
		int PrimoNumero1;
		int SecondoNumero1;
		
		do {
		int PrimoNumero = ObiettivoComune.generateRandomNumber();
		//(int) Math.random() * 12;
		int SecondoNumero= ObiettivoComune.generateRandomNumber();
		
		PrimoNumero1=PrimoNumero; //variabile d'appoggio
		SecondoNumero1=SecondoNumero; //variabile d'appoggio
		if(PrimoNumero!=SecondoNumero)
		{
			switch (PrimoNumero) {
			case 1:
				obiettivoComune = new PrimoObiettivoComune();
				break;
			case 2:
				obiettivoComune = new SecondoObiettivoComune();
				break;
			case 3:
				obiettivoComune = new TerzoObiettivoComune();
				break;
			case 4:
				obiettivoComune = new QuartoObiettivoComune();
				break;
			case 5:
				obiettivoComune = new QuintoObiettivoComune();
				break;
			case 6:
				obiettivoComune = new SestoObiettivoComune();
				break;
			case 7:
				obiettivoComune = new SettimoObiettivoComune();
				break;
			case 8:
				obiettivoComune = new OttavoObiettivoComune();
				break;
			case 9:
				obiettivoComune = new NonoObiettivoComune();
				break;
			case 10:
				obiettivoComune = new DecimoObiettivoComune();
				break;
			case 11:
				obiettivoComune = new UndicesimoObiettivoComune();
				break;
			case 12:
				obiettivoComune = new DodicesimoObiettivoComune();
				break;
			}
			
			switch (SecondoNumero) {
			case 1:
				obiettivoComune2 = new PrimoObiettivoComune();
				break;
			case 2:
				obiettivoComune2 = new SecondoObiettivoComune();
				break;
			case 3:
				obiettivoComune2 = new TerzoObiettivoComune();
				break;
			case 4:
				obiettivoComune2 = new QuartoObiettivoComune();
				break;
			case 5:
				obiettivoComune2 = new QuintoObiettivoComune();
				break;
			case 6:
				obiettivoComune2 = new SestoObiettivoComune();
				break;
			case 7:
				obiettivoComune2 = new SettimoObiettivoComune();
				break;
			case 8:
				obiettivoComune2 = new OttavoObiettivoComune();
				break;
			case 9:
				obiettivoComune2 = new NonoObiettivoComune();
				break;
			case 10:
				obiettivoComune2 = new DecimoObiettivoComune();
				break;
			case 11:
				obiettivoComune2 = new UndicesimoObiettivoComune();
				break;
			case 12:
				obiettivoComune2 = new DodicesimoObiettivoComune();
				break;
			}
		
		}
		
		
		}while(PrimoNumero1==SecondoNumero1);
		
		System.out.println(obiettivoComune.getNumeroCarta()+" ");
		System.out.println(obiettivoComune.getDescrizione()+" ");
		System.out.println(obiettivoComune2.getNumeroCarta()+" ");
		System.out.println(obiettivoComune2.getDescrizione()+" ");
		

	}

}
