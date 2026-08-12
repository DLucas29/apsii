package aula032q;

public class Principal {

	public static void main(String[] args) {
		Veiculo c1 = new Carro();
		Veiculo b1 = new Bicicleta();
		
		Pista pista = new Pista();
		
		pista.iniciarCorrida(c1);
		pista.iniciarCorrida(b1);

	}

}
