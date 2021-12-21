package bankapp;

import bankapp.model.Conta;
import bankapp.model.Historico;
import bankapp.service.ContaService;

public class BankApplication {
	public static void main(String[] args) {
		Conta contaDaniel = new Conta();
		Conta contaEddward = new Conta();
		Conta contaClaudia = new Conta();

		Conta conta = new Conta();
		
		contaClaudia.setNome("Claudia");
		contaEddward.setNome("Eddward");
		contaDaniel.setNome("Daniel");
		ContaService terminal = new ContaService();
									
		terminal.depositar(contaDaniel, 50.0);
		terminal.depositar(contaEddward, 50.0);
		terminal.depositar(contaClaudia, 10.0);

		terminal.sacar(contaDaniel, 20.0);
		terminal.sacar(contaClaudia, 10.0);
		terminal.sacar(contaEddward, 15.0);

		terminal.exibirExtrato(contaDaniel);
		terminal.exibirExtrato(contaClaudia);
		terminal.exibirExtrato(contaEddward);
		
	}
}