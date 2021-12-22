package model;

import java.util.Date;

public class Pessoais {


	private Integer id;
	private String cpf;
	private String nome;
	private String email;
	private Date aniversario;
	private String foto;
	
		public Date getAniversario( ) {
		return aniversario;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAniversario(Date aniversario ) {
		this.aniversario = aniversario;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Integer getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getFoto() {
		return foto;
	}
}
