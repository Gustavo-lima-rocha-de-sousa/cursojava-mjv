package comunicacao;

public class Contato {

	private Integer id;
	private String nome;
	private String Telefone;

	public Contato(Integer id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
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
