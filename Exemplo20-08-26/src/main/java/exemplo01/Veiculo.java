package exemplo01;

public class Veiculo {
	protected String modelo;
	protected int ano;

	public Veiculo(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String imprimirDetalhes() {
		return String.format("Modelo: %s | Ano de Fabricação: %d", modelo, ano);
	}

}
