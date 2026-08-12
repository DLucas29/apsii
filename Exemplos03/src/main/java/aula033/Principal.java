package aula033;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Livro l1 = new Livro();
		CD cd = new CD();
		
		// Livro
		/*System.out.println("Nome: ");
		l1.setNome(teclado.nextLine());
		
		System.out.println("Preço: ");
		l1.setPreco(teclado.nextDouble());

		System.out.println("Autor: ");
		l1.setAutor(teclado.nextLine());*/

		
		// CD
		System.out.println("Nome: ");
		cd.setNome(teclado.nextLine());

		System.out.println("preço: ");
		cd.setPreco(teclado.nextDouble());

		System.out.println("nº de faixas: ");
		cd.setNumFaixas(teclado.nextInt());
		
		cd.exibeInformacoes();
		
		
		

	}

}
