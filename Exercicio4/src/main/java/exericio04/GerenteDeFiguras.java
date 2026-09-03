package exericio04;

import java.util.List;
import java.util.ArrayList;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;

	public GerenteDeFiguras() {
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void adicionaFigura(FiguraGeometrica figura) {
		figuras.add(figura);
	}

	public double calculaAreaTotalDeFiguras() {
		double areaTotal = 0;
		for (FiguraGeometrica f : figuras) {
			areaTotal = areaTotal + f.calculaArea();
		}
		return areaTotal;
	}
	
	public List<FiguraGeometrica> getFiguras() {
		return figuras;
	}

	public void imprimeFiguras() {
	    for (int i = 0; i < figuras.size(); i++) {
	        System.out.print(figuras.get(i).getNomeFigura());

	        if (i < figuras.size() - 1) {
	            System.out.print(" | ");
	        }
	    }
	    System.out.println();
	}

	public double getMaiorAreaDeFigura() {
		double maior = 0;
		for (FiguraGeometrica f : figuras) {
			double area = f.calculaArea();
			if (area> maior) {
				maior = area;
			}

		}
		return maior;
	}

}
