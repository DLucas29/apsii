package exercicio02;

public class Diretor extends Gerente {
	protected double participacaoLucros;

	public Diretor(String nome, String matricula, double salarioBase, String dataAdimissao, double valeTransporte,
			double valeAlimentacao, int tamanhoEquipe, double percentualBonus, double participacaoLucros) {
		super(nome, matricula, salarioBase, dataAdimissao, valeTransporte, valeAlimentacao, tamanhoEquipe,
				percentualBonus);
		this.participacaoLucros = participacaoLucros;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + participacaoLucros;
	}
	
	@Override
	public String toString() {
		return String.format("Diretor: \n%s | %s | %.0f | %s | \nVT: %.0f | VA: %.0f | Equipe: %d | Bônus: %.0f%% | Participação: %.0f",
				nome, matricula, salarioBase, dataAdimissao, valeTransporte, valeAlimentacao, tamanhoEquipe,
				percentualBonus, participacaoLucros);
	}
}
