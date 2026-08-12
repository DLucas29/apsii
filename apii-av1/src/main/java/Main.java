
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Eletronico(1000, 12);
		Produto p2 = new Alimento(50, true);

		p1.imprimirPreco();
		p2.imprimirPreco();

	}

}
