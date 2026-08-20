package Exercicio2;

public class Funcionario {
	protected String nome;
	protected String matricula;
	protected double salarioBase;
	protected String dataAdimissao;
	
	public Funcionario(String nome, String matricula, double salarioBase, String dataAdimissao) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		this.dataAdimissao = dataAdimissao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public double calcularSalario() {
		return salarioBase;
	}
	
	public double calcularDesconto() {
		return salarioBase * 0.08;
	}
	
	@Override
	public String toString() { 
		double liquido = calcularSalario() - calcularDesconto();
		return String.format("%s [%s] - Salario: R$%.2f \nDesconto: R$%.2f \nLíquido: R$%.2f", nome, matricula, salarioBase, calcularSalario(), calcularDesconto(), liquido);
		
	}
	
}
