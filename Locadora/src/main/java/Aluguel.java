public class Aluguel {

    private int diasAlugada;
    private Fita fita;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double calcularValor() {
        double valor = 0;

        switch (fita.getTipoPreco()) {

            case NORMAL:
                valor = 2;

                if (diasAlugada > 2) {
                    valor += (diasAlugada - 2) * 1.5;
                }
                break;

            case LANCAMENTO:
                valor = diasAlugada * 3;
                break;

            case INFANTIL:
                valor = 1.5;

                if (diasAlugada > 3) {
                    valor += (diasAlugada - 3) * 1.5;
                }
                break;
        }

        return valor;
    }

    public int calcularPontos() {
        int pontos = 1;

        if (fita.getTipoPreco() == TipoPreco.LANCAMENTO
                && diasAlugada > 1) {
            pontos++;
        }

        return pontos;
    }
}