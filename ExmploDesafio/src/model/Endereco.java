package model;

public class Endereco {

	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;

	public Endereco(String logradouro, String numero, String bairro, String cidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

}