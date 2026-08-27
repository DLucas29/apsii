import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Informaçõos do Livro\nNome: ");
		String livroNome = input.nextLine();
		System.out.print("Preço: ");
		double livroPreco =  input.nextDouble();
		input.nextLine();
		System.out.print("Nome do autor: ");
		String livroAutor = input.nextLine();
		Livro livro = new Livro(livroNome, livroPreco, livroAutor);
		
		System.out.print("Informaçõos do CD\nNome: ");
		String cdNome = input.nextLine();		
		System.out.print("Preço: ");
		double cdPreco = input.nextDouble();
		input.nextLine();
		System.out.print("Número de faixas: ");
		int cdFaixas = input.nextInt();
		Cd cd= new Cd(cdNome, cdPreco, cdFaixas);
		
		
		System.out.println(cd.exibeInformacoes());
	}

}
