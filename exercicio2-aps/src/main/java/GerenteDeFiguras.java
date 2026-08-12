import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;
	private double maior = 0;
	
	public GerenteDeFiguras(){
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void adicionarFigura(FiguraGeometrica f) {
		figuras.add(f);
	}
	
	public void imprimeFiguras() {
		for (FiguraGeometrica f: figuras) {
			System.out.println(f.getNomeFigura());
		}
	}
	
	public double getMaiorAreaDeFigura() {
		for(FiguraGeometrica f: figuras) {
			if(f.calculaArea() > maior) {
				maior = f.calculaArea();
			}
		}
		return maior;
	}
}
