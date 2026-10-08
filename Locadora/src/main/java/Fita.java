public class Fita {

	private String titulo;
	private TipoPreco tipoPreco;

	public Fita(String titulo, TipoPreco tipoPreco) {
		this.titulo = titulo;
		this.tipoPreco = tipoPreco;
	}

	public String getTitulo() {
		return titulo;
	}

	public TipoPreco getTipoPreco() {
		return tipoPreco;
	}

	public void setTipoPreco(TipoPreco tipoPreco) {
		this.tipoPreco = tipoPreco;
	}
}