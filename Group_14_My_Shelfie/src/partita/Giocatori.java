package partita;

import java.math.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import obiettivi.*;
import obiettivi_comuni.*;
import utils.TesseraOggetto;

public class Giocatori {
	private String nome;
	private int punteggio = 0;
	private int numero_giocatore;
	private int contatore_giocatori;
	private ObiettivoPersonale obiettivoPersonale;
	private ObiettivoComune obiettivoComune;
	private static Set<Integer> numeriEstratti = new HashSet<Integer>();

	public void SetNomeGiocatore(String nome) {
		this.nome = nome;
	}

	public Giocatori(String nome, int numero) // costruttore
	{
		this.nome = nome;
		punteggio = -1;
		/*
		 * if(contatore_giocatori<=4) { this.numero_giocatore=contatore_giocatori;
		 * //prova commento per git contatore_giocatori++; }
		 */
		this.numero_giocatore = numero;
	}

	public int getNumeroGiocatori() { // ritorna quanti giocatori giocano nella partita
		return this.contatore_giocatori;
	}

	public void AumentaPunteggioGiocatore(int aumento) {
		this.punteggio += aumento;
	} // prova commento 3

	/**
	 * Funzione che assegna un obiettivo personale non ancora uscito al giocatore
	 */
	public void AssegnaObiettivoPersonale() {
		int NumeroRandom;
		NumeroRandom = generateRandomNumber();
		while(numeriEstratti.contains(NumeroRandom)) {
			NumeroRandom = generateRandomNumber();
		}
		System.out.println(NumeroRandom);
		numeriEstratti.add(NumeroRandom);
		switch (NumeroRandom) {
		case 1:
			this.obiettivoPersonale = new PrimoObiettivoPersonale();
			break;
		case 2:
			this.obiettivoPersonale = new SecondoObiettivoPersonale();
			break;
		case 3:
			this.obiettivoPersonale = new TerzoObiettivoPersonale();
			break;
		case 4:
			this.obiettivoPersonale = new QuartoObiettivoPersonale();
			break;
		case 5:
			this.obiettivoPersonale = new QuintoObiettivoPersonale();
			break;
		case 6:
			this.obiettivoPersonale = new SestoObiettivoPersonale();
			break;
		case 7:
			this.obiettivoPersonale = new SettimoObiettivoPersonale();
			break;
		case 8:
			this.obiettivoPersonale = new OttavoObiettivoPersonale();
			break;
		case 9:
			this.obiettivoPersonale = new NonoObiettivoPersonale();
			break;
		case 10:
			this.obiettivoPersonale = new DecimoObiettivoPersonale();
			break;
		case 11:
			this.obiettivoPersonale = new UndicesimoObiettivoPersonale();
			break;
		case 12:
			this.obiettivoPersonale = new DodicesimoObiettivoPersonale();
			break;
		}
	}
	public static int generateRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(12);
		return randomNum;
	}
	
	
}
