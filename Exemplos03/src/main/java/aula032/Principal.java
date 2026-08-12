package aula032;

public class Principal {

	public static void main(String[] args) {
		Carro v1 = new Carro();
		Bicicleta v2 = new Bicicleta();
		
		Pista p = new Pista();
		
		p.iniciarCorrida(v1);
		p.iniciarCorrida(v2);

	}

}
