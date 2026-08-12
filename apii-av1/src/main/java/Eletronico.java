
public class Eletronico extends Produto implements Desconto {
    private int garantiaMeses;

    public Eletronico(double precoBase, int garantiaMeses) {
        super(precoBase);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecoFinal() {
    	System.out.println("CalculaPrecoFinal() em Eletrônico");

        return aplicarDesconto(precoBase) + (garantiaMeses * 10);
    }

    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.9;
    }
}