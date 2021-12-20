package bankapp.service;

import bankapp.model.Conta;

public class ContaService {

	public void depositar(Conta conta,double valorDepositado) {
		conta.setSaldo(valorDepositado);
	}
	public void sacar (Conta conta, double valorSacado) {
		conta.setSaldo(valorSacado);
	}
	
}
