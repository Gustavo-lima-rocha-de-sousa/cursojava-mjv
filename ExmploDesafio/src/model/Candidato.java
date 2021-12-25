package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Candidato extends Pessoais {

	private String profissao;
	private String salario;
	private int sexo;
	private Integer id;
	private Integer ddd;
	private Integer telefone;
	
	
	private List<Candidato> candidato = new ArrayList<Candidato>();

	public void setCandidatoo(List<Candidato> candidato) {
		this.candidato = candidato;
	}

	public List<Candidato> getCandidato() {
		return candidato;
	}

	public Candidato() {/* Cria os dados na memoria - Sendo padrão do Java */
	}
	public Candidato (String nomePadrao) {
		nome = nomePadrao;
	}
	public Candidato (int cpf) {
		cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public int hascode() {
		return Objects.hash(nome,cpf);
	}
	public boolean equals (Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() !=obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(cpf, other.cpf);
	}
}