package aula04;

public class Principal {

	public static void main(String[] args) {
		GerenteDeFiguras gf = new GerenteDeFiguras();
		
		Losango l1 = new Losango(2,3);
		Triangulo t1 = new Triangulo(4,3);
		
		gf.adicionarFigura(l1);
		gf.adicionarFigura(t1);

		System.out.println(l1.calculaArea());
		System.out.println(t1.calculaArea());
		
		gf.imprimeFiguras();
		
		System.out.println(gf.getMaiorAreaDeFigura());

	}

}
