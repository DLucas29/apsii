package exericio04;

public class Triangulo implements FiguraGeometrica{
	private double base;
	private double altura;
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calculaArea() {
		return (this.altura * this.base)/2;
	}
	@Override
	public String toString() {
		return String.format("Triângulo altura = %.2f | base = ", altura, base); 
	}
	public String getNomeFigura() {
		return "Triângulo";
	}
} 
