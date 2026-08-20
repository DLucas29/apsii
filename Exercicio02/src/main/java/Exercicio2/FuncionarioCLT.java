package Exercicio2;

public class FuncionarioCLT extends Funcionario {
	protected double valeTransporte;
	protected double valeAlimentacao;

	public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdimissao,
			double valeTransporte, double valeAlimentacao)  {
		super(nome, matricula, salarioBase, dataAdimissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + valeTransporte + valeAlimentacao;
	}

	@Override
	public double calcularDesconto() {
		return super.calcularDesconto() + 50;
	}
	
	@Override
	public String toString() {
		double liquido = calcularSalario() - calcularDesconto();
		return String.format("FuncionarioCLT: \n%s | %s | %.0f | %s | VT: %.0f | VA: %.0f", 
				nome, matricula, salarioBase, dataAdimissao, valeTransporte, valeAlimentacao);
	}
	
}
