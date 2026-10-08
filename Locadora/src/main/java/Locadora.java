public class Locadora {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Raul");

        Fita fita1 = new Fita("Matrix", TipoPreco.NORMAL);
        Fita fita2 = new Fita("Toy Story", TipoPreco.INFANTIL);
        Fita fita3 = new Fita("Oppenheimer", TipoPreco.LANCAMENTO);

        cliente.adicionaAluguel(new Aluguel(fita1, 3));
        cliente.adicionaAluguel(new Aluguel(fita2, 4));
        cliente.adicionaAluguel(new Aluguel(fita3, 2));

        System.out.println(cliente.extrato());
    }
}
