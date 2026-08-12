package aula033;

public class CD extends Produto implements InfoGerais {
	public int numFaixas;

	@Override
	public void exibeInformacoes() {
		System.out.println(super.getNome());
		System.out.println(super.getPreco());
		System.out.println(numFaixas);
		
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

}
