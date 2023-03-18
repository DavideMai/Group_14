package main;

public class PlanciaSoggiorno {
	
	public int riga,colonna;
	
	int[][] arrayplancia;	
	
	public void Selezione (int riga ,int colonna) {
		this.riga = riga;
		this.colonna = colonna;
		
		return arrayplancia [riga][colonna];
	}
	
}
