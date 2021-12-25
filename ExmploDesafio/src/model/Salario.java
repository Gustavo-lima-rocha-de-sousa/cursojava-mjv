package model;

public class Salario {

	private Double valorMinimo;
	private Double valorMaximo;

	public Salario(Double valorMinimo, Double valorMaximo) {
		super();
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		
		}

	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

}
