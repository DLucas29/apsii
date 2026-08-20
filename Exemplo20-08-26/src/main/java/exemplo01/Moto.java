package exemplo01;

public class Moto extends Veiculo{
	protected int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}

	@Override
	public String imprimirDetalhes() {
		return String.format("Modelo: %s | Ano de Fabricação: %d | Cilindradas: %d", modelo, ano, cilindradas);
	}
	
}
