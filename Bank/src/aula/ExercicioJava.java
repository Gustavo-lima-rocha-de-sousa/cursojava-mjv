package aula;

import javax.swing.JOptionPane;

public class ExercicioJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Informe o Nome");
		Long cpf = Long.parseLong (JOptionPane.showInputDialog("Informe O Cpf"));
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a Idade"));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a Altura"));
		String doadorOrgao = JOptionPane.showInputDialog("Orgão que deseja Doar");
		String email = JOptionPane.showInputDialog("Qual o email?");
		Long telefone = Long.parseLong (JOptionPane.showInputDialog("Qual o Telefone"));
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");

		System.out.println(" Nome: " + nome + "\n" + " Cpf: " + cpf + "\n" + " Idade: " + idade + "\n" + " Altura: "
				+ altura + "\n" + " Orgão Doado: " + doadorOrgao + "\n" + " E-mail" + email + "\n" + " Phone: "
				+ telefone + "\n" + " Nacimento: " + dataNascimento);
	
	}

}
