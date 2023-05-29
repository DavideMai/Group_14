package partita;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import obiettivi_personali.*;
import obiettivi_comuni.*;
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
	private int numeroGiocatore;
	private int contatoreGiocatori;
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

	public void setNomeGiocatore(String nome) {
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
		this.setNumeroGiocatore(numero);
		libreria = new Libreria();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				libreria.tesseraOggetto[i][j] = TesseraOggetto.VUOTA;
			}
		}
	}

	/**
	 * 
	 * @return quanti giocatori ci sono nella partita
	 */
	public int getNumeroGiocatori() {
		return this.contatoreGiocatori;
	}

	/**
	 * 
	 * @param aumento quanto il punteggio del giocatore deve aumentare
	 */
	public void aumentaPunteggioGiocatore(int aumento) {
		this.punteggio += aumento;
	} // prova commento 3

	/**
	 * Funzione che assegna un obiettivo personale non ancora uscito al giocatore
	 */
	public void assegnaObiettivoPersonale() {
		int numeroRandom;
		numeroRandom = generateRandomNumber();
		while (numeriEstratti.contains(numeroRandom)) {
			numeroRandom = generateRandomNumber();
		}
		numeriEstratti.add(numeroRandom);
		switch (numeroRandom) {
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

	/**
	 * genera un numero casuale tra 0 e 11
	 * 
	 * @return il numero generato
	 */
	public static int generateRandomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt(11);
		return randomNum;
	}

	/**
	 * ritorna la libreria
	 * 
	 * @return libreria
	 */
	public Libreria getLibreria() {
		return libreria;
	}

	/**
	 * permette di settare la libreria
	 * 
	 * @param libreria la libreria da modificare
	 */
	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	/**
	 * permette di ottenere il nome del giocatore
	 * 
	 * @return il nome del giocatore
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * permette di ottenere l'obiettivo personale del giocatore
	 * 
	 * @return l'obiettivo personale
	 */
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
			if (o.controlloObiettivoComune(libreria)) {
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
				System.out.println("Il giocatore " + this.nome + " ha completato il primo obiettivo comune e guadagna "
						+ aumento + " punti");
			}

		}
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
			if (o.controlloObiettivoComune(libreria)) {
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
				System.out.println("Il giocatore " + this.nome
						+ " ha completato il secondo obiettivo comune e guadagna " + aumento + " punti");
			}
		}

		return aumento;
	}

	/**
	 * funzione che controlla se il giocatore ha completato uno (o entrambi) gli
	 * obiettivi comuni, e assegna i punteggi di conseguenza
	 * 
	 * @param o                obiettivo comune da controllare
	 * 
	 * @param rimanentiPrimo   quanti giocatori devono ancora completare il primo
	 *                         obiettivo comune
	 * @param rimanentiSecondo quanti giocatori devono ancora completare il secondo
	 *                         obiettivo comune
	 */
	public void controlloPrimoObiettivoComune(ObiettivoComune o, int rimanentiPrimo) {
		this.aumentaPunteggioGiocatore(assegnaPunteggioPrimoObiettivo(this.libreria, o, rimanentiPrimo));

	}

	public void controlloSecondoObiettivoComune(ObiettivoComune o, int rimanentiSecondo) {
		this.aumentaPunteggioGiocatore(assegnaPunteggioSecondoObiettivo(this.libreria, o, rimanentiSecondo));
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
		this.aumentaPunteggioGiocatore(
				this.obiettivoPersonale.controllaObiettivoPersonale(this.getLibreria().getTesseraoggetto()));
	}

	/**
	 * permette di ottenere il numero del giocatore
	 * 
	 * @return il numero del giocatore
	 */
	public int getNumeroGiocatore() {
		return numeroGiocatore;
	}

	/**
	 * permette di modificare il numero del giocatore
	 * 
	 * @param numeroGiocatore il numero che si vuole dare
	 */
	public void setNumeroGiocatore(int numeroGiocatore) {
		this.numeroGiocatore = numeroGiocatore;
	}

	/**
	 * permette di ottenere l'obiettivo comune
	 * 
	 * @return l'obiettivo comune
	 */
	public ObiettivoComune getObiettivoComune() {
		return obiettivoComune;
	}

	/**
	 * permette di settare l'obiettivo comune
	 * 
	 * @param obiettivoComune l'obiettivo da copiare
	 */
	public void setObiettivoComune(ObiettivoComune obiettivoComune) {
		this.obiettivoComune = obiettivoComune;
	}

	/**
	 * controlla se il giocatore ha già completato il primo obiettivo comune
	 * 
	 * @return ritorna la variabile
	 */
	public boolean isPrimoObiettivo() {
		return primoObiettivo;
	}

	/**
	 * modifica lo stato di completamento del primo obiettivo comune
	 * 
	 * @param primoObiettivo true o false
	 */
	public void setPrimoObiettivo(boolean primoObiettivo) {
		this.primoObiettivo = primoObiettivo;
	}

	/**
	 * controlla se il giocatore ha già completato il secondo obiettivo comune
	 * 
	 * @return ritorna la variabile
	 */
	public boolean isSecondoObiettivo() {
		return secondoObiettivo;
	}

	/**
	 * modifica lo stato di completamento del secondo obiettivo comune
	 * 
	 * @param secondoObiettivo true o false
	 */
	public void setSecondoObiettivo(boolean secondoObiettivo) {
		this.secondoObiettivo = secondoObiettivo;
	}
}
