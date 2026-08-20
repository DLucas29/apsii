package exemplo01;

public class Carro extends Veiculo {
	protected int numPortas;

	public Carro(String modelo, int ano, int numPortas) {
		super(modelo, ano);
		this.numPortas = numPortas;
	}

	@Override
	public String imprimirDetalhes() {
		return String.format("Modelo: %s | Ano de Fabricação: %d | N. de Portas: %d", modelo, ano, numPortas);
	}
	
}
