package aula03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		Carro c1 = new Carro ("M3", 2025, 2);
		
		
		System.out.println("Informe o modelo do carro: ");
		double a = teclado.nextDouble();
		
		Veiculo v = new Carro();
		
	
		
		
		System.out.println(a);
		
		
		
		

	}

}
