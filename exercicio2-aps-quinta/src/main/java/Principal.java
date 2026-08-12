
public class Principal {

	public static void main(String[] args) {
		GerenteDeFiguras gf = new GerenteDeFiguras();
		
		Triangulo t1 = new Triangulo(2,3);
		Losango l1 = new Losango(4,5);
		
		
		gf.adicionaFigura(t1);
		gf.adicionaFigura(l1);
		
		gf.imprimeFiguras();
		
		System.out.println(gf.getMaiorAreaDeFigura());
	}

}
