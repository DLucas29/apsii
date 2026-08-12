package aula03;

public class Carro extends Veiculo{

	private int numeroPortas;
	
	public Carro(String modelo, int ano, int numeroPortas) {
		super(modelo, ano);
		this.numeroPortas = numeroPortas;
	}
	
	public Carro() {
		super("", 0);
		this.numeroPortas = 0;
	}

	
	public void imprimirDetalhes() {
		super.imprimirDetalhes();
		System.out.println("Número de porta: " + numeroPortas);
	}


	public void setNumPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;		
	}

}
