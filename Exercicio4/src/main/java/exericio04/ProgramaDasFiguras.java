package exericio04;

public class ProgramaDasFiguras {
	public static void main(String[] args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		Triangulo t1 = new Triangulo(2, 3);
		Losango l1 = new Losango(4, 6);
		Losango l2 = new Losango(5, 8);
		
		gerente.adicionaFigura(t1);
		gerente.adicionaFigura(l1);
		gerente.adicionaFigura(l2);

		System.out.println("Figuras Cadastradas: ");
		gerente.imprimeFiguras();
		
		System.out.print("Maior área: ");
		System.out.println(gerente.getMaiorAreaDeFigura());
		
		System.out.print("Área total: " + gerente.calculaAreaTotalDeFiguras());
		
	}
}
