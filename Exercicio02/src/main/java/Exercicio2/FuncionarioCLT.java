package Exercicio2;

public class FuncionarioCLT extends Funcionario {
	protected double valeTransporte;
	protected double valeAlimentacao;

	public FuncionarioCLT (String nome, String matricula, double salarioBase, String dataAdimissao, double valeAlimentacao, double valeTransporte) {
		super(nome, matricula, salarioBase, dataAdimissao);
		this.valeAlimentacao = valeTransporte;
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
}
