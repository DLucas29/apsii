package br.edu.unipe.apsii.executavel;

public class Principal {
	
	public static void main (String [] args) {
		
		
		Banco banco1 = new Banco ("João", "35468", 10);
		Banco banco2 = new Banco ();
		
		
		
		System.out.println(banco1.getSaldo());
		banco1.setSaldo(100);
		System.out.println(banco1.getSaldo());


		
	}
	

}
