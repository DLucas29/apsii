import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras; 
	
	public GerenteDeFiguras(){
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void adicionaFigura(FiguraGeometrica figura) {
		figuras.add(figura);
	}
	
	public void imprimeFiguras() {
		for(FiguraGeometrica fig: figuras) {
			System.out.println(fig.getNomeFigura());
		}
	}
	
	public double getMaiorAreaDeFigura() {
		double maior = 0;
		for(FiguraGeometrica fig: figuras) {
			if (fig.calculaArea() > maior){
				maior = fig.calculaArea();
			}
		}
		return maior;
	}

}
