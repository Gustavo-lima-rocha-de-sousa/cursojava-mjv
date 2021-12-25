package cadastro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import CadastroService.Service;
import model.Candidato;
import model.FuncaoAutenticacao;
import model.Usuario;

public class CadastroApplication extends Service{

	private static final int Masculino = 1;
	private static final int Feminino = 2;

	public static void main(String[] args) {
		
		
		String login = JOptionPane.showInputDialog(null, "Informe o Login","Login",JOptionPane.OK_OPTION);
		String senha = JOptionPane.showInputDialog(null,"Informe a Senha", "Senha", JOptionPane.OK_OPTION);
						
		if(new FuncaoAutenticacao(new Usuario(login,senha)).autenticar()) {		
		
		List<Candidato> candidato = new ArrayList<Candidato>();
				
		HashMap<String, List<Candidato>> maps = new HashMap<String, List<Candidato>>();
			String nome = JOptionPane.showInputDialog(null, "Qual o Nome do Candidato?","Nome",JOptionPane.OK_OPTION);
			String salario = JOptionPane.showInputDialog(null, "Qual o Salario?", "Salario", JOptionPane.OK_OPTION);
			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o genero?","Genero", JOptionPane.OK_OPTION));
			String sx = Integer.toString(sexo);
				if(sexo == 1) {
					sexo = Masculino;
				}else if(sexo == 2) {
					sexo = Feminino;
				}else {
					JOptionPane.showMessageDialog(null,"Genero não localizado.");
				}						
			String retorno = JOptionPane.showInputDialog(null, "Data de Nascimento? ","Data",JOptionPane.OK_OPTION);
			Date data = null;
			String cpf = JOptionPane.showInputDialog(null, "Qual o Cpf? ","Cpf",JOptionPane.OK_OPTION);
			Integer telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o Telefone de contato?","Telefone", JOptionPane.OK_OPTION));
			String tl = Integer.toString(telefone);
			try {
				data = new SimpleDateFormat("dd/MM/yyyy").parse(retorno);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
			Candidato candidato1 = new Candidato();
			candidato1.setNome(nome);
			candidato1.setSalario(salario);
			candidato1.setAniversario(data);
			candidato1.setSexo(sexo);
			candidato1.setCpf(cpf);
			candidato1.setTelefone(telefone);
			
			System.out.println(nome +"\n"+ salario+"\n" + data+"\n" + sx+"\n" + sexo+ "\n" + cpf+"\n"+telefone);
			
		}
	}
}


		
