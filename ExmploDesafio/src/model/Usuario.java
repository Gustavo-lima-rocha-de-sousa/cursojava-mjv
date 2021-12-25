package model;

public class Usuario extends Pessoais implements PermitirAcesso {
	private String nome;
	private String cpf;
	
	private String login;
	private String senha;
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(){		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
		
	}
	public boolean autenticar() {
		return login.equals("teste") && senha.equals("123");
	}
}
