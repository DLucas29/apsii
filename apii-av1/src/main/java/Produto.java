
public class Produto {
    protected double precoBase;

    public Produto(double precoBase) {
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
    	System.out.println("CalculaPrecoFinal() em Produto");
        return precoBase;
    }

    public void imprimirPreco() {
    	System.out.println("imprimirPreco() em Produto");

        System.out.println("Preço final: " + calcularPrecoFinal());
    }
}