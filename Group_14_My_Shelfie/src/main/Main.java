package main;

import partita.Giocatori;
import partita.PlanciaGioco;
import partita.Libreria;
import partita.Partita;
import java.util.ArrayList;
import java.util.Scanner;

import obiettivi_comuni.ObiettivoComune;
import obiettivi_comuni.PrimoObiettivoComune;

public class Main {

	public static void main(String[] args) {
		int x;
		int[][]coordinate;
		PlanciaGioco plancia = new PlanciaGioco();
		Libreria libreria = new Libreria();
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci il numero di giocatori");
		x= sc.nextInt();
		plancia.CancellaCelle(x);
		plancia.SetCella();
		System.out.println(
				"V sta per vuota, C per gatto, P per pianta, G per gioco, F per cornice, T per trofeo e L per libro");
		plancia.visualizzaPlancia();
		coordinate = plancia.PescaTessere();
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(coordinate [i][j]+" ");
			}
			System.out.println();
		}
		libreria.setCellaVuoto();
		libreria.visualizzaLibreria();
		libreria.inserimentoTessere(plancia, coordinate);
		libreria.visualizzaLibreria();
		libreria.cancellaTessere(plancia, coordinate);
		plancia.visualizzaPlancia();
		}

}
