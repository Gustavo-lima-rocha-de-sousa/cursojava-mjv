package bankapp.service;

import bankapp.model.Conta;
import bankapp.model.Historico;

public class ContaService {
	public void depositar(Conta conta, double valorDepositado) {
		conta.setSaldo(conta.getSaldo() + valorDepositado);
		conta.getHistoricos().add(new Historico("20/12", valorDepositado, "DEPOSITO"));
	}

	public void sacar(Conta conta, double valorDepositado) {
		conta.setSaldo(conta.getSaldo() - valorDepositado);
		conta.getHistoricos().add(new Historico("20/12", valorDepositado, "SAQUE"));
	}

	public void exibirExtrato(Conta conta) {
		System.out.println("Exibindo histï¿½rico da conta:" + conta.getNomeCorrentista() );
		for(Historico hst: conta.getHistoricos()) {
			System.out.println(hst.getData() 
					+ ":" + hst.getTipoOperacao()
					+ ":" + hst.getValor() );
		}
	}

	public void exibirSaldo(Conta conta) {
		System.out.println(conta.getNomeCorrentista() + " , seu saldo Ã© " + conta.getSaldo());
	}

	public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferido) {
		if (contaOrigem.getSaldo() >= valorTransferido) {
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valorTransferido);
		contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferido);
		System.out.println("TransferÃªncia concluÃ­da.");
		contaOrigem.getHistoricos().add(new Historico("20/12", valorTransferido, "TRANSFERENCIA REALIZADA"));
		contaDestino.getHistoricos().add(new Historico("20/12", valorTransferido, "TRANSFERENCIA RECEBIDA"));
		}
		else {
			System.out.println("Saldo insuficiente para realizar essa operação.");
		}
	}
}