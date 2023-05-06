package partita;
import java.math.*;

import utils.TesseraOggetto;

public class Giocatori {
	private String nome;
	private int punteggio=0;
	private int numero_giocatore;
	private int contatore_giocatori;
	private TesseraOggetto ObiettivoPersonale;
	
	public void SetNomeGiocatore(String nome) {
		this.nome=nome;
	}
	
	public Giocatori(String nome, int numero)		//costruttore
	{
		this.nome = nome;
		punteggio=-1;
		/*if(contatore_giocatori<=4) {
			this.numero_giocatore=contatore_giocatori;	//prova commento per git
			contatore_giocatori++;
		}*/
		this.numero_giocatore = numero;
	}
	
	
	public int getNumeroGiocatori() {		//ritorna quanti giocatori giocano nella partita
		return this.contatore_giocatori;
	}
	
	public void AumentaPunteggioGiocatore(int aumento) {
		this.punteggio+=aumento;
	} //prova commento 3
	public void AssegnaObiettivoPersonale () {
		final int NumeroRandom = (int) Math.random()*12;	
	}
}
