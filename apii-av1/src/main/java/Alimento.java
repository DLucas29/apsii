
public class Alimento extends Produto {
    private boolean perecivel;

    public Alimento(double precoBase, boolean perecivel) {
        super(precoBase);
        this.perecivel = perecivel;
    }

    @Override
    public double calcularPrecoFinal() {
    	System.out.println("CalculaPrecoFinal() em Alimento");


        return precoBase + (perecivel ? 5 : 0);
    }
}