package bankapp.model;

import java.util.ArrayList;
import java.util.List;

//Poo
//modificadores de acesso
//padrao java beans
public class Conta {
	private double saldo;
	private String nome ;
	
	private int contaAg;
	private List<Historico> historicos = new ArrayList();

	public List<Historico> getHistoricos() {
		return historicos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getContaAg() {
		return contaAg;
	}

	public void setContaAg(int contaAg) {
		this.contaAg = contaAg;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
