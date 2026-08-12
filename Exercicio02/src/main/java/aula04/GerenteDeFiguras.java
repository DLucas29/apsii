package aula04;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras; 
	private double maior = 0;
	
	public GerenteDeFiguras(){
		figuras = new ArrayList<FiguraGeometrica>();
	}
	
	public void imprimeFiguras() {
		for(FiguraGeometrica figura: figuras) {
			System.out.println(figura.getNomeFigura());
		}
	}
	
	public void adicionarFigura(FiguraGeometrica figura) {
		figuras.add(figura);
	}
	
	public double getMaiorAreaDeFigura() {
		for(FiguraGeometrica figura: figuras) {
			if(figura.calculaArea() > maior) {
				maior = figura.calculaArea();
			}
		}
		return maior;
	}
}
