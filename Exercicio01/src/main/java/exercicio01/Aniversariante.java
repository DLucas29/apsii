package exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	};

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return this.dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	};

	public boolean equals(Object objeto) {
		if (objeto instanceof Aniversariante) {
			Aniversariante outroAniversariante = (Aniversariante) objeto;
			if (this.nome.equals(outroAniversariante.nome)
					&& this.dataAniversario.equals(outroAniversariante.dataAniversario)) {
				return true;
			}
		}
		return false;
	}
}