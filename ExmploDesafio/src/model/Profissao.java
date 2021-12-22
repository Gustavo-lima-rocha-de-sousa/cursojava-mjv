package model;

public class Profissao {

	private Integer id;
	private Double nome;

	public Profissao(Integer id, Double nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public Double getNome() {
		return nome;
	}

}
