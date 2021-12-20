package bankapp;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApplication {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta conta1 = new Conta();
		
		ContaService terminal = new ContaService();
		terminal.depositar(conta,50.0);
		terminal.depositar(conta1,20.0);
		
		System.out.println("Conta Gustavo: " + conta.getSaldo());
		System.out.println("Conta Gleyson: " + conta1.getSaldo());
	}
}