
public class Cd extends Produto implements InfoGerais{
	protected int numFaixas;
	
	public Cd(String nome, double preco, int numFaixas) {
		super(nome, preco);
		this.numFaixas = numFaixas;
	}
	public int getNumFaixas() {
		return numFaixas;
	}
	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	@Override
	public String exibeInformacoes() {
		return String.format("Livro: %s | Preço: %.2f | Faixas %d",nome, preco, numFaixas);		
	}
}
