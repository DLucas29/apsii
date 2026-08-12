package aula03q;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Carro c1 = new Carro("Modelo A", 2020, 4);
		Moto m1 = new Moto("Modelo B", 2022, 10);
		
		System.out.println("Informe um modelo: ");
		c1.setModelo(teclado.nextLine());
		
		System.out.println("Informe o ano: ");
		c1.setAno(teclado.nextInt());
		
		System.out.println("Informe o nº de portas: ");
		c1.setNumPortas(teclado.nextInt());
		
		c1.imprimirDetalhes();
		
		Veiculo v1 = new Carro("Modelo", 200, 4);
	
		

	}

}
