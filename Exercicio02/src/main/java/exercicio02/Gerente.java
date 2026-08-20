package exercicio02;

public class Gerente extends FuncionarioCLT {
	protected int tamanhoEquipe;
	protected double percentualBonus;

	public Gerente(String nome, String matricula, double salarioBase, String dataAdimissao, double valeTransporte,
			double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
		super(nome, matricula, salarioBase, dataAdimissao, valeTransporte, valeAlimentacao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus = percentualBonus;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (salarioBase * percentualBonus / 100);
	}

	@Override
	public double calcularDesconto() {
		if (tamanhoEquipe > 10) {
			return super.calcularDesconto() + 100;
		} else
			return super.calcularDesconto();
	}

	@Override
	public String toString() {
		return String.format("Gerente: \n%s | %s | %.0f | %s | \nVT: %.0f | VA: %.0f | Equipe: %d | Bônus: %.0f%%",
				nome, matricula, salarioBase, dataAdimissao, valeTransporte, valeAlimentacao, tamanhoEquipe,
				percentualBonus);
	}
}
