package main;

public class Giocatori {
	private String nome;
	private String cognome;
	private int punteggio=0;
	private int numero_giocatore;
	private int contatore_giocatori;
	
	public void SetNomeGiocatore(String nome) {
		this.nome=nome;
	}
	
	public void Giocatori()		//costruttore
	{
		nome="";
		cognome="";
		punteggio=-1;
		if(contatore_giocatori<=4) {
			this.numero_giocatore=contatore_giocatori;	//prova commento per git
			contatore_giocatori++;
		}
	}
	
	public void SetCognomeGiocatore(String cognome) {
		this.cognome=cognome;
	}
	
	public int getNumeroGiocatori() {		//ritorna quanti giocatori giocano nella partita
		return this.contatore_giocatori;
	}
	
	public void AumentaPunteggioGiocatore(int aumento) {
		this.punteggio+=aumento;
	} //prova commento 3
}
