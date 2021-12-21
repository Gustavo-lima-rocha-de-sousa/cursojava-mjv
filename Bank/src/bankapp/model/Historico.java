package bankapp.model;

public class Historico {
	private String data;
	private Double valor;
	private String tipoOperacao;

	public Historico(String data, Double valor, String tipoOperacao) {
		super();
		this.data = data;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
	}

	public String getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

}
