package exemplo01;

public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Corola", 2020);
		Carro c1 = new Carro("Celta", 2016, 2);
		Moto m1 = new Moto("CB300", 2020, 300);
		System.out.println(v1.imprimirDetalhes());
		System.out.println(c1.imprimirDetalhes());
		System.out.println(m1.imprimirDetalhes());
	}

}
