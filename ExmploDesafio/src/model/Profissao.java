package model;

import java.util.ArrayList;

public class Profissao {

	private Integer id;
	private Double nome;
	ArrayList<Pessoais> ListaFunc;
	
	public Profissao() {
		ListaFunc = new ArrayList();
	}
	
		public Profissao(Integer id, Double nome) {
		super();
		this.id = id;
		this.nome = nome;
		ListaFunc = new ArrayList();
	}
		
		public Double getNome() {
			return nome;
		}

		public Integer getId() {
			return id;
		}

		public ArrayList<Pessoais> getListaFunc() {
			return ListaFunc;
		}

		public void setListaFunc(ArrayList<Pessoais> listaFunc) {
			ListaFunc = listaFunc;
		}
		
		public void addFunc(Pessoais F) {
			ListaFunc.add(F);
			
			
		}		
}