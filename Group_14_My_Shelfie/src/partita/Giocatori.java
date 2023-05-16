package partita;

import java.math.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import obiettivi_personali.*;
import obiettivi_comuni.*;
import obiettivi_personali.DecimoObiettivoPersonale;
import obiettivi_personali.DodicesimoObiettivoPersonale;
import obiettivi_personali.NonoObiettivoPersonale;
import obiettivi_personali.ObiettivoPersonale;
import obiettivi_personali.OttavoObiettivoPersonale;
import obiettivi_personali.PrimoObiettivoPersonale;
import obiettivi_personali.QuartoObiettivoPersonale;
import obiettivi_personali.QuintoObiettivoPersonale;
import obiettivi_personali.SecondoObiettivoPersonale;
import obiettivi_personali.SestoObiettivoPersonale;
import obiettivi_personali.SettimoObiettivoPersonale;
import obiettivi_personali.TerzoObiettivoPersonale;
import obiettivi_personali.UndicesimoObiettivoPersonale;
import utils.TesseraOggetto;

/**
 * questa classe gestisce i giocatori che partecipano alla partita
 * 
 * @author david
 *
 */
public class Giocatori {
	private String nome;
	private int punteggio = 0;
	private int numero_giocatore;
	private int contatore_giocatori;
	private ObiettivoPersonale obiettivoPersonale;
	private ObiettivoComune obiettivoComune;
	private Libreria libreria;

	private static Set<Integer> numeriEstratti = new HashSet<Integer>();

	public void SetNomeGiocatore(String nome) {
		this.nome = nome;
	}

	/**
	 * costruttore di un giocatore
	 * 
	 * @param nome   nome del giocatore da creare
	 * @param numero numero del giocatore da creare
	 */
	public Giocatori(String nome, int numero) {
		this.nome = nome;
		punteggio = -1;
		this.numero_giocatore = numero;
		libreria = new Libreria();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				libreria.tesseraoggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
	}

	/**
	 * 
	 * @return quanti giocatori ci sono nella partita
	 */
	public int getNumeroGiocatori() {
		return this.contatore_giocatori;
	}

	/**
	 * 
	 * @param aumento quanto il punteggio del giocatore deve aumentare
	 */
	public void AumentaPunteggioGiocatore(int aumento) {
		this.punteggio += aumento;
	} // prova commento 3

	/**
	 * Funzione che assegna un obiettivo personale non ancora uscito al giocatore
	 */
	public void AssegnaObiettivoPersonale() {
		int NumeroRandom;
		NumeroRandom = generateRandomNumber();
		while (numeriEstratti.contains(NumeroRandom)) {
			NumeroRandom = generateRandomNumber();
		}
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

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	public String getNome() {
		return nome;
	}

}
