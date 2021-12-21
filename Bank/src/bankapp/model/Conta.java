package bankapp.model;

import java.util.ArrayList;
import java.util.List;

//Poo
//modificadores de acesso
//padrao java beans
public class Conta {
	private double saldo;
	private String nomeCorrentista;
	private String numero;
	
	private int contaAg;
	private List<Historico> historicos = new ArrayList();

	public List<Historico> getHistoricos() {
		return historicos;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	@Override
	public String toString() {
		return "Conta [nomeCorrentista=" + nomeCorrentista + ", numero=" + numero + "]";
	}

	
}
