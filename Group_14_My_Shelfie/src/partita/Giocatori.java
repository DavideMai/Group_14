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
	/**
	 * variabili booleane, sono true se il giocatore ha completato uno dei due
	 * obiettivi comuni (rispettivamente)
	 */
	private boolean primoObiettivo = false;
	private boolean secondoObiettivo = false;

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
		case 0:
			this.obiettivoPersonale = new PrimoObiettivoPersonale();
			break;
		case 1:
			this.obiettivoPersonale = new SecondoObiettivoPersonale();
			break;
		case 2:
			this.obiettivoPersonale = new TerzoObiettivoPersonale();
			break;
		case 3:
			this.obiettivoPersonale = new QuartoObiettivoPersonale();
			break;
		case 4:
			this.obiettivoPersonale = new QuintoObiettivoPersonale();
			break;
		case 5:
			this.obiettivoPersonale = new SestoObiettivoPersonale();
			break;
		case 6:
			this.obiettivoPersonale = new SettimoObiettivoPersonale();
			break;
		case 7:
			this.obiettivoPersonale = new OttavoObiettivoPersonale();
			break;
		case 8:
			this.obiettivoPersonale = new NonoObiettivoPersonale();
			break;
		case 9:
			this.obiettivoPersonale = new DecimoObiettivoPersonale();
			break;
		case 10:
			this.obiettivoPersonale = new UndicesimoObiettivoPersonale();
			break;
		case 11:
			this.obiettivoPersonale = new DodicesimoObiettivoPersonale();
			break;
		}

	}

	public static int generateRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(11);
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

	public ObiettivoPersonale getObiettivoPersonale() {
		return obiettivoPersonale;
	}

	/**
	 * questa funzione ritorna l'aumento del punteggio del giocatore a seguito del
	 * conseguimento del primo obiettivo comune
	 * 
	 * @param libreria  la libreria su cui controllare l'obiettivo comune
	 * @param o         il primo obiettivo comune da controllare
	 * @param rimanenti quanti giocatori devono ancora completare l'obiettivo comune
	 * @return l'aumento del punteggio
	 */
	public int assegnaPunteggioPrimoObiettivo(Libreria libreria, ObiettivoComune o, int rimanenti) {
		int aumento = 0;
		if (!this.primoObiettivo) {
			if (o.ControlloObiettivoComune(libreria)) {
				this.primoObiettivo = true;
				switch (rimanenti) {
				case 4:
					aumento = 8;
					break;
				case 3:
					aumento = 6;
					break;
				case 2:
					aumento = 4;
					break;
				case 1:
					aumento = 2;
					break;
				}
				rimanenti--;
				System.out.println("Il giocatore " + this.nome + " ha completato il primo obiettivo comune e guadagna "
						+ aumento + " punti");
			}

		}
		System.out.println("I giocatori che devono ancora completare il primo obiettivo comune sono " + rimanenti);
		return aumento;
	}

	/**
	 * questa funzione ritorna l'aumento del punteggio del giocatore a seguito del
	 * conseguimento del secondo
	 * 
	 * @param libreria  la libreria su cui controllare l'obiettivo comune
	 * @param o         il secondo obiettivo comune da controllare
	 * @param rimanenti quanti giocatori devono ancora completare l'obiettivo comune
	 * @return l'aumento del punteggio
	 */
	public int assegnaPunteggioSecondoObiettivo(Libreria libreria, ObiettivoComune o, int rimanenti) {
		int aumento = 0;
		if (!this.secondoObiettivo) {
			if (o.ControlloObiettivoComune(libreria)) {
				this.secondoObiettivo = true;
				switch (rimanenti) {
				case 4:
					aumento = 8;
					break;
				case 3:
					aumento = 6;
					break;
				case 2:
					aumento = 4;
					break;
				case 1:
					aumento = 2;
					break;
				}
				rimanenti--;
				System.out.println("Il giocatore " + this.nome
						+ " ha completato il secondo obiettivo comune e guadagna " + aumento + " punti");
			}
		}
		System.out.println("I giocatori che devono ancora completare il secondo obiettivo comune sono " + rimanenti);
		return aumento;
	}

	/**
	 * funzione che controlla se il giocatore ha completato uno (o entrambi) gli
	 * obiettivi comuni, e assegna i punteggi di conseguenza
	 * 
	 * @param o1               primo obiettivo comune da controllare
	 * @param o2               secondo obiettivo comune da controllare
	 * @param rimanentiPrimo   quanti giocatori devono ancora completare il primo
	 *                         obiettivo comune
	 * @param rimanentiSecondo quanti giocatori devono ancora completare il secondo
	 *                         obiettivo comune
	 */
	public void controlloPrimoObiettivoComune(ObiettivoComune o, int rimanentiPrimo) {
		this.AumentaPunteggioGiocatore(assegnaPunteggioPrimoObiettivo(this.libreria, o, rimanentiPrimo));

	}

	public void controlloSecondoObiettivoComune(ObiettivoComune o, int rimanentiSecondo) {
		this.AumentaPunteggioGiocatore(assegnaPunteggioSecondoObiettivo(this.libreria, o, rimanentiSecondo));
	}

	/**
	 * 
	 * @return punteggio del giocatore
	 */
	public int getPunteggio() {
		return punteggio;
	}

	/**
	 * metodo che assegna il punteggio al giocatore a fine partita in base a come ha
	 * completato l'obiettivo personale
	 */
	public void assegnaPunteggioObiettivoPersonale() {
		this.AumentaPunteggioGiocatore(
				this.obiettivoPersonale.ControllaObiettivoPersonale(this.getLibreria().getTesseraoggetto()));
	}
}
