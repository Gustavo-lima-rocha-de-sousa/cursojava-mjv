package CadastroService;

import java.util.Date;

import model.Pessoais;

import model.Contato;
import model.Endereco;

public class Service {

	public void cadastrar(Pessoais pessoais, String nome, String cpf, String email, Date aniversario, String foto,
			Integer id) {

		pessoais.setNome(pessoais.getNome() + nome);
		pessoais.setCpf(pessoais.getCpf() + cpf);
		pessoais.setEmail(pessoais.getEmail() + email);
		pessoais.setAniversario(pessoais.getAniversario());
		pessoais.setFoto(pessoais.getFoto() + foto);
		pessoais.setId(pessoais.getId() + id);
	}

	public void contato(Contato contato, String nome, Integer id, String telefone) {
		contato.setId(contato.getId() + id);
		contato.setNome(contato.getNome() + nome);
		contato.setTelefone(contato.getTelefone() + telefone);
	}

	public void local(Endereco endereco, String logradouro, String numero, String bairro,String cidade) {
		
		
	}
	
}
