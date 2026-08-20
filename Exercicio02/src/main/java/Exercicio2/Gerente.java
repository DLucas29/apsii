package Exercicio2;

public class Gerente extends Funcionario {
	protected int tamanhoEquipe;
	protected double percentualBonus;

	public Gerente(String nome, String matricula, double salarioBase, String dataAdimissao, int tamanhoEquipe, double percentualBonus) {
		super(nome, matricula, salarioBase, dataAdimissao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus= percentualBonus;
	}

}
