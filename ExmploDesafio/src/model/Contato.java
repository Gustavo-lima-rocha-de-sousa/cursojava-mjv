package model;

public class Contato {

	private Integer id;
	private String nome;
	private String Telefone;

	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return Telefone;
	}

}
