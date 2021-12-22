package bankapp;

import bankapp.model.Conta;
import bankapp.model.Historico;
import bankapp.repository.ContaRepository;
import bankapp.service.ContaService;

public class BankApplication {
	public static void main(String[] args) {
		exemplo2();
	}

	public static void exemplo2() {
		ContaRepository repository = new ContaRepository();

		Conta contaClaudian = new Conta();
		contaClaudian.setNomeCorrentista("Claudia");
		contaClaudian.setNumero("7688-9");
		repository.adicionarConta(contaClaudian);
		
		Conta contaDaniel = new Conta();
		contaDaniel.setNomeCorrentista("Daniel");
		contaDaniel.setNumero("1287-5");
		
		repository.adicionarConta(contaDaniel);
		
		Conta contaEddward = new Conta();
		contaEddward.setNomeCorrentista("Eddward");
		contaEddward.setNumero("1237-5");
		
		repository.adicionarConta(contaEddward);
		
		Conta contaGustavo = new Conta();
		contaGustavo.setNomeCorrentista("Gustavo");
		contaGustavo.setNumero("1437-5");
		
		repository.adicionarConta(contaGustavo);
		
		Conta contaGleysson = new Conta();
		contaGleysson.setNomeCorrentista("Gleysson");
		contaGleysson.setNumero("1838-5");
		
		repository.adicionarConta(contaGleysson);
		
		Conta [] contas = repository.getContas();
		for(int i=0; i< contas.length ; i=i+1 ) {
			
			Conta contAtual = contas[i];
			System.out.println(contAtual);
		}

	}

	public static void exemplo1() {
		Conta contaDaniel = new Conta();
		Conta contaEddward = new Conta();
		Conta contaClaudia = new Conta();

		Conta conta = new Conta();

		contaClaudia.setNomeCorrentista("Claudia");
		contaEddward.setNomeCorrentista("Eddward");
		contaDaniel.setNomeCorrentista("Daniel");
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

	public static void exemplo3() {
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
		
		terminal.transferir(contaDaniel, contaClaudia, 5);

		terminal.exibirExtrato(contaDaniel);
		terminal.exibirExtrato(contaClaudia);
		terminal.exibirExtrato(contaEddward);
		
		terminal.exibirSaldo(contaDaniel);
		terminal.exibirSaldo(contaClaudia);
	}
}