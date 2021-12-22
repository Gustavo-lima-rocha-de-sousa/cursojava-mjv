package CadastroService;

import java.util.Date;

import model.Pessoais;

public class Service {

	public void cadastrar (Pessoais pessoais, String nome, String cpf, String email, Date aniversario, String foto, Integer id) {
			pessoais.setNome(pessoais.getNome() + nome);
			pessoais.setCpf(pessoais.getCpf() + cpf);
			pessoais.setEmail(pessoais.getEmail() + email);
			pessoais.setAniversario(pessoais.getAniversario() + aniversario);
			pessoais.setFoto(pessoais.getFoto() + foto);
	}
		
}
