package aula03Exemplo2;

public class Princial {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Bicicleta b1 = new Bicicleta();
		
		Pista pista = new Pista();

		pista.iniciarCorrida(c1);
		pista.iniciarCorrida(b1);
	}

}
