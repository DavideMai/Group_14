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
	
	public void SetCognomeGiocatore(String cognome) {
		this.cognome=cognome;
	}
	
	public void AumentaPunteggioGiocatore(int aumento) {
		this.punteggio+=aumento;
	}
	
	public void Giocatore() {
		if(contatore_giocatori<=4) {
			this.numero_giocatore=contatore_giocatori;
			contatore_giocatori++;
		}
	}
}
