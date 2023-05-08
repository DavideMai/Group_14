package main;

import java.util.Random;

public class ObiettivoComune {
	
	public String [] tipologia;
	public String [] descrizione;
	
	
	public ObiettivoComune()  //costruttore
	{
		this.tipologia=new String[12];
		this.descrizione=new String[12];
	}
	
	public void GeneraObiettivo()
	{
		tipologia[0]="a";
		tipologia[1]="b";
		tipologia[2]="c";
		tipologia[3]="d";
		tipologia[4]="e";
		tipologia[5]="f";
		tipologia[6]="g";
		tipologia[7]="h";
		tipologia[8]="i";
		tipologia[9]="j";
		tipologia[10]="k";
		tipologia[11]="l";
		
		descrizione[0]="Sei gruppi separati formati ciascuno da due tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		descrizione[1]="Quattro tessere dello stesso tipo ai quattro angolo della libreria";
		descrizione[2]="Quattro gruppi separati formati ciasuno da quattro tessere adiacenti dello stesso tipo. Le tessere di un gruppo possono essere diverse da quelle di un altro gruppo";
		descrizione[3]="Due gruppi separati di 4 tessere dello stesso tipo che formano un quadrato 2x2- Le tessere dei due gruppi devono essere dello stesso tipo";
		descrizione[4]="Tre colonne formate ciascuna da 6 tessere di uno, due o tre tipi differenti. Colonne diverse possono avere combinazioni diverse di tipi di tessere";
		descrizione[5]="Otto tessere dello stesso tipo. Non i sono restrizioni sulla posizione di queste tessere";
		descrizione[6]="Descrizione: Cinque tessere dello stesso tipo che formano una diagonale";
		descrizione[7]="Quattro righe formate ciascuna da 5 tessere di uno, due o tre tipi differenti. Righe diverse possono avere combinazioni diverse di tipi di tessere";
		descrizione[8]="Due colonne formate ciascuna da 6 diversi tipi di tessere";
		descrizione[9]="Due righe formate ciascuna da 5 diversi tipi di tessere";
		descrizione[10]="Cinque tessere dello stesso tipo che formano una X";
		descrizione[11]="Cinque colonne di altezza crescente o decrescente: a partire dalla prima colonna a sinistra o a destra, ogni colonna successiva deve essere formata da una tessera in più. Le tessere possono essere di qualsiasi tipo";
	}
	
	public static int generateRandomNumber()
	{
		 Random rand = new Random();
	     int randomNum = rand.nextInt(12);
	     return randomNum;	
	}
	
	public String VisualizzaPrimaCarta()
	{
		ObiettivoComune ob= new ObiettivoComune();		
		ob.GeneraObiettivo();		
		int a=ob.generateRandomNumber();
		
		String obt;
		String obd;
		obt=ob.tipologia[a];
		obd=ob.descrizione[a];				
		System.out.println("Primo obiettivo comune: "+obd);	
		return obd;	
	}
	
	public String VisualizzaSecondaCarta()
	{
		ObiettivoComune ob = new ObiettivoComune();
		ob.GeneraObiettivo();
		int b=ob.generateRandomNumber();		
		String ob2t;
		String ob2d;
		ob2t=ob.tipologia[b];
		ob2d=ob.descrizione[b];
		System.out.println("Secondo obiettivo comune: "+ob2d);
		
		return ob2d;	
	}
	
	
}
